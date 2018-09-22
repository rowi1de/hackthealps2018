package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;

@Data
@Entity
public class ScoreModel extends BaseModel implements Comparable<ScoreModel> {

    @Enumerated(value = EnumType.STRING)
    final ScoreValue scoreValue;

    final String scoreCriteria;

    public ScoreValue getScoreValue()
    {
    	return scoreValue;
    }
    @Override
    public int compareTo(ScoreModel o) {
        return o.scoreValue.ordinal() - scoreValue.ordinal();
    }
}
