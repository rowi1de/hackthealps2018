package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Data
@Builder
public class PoiModel extends BaseModel {

    private String title;

    private Double latitude;

    private Double longitude;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private ScoreModel scoreModel;
}
