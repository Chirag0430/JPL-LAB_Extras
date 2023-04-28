import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Table_Swing {
    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "John Doe", 85.5));
        students.add(new Student(2, "Jane Smith", 92.0));
        students.add(new Student(3, "Bob Johnson", 75.3));

        // Create a new JFrame
        JFrame frame = new JFrame("Student Table Example");

        // Set the layout manager
        frame.setLayout(new BorderLayout());

        // Create a new JTable
        String[] columns = {"Roll Number", "Name", "Percentage"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        for (Student student : students) {
            Object[] rowData = {student.getRollNumber(), student.getName(), student.getPercentage()};
            tableModel.addRow(rowData);
        }
        JTable table = new JTable(tableModel);

        // Add the JTable to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the JScrollPane to the JFrame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set the size of the JFrame
        frame.setSize(500, 300);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}

// A simple Student class
class Student {
    private int rollNumber;
    private String name;
    private double percentage;

    public Student(int rollNumber, String name, double percentage) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.percentage = percentage;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }
}
