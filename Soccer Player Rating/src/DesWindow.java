import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DesWindow extends GUI {
    JFrame frame = new JFrame();
    JTextField note = new JTextField("Go to https://bit.ly/3BsztCO");
    //Gui that pops up if user clicks on the Description of Stats button. GUI prints message that gives user the bit.ly link to the descriptions
    DesWindow() {
        note.setEditable(false);
        note.setOpaque(false);
        note.setBorder(null);
        note.setBounds(120,100,520,100);
        note.setFont(new Font("Serif", Font.PLAIN, 20));
        frame.add(note);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
