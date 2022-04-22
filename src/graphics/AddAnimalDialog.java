package graphics;

import animals.*;
import diet.Herbivore;
import mobility.Point;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class AddAnimalDialog extends JDialog {

    public AddAnimalDialog() {
        this.setTitle("Add Animal");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

}