public class Interface {

    interface Vehicle {
        void start();
    }

    static class Car implements Vehicle {

        public void start() {
            System.out.println("Car Started");
        }
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}