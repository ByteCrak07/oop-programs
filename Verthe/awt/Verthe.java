import java.awt.*;
import java.awt.event.*;

class Blah implements ActionListener{
    Label lebel;
    TextField text;
    Button but1;

    Blah(Label l,TextField t, Button b){
        lebel = l;
        text = t;
        but1=b;
    }

    public void actionPerformed(ActionEvent e){
        String val,command;
        command = e.getActionCommand();
        Object ob = e.getSource();
        if(ob==but1){
            but1.setBackground(Color.GREEN);
        }
        if(command.equals("Submit")){
            val = text.getText();
            lebel.setText(val+ " hello");
        }
    }
}

public class Verthe {
    Frame frame;
    Panel panel;
    Button but1;
    TextField text;
    Label lebel;

    void app(){
        frame = new Frame("Verthe");
        panel = new Panel();
        panel.setBackground(Color.YELLOW);

        but1 = new Button("CLick me");
        text = new TextField(10);
        lebel = new Label();
        lebel.setPreferredSize(new Dimension(200,10));
        but1.setActionCommand("Submit");
        but1.addActionListener(new Blah(lebel,text,but1));

        panel.add(text);
        panel.add(but1);
        panel.add(lebel);

        frame.add(panel);
        frame.setSize(500,300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Verthe v = new Verthe();
        v.app();
    }
}
