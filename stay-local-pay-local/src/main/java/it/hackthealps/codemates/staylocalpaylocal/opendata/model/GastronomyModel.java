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
public class GastronomyModel extends BaseModel {

	private String title;

	private Double latitude;

	private Double longitude;

	@OneToOne
	@Cascade(CascadeType.ALL)
	private ScoreModel scoreModel;

	public String getTitle() {
		return title;
	}

	public GastronomyModel setTitle(String title) {
		this.title = title;
		return this;
	}

	public Double getLatitude() {
		return latitude;
	}

	public GastronomyModel setLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	public Double getLongitude() {
		return longitude;
	}

	public GastronomyModel setLongitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	public ScoreModel getScoreModel() {
		return scoreModel;
	}

	public GastronomyModel setScoreModel(ScoreModel scoreModel) {
		this.scoreModel = scoreModel;
		return this;
	}
}
