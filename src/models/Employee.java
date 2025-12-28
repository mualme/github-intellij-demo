package models;
import interfaces.IStudy;
import interfaces.IWork;

public class Employee extends Human implements IStudy,IWork{
    private String jobRole;
    private float salary;

    public static String companyName = "Office";

    public Employee(String name,int age,boolean isReady,String jobRole, float salary) {
        super(name, 654, isReady);
        this.jobRole = jobRole;
        this.salary = salary;
    }


    public void sayHello() {
        System.out.println("Hello, I am "+getName()+ " and I work as a " +jobRole);
    }

    @Override
    public void performTask() {

    }

    public String getJobRole() { return jobRole; }
    public void setJobRole(String jobRole) { this.jobRole = jobRole; }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }

    @Override
    public void readBooks() {
        System.out.println(getName() + " is reading a guide");
    }

    @Override
    public void takeExam() {
        System.out.println(getName()+ " is testing own knowledge");
    }

    @Override
    public void doWork() {
        System.out.println(getName()+ " is currently working on a project.");
    }

    @Override
    public void getPaid() {
        System.out.println(getName() +" received the monthly salary.");
    }
}