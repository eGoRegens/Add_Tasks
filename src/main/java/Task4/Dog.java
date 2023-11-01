package Task4;

public class Dog implements Runnable {
    public String typeAnimal1;

    public Dog(String typeAnimal) {
        this.typeAnimal1 = typeAnimal;
    }

    @Override
    public void run() {
        System.out.println("Только " + this.typeAnimal1 + " умеет бегать.");
    }
}