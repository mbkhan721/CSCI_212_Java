package PracticeExam02.Interfaces.Quest3And4;

public abstract class Animal {
    String species;
    int population;

    public Animal (String s, int p){
        if (s == null || s=="")
            throw new FlyingAnimalException("Species must be given.");
        if (p < 0)
            throw new FlyingAnimalException("Population cannot be negative");
        species = s;
        population = p;
        System.out.println("New animal, species is "+species+", population " + population);

    }
    public String getSpecies() {
        return species;
    }
    public void setPopulation(int p) throws Exception {
        if (p<0)
            throw new Exception("Population cannot be negative");
        population = p;
    }

}
