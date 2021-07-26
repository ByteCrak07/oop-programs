import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculator implements ActionListener {
    JFrame frame;
    JPanel pan1, pan2, mainpan;
    JTextField ans;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot, badd, bsub, bmul, bdiv, bcal, bclr;
    float n1, n2, res;
    char op;
    boolean started, calculated;

    Calculator() {
        n1 = 0;
        n2 = 0;
        res = 0;
        op = '\u0000';
        started = false;
        calculated = false;
    }

    public void app() {
        frame = new JFrame("Calculator");

        pan1 = new JPanel();
        pan2 = new JPanel();
        mainpan = new JPanel();
        pan2.setLayout(new GridLayout(4, 4, 5, 5));

        ans = new JTextField(20);
        ans.setEditable(false);
        ans.setBackground(Color.WHITE);
        ans.setHorizontalAlignment(SwingConstants.RIGHT);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bdot = new JButton(".");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        bcal = new JButton("=");
        bclr = new JButton("C");

        b0.setActionCommand("0");
        b1.setActionCommand("1");
        b2.setActionCommand("2");
        b3.setActionCommand("3");
        b4.setActionCommand("4");
        b5.setActionCommand("5");
        b6.setActionCommand("6");
        b7.setActionCommand("7");
        b8.setActionCommand("8");
        b9.setActionCommand("9");
        bdot.setActionCommand(".");
        badd.setActionCommand("+");
        bsub.setActionCommand("-");
        bmul.setActionCommand("*");
        bdiv.setActionCommand("/");
        bcal.setActionCommand("=");
        bclr.setActionCommand("C");

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bdot.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bcal.addActionListener(this);
        bclr.addActionListener(this);

        pan1.add(ans);
        pan1.add(bclr);
        pan1.setMaximumSize(new Dimension(300, 10));
        pan1.setBorder(new EmptyBorder(10, 0, 0, 0));

        pan2.add(b7);
        pan2.add(b8);
        pan2.add(b9);
        pan2.add(bdiv);
        pan2.add(b4);
        pan2.add(b5);
        pan2.add(b6);
        pan2.add(bmul);
        pan2.add(b1);
        pan2.add(b2);
        pan2.add(b3);
        pan2.add(bsub);
        pan2.add(b0);
        pan2.add(bdot);
        pan2.add(bcal);
        pan2.add(badd);
        pan2.setBorder(new EmptyBorder(10, 10, 10, 10));

        mainpan.add(pan1);
        mainpan.add(pan2);
        mainpan.setLayout(new BoxLayout(mainpan, BoxLayout.Y_AXIS));

        frame.add(mainpan);
        frame.setSize(300, 300);
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
        String txt = ans.getText();
        if (txt.equals("+") || txt.equals("-") || txt.equals("*") || txt.equals("/")) {
            ans.setText(null);
            txt = "";
        }
        if (command == "=") {
            n2 = Float.parseFloat(ans.getText());

            if (op == '+')
                res = n1 + n2;
            if (op == '-')
                res = n1 - n2;
            if (op == '*')
                res = n1 * n2;
            if (op == '/') {
                if (n2 == 0.0) {
                    n1 = 0;
                    n2 = 0;
                    res = 0;
                    op = '\u0000';
                    ans.setText("Error: Division by zero");
                    return;
                } else
                    res = n1 / n2;
            }

            n1 = res;
            if (res == (int) res)
                ans.setText(Integer.toString((int) res));
            else
                ans.setText(Float.toString((res)));
            calculated = true;
        } else if (command == "+" || command == "-" || command == "*" || command == "/") {
            if (!started) {
                n1 = Float.parseFloat(ans.getText());
                started = true;
            } else {
                if (calculated) {
                    n1 = Float.parseFloat(ans.getText());
                    calculated = false;
                } else {
                    n2 = Float.parseFloat(ans.getText());

                    if (op == '+')
                        res = n1 + n2;
                    if (op == '-')
                        res = n1 - n2;
                    if (op == '*')
                        res = n1 * n2;
                    if (op == '/') {
                        if (n2 == 0.0) {
                            n1 = 0;
                            n2 = 0;
                            res = 0;
                            op = '\u0000';
                            ans.setText("Error: Division by zero");
                            return;
                        } else
                            res = n1 / n2;
                    }

                    n1 = res;
                }
            }
            ans.setText(command);
            op = command.charAt(0);
        } else if (command == "C") {
            n1 = 0;
            n2 = 0;
            res = 0;
            op = '\u0000';
            ans.setText(null);
            started = false;
            calculated = false;
        } else {
            ans.setText(txt + command);
        }
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.app();
    }
}