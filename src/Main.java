import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Human h = new Human("Viktor", 45, false);
        Employee e = new Employee("Elena", 30, true, "Designer", 2500.0f);

        System.out.println("-Student Registration-");
        System.out.print("Name: ");
        String nameIn = sc.nextLine();
        System.out.print("Major: ");
        String majorIn = sc.nextLine();
        System.out.print("Age: ");
        int ageIn = sc.nextInt();
        System.out.print("Gpa: ");
        float gpaIn = sc.nextFloat();

        Student s = new Student(nameIn, ageIn, true, majorIn, gpaIn);

        System.out.println("-Actions-");
        h.sayHello();
        e.sayHello();
        s.sayHello();

        s.celebrateBirthday();
        sc.close();
    }
}