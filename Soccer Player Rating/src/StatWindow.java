import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StatWindow extends GUI implements ActionListener{
    public static JButton button;
    JFrame frame = new JFrame();
    JButton misc = new JButton("Miscellaneous Stats");
    JButton shoot = new JButton("Shooting Stats");
    JButton pass = new JButton("Passing Stats");
    JButton goalShot = new JButton("Goal/Shot Creation Stats");
    JButton defense = new JButton("Defensive Stats");
    JButton possession = new JButton("Possession Stats");
    JLabel note = new JLabel("Please Enter Stats For All Categories");
    //Create GUI for when user click "Enter Stats" from initialPage class. Gui has all the categories of stats to click on (miscellaneous, shooting, passing, etc.)
    StatWindow() {
        note.setBounds(570,50,400,100);
        frame.add(note);

        misc.setBounds(20,160,200,40);
        misc.setFocusable(false);
        misc.addActionListener(this);
        frame.add(misc);

        shoot.setBounds(240,160,200,40);
        shoot.setFocusable(false);
        shoot.addActionListener(this);
        frame.add(shoot);

        pass.setBounds(460,160,200,40);
        pass.setFocusable(false);
        pass.addActionListener(this);
        frame.add(pass);

        goalShot.setBounds(680,160,200,40);
        goalShot.setFocusable(false);
        goalShot.addActionListener(this);
        frame.add(goalShot);

        defense.setBounds(900,160,200,40);
        defense.setFocusable(false);
        defense.addActionListener(this);
        frame.add(defense);

        possession.setBounds(1120,160,200,40);
        possession.setFocusable(false);
        possession.addActionListener(this);
        frame.add(possession);

        button = new JButton("Enter");
        button.setBounds(570, 250, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        note = new JLabel("");
        note.setBounds(450, 300, 550, 40);
        frame.add(note);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1360,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    // ActionListener for which button user clicks. Any button but Enter calls a method from GUI class where another gui will pop up. If Enter, all user input gets stored into ArrayLists
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == misc) {
            miscEnter();
        }
        else if (e.getSource() == shoot) {
            shootEnter();
        }
        else if (e.getSource() == pass) {
            passEnter();
        }
        else if (e.getSource() == goalShot) {
            creationEnter();
        }
        else if (e.getSource() == defense) {
            defenseEnter();
        }
        else if (e.getSource() == possession) {
            possEnter();
        }
        else {
            date1 = dateText.getText();
            playerName1 = playerNameText.getText();
            playerPosition1 = playerPositionText.getText();
            minutes1 = Double.parseDouble(minutesText.getText());

            miscStats.add(Double.parseDouble(yellowText.getText()));
            miscStats.add(Double.parseDouble(redText.getText()));
            miscStats.add(Double.parseDouble(foulCommitText.getText()));
            miscStats.add(Double.parseDouble(foulDrawnText.getText()));
            miscStats.add(Double.parseDouble(offsideText.getText()));
            miscStats.add(Double.parseDouble(ownGoalText.getText()));
            miscStats.add(Double.parseDouble(aerialWonText.getText()));
            miscStats.add(Double.parseDouble(aerialContestedText.getText()));
            miscStats.add(Double.parseDouble(crossesText.getText()));

            shootStats.add(Double.parseDouble(goalsText.getText()));
            shootStats.add(Double.parseDouble(shotsOnTargetText.getText()));
            shootStats.add(Double.parseDouble(shotsText.getText()));
            shootStats.add(Double.parseDouble(penaltyKicksMadeText.getText()));
            shootStats.add(Double.parseDouble(penaltyKicksMissText.getText()));

            passStats.add(Double.parseDouble(passComplete15YdText.getText()));
            passStats.add(Double.parseDouble(passComplete15YdAttemptedText.getText()));
            passStats.add(Double.parseDouble(passComplete1530YdText.getText()));
            passStats.add(Double.parseDouble(passComplete1530YdAttemptedText.getText()));
            passStats.add(Double.parseDouble(passComplete30YdText.getText()));
            passStats.add(Double.parseDouble(passComplete30YdAttemptedText.getText()));
            passStats.add(Double.parseDouble(assistText.getText()));
            passStats.add(Double.parseDouble(keyPassText.getText()));
            passStats.add(Double.parseDouble(passThirdText.getText()));
            passStats.add(Double.parseDouble(passPenaltyText.getText()));
            passStats.add(Double.parseDouble(passOffsideText.getText()));
            passStats.add(Double.parseDouble(passOobText.getText()));
            passStats.add(Double.parseDouble(passIntText.getText()));
            passStats.add(Double.parseDouble(passBlockText.getText()));

            creationStats.add(Double.parseDouble(shotCreatingActionText.getText()));
            creationStats.add(Double.parseDouble(goalCreatingActionText.getText()));
            creationStats.add(Double.parseDouble(completedPassToShotText.getText()));
            creationStats.add(Double.parseDouble(completedPassToGoalText.getText()));
            creationStats.add(Double.parseDouble(dribbleToShotText.getText()));
            creationStats.add(Double.parseDouble(dribbleToGoalText.getText()));
            creationStats.add(Double.parseDouble(shotToShotText.getText()));
            creationStats.add(Double.parseDouble(shotToGoalText.getText()));
            creationStats.add(Double.parseDouble(foulToShotText.getText()));
            creationStats.add(Double.parseDouble(foulToGoalText.getText()));

            defenseStats.add(Double.parseDouble(tacklesText.getText()));
            defenseStats.add(Double.parseDouble(tacklesWonText.getText()));
            defenseStats.add(Double.parseDouble(tacklesDef3rdText.getText()));
            defenseStats.add(Double.parseDouble(tacklesMid3rdText.getText()));
            defenseStats.add(Double.parseDouble(tacklesAtt3rdText.getText()));
            defenseStats.add(Double.parseDouble(dribbledPastText.getText()));
            defenseStats.add(Double.parseDouble(pressuresText.getText()));
            defenseStats.add(Double.parseDouble(succPressuresText.getText()));
            defenseStats.add(Double.parseDouble(succPressureDef3rdText.getText()));
            defenseStats.add(Double.parseDouble(succPressureMid3rdText.getText()));
            defenseStats.add(Double.parseDouble(succPressureAtt3rdText.getText()));
            defenseStats.add(Double.parseDouble(shotBlockedText.getText()));
            defenseStats.add(Double.parseDouble(shotSavedText.getText()));
            defenseStats.add(Double.parseDouble(passBlockedText.getText()));
            defenseStats.add(Double.parseDouble(interceptionText.getText()));
            defenseStats.add(Double.parseDouble(errorText.getText()));

            possStats.add(Double.parseDouble(touchText.getText()));
            possStats.add(Double.parseDouble(dribbleCompletedText.getText()));
            possStats.add(Double.parseDouble(dribbleAttemptedText.getText()));
            possStats.add(Double.parseDouble(miscontrolsText.getText()));
            possStats.add(Double.parseDouble(dispossessedText.getText()));

            //Check what player position is to calculate player rating (calls a method in GUI class)
            if (playerPosition1.equals("Striker")) {
                try {
                    Striker();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            else if (playerPosition1.equals("Winger")) {
                try {
                    Winger();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            else if (playerPosition1.equals("Center Back")) {
                try {
                    CenterBack();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            else if (playerPosition1.equals("Full Back")) {
                try {
                    FullBack();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            else if (playerPosition1.equals("Defensive Mid")) {
                try {
                    DefensiveMid();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            else if (playerPosition1.equals("Right Mid") || playerPosition1.equals("Left Mid")) {
                try {
                    SideMid();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            else if (playerPosition1.equals("Center Mid")) {
                try {
                    CenterMid();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            else if (playerPosition1.equals("Attacking Mid")) {
                try {
                    AttackingMid();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
