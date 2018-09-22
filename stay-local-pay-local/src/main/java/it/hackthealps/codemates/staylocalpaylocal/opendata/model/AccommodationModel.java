package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class AccommodationModel extends BaseModel {

    private String title;

    private Double latitude;

    private Double longitude;
}
