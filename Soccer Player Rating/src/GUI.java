import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.*;
import java.io.*;

public class GUI {
    public static double playerRating = 6;
    // Misc stat
    public static JLabel date;
    public static JTextField dateText;
    public static JLabel playerName;
    public static JTextField playerNameText;
    public static JLabel playerPosition;
    public static JTextField playerPositionText;
    public static JLabel minutes;
    public static JTextField minutesText;
    public static JLabel yellow;
    public static JTextField yellowText;
    public static JLabel red;
    public static JTextField redText;
    public static JLabel foulCommit;
    public static JTextField foulCommitText;
    public static JLabel foulDrawn;
    public static JTextField foulDrawnText;
    public static JLabel offside;
    public static JTextField offsideText;
    public static JLabel ownGoal;
    public static JTextField ownGoalText;
    public static JLabel aerialWon;
    public static JTextField aerialWonText;
    public static JLabel aerialContested;
    public static JTextField aerialContestedText;
    public static JLabel crosses;
    public static JTextField crossesText;
    public static String date1;
    public static String playerName1;
    public static String playerPosition1;
    public static double minutes1;
    ArrayList<Double> miscStats = new ArrayList<>();

    // Shoot stat
    public static JLabel goals;
    public static JTextField goalsText;
    public static JLabel shotsOnTarget;
    public static JTextField shotsOnTargetText;
    public static JLabel shots;
    public static JTextField shotsText;
    public static JLabel penaltyKicksMade;
    public static JTextField penaltyKicksMadeText;
    public static JLabel penaltyKicksMiss;
    public static JTextField penaltyKicksMissText;
    ArrayList<Double> shootStats = new ArrayList<>();

    // pass stat
    public static JLabel passComplete15Yd;
    public static JTextField passComplete15YdText;
    public static JLabel passComplete1530Yd;
    public static JTextField passComplete1530YdText;
    public static JLabel passComplete30Yd;
    public static JTextField passComplete30YdText;
    public static JLabel passComplete15YdAttempted;
    public static JTextField passComplete15YdAttemptedText;
    public static JLabel passComplete1530YdAttempted;
    public static JTextField passComplete1530YdAttemptedText;
    public static JLabel passComplete30YdAttempted;
    public static JTextField passComplete30YdAttemptedText;
    public static JLabel assist;
    public static JTextField assistText;
    public static JLabel keyPass;
    public static JTextField keyPassText;
    public static JLabel passThird;
    public static JTextField passThirdText;
    public static JLabel passPenalty;
    public static JTextField passPenaltyText;
    public static JLabel passOffside;
    public static JTextField passOffsideText;
    public static JLabel passOob;
    public static JTextField passOobText;
    public static JLabel passInt;
    public static JTextField passIntText;
    public static JLabel passBlock;
    public static JTextField passBlockText;
    ArrayList<Double> passStats = new ArrayList<>();

    // goal & shot creation stat
    public static JLabel shotCreatingAction;
    public static JTextField shotCreatingActionText;
    public static JLabel goalCreatingAction;
    public static JTextField goalCreatingActionText;
    public static JLabel completedPassToShot;
    public static JTextField completedPassToShotText;
    public static JLabel completedPassToGoal;
    public static JTextField completedPassToGoalText;
    public static JLabel dribbleToShot;
    public static JTextField dribbleToShotText;
    public static JLabel dribbleToGoal;
    public static JTextField dribbleToGoalText;
    public static JLabel shotToShot;
    public static JTextField shotToShotText;
    public static JLabel shotToGoal;
    public static JTextField shotToGoalText;
    public static JLabel foulToShot;
    public static JTextField foulToShotText;
    public static JLabel foulToGoal;
    public static JTextField foulToGoalText;
    ArrayList<Double> creationStats = new ArrayList<>();

    // defense stat
    public static JLabel tackles;
    public static JTextField tacklesText;
    public static JLabel tacklesWon;
    public static JTextField tacklesWonText;
    public static JLabel tacklesDef3rd;
    public static JTextField tacklesDef3rdText;
    public static JLabel tacklesMid3rd;
    public static JTextField tacklesMid3rdText;
    public static JLabel tacklesAtt3rd;
    public static JTextField tacklesAtt3rdText;
    public static JLabel dribbledPast;
    public static JTextField dribbledPastText;
    public static JLabel pressures;
    public static JTextField pressuresText;
    public static JLabel succPressures;
    public static JTextField succPressuresText;
    public static JLabel succPressureDef3rd;
    public static JTextField succPressureDef3rdText;
    public static JLabel succPressureMid3rd;
    public static JTextField succPressureMid3rdText;
    public static JLabel succPressureAtt3rd;
    public static JTextField succPressureAtt3rdText;
    public static JLabel shotBlocked;
    public static JTextField shotBlockedText;
    public static JLabel shotSaved;
    public static JTextField shotSavedText;
    public static JLabel passBlocked;
    public static JTextField passBlockedText;
    public static JLabel interception;
    public static JTextField interceptionText;
    public static JLabel error;
    public static JTextField errorText;
    ArrayList<Double> defenseStats = new ArrayList<>();

    //possession stat
    public static JLabel touch;
    public static JTextField touchText;
    public static JLabel dribbleCompleted;
    public static JTextField dribbleCompletedText;
    public static JLabel dribbleAttempted;
    public static JTextField dribbleAttemptedText;
    public static JLabel miscontrols;
    public static JTextField miscontrolsText;
    public static JLabel dispossessed;
    public static JTextField dispossessedText;
    ArrayList<Double> possStats = new ArrayList<>();

    //main, it creates Table object and initialPage Object
    public static void main(String[] args) throws FileNotFoundException {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Table table = new Table();
        table.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        table.setSize(600,400);
        table.setVisible(true);
        table.setTitle("Player Ratings");
        initialPage initial = new initialPage();
    }

    //gui for the stats to enter in misc stats category
    public void miscEnter() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        date = new JLabel("Date");
        date.setBounds(10, 20, 150, 25);
        panel.add(date);

        dateText = new JTextField(20);
        dateText.setBounds(170, 20, 150, 25);
        panel.add(dateText);

        playerName = new JLabel("Player Name");
        playerName.setBounds(10, 50, 150, 25);
        panel.add(playerName);

