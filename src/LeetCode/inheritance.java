public class inheritance {

    public static void main(String[] args) {

        Cat dobby = new Cat();

        dobby.eat();

        dobby.legs = 4;
        dobby.color = "White";

        System.out.println("Cat Legs: " + dobby.legs);
        System.out.println("Cat Color: " + dobby.color);
    }
}

class Animal {

    String color;

    void eat() {
        System.out.println("Cat is Eating...");
    }

    void breathe() {
        System.out.println("Cat is Breathing...");
    }
}

class Mammal extends Animal {

    int legs;
}

class Cat extends Mammal {

    String name;
}