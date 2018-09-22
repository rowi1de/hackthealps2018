package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventResult {

    public List<Event> getItems() {
        return items;
    }

    @JsonProperty("Items")
    List<Event> items;


}
