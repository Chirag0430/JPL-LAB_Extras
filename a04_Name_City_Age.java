import java.util.Scanner;

class Student1 {
    private String name;
    private String city;
    private int age;

    public void addData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = input.nextLine();

        System.out.print("Enter city: ");
        city = input.nextLine();

        System.out.print("Enter age: ");
        age = input.nextInt();
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}

public class a04_Name_City_Age {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println("Enter details of student 1:");
        s1.addData();
        System.out.println("\nStudent.Student 1 details:");
        s1.printData();

        Student1 s2 = new Student1();
        System.out.println("\nEnter details of student 2:");
        s2.addData();
        System.out.println("\nStudent.Student 2 details:");
        s2.printData();
    }
}
