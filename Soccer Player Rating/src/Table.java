import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Table extends JFrame {
    private JTable table;
    //Putting contents into JTable to display
    public Table() throws FileNotFoundException {
        super("JTable Demo");
        String[] names = { "Date", "Player Name", "Position", "Minutes Played", "Player Rating" };
        Object[][] data = toArr(new File("C:\\Users\\Kevin\\eclipse-workspace\\IA\\playerList.txt"));
        table = new JTable(data, names);
        table.setPreferredScrollableViewportSize(new Dimension(500, 300));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        add(new JScrollPane(table));
    }
    //reading playerList.txt into a 2D Object array
    public static Object[][] toArr(File file) throws FileNotFoundException {
        Scanner keyboard = new Scanner(file);
        int counter = 0;
        Object holder;
        //See how many lines in text file
        while (keyboard.hasNextLine()) {
            holder = keyboard.nextLine();
            counter++;
        }
        Object[][] holder1 = new Object[counter][5];
        Scanner keyboard2 = new Scanner(file);
        //put text file contents into 2d array line by line
        for (int i = 0; i < holder1.length; i++) {
            holder1[i] = keyboard2.nextLine().split("\\|");
        }
        return holder1;
    }
}