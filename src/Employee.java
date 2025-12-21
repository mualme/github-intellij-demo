public class Employee extends Human {
    private String jobRole;
    private float salary;

    public static String companyName = "Office";

    public Employee(String name,int age,boolean isReady,String jobRole, float salary) {
        super(name, age, isReady);
        this.jobRole = jobRole;
        this.salary = salary;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am "+getName()+ " and I work as a " +jobRole);
    }

    public String getJobRole() { return jobRole; }
    public void setJobRole(String jobRole) { this.jobRole = jobRole; }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }
}