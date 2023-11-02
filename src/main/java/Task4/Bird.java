package Task4;

public class Bird {
    public String typeAnimalFly;

    public Bird(String typeAnimal) {
        typeAnimalFly = typeAnimal;
    }

    public void fly() {
    }

    public static void main(String[] args) {
        Bird bird = new Bird("птица");
        bird.fly();
    }
}     //не знаю,что делать с этими классами,которые неимлементируются по заданию,пусть как заготовка будет.