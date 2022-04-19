package graphics;

//import animals.Animal;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
//
///**
// * @author Noy Nir 207993940
// * Created on : 11 / 06 / 2020
// * Last edited on : 11 / 06 / 2020
// * RemoveAnimalDialog class - a class that remove animal
// */
//
//public class RemoveAnimalDialog extends JDialog {
//
//    public static RemoveAnimalDialog newInstance(List<Animal> animals, int width, int height) {
//        RemoveAnimalDialog removeDialog = new RemoveAnimalDialog(animals);
//        removeDialog.setAlwaysOnTop(true);
//        removeDialog.setTitle("Remove Animal");
//        removeDialog.setSize(width, height);
//        removeDialog.setLocationByPlatform(true);
//        removeDialog.setVisible(true);
//        return removeDialog;
//    }
//
//    /**
//     * Constructor
//     *
//     * @param animals - the animal in the competition
//     */
//    public RemoveAnimalDialog(List<Animal> animals) {
//        super();
//        JPanel panel = new JPanel();
//        JLabel label = new JLabel("Choose animal to remove: ");
//        JComboBox<String> animalBox = new JComboBox<>();
//        for(int i = 0 ; i < animals.size(); i++){
//            animalBox.addItem(animals.get(i).getName());
//        }
//        JButton removeButton = new JButton("Remove");
//        removeButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                int index = animalBox.getSelectedIndex();
//                animals.get(index).setRemovedFlag(true);
//                // make animal stop running
//                animals.get(index).stopRunning();
//                dispose();
//            }
//        });
//        panel.add(label);
//        panel.add(animalBox);
//        panel.add(removeButton);
//        add(panel);
//    }
//}
