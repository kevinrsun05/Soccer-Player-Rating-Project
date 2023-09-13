import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class initialPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton descriptionButton = new JButton("Description of Stats");
    JButton statsEnterButton = new JButton("Enter Stats");
    JLabel important = new JLabel("Please read Description of Stats first *IMPORTANT");
    //First UI users will see has Description of Stats and enter stats button
    initialPage() {

        important.setBounds(90,50,300,100);
        frame.add(important);

        descriptionButton.setBounds(20,160,200,40);
        descriptionButton.setFocusable(false);
        descriptionButton.addActionListener(this);

        frame.add(descriptionButton);

        statsEnterButton.setBounds(240,160,200,40);
        statsEnterButton.setFocusable(false);
        statsEnterButton.addActionListener(this);

        frame.add(statsEnterButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    //ActionListener for which button user presses, if press Description of Stats, create DesWindow object, if Enter Stats, create StatWindow object
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == descriptionButton) {
            DesWindow descriptionWindow = new DesWindow();
        }
        else {
            StatWindow statWindow = new StatWindow();
        }

    }
}
