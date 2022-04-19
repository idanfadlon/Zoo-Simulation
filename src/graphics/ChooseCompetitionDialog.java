package graphics;

//import Olympics.Competition;
//import animals.Animal;
//import animals.AnimalCategory;
//import javafx.scene.control.skin.SliderSkin;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
///**
// * @author Noy Nir 207993940
// * Created on : 11 / 06 / 2020
// * Last edited on : 11 / 06 / 2020
// * ChooseCompetitionDialog class - a class that add competition dialog
// */
//
//public class ChooseCompetitionDialog extends JDialog {
//
//    private OnCompetitionSelectedListener listener = null;
//
//    public static ChooseCompetitionDialog newInstance(int width,
//                                                      int height,
//                                                      OnCompetitionSelectedListener listener) {
//        ChooseCompetitionDialog dialog = new ChooseCompetitionDialog(listener);
//        dialog.setAlwaysOnTop(true);
//        dialog.setTitle("Create Competition");
//        dialog.setSize(width, height);
//        dialog.setLocationByPlatform(true);
//        dialog.setVisible(true);
//        return dialog;
//    }
//
//    /**
//     * Constructor
//     * @param listener - listener to the competition that selected
//     */
//    public ChooseCompetitionDialog(OnCompetitionSelectedListener listener){
//        super();
//        this.listener = listener;
//        JPanel panel = new JPanel();
//        JLabel label = new JLabel("Choose competition type: ");
//        JComboBox<String> competitionBox = new JComboBox<>();
//        AnimalCategory[] categories = AnimalCategory.values();
//        /*-1 because the last element is UNKNOWN category*/
//        for (int i = 0; i < categories.length - 1 ; i++) {
//            competitionBox.addItem(categories[i].name().toLowerCase());
//        }
//        JButton createButton = new JButton("Create");
//        createButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                int selectedIndex = competitionBox.getSelectedIndex();
//                AnimalCategory category = categories[selectedIndex];
//                if(listener != null)
//                {
//                    listener.onCompetitionSelected(new Competition(category));
//                }
//                dispose();
//            }
//        });
//        panel.add(label);
//        panel.add(competitionBox);
//        panel.add(createButton);
//        add(panel);
//    }
//
//    public interface OnCompetitionSelectedListener{
//        void onCompetitionSelected(Competition selectedCompetition);
//    }
//}
