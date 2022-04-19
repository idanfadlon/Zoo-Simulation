package graphics;

//import Olympics.Competition;
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

    public AddAnimalDialog(){
        this.setTitle("Add Animal");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }

//    private static HashMap<AnimalCategory, List<String>> typeMap = new HashMap<>();
//    private static HashMap<AnimalCategory, List<String>> laneMap = new HashMap<>();
//    static {
//        typeMap.put(AnimalCategory.TERRESTRIAL, List.of("Alligator", "Dog", "Cat", "Snake"));
//        typeMap.put(AnimalCategory.AIR, List.of("Eagle", "Pigeon"));
//        typeMap.put(AnimalCategory.WATER, List.of("Alligator", "Dolphin", "Whale"));
//        laneMap.put(AnimalCategory.WATER, List.of("1", "2", "3", "4"));
//        laneMap.put(AnimalCategory.AIR, List.of("1", "2", "3", "4", "5"));
//    }
//    private Competition competition;
//    private AnimalCategory selectedCategory = AnimalCategory.UNKNOWN;
//    private String selectedAnimal;
//    private JTextField animalName, animalSpeed, animalWeight, animalEnergyPm, animalMaxEnergy;
//    private JComboBox<String> animalLaneBox, animalBox, genderBox;
//    private JLabel laneLabel;
//    private OnAnimalCreatedListener listener;
//
//
//    /**
//     * A static method that creates the dialog
//     *
//     * @param width - dialog's width
//     * @param height - dialog's height
//     * @param competition - the competition type
//     * @param listener - listener when we adding animal
//     * @return dialog - the created dialog
//     */
//    public static AddAnimalDialog newInstance(int width, int height,
//                                              Competition competition,
//                                              OnAnimalCreatedListener listener) {
//        AddAnimalDialog dialog = new AddAnimalDialog(competition, listener);
//        dialog.setAlwaysOnTop(true);
//        dialog.setTitle("Add Animal");
//        dialog.setSize(width, height);
//        dialog.setLocationByPlatform(true);
//        dialog.setVisible(true);
//        return dialog;
//    }
//
//    /**
//     * Constructor
//     *
//     * @param competition - the competition
//     * @param listener - listener when animal created
//     */
//    public AddAnimalDialog(Competition competition, OnAnimalCreatedListener listener){
//        super();
//        this.competition = competition;
//        this.listener = listener;
//        JPanel panel = new JPanel();
//        laneLabel = new JLabel("Choose racing lane: ");
//        animalLaneBox = new JComboBox<>();
//        animalLaneBox.setVisible(false);
//        JLabel categoryLabel = new JLabel("Choose Animal Category: ");
//        animalBox = createAnimalBox();
//        JComboBox<String> animalCategoryBox = createComboBox(animalBox);
//        JLabel animalLabel = new JLabel("Choose Animal: ");
//        JLabel nameLabel = new JLabel("Enter Animal Name: ");
//        animalName = new JTextField(20);
//        JLabel speedLabel = new JLabel("Enter Animal Speed: ");
//        animalSpeed = new JTextField(20);
//        JLabel weightLabel = new JLabel("Enter Animal Weight: ");
//        animalWeight = new JTextField(20);
//        JLabel genderLabel = new JLabel("Enter Animal Gender: ");
//        initGenderBox();
//        JLabel energyPMLabel = new JLabel("Enter Energy Per Meter Consumption: ");
//        animalEnergyPm = new JTextField(20);
//        JLabel maxEnergyLabel = new JLabel("Enter Animal Max Energy");
//        animalMaxEnergy = new JTextField(20);
//        panel.add(categoryLabel);
//        panel.add(animalCategoryBox);
//        panel.add(animalLabel);
//        panel.add(animalBox);
//        panel.add(nameLabel);
//        panel.add(animalName);
//        panel.add(speedLabel);
//        panel.add(animalSpeed);
//        panel.add(weightLabel);
//        panel.add(animalWeight);
//        panel.add(genderLabel);
//        panel.add(genderBox);
//        panel.add(energyPMLabel);
//        panel.add(animalEnergyPm);
//        panel.add(maxEnergyLabel);
//        panel.add(animalMaxEnergy);
//        panel.add(laneLabel);
//        panel.add(animalLaneBox);
//        JButton addAnimal = createAddButton();
//        panel.add(addAnimal);
//        add(panel);
//    }
//
//
//    /**
//     * A method to fill the combo box with the correct animals names
//     *
//     * @param stringBox - the options in the combo box
//     * @param animalName - a list of the animals names
//     */
//    private void fillStringBox(JComboBox<String> stringBox, List<String> animalName){
//        stringBox.removeAllItems();
//        for(int i = 0; i < animalName.size(); i++)
//        {
//            stringBox.addItem(animalName.get(i));
//        }
//    }
//
//    /**
//     * A method to create animals combo box
//     * @return animalBox - the created combo box
//     */
//    private JComboBox<String> createAnimalBox(){
//        JComboBox<String> animalBox = new JComboBox<>();
//        animalBox.addItemListener(itemEvent -> {
//            if (itemEvent.getStateChange() == ItemEvent.SELECTED){
//                selectedAnimal = itemEvent.getItem().toString();
//                System.out.println(selectedAnimal);
//            }
//        });
//        return animalBox;
//    }
//
//    /**
//     * A method that returns the air\water animal start position
//     * @return point - the animal's position
//     */
//    private Point getAnimalStartingLocation() {
//        int x = 0;
//        int y = 0;
//        if(selectedCategory != AnimalCategory.TERRESTRIAL) {
//            y += (animalLaneBox.getSelectedIndex() + 1) * 50;
//        }
//        return new Point(x, y);
//    }
//
//    /**
//     * A method to create combo box of categories
//     *
//     * @param animalBox - the animals combo box
//     * @return animalCategoryBox - the new created combo box of categories
//     */
//    private JComboBox<String> createComboBox(JComboBox<String> animalBox){
//        JComboBox<String> animalCategoryBox = new JComboBox<>();
//        AnimalCategory[] categories = AnimalCategory.values();
//        animalCategoryBox.addItemListener(new CategoryItemListener(animalCategoryBox,
//                categories, animalBox));
//        for (int i = 0; i < categories.length - 1 ; i++) {
//            animalCategoryBox.addItem(categories[i].name().toLowerCase());
//        }
//        return animalCategoryBox;
//    }
//
//    /**
//     * A method that creates combo box to the animal's gender
//     */
//    private void initGenderBox() {
//        genderBox = new JComboBox<>();
//        for(Gender gender: Gender.values()) {
//            genderBox.addItem(gender.name().toLowerCase());
//        }
//    }
//
//    /**
//     * A method that creates button "Add Animal" that adding animal
//     *
//     * @return addAnimal - the created button
//     */
//    private JButton createAddButton(){
//        JButton addAnimal = new JButton("Add Animal");
//        addAnimal.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                if(!isAnimalValid()) {
//                    return;
//                }
//                String name = animalName.getText();
//                Gender gender = Gender.values()[genderBox.getSelectedIndex()];
//                double weight = Double.parseDouble(animalWeight.getText());
//                double speed = Double.parseDouble(animalSpeed.getText());
//                Point point = getAnimalStartingLocation();
//                int maxEnergy = Integer.parseInt(animalMaxEnergy.getText());
//                int energyPm = Integer.parseInt(animalEnergyPm.getText());
//                int selectedIndex = animalBox.getSelectedIndex();
//                String animalStr = animalBox.getItemAt(selectedIndex);
//                Animal animal = AnimalFactory.create(animalStr, name, gender,
//                        weight, speed, new ArrayList<>(), point, null, maxEnergy, energyPm,
//                        Orientation.EAST);
//                if(listener != null) {
//                    listener.onAnimalCreated(animal);
//                }
//                dispose();
//            }
//        });
//        return addAnimal;
//    }
//
//    /**
//     * A method that check if the selected category appropriate to the competition type
//     *
//     * @return true if he selected category appropriate to the competition type
//     * else - throws exception
//     */
//    private boolean isAnimalValid() {
//        try {
//            checkType(selectedCategory);
//        } catch (AnimalTypeException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        return true;
//    }
//
//    /**
//     * A method that update the animalLaneBox and the laneLabel in accordance to visible
//     * @param visible - boolean
//     */
//    private void setLaneSectionVisibility(boolean visible) {
//        animalLaneBox.setVisible(visible);
//        laneLabel.setVisible(visible);
//    }
//
//    /**
//     * A method that check if the animal category appropriate to the competition type
//     * @param category - the animal's category
//     * @return boolean
//     * @throws AnimalTypeException
//     */
//    private boolean checkType(AnimalCategory category) throws AnimalTypeException{
//        if (competition.getCompetitionCategory() != category){
//            throw new AnimalTypeException();
//        }
//        return true;
//    }
//
//    /**
//     * CategoryItemListener class
//     */
//    private class CategoryItemListener implements ItemListener{
//        JComboBox<String> animalCategoryBox;
//        AnimalCategory[] categories;
//        JComboBox<String> animalBox;
//
//        /**
//         * Constructor
//         *
//         * @param animalCategoryBox - the animal category box
//         * @param categories - the animals categories
//         * @param animalBox - the animal box
//         */
//        public CategoryItemListener(JComboBox<String> animalCategoryBox,
//                                    AnimalCategory[] categories, JComboBox<String>animalBox) {
//            this.animalCategoryBox = animalCategoryBox;
//            this.categories = categories;
//            this.animalBox = animalBox;
//        }
//
//        /**
//         * A method that Hides the Combo Box from us if it is a terrestrial animal
//         */
//        @Override
//        public void itemStateChanged(ItemEvent itemEvent) {
//            if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
//                int index = animalCategoryBox.getSelectedIndex();
//                AnimalCategory category = categories[index];
//                selectedCategory = category;
//                fillStringBox(animalBox, typeMap.get(category));
//                if(category == AnimalCategory.TERRESTRIAL) {
//                    setLaneSectionVisibility(false);
//                }
//                else {
//                    setLaneSectionVisibility(true);
//                    fillStringBox(animalLaneBox, laneMap.get(category));
//                }
//            }
//        }
//    }
//
//    /**
//     * Exception to throw when animal type is not matching to comptetion
//     */
//    public static class AnimalTypeException extends Exception{
//        public AnimalTypeException() {
//            super("Animal type doesn't match to competition type");
//        }
//    }
//
//    /**
//     * Listener to fire when animal is created
//     */
//    interface OnAnimalCreatedListener {
//        void onAnimalCreated(Animal createdAnimal);
//    }
}