        playerNameText = new JTextField(20);
        playerNameText.setBounds(170, 50, 150, 25);
        panel.add(playerNameText);

        playerPosition = new JLabel("Player Position");
        playerPosition.setBounds(10, 80, 150, 25);
        panel.add(playerPosition);

        playerPositionText = new JTextField(20);
        playerPositionText.setBounds(170, 80, 150, 25);
        panel.add(playerPositionText);

        minutes = new JLabel("Minutes Played");
        minutes.setBounds(10, 110, 150, 25);
        panel.add(minutes);

        minutesText = new JTextField(20);
        minutesText.setBounds(170, 110, 50, 25);
        panel.add(minutesText);

        yellow = new JLabel("Yellow Cards");
        yellow.setBounds(10, 140, 150, 25);
        panel.add(yellow);

        yellowText = new JTextField(20);
        yellowText.setBounds(170, 140, 50, 25);
        panel.add(yellowText);

        red = new JLabel("Red Cards");
        red.setBounds(10, 170, 150, 25);
        panel.add(red);

        redText = new JTextField(20);
        redText.setBounds(170, 170, 50, 25);
        panel.add(redText);

        foulCommit = new JLabel("Fouls Commited");
        foulCommit.setBounds(10, 200, 150, 25);
        panel.add(foulCommit);

        foulCommitText = new JTextField(20);
        foulCommitText.setBounds(170, 200, 50, 25);
        panel.add(foulCommitText);

        foulDrawn = new JLabel("Fouls Drawn");
        foulDrawn.setBounds(10, 230, 150, 25);
        panel.add(foulDrawn);

        foulDrawnText = new JTextField(20);
        foulDrawnText.setBounds(170, 230, 50, 25);
        panel.add(foulDrawnText);

        offside = new JLabel("Offsides");
        offside.setBounds(10, 260, 150, 25);
        panel.add(offside);

        offsideText = new JTextField(20);
        offsideText.setBounds(170, 260, 50, 25);
        panel.add(offsideText);

        ownGoal = new JLabel("Own Goals");
        ownGoal.setBounds(10, 290, 150, 25);
        panel.add(ownGoal);

        ownGoalText = new JTextField(20);
        ownGoalText.setBounds(170, 290, 50, 25);
        panel.add(ownGoalText);

        aerialWon = new JLabel("Aerials Won");
        aerialWon.setBounds(10, 320, 150, 25);
        panel.add(aerialWon);

        aerialWonText = new JTextField(20);
        aerialWonText.setBounds(170, 320, 50, 25);
        panel.add(aerialWonText);

        aerialContested = new JLabel("Aerials Contested");
        aerialContested.setBounds(10, 350, 110, 25);
        panel.add(aerialContested);

        aerialContestedText = new JTextField(20);
        aerialContestedText.setBounds(170, 350, 50, 25);
        panel.add(aerialContestedText);

        crosses = new JLabel("Crosses");
        crosses.setBounds(10, 380, 150, 25);
        panel.add(crosses);

        crossesText = new JTextField(20);
        crossesText.setBounds(170, 380, 50, 25);
        panel.add(crossesText);

