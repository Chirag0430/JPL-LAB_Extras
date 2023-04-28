import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_Swing extends JFrame implements ActionListener {
    private JTextField display;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", ".", "=", "/"
    };
    private double firstNum = 0.0;
    private String operation = "";

    public Calculator_Swing() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        display = new JTextField("0", 20);
        display.setEditable(false);
        topPanel.add(display, BorderLayout.CENTER);
        add(topPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        buttons = new JButton[buttonLabels.length];
        for(int i=0; i<buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonLabel = e.getActionCommand();
        if(buttonLabel.equals("+") || buttonLabel.equals("-") || buttonLabel.equals("*") || buttonLabel.equals("/")) {
            firstNum = Double.parseDouble(display.getText());
            operation = buttonLabel;
            display.setText("");
        } else if(buttonLabel.equals("=")) {
            double secondNum = Double.parseDouble(display.getText());
            double result = 0.0;
            if(operation.equals("+")) {
                result = firstNum + secondNum;
            } else if(operation.equals("-")) {
                result = firstNum - secondNum;
            } else if(operation.equals("*")) {
                result = firstNum * secondNum;
            } else if(operation.equals("/")) {
                result = firstNum / secondNum;
            }
            display.setText(Double.toString(result));
            firstNum = 0.0;
            operation = "";
        } else {
            String currentText = display.getText();
            if(currentText.equals("0")) {
                display.setText(buttonLabel);
            } else {
                display.setText(currentText + buttonLabel);
            }
        }
    }

    public static void main(String[] args) {
        new Calculator_Swing();
    }
}
