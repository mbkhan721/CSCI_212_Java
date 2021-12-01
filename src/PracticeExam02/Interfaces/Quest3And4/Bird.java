package PracticeExam02.Interfaces.Quest3And4;

public class Bird extends FlyingAnimal {
    private boolean flapping = true;

    public Bird (String species) throws Exception {
        super(species, Flapping.DEFAULT_POPULATION, Flapping.DEFAULT_WING_BEATS);
    }
    public Bird (String species, int population, int wingBeats, boolean f){
        super(species, population, wingBeats);
        System.out.println(this.toString()+" created, Species is "+ species
                +" wing beats = "+wingBeats);
    }
    public int wingBeats() {
        return wingBeatsPerSecond;
    }
    public boolean flaps () {
        return flapping;
    }
}
