package graphics;

import animals.Animal;
import animals.Elephant;
import animals.Lion;
import mobility.Point;
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
    private JPanel zooSouthPanel = new JPanel();
    private Button addAnimal,moveAnimal,info;
    private String[] col_names={"Animal","Color","Weight","Hor.speed","Ver.speed","Eat counter"};
    private Object[][] zoo_data;
    private InfoDialog infoDialog;
    private JTable ZooInfoTable;


    public ZooPanel(){
        Lion l = new Lion("idan",new Point(30,50));
        Elephant eM = new Elephant("matan",new Point(60,80));
        Zoo.add(l);
        Zoo.add(eM);
        loadData();
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
                    ZooImage = ImageIO.read((new File("C:\\Users\\idan\\Desktop\\HW1-ZooProject - 22.04\\HW1-ZooProject\\HW1-ZooProject\\src\\graphics\\matanwithjepeta.jpg")));
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
            ZooImage = ImageIO.read((new File("C:\\Users\\idan\\Desktop\\HW1-ZooProject - 22.04\\HW1-ZooProject\\HW1-ZooProject\\src\\graphics\\zooimg.jpg")));
        } catch (IOException e) {
            System.out.println("Cannot load image");
        }
        int w = ZooImage.getWidth(null) ;
        int h = ZooImage.getHeight(null) ;
        this.add(new JLabel(new ImageIcon(ZooImage.getScaledInstance(w, h,
                Image.SCALE_SMOOTH))));


        zooSouthPanel.setLayout(new BoxLayout(zooSouthPanel,BoxLayout.LINE_AXIS));
        addAnimal = new Button("Add Animal");
        addAnimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddAnimalDialog addAnimalDialog = new AddAnimalDialog();
            }
        });
        moveAnimal = new Button("Move Animal");
        moveAnimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MoveAnimalDialog moveAnimalDialog = new MoveAnimalDialog();
            }
        });
        info = new Button("Info");
        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertDataToTable();
            }
        });
        zooSouthPanel.add(addAnimal);
        zooSouthPanel.add(moveAnimal);
        zooSouthPanel.add(new Button("Clear"));
        zooSouthPanel.add(new Button("Food"));
        zooSouthPanel.add(info);
        zooSouthPanel.add(new Button("Exit"));
        this.add(zooSouthPanel,BorderLayout.SOUTH);
    }
    private void loadData(){

        zoo_data = new Object[Zoo.size()][col_names.length];
        for (int i=0;i<Zoo.size();i++){
            String name=Zoo.get(i).getName();
            String color="Natural";
            double weight=Zoo.get(i).getWeight();
            int vspeed=Zoo.get(i).getVerSpeed();
            int hspeed=Zoo.get(i).getHorSpeed();
            int eatc=Zoo.get(i).getEatCount();
           Object[] temp= {name,color,weight,vspeed,hspeed,eatc};
           for (int j=0;j<col_names.length;j++){
               zoo_data[i][j]= temp[j];
           }
        }

    }
    private void insertDataToTable(){
        ZooInfoTable = new JTable(zoo_data,col_names);
        ZooInfoTable.setBounds(50,50,100,100);
        infoDialog = new InfoDialog(ZooInfoTable);
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
