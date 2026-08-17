import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("HALLO");

        JFrame frame = new JFrame("My first frame");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setVisible(true);

        JLabel label = new JLabel("HALLO");
        JButton button = new JButton("CIAO");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("clicked");
            }
        });

        frame.add(label);
        frame.add(button);
    }    
}
