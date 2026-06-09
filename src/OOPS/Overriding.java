public class Overriding {

    static class Animal {
        void sound() {
            System.out.println("Animal Sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog Barks");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}