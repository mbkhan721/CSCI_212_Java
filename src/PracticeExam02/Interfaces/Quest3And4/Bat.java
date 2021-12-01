package PracticeExam02.Interfaces.Quest3And4;

public class Bat extends FlyingAnimal {
    private boolean flapping = false;

    public Bat (String species) {
        super(species, Flapping.DEFAULT_WING_BEATS, Flapping.DEFAULT_POPULATION);
    }
    public Bat (String species, int population, int wingBeats) {
        super(species, population, wingBeats);
        System.out.println(this.getClass().getName()+" created, Species is "+ species
                +" wing beats = "+wingBeats);
    }

    @Override
    public int wingBeats() {
        return wingBeatsPerSecond;
    }

    @Override
    public boolean flaps() {
        return flapping;
    }
}