        frame.setVisible(true);
    }
    // gui for stats to enter in shooting stats category
    public void shootEnter() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        goals = new JLabel("Goals");
        goals.setBounds(10, 20, 150, 25);
        panel.add(goals);

        goalsText = new JTextField(20);
        goalsText.setBounds(170, 20, 50, 25);
        panel.add(goalsText);

        shotsOnTarget = new JLabel("Shots On Target");
        shotsOnTarget.setBounds(10, 50, 150, 25);
        panel.add(shotsOnTarget);

        shotsOnTargetText = new JTextField(20);
        shotsOnTargetText.setBounds(170, 50, 50, 25);
        panel.add(shotsOnTargetText);

        shots = new JLabel("Shots Total");
        shots.setBounds(10, 80, 150, 25);
        panel.add(shots);

        shotsText = new JTextField(20);
        shotsText.setBounds(170, 80, 50, 25);
        panel.add(shotsText);

        penaltyKicksMade = new JLabel("Penalty Kicks Made");
        penaltyKicksMade.setBounds(10, 110, 150, 25);
        panel.add(penaltyKicksMade);

        penaltyKicksMadeText = new JTextField(20);
        penaltyKicksMadeText.setBounds(170, 110, 50, 25);
        panel.add(penaltyKicksMadeText);

        penaltyKicksMiss = new JLabel("Penalty Kicks Missed");
        penaltyKicksMiss.setBounds(10, 140, 150, 25);
        panel.add(penaltyKicksMiss);

        penaltyKicksMissText = new JTextField(20);
        penaltyKicksMissText.setBounds(170, 140, 50, 25);
        panel.add(penaltyKicksMissText);

        frame.setVisible(true);
    }

    // gui to enter stats in passing stats category
    public void passEnter() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        passComplete15Yd = new JLabel("Passes Completed (Short)");
        passComplete15Yd.setBounds(10, 20, 150, 25);
        panel.add(passComplete15Yd);

        passComplete15YdText = new JTextField(20);
        passComplete15YdText.setBounds(200, 20, 50, 25);
        panel.add(passComplete15YdText);

        passComplete15YdAttempted = new JLabel("Passes Attempted (Short)");
        passComplete15YdAttempted.setBounds(10, 50, 150, 25);
        panel.add(passComplete15YdAttempted);

        passComplete15YdAttemptedText = new JTextField(20);
        passComplete15YdAttemptedText.setBounds(200, 50, 50, 25);
        panel.add(passComplete15YdAttemptedText);

        passComplete1530Yd = new JLabel("Passes Completed (Medium)");
        passComplete1530Yd.setBounds(10, 80, 170, 25);
        panel.add(passComplete1530Yd);

        passComplete1530YdText = new JTextField(20);
        passComplete1530YdText.setBounds(200, 80, 50, 25);
        panel.add(passComplete1530YdText);

        passComplete1530YdAttempted = new JLabel("Passes Attempted (Medium)");
        passComplete1530YdAttempted.setBounds(10, 110, 170, 25);
        panel.add(passComplete1530YdAttempted);

        passComplete1530YdAttemptedText = new JTextField(20);
        passComplete1530YdAttemptedText.setBounds(200, 110, 50, 25);
        panel.add(passComplete1530YdAttemptedText);

        passComplete30Yd = new JLabel("Passes Completed (Long)");
        passComplete30Yd.setBounds(10, 140, 150, 25);
        panel.add(passComplete30Yd);

        passComplete30YdText = new JTextField(20);
        passComplete30YdText.setBounds(200, 140, 50, 25);
        panel.add(passComplete30YdText);

        passComplete30YdAttempted = new JLabel("Passes Attempted (Long)");
        passComplete30YdAttempted.setBounds(10, 170, 150, 25);
        panel.add(passComplete30YdAttempted);

        passComplete30YdAttemptedText = new JTextField(20);
        passComplete30YdAttemptedText.setBounds(200, 170, 50, 25);
        panel.add(passComplete30YdAttemptedText);

        assist = new JLabel("Assists");
        assist.setBounds(10, 200, 150, 25);
        panel.add(assist);

        assistText = new JTextField(20);
        assistText.setBounds(200, 200, 50, 25);
        panel.add(assistText);

        keyPass = new JLabel("Key Passes");
        keyPass.setBounds(10, 230, 150, 25);
        panel.add(keyPass);

        keyPassText = new JTextField(20);
        keyPassText.setBounds(200, 230, 50, 25);
        panel.add(keyPassText);

        passThird = new JLabel("Passes into Final Third");
        passThird.setBounds(10, 260, 150, 25);
        panel.add(passThird);

        passThirdText = new JTextField(20);
        passThirdText.setBounds(200, 260, 50, 25);
        panel.add(passThirdText);

        passPenalty = new JLabel("Passes into Penalty Area");
        passPenalty.setBounds(10, 290, 150, 25);
        panel.add(passPenalty);

        passPenaltyText = new JTextField(20);
        passPenaltyText.setBounds(200, 290, 50, 25);
        panel.add(passPenaltyText);

        passOffside = new JLabel("Passes Offside");
        passOffside.setBounds(10, 320, 150, 25);
        panel.add(passOffside);

        passOffsideText = new JTextField(20);
        passOffsideText.setBounds(200, 320, 50, 25);
        panel.add(passOffsideText);

        passOob = new JLabel("Passes Out of Bounds");
        passOob.setBounds(10, 350, 150, 25);
        panel.add(passOob);

        passOobText = new JTextField(20);
        passOobText.setBounds(200, 350, 50, 25);
        panel.add(passOobText);

        passInt = new JLabel("Passes Intercepted");
        passInt.setBounds(10, 380, 150, 25);
        panel.add(passInt);

        passIntText = new JTextField(20);
        passIntText.setBounds(200, 380, 50, 25);
        panel.add(passIntText);

        passBlock = new JLabel("Passes Blocked");
        passBlock.setBounds(10, 410, 150, 25);
        panel.add(passBlock);

        passBlockText = new JTextField(20);
        passBlockText.setBounds(200, 410, 50, 25);
        panel.add(passBlockText);

        frame.setVisible(true);
    }

    //gui to enter stats in shot/goal creation stats category
    public void creationEnter() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        shotCreatingAction = new JLabel("Shot Creating Action");
        shotCreatingAction.setBounds(10, 20, 150, 25);
        panel.add(shotCreatingAction);

        shotCreatingActionText = new JTextField(20);
        shotCreatingActionText.setBounds(200, 20, 50, 25);
        panel.add(shotCreatingActionText);

        goalCreatingAction = new JLabel("Goal Creating Action");
        goalCreatingAction.setBounds(10, 50, 150, 25);
        panel.add(goalCreatingAction);

        goalCreatingActionText = new JTextField(20);
        goalCreatingActionText.setBounds(200, 50, 50, 25);
        panel.add(goalCreatingActionText);

        completedPassToShot = new JLabel("SCA (Pass)");
        completedPassToShot.setBounds(10, 80, 170, 25);
        panel.add(completedPassToShot);

        completedPassToShotText = new JTextField(20);
        completedPassToShotText.setBounds(200, 80, 50, 25);
        panel.add(completedPassToShotText);

        completedPassToGoal = new JLabel("GCA (Pass)");
        completedPassToGoal.setBounds(10, 110, 170, 25);
        panel.add(completedPassToGoal);

        completedPassToGoalText = new JTextField(20);
        completedPassToGoalText.setBounds(200, 110, 50, 25);
        panel.add(completedPassToGoalText);

        dribbleToShot = new JLabel("SCA (Dribble)");
        dribbleToShot.setBounds(10, 140, 150, 25);
        panel.add(dribbleToShot);

        dribbleToShotText = new JTextField(20);
        dribbleToShotText.setBounds(200, 140, 50, 25);
        panel.add(dribbleToShotText);

        dribbleToGoal = new JLabel("GCA (Dribble)");
        dribbleToGoal.setBounds(10, 170, 150, 25);
        panel.add(dribbleToGoal);

        dribbleToGoalText = new JTextField(20);
        dribbleToGoalText.setBounds(200, 170, 50, 25);
        panel.add(dribbleToGoalText);

        shotToShot = new JLabel("SCA (Shot)");
        shotToShot.setBounds(10, 200, 150, 25);
        panel.add(shotToShot);

        shotToShotText = new JTextField(20);
        shotToShotText.setBounds(200, 200, 50, 25);
        panel.add(shotToShotText);

        shotToGoal = new JLabel("GCA (Shot)");
        shotToGoal.setBounds(10, 230, 150, 25);
        panel.add(shotToGoal);

        shotToGoalText = new JTextField(20);
        shotToGoalText.setBounds(200, 230, 50, 25);
        panel.add(shotToGoalText);

        foulToShot = new JLabel("SCA (Foul Drawn)");
        foulToShot.setBounds(10, 260, 150, 25);
        panel.add(foulToShot);

        foulToShotText = new JTextField(20);
        foulToShotText.setBounds(200, 260, 50, 25);
        panel.add(foulToShotText);

        foulToGoal = new JLabel("GCA (Foul Drawn)");
        foulToGoal.setBounds(10, 290, 150, 25);
        panel.add(foulToGoal);

        foulToGoalText = new JTextField(20);
        foulToGoalText.setBounds(200, 290, 50, 25);
        panel.add(foulToGoalText);

        frame.setVisible(true);
    }

    // gui to enter stats in defense stats category
    public void defenseEnter() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        tackles = new JLabel("Tackles");
        tackles.setBounds(10, 20, 150, 25);
        panel.add(tackles);

        tacklesText = new JTextField(20);
        tacklesText.setBounds(200, 20, 50, 25);
        panel.add(tacklesText);

        tacklesWon = new JLabel("Tackles Won");
        tacklesWon.setBounds(10, 50, 150, 25);
        panel.add(tacklesWon);

        tacklesWonText = new JTextField(20);
        tacklesWonText.setBounds(200, 50, 50, 25);
        panel.add(tacklesWonText);

        tacklesDef3rd = new JLabel("Tackles (Def 3rd)");
        tacklesDef3rd.setBounds(10, 80, 170, 25);
        panel.add(tacklesDef3rd);

        tacklesDef3rdText = new JTextField(20);
        tacklesDef3rdText.setBounds(200, 80, 50, 25);
        panel.add(tacklesDef3rdText);

        tacklesMid3rd = new JLabel("Tackles (Mid 3rd)");
        tacklesMid3rd.setBounds(10, 110, 170, 25);
        panel.add(tacklesMid3rd);

        tacklesMid3rdText = new JTextField(20);
        tacklesMid3rdText.setBounds(200, 110, 50, 25);
        panel.add(tacklesMid3rdText);

        tacklesAtt3rd = new JLabel("Tackles (Att 3rd)");
        tacklesAtt3rd.setBounds(10, 140, 150, 25);
        panel.add(tacklesAtt3rd);

        tacklesAtt3rdText = new JTextField(20);
        tacklesAtt3rdText.setBounds(200, 140, 50, 25);
        panel.add(tacklesAtt3rdText);

        dribbledPast = new JLabel("Dribbled Past");
        dribbledPast.setBounds(10, 170, 150, 25);
        panel.add(dribbledPast);

        dribbledPastText = new JTextField(20);
        dribbledPastText.setBounds(200, 170, 50, 25);
        panel.add(dribbledPastText);

        pressures = new JLabel("Pressures");
        pressures.setBounds(10, 200, 150, 25);
        panel.add(pressures);

        pressuresText = new JTextField(20);
        pressuresText.setBounds(200, 200, 50, 25);
        panel.add(pressuresText);

        succPressures = new JLabel("Successful Pressures");
        succPressures.setBounds(10, 230, 150, 25);
        panel.add(succPressures);

        succPressuresText = new JTextField(20);
        succPressuresText.setBounds(200, 230, 50, 25);
        panel.add(succPressuresText);

        succPressureDef3rd = new JLabel("Pressures (Def 3rd)");
        succPressureDef3rd.setBounds(10, 260, 150, 25);
        panel.add(succPressureDef3rd);

        succPressureDef3rdText = new JTextField(20);
        succPressureDef3rdText.setBounds(200, 260, 50, 25);
        panel.add(succPressureDef3rdText);

        succPressureMid3rd = new JLabel("Pressures (Mid 3rd)");
        succPressureMid3rd.setBounds(10, 290, 150, 25);
        panel.add(succPressureMid3rd);

        succPressureMid3rdText = new JTextField(20);
        succPressureMid3rdText.setBounds(200, 290, 50, 25);
        panel.add(succPressureMid3rdText);

        succPressureAtt3rd = new JLabel("Pressures (Att 3rd)");
        succPressureAtt3rd.setBounds(10, 320, 150, 25);
        panel.add(succPressureAtt3rd);

        succPressureAtt3rdText = new JTextField(20);
        succPressureAtt3rdText.setBounds(200, 320, 50, 25);
        panel.add(succPressureAtt3rdText);

        shotBlocked = new JLabel("Shots Blocked");
        shotBlocked.setBounds(10, 350, 150, 25);
        panel.add(shotBlocked);

        shotBlockedText = new JTextField(20);
        shotBlockedText.setBounds(200, 350, 50, 25);
        panel.add(shotBlockedText);

        shotSaved = new JLabel("Shots Saved");
        shotSaved.setBounds(10, 380, 150, 25);
        panel.add(shotSaved);

        shotSavedText = new JTextField(20);
        shotSavedText.setBounds(200, 380, 50, 25);
        panel.add(shotSavedText);

        passBlocked = new JLabel("Passes Blocked");
        passBlocked.setBounds(10, 410, 150, 25);
        panel.add(passBlocked);

        passBlockedText = new JTextField(20);
        passBlockedText.setBounds(200, 410, 50, 25);
        panel.add(passBlockedText);

        interception = new JLabel("Interceptions");
        interception.setBounds(10, 440, 150, 25);
        panel.add(interception);

        interceptionText = new JTextField(20);
        interceptionText.setBounds(200, 440, 50, 25);
        panel.add(interceptionText);

        error = new JLabel("Errors");
        error.setBounds(10, 470, 150, 25);
        panel.add(error);

        errorText = new JTextField(20);
        errorText.setBounds(200, 470, 50, 25);
        panel.add(errorText);

        frame.setVisible(true);
    }

    // gui to enter stats for possession stats category
    public void possEnter() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        touch = new JLabel("Touches");
        touch.setBounds(10, 20, 150, 25);
        panel.add(touch);

        touchText = new JTextField(20);
        touchText.setBounds(170, 20, 50, 25);
        panel.add(touchText);

        dribbleCompleted = new JLabel("Dribbles Completed");
        dribbleCompleted.setBounds(10, 50, 150, 25);
        panel.add(dribbleCompleted);

        dribbleCompletedText = new JTextField(20);
        dribbleCompletedText.setBounds(170, 50, 50, 25);
        panel.add(dribbleCompletedText);

        dribbleAttempted = new JLabel("Dribbles Attempted");
        dribbleAttempted.setBounds(10, 80, 150, 25);
        panel.add(dribbleAttempted);

        dribbleAttemptedText = new JTextField(20);
        dribbleAttemptedText.setBounds(170, 80, 50, 25);
        panel.add(dribbleAttemptedText);

        miscontrols = new JLabel("Miscontrols");
        miscontrols.setBounds(10, 110, 150, 25);
        panel.add(miscontrols);

        miscontrolsText = new JTextField(20);
        miscontrolsText.setBounds(170, 110, 50, 25);
        panel.add(miscontrolsText);

        dispossessed = new JLabel("Dispossessed");
        dispossessed.setBounds(10, 140, 150, 25);
        panel.add(dispossessed);

        dispossessedText = new JTextField(20);
        dispossessedText.setBounds(170, 140, 50, 25);
        panel.add(dispossessedText);

        frame.setVisible(true);
    }

    // Calculate player rating for strikers
    public void Striker() throws IOException {
        playerRating = 6;
        playerRating += (miscStats.get(0) * -0.1) + (miscStats.get(1) * -0.5) + (miscStats.get(2) * -0.1)
                + (miscStats.get(3) * 0.1) + (miscStats.get(4) * -0.1) + (miscStats.get(5) * -0.75)
                + (miscStats.get(6) * 0.07 * (miscStats.get(6) / miscStats.get(7))) + (miscStats.get(8) * 0.005);

        playerRating += (shootStats.get(0) * 0.75) + (shootStats.get(1) * 0.05 * (shootStats.get(1) / shootStats.get(2)))
                + (shootStats.get(3) * -0.1) + (shootStats.get(4) * -1);

        playerRating += (passStats.get(0) * 0.01 * (passStats.get(0) / passStats.get(1)))
                + (passStats.get(2) * 0.03 * (passStats.get(2) / passStats.get(3)))
                + (passStats.get(4) * 0.05 * (passStats.get(4) / passStats.get(5))) + (passStats.get(6) * 0.5)
                + (passStats.get(7) * 0.05) + (passStats.get(8) * 0.01) + (passStats.get(9) * 0.03)
                + (passStats.get(10) * -0.03) + (passStats.get(11) * -0.03) + (passStats.get(12) * -0.04)
                + (passStats.get(13) * -0.03);

        playerRating += (creationStats.get(0) * 0.05) + (creationStats.get(1) * 0.1) + (creationStats.get(2) * 0.01)
                + (creationStats.get(3) * 0.02) + (creationStats.get(4) * 0.02) + (creationStats.get(5) * 0.03)
                + (creationStats.get(6) * 0.01) + (creationStats.get(7) * 0.02) + (creationStats.get(8) * 0.01)
                + (creationStats.get(9) * 0.02);

        playerRating += (defenseStats.get(0) * 0.05) + (defenseStats.get(1) * 0.1) + (defenseStats.get(2) * 0.03)
                + (defenseStats.get(3) * 0.01) + (defenseStats.get(4) * 0.02) + (defenseStats.get(5) * -0.1)
                + (defenseStats.get(6) * 0.01) + (defenseStats.get(7) * 0.03) + (defenseStats.get(8) * 0.02)
                + (defenseStats.get(9) * 0.01) + (defenseStats.get(10) * 0.02) + (defenseStats.get(11) * 0.05)
                + (defenseStats.get(12) * 0.1) + (defenseStats.get(13) * 0.03) + (defenseStats.get(14) * 0.05)
                + (defenseStats.get(15) * -0.3);

        playerRating += (possStats.get(0) * 0.005) + (possStats.get(1) * 0.007 * (possStats.get(1) / possStats.get(2)))
                + (possStats.get(3) * -0.05) + (possStats.get(4) * -0.1);

        playerRating = playerRating / minutes1 * 90;
        if (playerRating > 10) {
            playerRating = 10;
        }
        putInFile();

    }

    // Calculate player rating for wingers
    public void Winger() throws IOException {
        playerRating = 6;
        playerRating += (miscStats.get(0) * -0.1) + (miscStats.get(1) * -0.5) + (miscStats.get(2) * -0.1)
                + (miscStats.get(3) * 0.1) + (miscStats.get(4) * -0.1) + (miscStats.get(5) * -0.75)
                + (miscStats.get(6) * 0.07 * (miscStats.get(6) / miscStats.get(7))) + (miscStats.get(8) * 0.003);

        playerRating += (shootStats.get(0) * 1) + (shootStats.get(1) * 0.1 * (shootStats.get(1) / shootStats.get(2)))
                + (shootStats.get(3) * -0.1) + (shootStats.get(4) * -1);

        playerRating += (passStats.get(0) * 0.01 * (passStats.get(0) / passStats.get(1)))
                + (passStats.get(2) * 0.03 * (passStats.get(2) / passStats.get(3)))
                + (passStats.get(4) * 0.05 * (passStats.get(4) / passStats.get(5))) + (passStats.get(6) * 0.5)
                + (passStats.get(7) * 0.05) + (passStats.get(8) * 0.01) + (passStats.get(9) * 0.03)
                + (passStats.get(10) * -0.03) + (passStats.get(11) * -0.03) + (passStats.get(12) * -0.04)
                + (passStats.get(13) * -0.03);

        playerRating += (creationStats.get(0) * 0.05) + (creationStats.get(1) * 0.1) + (creationStats.get(2) * 0.01)
                + (creationStats.get(3) * 0.02) + (creationStats.get(4) * 0.02) + (creationStats.get(5) * 0.03)
                + (creationStats.get(6) * 0.01) + (creationStats.get(7) * 0.02) + (creationStats.get(8) * 0.01)
                + (creationStats.get(9) * 0.02);

        playerRating += (defenseStats.get(0) * 0.05) + (defenseStats.get(1) * 0.1) + (defenseStats.get(2) * 0.03)
                + (defenseStats.get(3) * 0.01) + (defenseStats.get(4) * 0.02) + (defenseStats.get(5) * -0.1)
                + (defenseStats.get(6) * 0.01) + (defenseStats.get(7) * 0.03) + (defenseStats.get(8) * 0.02)
                + (defenseStats.get(9) * 0.01) + (defenseStats.get(10) * 0.02) + (defenseStats.get(11) * 0.05)
                + (defenseStats.get(12) * 0.1) + (defenseStats.get(13) * 0.03) + (defenseStats.get(14) * 0.05)
                + (defenseStats.get(15) * -0.3);

        playerRating += (possStats.get(0) * 0.005) + (possStats.get(1) * 0.007 * (possStats.get(1) / possStats.get(2)))
                + (possStats.get(3) * -0.05) + (possStats.get(4) * -0.1);

        playerRating = playerRating / minutes1 * 90;
        if (playerRating > 10) {
            playerRating = 10;
        }
        putInFile();
    }

    // Calculate player rating for center backs
    public void CenterBack() throws IOException {
        playerRating = 6;
        playerRating += (miscStats.get(0) * -0.1) + (miscStats.get(1) * -0.5) + (miscStats.get(2) * -0.3)
                + (miscStats.get(3) * 0.1) + (miscStats.get(4) * -0.1) + (miscStats.get(5) * -0.75)
                + (miscStats.get(6) * 0.05 * (miscStats.get(6) / miscStats.get(7))) + (miscStats.get(8) * 0.005);

        playerRating += (shootStats.get(0) * 2.5) + (shootStats.get(1) * 1.5 * (shootStats.get(1) / shootStats.get(2)))
                + (shootStats.get(3) * -0.1) + (shootStats.get(4) * -1);

        playerRating += (passStats.get(0) * 0.008 * (passStats.get(0) / passStats.get(1)))
                + (passStats.get(2) * 0.018 * (passStats.get(2) / passStats.get(3)))
                + (passStats.get(4) * 0.038 * (passStats.get(4) / passStats.get(5))) + (passStats.get(6) * 1.5)
                + (passStats.get(7) * 1) + (passStats.get(8) * 0.04) + (passStats.get(9) * 0.07)
                + (passStats.get(10) * -0.04) + (passStats.get(11) * -0.05) + (passStats.get(12) * -0.1)
                + (passStats.get(13) * -0.1);

        playerRating += (creationStats.get(0) * 0.1) + (creationStats.get(1) * 0.3) + (creationStats.get(2) * 0.03)
                + (creationStats.get(3) * 0.05) + (creationStats.get(4) * 0.04) + (creationStats.get(5) * 0.06)
                + (creationStats.get(6) * 0.03) + (creationStats.get(7) * 0.04) + (creationStats.get(8) * 0.03)
                + (creationStats.get(9) * 0.04);

        playerRating += (defenseStats.get(0) * 0.02) + (defenseStats.get(1) * 0.05) + (defenseStats.get(2) * 0.01)
                + (defenseStats.get(3) * 0.02) + (defenseStats.get(4) * 0.03) + (defenseStats.get(5) * -0.2)
                + (defenseStats.get(6) * 0.005) + (defenseStats.get(7) * 0.02) + (defenseStats.get(8) * 0.01)
                + (defenseStats.get(9) * 0.015) + (defenseStats.get(10) * 0.02) + (defenseStats.get(11) * 0.03)
                + (defenseStats.get(12) * 0.05) + (defenseStats.get(13) * 0.03) + (defenseStats.get(14) * 0.05)
                + (defenseStats.get(15) * -0.3);

        playerRating += (possStats.get(0) * 0.004) + (possStats.get(1) * 0.01 * (possStats.get(1) / possStats.get(2)))
                + (possStats.get(3) * -0.1) + (possStats.get(4) * -0.2);

        playerRating = playerRating / minutes1 * 90;
        if (playerRating > 10) {
            playerRating = 10;
        }
        putInFile();
    }

    // Calculate player rating for full backs
    public void FullBack() throws IOException {
        playerRating = 6;
        playerRating += (miscStats.get(0) * -0.1) + (miscStats.get(1) * -0.5) + (miscStats.get(2) * -0.3)
                + (miscStats.get(3) * 0.1) + (miscStats.get(4) * -0.1) + (miscStats.get(5) * -0.75)
                + (miscStats.get(6) * 0.05 * (miscStats.get(6) / miscStats.get(7))) + (miscStats.get(8) * 0.002);

        playerRating += (shootStats.get(0) * 2) + (shootStats.get(1) * 1 * (shootStats.get(1) / shootStats.get(2)))
                + (shootStats.get(3) * -0.1) + (shootStats.get(4) * -1);

        playerRating += (passStats.get(0) * 0.009 * (passStats.get(0) / passStats.get(1)))
                + (passStats.get(2) * 0.019 * (passStats.get(2) / passStats.get(3)))
                + (passStats.get(4) * 0.039 * (passStats.get(4) / passStats.get(5))) + (passStats.get(6) * 1.3)
                + (passStats.get(7) * 0.75) + (passStats.get(8) * 0.03) + (passStats.get(9) * 0.06)
                + (passStats.get(10) * -0.04) + (passStats.get(11) * -0.05) + (passStats.get(12) * -0.075)
                + (passStats.get(13) * -0.07);

        playerRating += (creationStats.get(0) * 0.08) + (creationStats.get(1) * 0.25) + (creationStats.get(2) * 0.025)
                + (creationStats.get(3) * 0.045) + (creationStats.get(4) * 0.035) + (creationStats.get(5) * 0.055)
                + (creationStats.get(6) * 0.025) + (creationStats.get(7) * 0.035) + (creationStats.get(8) * 0.025)
                + (creationStats.get(9) * 0.035);

        playerRating += (defenseStats.get(0) * 0.015) + (defenseStats.get(1) * 0.045) + (defenseStats.get(2) * 0.01)
                + (defenseStats.get(3) * 0.02) + (defenseStats.get(4) * 0.03) + (defenseStats.get(5) * -0.15)
                + (defenseStats.get(6) * 0.004) + (defenseStats.get(7) * 0.02) + (defenseStats.get(8) * 0.01)
                + (defenseStats.get(9) * 0.015) + (defenseStats.get(10) * 0.02) + (defenseStats.get(11) * 0.03)
                + (defenseStats.get(12) * 0.05) + (defenseStats.get(13) * 0.03) + (defenseStats.get(14) * 0.05)
                + (defenseStats.get(15) * -0.3);

        playerRating += (possStats.get(0) * 0.0045) + (possStats.get(1) * 0.01 * (possStats.get(1) / possStats.get(2)))
                + (possStats.get(3) * -0.1) + (possStats.get(4) * -0.2);

        playerRating = playerRating / minutes1 * 90;
        if (playerRating > 10) {
            playerRating = 10;
        }
        putInFile();
    }

    // Calculate player rating for defensive midfielders
    public void DefensiveMid() throws IOException {
        playerRating = 6;
        playerRating += (miscStats.get(0) * -0.1) + (miscStats.get(1) * -0.5) + (miscStats.get(2) * -0.3)
                + (miscStats.get(3) * 0.1) + (miscStats.get(4) * -0.1) + (miscStats.get(5) * -2)
                + (miscStats.get(6) * 0.06 * (miscStats.get(6) / miscStats.get(7))) + (miscStats.get(8) * 0.005);

        playerRating += (shootStats.get(0) * 2) + (shootStats.get(1) * 1 * (shootStats.get(1) / shootStats.get(2)))
                + (shootStats.get(3) * -0.1) + (shootStats.get(4) * -1);

        playerRating += (passStats.get(0) * 0.006 * (passStats.get(0) / passStats.get(1)))
                + (passStats.get(2) * 0.016 * (passStats.get(2) / passStats.get(3)))
                + (passStats.get(4) * 0.036 * (passStats.get(4) / passStats.get(5))) + (passStats.get(6) * 1)
                + (passStats.get(7) * 0.8) + (passStats.get(8) * 0.036) + (passStats.get(9) * 0.066)
                + (passStats.get(10) * -0.036) + (passStats.get(11) * -0.05) + (passStats.get(12) * -0.1)
                + (passStats.get(13) * -0.1);

        playerRating += (creationStats.get(0) * 0.08) + (creationStats.get(1) * 0.28) + (creationStats.get(2) * 0.023)
                + (creationStats.get(3) * 0.043) + (creationStats.get(4) * 0.033) + (creationStats.get(5) * 0.053)
                + (creationStats.get(6) * 0.023) + (creationStats.get(7) * 0.033) + (creationStats.get(8) * 0.023)
                + (creationStats.get(9) * 0.033);

        playerRating += (defenseStats.get(0) * 0.015) + (defenseStats.get(1) * 0.045) + (defenseStats.get(2) * 0.01)
                + (defenseStats.get(3) * 0.02) + (defenseStats.get(4) * 0.03) + (defenseStats.get(5) * -0.15)
                + (defenseStats.get(6) * 0.004) + (defenseStats.get(7) * 0.015) + (defenseStats.get(8) * 0.01)
                + (defenseStats.get(9) * 0.013) + (defenseStats.get(10) * 0.018) + (defenseStats.get(11) * 0.03)
                + (defenseStats.get(12) * 0.05) + (defenseStats.get(13) * 0.03) + (defenseStats.get(14) * 0.05)
                + (defenseStats.get(15) * -0.25);

        playerRating += (possStats.get(0) * 0.003) + (possStats.get(1) * 0.0075 * (possStats.get(1) / possStats.get(2)))
                + (possStats.get(3) * -0.09) + (possStats.get(4) * -0.19);

        playerRating = playerRating / minutes1 * 90;
        if (playerRating > 10) {
            playerRating = 10;
        }
        putInFile();
    }

    // Calculate player rating for left/right midfielders
    public void SideMid() throws IOException {
        playerRating = 6;
        playerRating += (miscStats.get(0) * -0.1) + (miscStats.get(1) * -0.5) + (miscStats.get(2) * -0.3)
                + (miscStats.get(3) * 0.1) + (miscStats.get(4) * -0.1) + (miscStats.get(5) * -2)
                + (miscStats.get(6) * 0.07 * (miscStats.get(6) / miscStats.get(7))) + (miscStats.get(8) * 0.002);

        playerRating += (shootStats.get(0) * 1.5) + (shootStats.get(1) * 0.65 * (shootStats.get(1) / shootStats.get(2)))
                + (shootStats.get(3) * -0.1) + (shootStats.get(4) * -1);

        playerRating += (passStats.get(0) * 0.009 * (passStats.get(0) / passStats.get(1)))
                + (passStats.get(2) * 0.019 * (passStats.get(2) / passStats.get(3)))
                + (passStats.get(4) * 0.05 * (passStats.get(4) / passStats.get(5))) + (passStats.get(6) * 0.7)
                + (passStats.get(7) * 0.8) + (passStats.get(8) * 0.014) + (passStats.get(9) * 0.026)
                + (passStats.get(10) * -0.036) + (passStats.get(11) * -0.05) + (passStats.get(12) * -0.075)
                + (passStats.get(13) * -0.07);

        playerRating += (creationStats.get(0) * 0.085) + (creationStats.get(1) * 0.3) + (creationStats.get(2) * 0.024)
                + (creationStats.get(3) * 0.044) + (creationStats.get(4) * 0.034) + (creationStats.get(5) * 0.054)
                + (creationStats.get(6) * 0.024) + (creationStats.get(7) * 0.034) + (creationStats.get(8) * 0.024)
                + (creationStats.get(9) * 0.034);

        playerRating += (defenseStats.get(0) * 0.022) + (defenseStats.get(1) * 0.052) + (defenseStats.get(2) * 0.015)
                + (defenseStats.get(3) * 0.015) + (defenseStats.get(4) * 0.025) + (defenseStats.get(5) * -0.13)
                + (defenseStats.get(6) * 0.0035) + (defenseStats.get(7) * 0.0145) + (defenseStats.get(8) * 0.02)
                + (defenseStats.get(9) * 0.011) + (defenseStats.get(10) * 0.016) + (defenseStats.get(11) * 0.04)
                + (defenseStats.get(12) * 0.07) + (defenseStats.get(13) * 0.03) + (defenseStats.get(14) * 0.05)
                + (defenseStats.get(15) * -0.2);

        playerRating += (possStats.get(0) * 0.004) + (possStats.get(1) * 0.009 * (possStats.get(1) / possStats.get(2)))
                + (possStats.get(3) * -0.08) + (possStats.get(4) * -0.13);

        playerRating = playerRating / minutes1 * 90;
        if (playerRating > 10) {
            playerRating = 10;
        }
        putInFile();
    }

    // Calculate player rating for center midfielders
    public void CenterMid() throws IOException {
        playerRating = 6;
        playerRating += (miscStats.get(0) * -0.1) + (miscStats.get(1) * -0.5) + (miscStats.get(2) * -0.3)
                + (miscStats.get(3) * 0.1) + (miscStats.get(4) * -0.1) + (miscStats.get(5) * -2)
                + (miscStats.get(6) * 0.06 * (miscStats.get(6) / miscStats.get(7))) + (miscStats.get(8) * 0.006);

        playerRating += (shootStats.get(0) * 1.5) + (shootStats.get(1) * 0.65 * (shootStats.get(1) / shootStats.get(2)))
                + (shootStats.get(3) * -0.1) + (shootStats.get(4) * -1);

        playerRating += (passStats.get(0) * 0.0058 * (passStats.get(0) / passStats.get(1)))
                + (passStats.get(2) * 0.018 * (passStats.get(2) / passStats.get(3)))
                + (passStats.get(4) * 0.038 * (passStats.get(4) / passStats.get(5))) + (passStats.get(6) * 0.5)
                + (passStats.get(7) * 0.4) + (passStats.get(8) * 0.016) + (passStats.get(9) * 0.026)
                + (passStats.get(10) * -0.036) + (passStats.get(11) * -0.05) + (passStats.get(12) * -0.1)
                + (passStats.get(13) * -0.1);

        playerRating += (creationStats.get(0) * 0.08) + (creationStats.get(1) * 0.28) + (creationStats.get(2) * 0.023)
                + (creationStats.get(3) * 0.043) + (creationStats.get(4) * 0.033) + (creationStats.get(5) * 0.053)
                + (creationStats.get(6) * 0.023) + (creationStats.get(7) * 0.033) + (creationStats.get(8) * 0.023)
                + (creationStats.get(9) * 0.033);

        playerRating += (defenseStats.get(0) * 0.022) + (defenseStats.get(1) * 0.052) + (defenseStats.get(2) * 0.015)
                + (defenseStats.get(3) * 0.015) + (defenseStats.get(4) * 0.025) + (defenseStats.get(5) * -0.13)
                + (defenseStats.get(6) * 0.0035) + (defenseStats.get(7) * 0.0145) + (defenseStats.get(8) * 0.02)
                + (defenseStats.get(9) * 0.011) + (defenseStats.get(10) * 0.016) + (defenseStats.get(11) * 0.04)
                + (defenseStats.get(12) * 0.07) + (defenseStats.get(13) * 0.03) + (defenseStats.get(14) * 0.05)
                + (defenseStats.get(15) * -0.2);

        playerRating += (possStats.get(0) * 0.0032) + (possStats.get(1) * 0.007 * (possStats.get(1) / possStats.get(2)))
                + (possStats.get(3) * -0.085) + (possStats.get(4) * -0.15);

        playerRating = playerRating / minutes1 * 90;
        if (playerRating > 10) {
            playerRating = 10;
        }
        putInFile();
    }

    // Calculate player rating for attaking midfielders
    public void AttackingMid() throws IOException {
        playerRating = 6;
        playerRating += (miscStats.get(0) * -0.1) + (miscStats.get(1) * -0.5) + (miscStats.get(2) * -0.3)
                + (miscStats.get(3) * 0.1) + (miscStats.get(4) * -0.1) + (miscStats.get(5) * -2)
                + (miscStats.get(6) * 0.06 * (miscStats.get(6) / miscStats.get(7))) + (miscStats.get(8) * 0.006);

        playerRating += (shootStats.get(0) * 1.5) + (shootStats.get(1) * 0.65 * (shootStats.get(1) / shootStats.get(2)))
                + (shootStats.get(3) * -0.1) + (shootStats.get(4) * -1);

        playerRating += (passStats.get(0) * 0.006 * (passStats.get(0) / passStats.get(1)))
                + (passStats.get(2) * 0.016 * (passStats.get(2) / passStats.get(3)))
                + (passStats.get(4) * 0.04 * (passStats.get(4) / passStats.get(5))) + (passStats.get(6) * 0.5)
                + (passStats.get(7) * 0.4) + (passStats.get(8) * 0.016) + (passStats.get(9) * 0.026)
                + (passStats.get(10) * -0.036) + (passStats.get(11) * -0.05) + (passStats.get(12) * -0.08)
                + (passStats.get(13) * -0.08);

        playerRating += (creationStats.get(0) * 0.075) + (creationStats.get(1) * 0.25) + (creationStats.get(2) * 0.02)
                + (creationStats.get(3) * 0.04) + (creationStats.get(4) * 0.03) + (creationStats.get(5) * 0.05)
                + (creationStats.get(6) * 0.02) + (creationStats.get(7) * 0.03) + (creationStats.get(8) * 0.02)
                + (creationStats.get(9) * 0.03);

        playerRating += (defenseStats.get(0) * 0.025) + (defenseStats.get(1) * 0.055) + (defenseStats.get(2) * 0.02)
                + (defenseStats.get(3) * 0.015) + (defenseStats.get(4) * 0.02) + (defenseStats.get(5) * -0.1)
                + (defenseStats.get(6) * 0.003) + (defenseStats.get(7) * 0.014) + (defenseStats.get(8) * 0.05)
                + (defenseStats.get(9) * 0.011) + (defenseStats.get(10) * 0.01) + (defenseStats.get(11) * 0.07)
                + (defenseStats.get(12) * 0.015) + (defenseStats.get(13) * 0.04) + (defenseStats.get(14) * 0.07)
                + (defenseStats.get(15) * -0.15);

        playerRating += (possStats.get(0) * 0.0032) + (possStats.get(1) * 0.007 * (possStats.get(1) / possStats.get(2)))
                + (possStats.get(3) * -0.085) + (possStats.get(4) * -0.15);

        playerRating = playerRating / minutes1 * 90;
        if (playerRating > 10) {
            playerRating = 10;
        }
        putInFile();
    }
    //Put data into Player object then create Table Object for JTable
    public static void putInFile() throws IOException{
        Player p = new Player(date1, playerName1, playerPosition1, String.format("%.0f", minutes1), String.format("%.2f", playerRating));
        saveToFile("playerList.txt", p.getDate() + "|" + p.getPlayerName() + "|" + p.getPlayerPosition() + "|"
                + p.getMinutes() + "|" + p.getPlayerRating());
        Table table = new Table();
        table.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        table.setSize(600,200);
        table.setVisible(true);
        table.setTitle("Player Ratings");
    }
    //putting data into playerList.txt
    public static void saveToFile(String fileName, String text) throws IOException {
        File file1 = new File(fileName);
        FileWriter fw = new FileWriter(file1, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(text);
        pw.close();
    }

}