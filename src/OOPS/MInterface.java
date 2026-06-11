public class MInterface {

    interface A {
        void show();
    }

    interface B {
        void print();
    }

    static class Demo implements A, B {

        public void show() {
            System.out.println("Show");
        }

        public void print() {
            System.out.println("Print");
        }
    }

    public static void main(String[] args) {

        Demo d = new Demo();

        d.show();
        d.print();
    }
}