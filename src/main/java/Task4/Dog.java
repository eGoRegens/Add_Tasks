package Task4;

public class Dog implements Runnable {
    public String typeAnimalRun;

    public Dog(String typeAnimal) {
        typeAnimalRun = typeAnimal;
    }

    @Override
    public void run() {
        System.out.println("Только " + typeAnimalRun + " умеет бегать.");
    }
}