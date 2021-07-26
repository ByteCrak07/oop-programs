import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Traffic implements ActionListener {
    JFrame frame;
    JPanel mainPanel, pan1, pan2;
    JRadioButton red, yellow, green;
    JButton r, y, g;
    ButtonGroup bg;

    public void app() {
        frame = new JFrame("Traffic lights");

        mainPanel = new JPanel();
        pan1 = new JPanel();
        pan2 = new JPanel();

        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");
        red.setActionCommand("red");
        yellow.setActionCommand("yellow");
        green.setActionCommand("green");
        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);
        bg = new ButtonGroup();
        bg.add(red);
        bg.add(yellow);
        bg.add(green);

        r = new JButton();
        y = new JButton();
        g = new JButton();
        r.setBackground(Color.WHITE);
        y.setBackground(Color.WHITE);
        g.setBackground(Color.WHITE);

        pan1.add(r);
        pan1.add(y);
        pan1.add(g);
        pan1.setLayout(new GridLayout(3, 1, 5, 5));

        pan2.add(red);
        pan2.add(yellow);
        pan2.add(green);
        pan2.setMaximumSize(new Dimension(250, 50));

        pan1.setBorder(new EmptyBorder(10, 10, 10, 10));

        mainPanel.add(pan1);
        mainPanel.add(pan2);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        frame.add(mainPanel);
        frame.setSize(250, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        r.setBackground(Color.WHITE);
        y.setBackground(Color.WHITE);
        g.setBackground(Color.WHITE);
        if (command == "red")
            r.setBackground(Color.RED);
        if (command == "yellow")
            y.setBackground(Color.YELLOW);
        if (command == "green")
            g.setBackground(Color.GREEN);
    }

    public static void main(String[] args) {
        Traffic tr = new Traffic();
        tr.app();
    }
}
