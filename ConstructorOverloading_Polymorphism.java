class Employee {
    private String name;
    private int age;
    private String department;

    public Employee() {
        this.name = "John Doe";
        this.age = 30;
        this.department = "IT";
    }

    public Employee(String name) {
        this.name = name;
        this.age = 30;
        this.department = "IT";
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}

public class ConstructorOverloading_Polymorphism {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Jane Smith");
        Employee employee3 = new Employee("Bob Johnson", 35);
        Employee employee4 = new Employee("Mary Lee", 28, "Marketing");

        System.out.println("Employee 1: " + employee1.getName() + ", " + employee1.getAge() + ", " + employee1.getDepartment());
        System.out.println("Employee 2: " + employee2.getName() + ", " + employee2.getAge() + ", " + employee2.getDepartment());
        System.out.println("Employee 3: " + employee3.getName() + ", " + employee3.getAge() + ", " + employee3.getDepartment());
        System.out.println("Employee 4: " + employee4.getName() + ", " + employee4.getAge() + ", " + employee4.getDepartment());
    }
}
