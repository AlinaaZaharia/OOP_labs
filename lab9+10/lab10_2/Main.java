import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type show whitespaces,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JPanel wrapperPanel=new JPanel();
        JLabel l = new JLabel ("username ");
        JTextField tf = new JTextField("   ");

        tf.setColumns(30);
        panel1.add(l);
        panel1.add(tf);
        panel1.setLayout(new FlowLayout());

        JLabel l2 = new JLabel ("password ");
        JTextField tf2 = new JTextField("      ");

        tf2.setColumns(30);
        panel1.add(l2);
        panel1.add(tf2);
        panel2.setLayout(new FlowLayout());


        //JButton b1 = new JButton("Button 1");
        // JButton b2 = new JButton("Button 2");
        // JButton b3 = new JButton("Button 3");
        //  panel2.add(b1);
        // panel2.add(b2);
        // panel2.add(b3);

        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        JCheckBox tc=new JCheckBox("Terms and Conditions ");
        p.add(tc);

        JButton b1 = new JButton("Login");
        b1.addActionListener(new LoginListener());
        p.add(b1);

        JLabel verif=new JLabel("Not logged in ");
        p.add(verif);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verif.setText("Succesfully logged in!");
            }
        });

        frame.setContentPane(p);
        frame.setVisible(true);
    }
}