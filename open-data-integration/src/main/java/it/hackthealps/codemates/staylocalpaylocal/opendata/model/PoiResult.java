package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PoiResult {

    public List<GBLTSPoi> getItems() {
        return items;
    }

    @JsonProperty("Items")
    List<GBLTSPoi> items;


}
