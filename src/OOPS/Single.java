public class Single {

    static class Animal {
        void sound() {
            System.out.println("Animal Sound");
        }
    }

    static class Dog extends Animal {
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}