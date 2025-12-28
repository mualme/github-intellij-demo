package main;

import interfaces.IWork;
import interfaces.IStudy;
import models.Employee;
import models.Human;
import models.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Human humanRef = new Student("Dina", 19, true, "DJ", 4.0f);
        Student studentRef = new Student("Alina", 20, true, "CS", 3.5f);
        IWork workerRef = new Employee("Dias", 30, true, "Google", 500000);

        System.out.println("-models.Student Registration-");
        System.out.print("Name: ");
        String nameIn = sc.nextLine();
        System.out.print("Major: ");
        String majorIn = sc.nextLine();
        System.out.print("Age: ");
        int ageIn = sc.nextInt();
        System.out.print("Gpa: ");
        float gpaIn = sc.nextFloat();

        Student stuD = new Student(nameIn, ageIn, true, majorIn, gpaIn);

        System.out.println("---Action---");
        stuD.sayHello();
        stuD.celebrateBirthday();
        stuD.takeExam();
        stuD.showGpa();
        stuD.performTask();

        System.out.println("-Full student test-");
        studentRef.readBooks();
        studentRef.takeExam();
        studentRef.performTask();
        studentRef.showGpa();

        System.out.println("-Full employee test-");
        workerRef.doWork();
        workerRef.getPaid();
        ((IStudy) workerRef).readBooks();
        ((IStudy) workerRef).takeExam();
    }
}