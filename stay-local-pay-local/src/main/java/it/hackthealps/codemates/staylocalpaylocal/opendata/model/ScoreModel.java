package it.hackthealps.codemates.staylocalpaylocal.opendata.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

import lombok.Data;

@Data
@Entity
public class ScoreModel extends BaseModel implements Comparable<ScoreModel> {
    @Enumerated(value = EnumType.STRING)
    final ScoreValue scoreValue;

    @Embedded
    final List<String> scoreCriteria;

    public ScoreValue getScoreValue()
    {
    	return scoreValue;
    }
    @Override
    public int compareTo(ScoreModel o) {
        return this.scoreValue.ordinal() - o.scoreValue.ordinal();
    }
}
