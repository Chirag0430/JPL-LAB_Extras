class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.age = age;
    }
}

public class Encapsulation_person_Example {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
