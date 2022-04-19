package graphics;

//import animals.Animal;
//import animals.Gender;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
//
///**
// * @author Noy Nir 207993940
// * Created on : 11 / 06 / 2020
// * Last edited on : 11 / 06 / 2020
// * EatDialog class - a class that add eat dialog
// */
//
//public class EatDialog extends JDialog {
//
//    public static EatDialog newInstance(List<Animal> animals,int width, int height) {
//        EatDialog dialog = new EatDialog(animals);
//        dialog.setAlwaysOnTop(true);
//        dialog.setTitle("Eat");
//        dialog.setSize(width, height);
//        dialog.setLocationByPlatform(true);
//        dialog.setVisible(true);
//        return dialog;
//    }
//
//    public EatDialog(List<Animal> animals){
//        super();
//        JPanel panel = new JPanel();
//        JLabel label = new JLabel("Choose Animal That You Want To Feed: ");
//        JComboBox<String> animalBox = createAnimalBox(animals);
//        JLabel eatLabel = new JLabel("Energy Amount To Add :");
//        JTextField eatField = new JTextField(20);
//        JButton feedButton = new JButton("Feed");
//        feedButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                int selectedIndex = animalBox.getSelectedIndex();
//                Animal animal = animals.get(selectedIndex);
//                int energy = Integer.parseInt(eatField.getText());
//                if((!animal.eat(energy))){
//                    JOptionPane.showMessageDialog(null, "Exceeded Energy Limit! \n " +
//                            "Try Again!");
//                }
//                else {
//                    dispose();
//                }
//            }
//        });
//        panel.add(label);
//        panel.add(animalBox);
//        panel.add(eatLabel);
//        panel.add(eatField);
//        panel.add(feedButton);
//        add(panel);
//    }
//
//    private JComboBox<String> createAnimalBox(List<Animal> animals){
//        JComboBox<String> animalBox = new JComboBox<>();
//        for(int i = 0 ; i < animals.size(); i++){
//            animalBox.addItem(animals.get(i).getName());
//        }
//        return animalBox;
//    }
//}
