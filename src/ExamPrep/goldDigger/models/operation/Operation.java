package ExamPrep.goldDigger.models.operation;

import ExamPrep.goldDigger.models.disocverer.Discoverer;
import ExamPrep.goldDigger.models.spot.Spot;

import java.util.Collection;

public interface Operation {
    void startOperation(Spot spot, Collection<Discoverer> discoverers);

}
