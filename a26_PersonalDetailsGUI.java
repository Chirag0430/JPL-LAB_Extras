import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class a26_PersonalDetailsGUI extends JFrame implements ActionListener {
    JLabel nameLabel, ageLabel, emailLabel;
    JTextField nameTextField, ageTextField, emailTextField;
    JButton submitButton;

    public a26_PersonalDetailsGUI() {
        setTitle("Personal Details");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels
        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        emailLabel = new JLabel("Email:");

        // Create text fields
        nameTextField = new JTextField(20);
        ageTextField = new JTextField(20);
        emailTextField = new JTextField(20);

        // Create submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Create panel and add components
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(ageLabel);
        panel.add(ageTextField);
        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(new JLabel(""));
        panel.add(submitButton);

        // Add panel to frame
        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameTextField.getText();
            int age = Integer.parseInt(ageTextField.getText());
            String email = emailTextField.getText();
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nAge: " + age + "\nEmail: " + email);
        }
    }

    public static void main(String[] args) {
        new a26_PersonalDetailsGUI();
    }
}
