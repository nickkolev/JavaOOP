package ExamPrep.goldDigger.models.disocverer;

import ExamPrep.goldDigger.models.museum.Museum;

public interface Discoverer {
    String getName();

    double getEnergy();

    boolean canDig();

    Museum getMuseum();

    void dig();
}
