package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccommodationResultModel {

    public List<Accommodation> getItems() {
        return items;
    }

    @JsonProperty("Items")
    List<Accommodation> items;


}
