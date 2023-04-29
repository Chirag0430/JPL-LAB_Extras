package practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;        //CFAABJJJJ
import javax.swing.JRadioButton;
import javax.swing.JLabel;

class Traffic implements ActionListener {

    JFrame f;
    JPanel panel;
    JRadioButton redButton, yellowButton, greenButton;
    ButtonGroup buttonGroup;
    JLabel label;

    Traffic()
    {
        f = new JFrame("Traffic Light");
        f.setSize(300, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        redButton = new JRadioButton("Red");
        redButton.setBounds(100, 50, 100, 30);
        redButton.addActionListener(this);

        yellowButton = new JRadioButton("Yellow");
        yellowButton.setBounds(100, 100, 100, 30);
        yellowButton.addActionListener(this);

        greenButton = new JRadioButton("Green");
        greenButton.setBounds(100, 150, 100, 30);
        greenButton.addActionListener(this);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        label = new JLabel("");
        label.setBounds(100, 200, 100, 100);


        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);
        panel.add(label);

        f.add(panel);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            label.setText("Stop");
            label.setForeground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            label.setText("Ready");
            label.setForeground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            label.setText("Go");
            label.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        Traffic traffic = new Traffic();
}

}
