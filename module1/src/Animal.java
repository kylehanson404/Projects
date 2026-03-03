public class Animal {

    // private data field
    private String species;

    // default constructor
    public Animal() {
        species = "";
    }

    // custom constructor
    public Animal(String newSpecies) {
        species = newSpecies;
    }

    // setter method
    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    // getter method
    public String getSpecies() {
        return species;
    }

    // toString method
    
    public String toString() {
        return "Species: " + species;
    }
}