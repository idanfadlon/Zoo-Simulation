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

   public ZooFrame(){
       super("Zoo");
       this.add(new ZooPanel());
       this.pack();
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setVisible(true);
   }

    public static void main(String[] args){
       ZooFrame zooFrame = new ZooFrame();
    }
}
