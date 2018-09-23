package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GastronomyResult {

    public List<Gastronomy> getItems() {
        return items;
    }

    @JsonProperty("Items")
    List<Gastronomy> items;


}
