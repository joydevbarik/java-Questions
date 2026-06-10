public class Encapsulation {

    static class Employee {

        private int salary = 50000;

        public int getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        System.out.println("Salary = " + e.getSalary());
    }
}