class Students {
    private String name;
    private int rollNumber;
    private String department;

    public void getData(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}

class a02_Student1_2 {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.getData("John Doe", 1234, "Computer Science");
        s1.printData();

        Students s2 = new Students();
        s2.getData("Jane Smith", 5678, "Electronics");
        s2.printData();
    }
}
