import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Swing implements ActionListener {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel jLab1;

    private JPanel controlPanel1;
    private JPanel controlPanel2;
    private JPanel controlPanel3;

    JRadioButton b1;
    JRadioButton b2;
    JRadioButton b3;
    ButtonGroup bg;
    JButton b4, b5, b6;

    public Swing() {
        prepareGUI();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java Radio Button");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new GridLayout(5, 1));

        headerLabel = new JLabel("", JLabel.CENTER);

        b1 = new JRadioButton("R");
        b1.addActionListener(this);

        b2 = new JRadioButton("Y");
        b2.addActionListener(this);

        b3 = new JRadioButton("G");
        b3.addActionListener(this);

        bg = new ButtonGroup();
        b4 = new JButton("RED");
        b4.setPreferredSize(new Dimension(120, 30));

        b5 = new JButton("YELLOW");
        b5.setPreferredSize(new Dimension(120, 30));

        b6 = new JButton("GREEN");
        b6.setPreferredSize(new Dimension(120, 30));
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);

        jLab1 = new JLabel("Select ");

        controlPanel1 = new JPanel();
        controlPanel2 = new JPanel();
        controlPanel3 = new JPanel();

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel1);
        mainFrame.add(controlPanel1);
        mainFrame.add(controlPanel2);
        mainFrame.add(controlPanel3);
        mainFrame.add(jLab1);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    private void showEventDemo() {
        headerLabel.setText("Control in Action");
        controlPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        controlPanel1.add(b1);
        controlPanel1.add(b4);

        controlPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        controlPanel2.add(b2);
        controlPanel2.add(b5);

        controlPanel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        controlPanel3.add(b3);
        controlPanel3.add(b6);

        mainFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        jLab1.setText("You selected " + ae.getActionCommand());
        String command = ae.getActionCommand();

        if (command.equals("R")) {
            b4.setBackground(Color.RED);
            b4.setOpaque(true);
            b5.setBackground(null);
            b6.setBackground(null);
        }

        if (command.equals("Y")) {
            b5.setBackground(Color.YELLOW);
            b5.setOpaque(true);
            b4.setBackground(null);
            b6.setBackground(null);
        }

        if (command.equals("G")) {
            b6.setBackground(Color.GREEN);
            b6.setOpaque(true);
            b4.setBackground(null);
            b5.setBackground(null);
        }
    }

    public static void main(String[] args) {
        Swing swingControlDemo = new Swing();
        swingControlDemo.showEventDemo();
    }
}
