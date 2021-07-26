import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JPanel panel1, panel2, panel3;
    JLabel num1, num2, res, msg;
    JTextField n1, n2, ans;
    JButton add, sub, mul, div;
    float Num1, Num2, Res;

    public void app() {
        frame = new JFrame("My Calculator");
        frame.setLayout(new GridLayout(3, 1));

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());

        num1 = new JLabel("Number 1");
        num2 = new JLabel("Number 2");
        res = new JLabel("Result");
        msg = new JLabel();

        n1 = new JTextField(5);
        n2 = new JTextField(5);
        ans = new JTextField(5);
        n1.addActionListener(this);
        n2.addActionListener(this);

        add = new JButton("Add");
        sub = new JButton("Sub");
        mul = new JButton("Mul");
        div = new JButton("Div");
        add.setActionCommand("Add");
        sub.setActionCommand("Sub");
        mul.setActionCommand("Mul");
        div.setActionCommand("Div");
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        panel1.add(num1);
        panel1.add(n1);
        panel1.add(num2);
        panel1.add(n2);
        panel1.add(res);
        panel1.add(ans);

        panel2.add(add);
        panel2.add(sub);
        panel2.add(mul);
        panel2.add(div);

        panel3.add(msg);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.setSize(400, 150);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        Num1 = Float.parseFloat(n1.getText());
        Num2 = Float.parseFloat(n2.getText());
        String command = e.getActionCommand();
        if (command.equals("Add")) {
            Res = Num1 + Num2;
            msg.setText("Add is clicked...");
        } else if (command.equals("Sub")) {
            Res = Num1 - Num2;
            msg.setText("Sub is clicked...");
        } else if (command.equals("Mul")) {
            Res = Num1 * Num2;
            msg.setText("Mul is clicked...");
        } else if (command.equals("Div")) {
            if (Num2 == 0.0) {
                msg.setText("Division error");
                ans.setText("Error");
                return;
            }
            Res = Num1 / Num2;
            msg.setText("Div is clicked...");
        }
        Res = Math.round(Res * 10000.0) / 10000.0f;
        ans.setText(Float.toString(Res));
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.app();
    }
}