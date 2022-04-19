package graphics;

import animals.Animal;
import plants.Cabbage;
import plants.Plant;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class ZooPanel extends JPanel implements Runnable {
    ArrayList<Animal> Zoo = new ArrayList<Animal>();
    private BufferedImage img;
    private Plant food = new Cabbage();
    private JMenuBar northMenuBar;
    private JMenu help;
    private JMenu background;
    private JMenu file;
    private JMenuItem exit,Help;

    private Image ZooImage;


    public ZooPanel(){

        this.setLayout(new BorderLayout());
        this.northMenuBar = new JMenuBar();
        help = new JMenu("Help");
        background = new JMenu("Background");
        file = new JMenu("File");
        Help = new JMenuItem("Help");
        Help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog helpDialog = new JDialog();
                helpDialog.setDefaultCloseOperation(HIDE_ON_CLOSE);
                helpDialog.setSize(300,300);
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                try {
                    ZooImage = ImageIO.read((new File("C:\\Users\\kibeb\\Downloads\\HW1-ZooProject\\HW1-ZooProject\\src\\graphics\\matanwithjepeta.jpg")));
                } catch (IOException ex) {
                    System.out.println("Cannot load image");
                }
                int w = ZooImage.getWidth(null)/8;
                int h = ZooImage.getHeight(null)/8;
                panel.add(new JLabel(new ImageIcon(ZooImage.getScaledInstance(w, h,
                        Image.SCALE_SMOOTH))));
                helpDialog.add(panel);

                helpDialog.setVisible(true);
            }
        });
        help.add(Help);
        background.add(new JMenuItem("Image")); // Add Action Listener
        background.add(new JMenuItem("Green")); //
        background.add(new JMenuItem("None")); //
        exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        file.add(exit);
        northMenuBar.add(file);
        northMenuBar.add(background);
        northMenuBar.add(help);
        this.add(northMenuBar,BorderLayout.NORTH);

        try {
            ZooImage = ImageIO.read((new File("C:\\Users\\kibeb\\Downloads\\HW1-ZooProject\\HW1-ZooProject\\src\\graphics\\zooimg.jpg")));
        } catch (IOException e) {
            System.out.println("Cannot load image");
        }
        int w = ZooImage.getWidth(null) ;
        int h = ZooImage.getHeight(null) ;
        this.add(new JLabel(new ImageIcon(ZooImage.getScaledInstance(w, h,
                Image.SCALE_SMOOTH))));
    }



    public void manageZoo() {
        while (true) {
            if (isChange())
                repaint();

        }
    }


    private boolean isChange(){
        return false;
    }
    public void repaint()
    {

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g) ;
        if(img!=null)
            g.drawImage(img,0,0,getWidth(),getHeight(), this);


    }

    @Override
    public void run() {

    }
}
