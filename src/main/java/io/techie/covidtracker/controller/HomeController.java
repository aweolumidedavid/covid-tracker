package io.techie.covidtracker.controller;

import io.techie.covidtracker.service.NewCovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;



@Controller
public class HomeController {


    NewCovidDataService newCovidDataService;

    @Autowired
    public HomeController(NewCovidDataService newCovidDataService) {
        this.newCovidDataService = newCovidDataService;
    }

    @GetMapping("/")
    public String home(Model model) throws IOException, InterruptedException {

        model.addAttribute("continent",newCovidDataService.fetchVirusDataStat());

        return "home";
    }

}
