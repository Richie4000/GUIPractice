import javax.swing.*; // Java swing GUI
import javax.swing.border.Border; // Border
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener { // GUI class

    private int count = 0;
    private JFrame frame; // frame of GUI
    private JLabel label; // label
    private JPanel panel; // panel
    public GUI () {

       frame = new JFrame(); // new frame

        JButton button = new JButton("Click Me"); // button text
        button.addActionListener(this);

        // the number of clicks
        label = new JLabel("Number of clicks: 0");

        // border size and characteristics
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the program will close when I exit the App
        frame.setTitle("Richie's GUI"); // title of my GUI
        frame.pack();
        frame.setVisible(true);

    }

    // main method
    public static void main(String[] args) {
        new GUI();

    }

    // every time I click, the number changes from 0 to 1 and so on
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);

    }
}
