import java.awt.*;

public class SimpleApplication_AWT {
    public static void main(String[] args) {
        // Create a new Frame
        Frame f = new Frame("My Window");

        // Create a new Button
        Button b = new Button("Click Me");

        // Set the placement of the Button
        b.setBounds(100, 100, 80, 30);

        // Add the Button to the Frame
        f.add(b);

        // Set the size of the Frame
        f.setSize(300, 300);

        // Make the Frame visible
        f.setVisible(true);
    }
}
