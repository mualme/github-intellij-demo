public class Student extends Human {
    private String major;
    private float gpa;

    public Student(String name,int age,boolean isReady,String major,float gpa) {
        super(name, age, isReady);
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public void sayHello() {
        System.out.println("Hi! My name is " +getName()+ ". I study "+major);
    }

    public String getMajor() { return major;}
    public void setMajor(String major) { this.major=major;}

    public float getGpa() { return gpa; }
    public void setGpa(float averageGrade) { this.gpa = gpa; }
}