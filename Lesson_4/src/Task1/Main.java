package Task1;

class Student {
    int id;
    String name;
    String surname;
    int course;
    float avgMath;
    float avgEconomy;
    float avgFL;

    public Student(float avgMath, float avgEconomy, float avgFL) {
        this.avgFL = avgFL;
        this.avgMath = avgMath;
        this.avgEconomy = avgEconomy;
    }
}

class StudentTest {
    Student std1 = new Student(7.3f, 10.4f, 11.0f);
    Student std2 = new Student(4.2f, 8.6f, 9.8f);
    Student std3 = new Student(10.1f, 11.6f, 11.3f);

    float avgTotal = (std1.avgMath + std2.avgEconomy + std3.avgFL) / 3;
}

public class Main {
    public static void main(String[] args) {
        StudentTest rsl = new StudentTest();
        System.out.println(rsl.avgTotal);

    }
}

