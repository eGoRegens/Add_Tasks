package Task4;

public class Fish {
    public String typeAnimalSweam;

    public Fish(String typeAnimal) {
        typeAnimalSweam = typeAnimal;
    }

    public static void main(String[] args) {
        Fish fish = new Fish("рыба");
        fish.sweam();
    }

    public void sweam() {
    }
}