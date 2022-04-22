package graphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ZooFrame extends JFrame {


    private JPanel zooSouthPanel;
    private Button addAnimal,moveAnimal,exit;



   public ZooFrame(){
       super("Zoo");

       this.zooSouthPanel = new JPanel();
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
       exit = new Button("Exit");
       exit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });

       zooSouthPanel.add(addAnimal);
       zooSouthPanel.add(moveAnimal);
       zooSouthPanel.add(new Button("Clear"));
       zooSouthPanel.add(new Button("Food"));
       zooSouthPanel.add(new Button("Info"));
       zooSouthPanel.add(exit);
       this.add(zooSouthPanel,BorderLayout.SOUTH);
       this.add(new ZooPanel());
       this.setSize(500,500);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setVisible(true);
   }

    public static void main(String[] args){
       ZooFrame zooFrame = new ZooFrame();
    }
}
