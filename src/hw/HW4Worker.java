package hw;

public class HW4Worker {
    String name;
    String job;
    int salary;

    HW4Worker(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
     void showInfo() {
        System.out.println("Name: " + name + "\n" + "Job: " + job + "\n" + "Salary: " + salary);
    }
}
