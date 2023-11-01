package Task3;

public class Pet {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setAge(5);
        cat1.speak();
    }

    static class Cat {
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int catAge) {
            age = catAge;
        }

        public void speak() {
            System.out.println("Моей кошке " + age + " лет");
        }
    }
}
