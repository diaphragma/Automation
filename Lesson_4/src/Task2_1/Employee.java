package Task2_1;

public class Employee {
    private float salary;
    public String surname;
    protected int id;

    public void showSalary() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    public Employee(float salary) {
        this.salary = salary;
    }

    private Employee(String surname) {
        this.surname = surname;
    }

    Employee(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1000.5f);
        Employee emp2 = new Employee("Johnson");
        Employee emp3 = new Employee(229);

        emp1.showSalary();
        emp2.showSurname();
        emp3.showId();

    }
}

class instanceEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1000.5f);
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

