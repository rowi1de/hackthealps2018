package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.List;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccoFeature;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Accommodation;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Event;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Facilities;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Gastronomy;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ScoreModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ScoreValue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreService {

    private static final List<String> GASTRONOMY_FEATURES = asList("Südtiroler Spezialitäten", "Italienische Küche");
    private static final List<String> ACCOMODATION_FEATURES = asList("Fruit growing farm", "Residence bar");
    private static final List<String> EVENT_FEATIURES = asList("Fruit growing farm");

    public ScoreModel score(Gastronomy gastronomy) {
        List<String> scoreFeatures = gastronomy.getFacilities()
                .stream()
                .map(Facilities::getShortname)
                .filter(GASTRONOMY_FEATURES::contains)
                .collect(toList());

        return getScoreModel(scoreFeatures);
    }

    public ScoreModel score(Accommodation accommodation) {
        List<String> scoreFeatures = accommodation.getFeatures()
                .stream()
                .map(AccoFeature::getName)
                .filter(ACCOMODATION_FEATURES::contains)
                .collect(toList());
        return getScoreModel(scoreFeatures);
    }

    public ScoreModel score(Event event) {
        List<String> scoreFeatures = event.getDistrictIds()
                .stream()
                .filter(EVENT_FEATIURES::contains)
                .collect(toList());
        return getScoreModel(scoreFeatures);
    }


    private ScoreModel getScoreModel(List<String> scoreFeatures) {
        final ScoreValue scoreValue = ScoreValue.values()[scoreFeatures.size()];
        return new ScoreModel(scoreValue, scoreFeatures);
    }
}
