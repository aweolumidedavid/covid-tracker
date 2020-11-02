package io.techie.covidtracker.service;


import com.google.gson.Gson;
import io.techie.covidtracker.model.ContinentData;
import io.techie.covidtracker.model.Statistics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Service
public class NewCovidDataService {

    @Value("${virus.Data.Url}")
    private String VIRUSDATAURL;

    @Value("${host.Name}")
    private String hostName;

    @Value("${host.Value}")
    private String hostValue;

    @Value("${key.Name}")
    private String keyName;

    @Value("${key.Value}")
    private String keyValue;



    @Scheduled(cron = "* * 1 * * *")
    public List<ContinentData> fetchVirusDataStat() throws IOException, InterruptedException {
        List<Statistics> newStats = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add(hostName, hostValue);
        headers.add(keyName, keyValue);

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<String> result = restTemplate.exchange(VIRUSDATAURL, HttpMethod.GET, entity, String.class);

        Statistics stats = new Gson().fromJson(result.getBody(), Statistics.class);

        List<ContinentData> continentData = stats.getResponse();

        return continentData;
    }

}

