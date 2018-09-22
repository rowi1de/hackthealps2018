package it.hackthealps.codemates.staylocalpaylocal.opendata.service;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Collectors;

import it.hackthealps.codemates.staylocalpaylocal.opendata.model.AccoFeature;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Accommodation;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Event;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Facilities;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.GBLTSPoi;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.Gastronomy;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ScoreModel;
import it.hackthealps.codemates.staylocalpaylocal.opendata.model.ScoreValue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreService {

    private static final List<String> GASTRONOMY_FEATURES = asList("Südtiroler Spezialitäten", "Italienische Küche",
            "Geeignet für Busse");
    private static final List<String> ACCOMODATION_FEATURES = asList("Fruit growing farm", "Residence bar", "Hiking", "Wine growing farm");
    private static final List<String> EVENT_FEATURES = asList("79CBD66151C911D18F1400A02427D15E", "79CBD6A051C911D18F1400A02427D15E");
    private static final List<String> POI_FEATURES = asList("Sport und Freizeit", "Seen, Wasserfälle",  "Aussichtspunkte");

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
                .filter(EVENT_FEATURES::contains)
                .collect(toList());
        return getScoreModel(scoreFeatures);
    }

    public ScoreModel score(GBLTSPoi poiModel) {
        List<String> scoreFeatures = poiModel.getLtSTags()
                .stream()
                .map(tag -> tag.getTagName().get("de"))
                .filter(POI_FEATURES::contains)
                .collect(toList());
        return getScoreModel(scoreFeatures);
    }


    private ScoreModel getScoreModel(List<String> scoreFeatures) {
        final ScoreValue scoreValue = ScoreValue.values()[Math.min(scoreFeatures.size(), 3)];
        return new ScoreModel(scoreValue, scoreFeatures.stream().collect(Collectors.joining(",")));
    }
}
