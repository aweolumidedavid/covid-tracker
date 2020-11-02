package io.techie.covidtracker.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

public  class Statistics {
   @JsonProperty("get")
   private String get;

   @JsonProperty("parameters")
   private  String[] parameters;

   @JsonProperty("errors")
   private String[] errors;

   @JsonProperty("result")
   private int result;

   @JsonProperty("response")
   List<ContinentData> response;

   public String getGet() {
      return get;
   }

   public void setGet(String get) {
      this.get = get;
   }

   public String[] getParameters() {
      return parameters;
   }

   public void setParameters(String[] parameters) {
      this.parameters = parameters;
   }

   public String[] getErrors() {
      return errors;
   }

   public void setErrors(String[] errors) {
      this.errors = errors;
   }

   public int getResult() {
      return result;
   }

   public void setResult(int result) {
      this.result = result;
   }

   public List<ContinentData> getResponse() {
      return response;
   }

   public void setResponse(List<ContinentData> response) {
      this.response = response;
   }

    @Override
    public String toString() {
        return "Statistics{" +
                "get='" + get + '\'' +
                ", parameters=" + Arrays.toString(parameters) +
                ", errors=" + Arrays.toString(errors) +
                ", result=" + result +
                ", response=" + response +
                '}';
    }
}
