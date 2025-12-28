package models;
import interfaces.IStudy;

public final class Student extends Human implements IStudy {
    private String major;
    private float gpa;

    public Student(String name,int age,boolean isReady,String major,float gpa) {
        super(name, age, isReady);
        this.major = major;
        this.gpa = gpa;
    }

    public void sayHello() {
        System.out.println("Hi! My name is " +getName()+ ". I study "+major);
    }

    public String getMajor() { return major;}
    public void setMajor(String major) { this.major=major;}

    public float getGpa() { return gpa; }
    public void setGpa(float averageGrade) {
    }

    public final void showGpa() {
        System.out.println("Student " + getName()+ "'s GPA is "+gpa);
    }

    private final String status = "Active";

    @Override
    public final void performTask() {
        System.out.println("Student is studying hard.");
    }
    public void study() { System.out.println("Studying..."); }
    public void passExam() { System.out.println("Exam passed!"); }

    @Override
    public void readBooks() {
        System.out.println(getName() +" is reading");
    }

    @Override
    public void takeExam() {
        System.out.println( getName()+ " is on an Exam");
    }
}