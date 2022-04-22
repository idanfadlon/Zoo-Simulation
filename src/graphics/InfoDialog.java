package graphics;

import javax.swing.*;

public class InfoDialog extends JDialog {

    public InfoDialog(JTable table){

        JScrollPane js =new JScrollPane(table);
        this.setTitle("Info Table");
        this.add(js);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }
}
