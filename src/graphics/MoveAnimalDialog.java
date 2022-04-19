package graphics;

import javax.swing.*;

public class MoveAnimalDialog extends JDialog {
    public MoveAnimalDialog(){
        this.setTitle("Move Animal");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }
}
