package L01WorkingWithAbstraction.exercise.P5JediGalaxy;


public class Galaxy {
    private StarsField field;
    private Jedi jedi;
    private Evil evil;

    public Galaxy(StarsField field) {
        this.field = field;
        this.jedi = new Jedi();
        this.evil = new Evil();
    }

    public void moveEvil(int currentRowEvil, int currentColEvil) {
        evil.moveEvil(currentRowEvil, currentColEvil, this.field);
    }

    public long moveJedi(int currentRowJedi, int currentColJedi){
        return jedi.moveJedi(currentRowJedi, currentColJedi, this.field);
    }
}