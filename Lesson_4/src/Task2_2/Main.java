package Task2_2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1040.60f);
        Employee emp2 = new Employee("Johnson");
        Employee emp3 = new Employee(229);

        System.out.println(emp1.salary);
        System.out.println(emp2.surname);
        System.out.println(emp3.id);

        emp1.showSalary();
        emp2.showSurname();
        emp3.showId();

    }
}
