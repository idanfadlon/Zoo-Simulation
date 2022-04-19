package graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
/**
 * @author Noy Nir 207993940
 * Created on : 11 / 06 / 2020
 * Last edited on : 11 / 06 / 2020
 * CompetitionMenu class - a class that add menu
 */
public class CompetitionMenu extends JMenuBar {

    /**
     * Constructor
     */
    public CompetitionMenu(){
        super();
        initFile();
        initHelp();
    }

    /**
     * A method that init the file button on the top
     */
    private void initFile(){
        JMenu file;
        file = new JMenu("File");
        add(file);
        JMenuItem exit = new JMenuItem("Exit");
        exit.setMnemonic(KeyEvent.VK_X);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        };
        exit.addActionListener(actionListener);
        file.add(exit);
    }

    /**
     * A method that init the help button on the top
     */
    private void initHelp(){
        JMenu help;
        help = new JMenu("Help");
        add(help);
        JMenuItem help_m_i = new JMenuItem("Help");
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Home Work 2 \n GUI");
            }
        };
        help_m_i.addActionListener(actionListener);
        help.add(help_m_i);
    }
}
