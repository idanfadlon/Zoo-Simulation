package graphics;

//import javax.swing.*;
//import java.awt.*;
//
///**
// * @author Noy Nir 207993940
// * Created on : 11 / 06 / 2020
// * Last edited on : 11 / 06 / 2020
// * CompetitionFrame class - a class that add frame , our main
// */
//public class CompetitionFrame extends JFrame {
//
//    /**
//     * Constructor
//     *
//     * @throws HeadlessException
//     */
//    public CompetitionFrame() throws HeadlessException {
//        super("Competition");
//        initFrame();
//        initPanel();
//        initMenu();
//        setVisible(true);
//    }
//
//    /**
//     * A method that init a frame
//     */
//    private void initFrame(){
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(700, 700);
//        getContentPane().setBackground(new Color(255,192,203));
//        setLayout(new BorderLayout());
//    }
//
//    /**
//     * A method that init a panel
//     */
//    private void initPanel(){
//        JPanel panel = new CompetitionPanel(new BorderLayout());
//        panel.setBounds(0 ,0, getWidth(), getHeight());
//        add(panel);
//    }
//
//    /**
//     * A method that init a menu
//     */
//    private void initMenu(){
//        JMenuBar menu = new CompetitionMenu();
//        setJMenuBar(menu);
//    }
//
//    /**
//     * main
//     */
//    public static void main(String[] args) {
//        JFrame frame = new CompetitionFrame();
//    }
//
//}
