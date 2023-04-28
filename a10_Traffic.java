import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class a10_Traffic {
    private JLabel label;

    public a10_Traffic() {
        // Create a new JFrame
        JFrame frame = new JFrame("Traffic Light Example");

        // Create a new JPanel
        JPanel panel = new JPanel(new GridLayout(4, 1));

        // Create three radio buttons for the traffic lights
        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton yellowButton = new JRadioButton("Yellow");
        JRadioButton greenButton = new JRadioButton("Green");

        // Add the radio buttons to a ButtonGroup
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        // Create a new JLabel for the message
        label = new JLabel("", JLabel.CENTER);
        label.setOpaque(true);

        // Add the radio buttons and the JLabel to the panel
        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);
        panel.add(label);

        // Create an ActionListener for the radio buttons
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the selected radio button
                JRadioButton button = (JRadioButton) e.getSource();

                // Set the message text and color based on the selected button
                if (button == redButton) {
                    label.setText("STOP");
                    label.setBackground(Color.RED);
                } else if (button == yellowButton) {
                    label.setText("READY");
                    label.setBackground(Color.YELLOW);
                } else if (button == greenButton) {
                    label.setText("GO");
                    label.setBackground(Color.GREEN);
                }
            }
        };

        // Add the ActionListener to the radio buttons
        redButton.addActionListener(listener);
        yellowButton.addActionListener(listener);
        greenButton.addActionListener(listener);

        // Set the size of the JFrame and make it visible
        frame.setSize(300, 200);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new a10_Traffic();
    }
}
