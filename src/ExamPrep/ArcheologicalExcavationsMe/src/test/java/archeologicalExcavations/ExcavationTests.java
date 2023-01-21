package ExamPrep.ArcheologicalExcavationsMe.src.test.java.archeologicalExcavations;

import ExamPrep.ArcheologicalExcavationsMe.src.main.java.archeologicalExcavations.Archaeologist;
import ExamPrep.ArcheologicalExcavationsMe.src.main.java.archeologicalExcavations.Excavation;
import org.junit.Assert;
import org.junit.Test;

public class ExcavationTests {

    Excavation excavation = new Excavation("TestExcavation" , 3);

    // 0. Constructor
    @Test(expected = NullPointerException.class)
    public void constructor_ShouldThrowArgumentNullExceptionForInvalidName() {
        new Excavation(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_ShouldThrowArgumentExceptionForInvalidCapacity() {
        new Excavation("Misionis", -10);
    }

    // 1. addArchaeologist
    // 1.1 Successfully adding archeologist
    @Test
    public void successfullyAddingArcheologistTest() {
        Archaeologist archaeologist = new Archaeologist("Niki", 20);
        Archaeologist archaeologist2 = new Archaeologist("Gosho", 20);

        Assert.assertEquals(0, excavation.getCount());

        excavation.addArchaeologist(archaeologist);
        Assert.assertEquals(1, excavation.getCount());

        excavation.addArchaeologist(archaeologist2);
        Assert.assertEquals(2, excavation.getCount());
    }

    // 1.2 Capacity full
    @Test(expected = IllegalArgumentException.class)
    public void addingArcheologistShouldThrowWhenCapacityIsFull() throws IllegalArgumentException{
        Archaeologist archaeologist1 = new Archaeologist("Niki", 20);
        Archaeologist archaeologist2 = new Archaeologist("Gosho", 20);
        Archaeologist archaeologist3 = new Archaeologist("Pesho", 20);
        Archaeologist archaeologist4 = new Archaeologist("Dobri", 20);

        excavation.addArchaeologist(archaeologist1);
        excavation.addArchaeologist(archaeologist2);
        excavation.addArchaeologist(archaeologist3);

        //this should throw exception
        excavation.addArchaeologist(archaeologist4);
    }

    // 1.3 Archeologist already exists
    @Test(expected = IllegalArgumentException.class)
    public void addingExistingArcheologistShouldThrow() throws IllegalArgumentException {
        Archaeologist archaeologist1 = new Archaeologist("Niki", 20);
        Archaeologist archaeologist2 = new Archaeologist("Niki", 20);

        excavation.addArchaeologist(archaeologist1);

        //this should throw exception
        excavation.addArchaeologist(archaeologist2);
    }

    // 2. removeArchaeologist
    // 2.1 Successfully removing archeologist
    @Test
    public void successfullyRemovingArcheologist() {

        Archaeologist archaeologist1 = new Archaeologist("Niki", 20);
        Archaeologist archaeologist2 = new Archaeologist("Gosho", 20);

        excavation.addArchaeologist(archaeologist1);
        excavation.addArchaeologist(archaeologist2);

        Assert.assertEquals(2, excavation.getCount());

        Assert.assertTrue(excavation.removeArchaeologist("Niki"));
        Assert.assertEquals(1, excavation.getCount());

        Assert.assertTrue(excavation.removeArchaeologist("Gosho"));
        Assert.assertEquals(0, excavation.getCount());
    }

    // 2.2 Archeologist doesn't exist
    @Test
    public void unsuccessfulRemovingArcheologist() {
        Archaeologist archaeologist1 = new Archaeologist("Niki", 20);
        Archaeologist archaeologist2 = new Archaeologist("Gosho", 20);

        excavation.addArchaeologist(archaeologist1);

        Assert.assertFalse(excavation.removeArchaeologist("Gosho"));
    }
}
