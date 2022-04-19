package graphics;

//import Olympics.Competition;
//import animals.*;
//import utils.FileUtils;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.*;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @author Noy Nir 207993940
// * Created on : 11 / 06 / 2020
// * Last edited on : 11 / 06 / 2020
// * CompetitionPanel class - a class that add panel
// */
//
//public class CompetitionPanel extends JPanel {
//
//    private static final String BACKGROUND_IMAGE_PATH =
//            FileUtils.getImagesPathName("competitionBackground.png");
//    private BufferedImage backgroundImage = null;
//    private String[] buttonsNames = {"Competition", "Add Animal", "Clear", "Eat",
//                                        "Info", "Exit"};
//    private List<Animal> animals = new ArrayList<>();
//    private Competition competition = new Competition(AnimalCategory.UNKNOWN);
//
//    /**
//     * Constructor
//     * @param layout - LayoutManager
//     */
//    public CompetitionPanel(LayoutManager layout) {
//        super(layout);
//        init();
//    }
//
//    /**
//     * Constructor
//     */
//    public CompetitionPanel() {
//        init();
//    }
//
//    /**
//     * A method that init a toolbar and background Image
//     */
//    private void init() {
//        try {
//            backgroundImage = ImageIO.read(new File(BACKGROUND_IMAGE_PATH));
//        }
//        catch (IOException e) {
//            System.out.println("Cannot load image :" + e.getMessage());
//        }
//        createToolbar();
//        setVisible(true);
//    }
//
//    /**
//     * A method that create the toolbar
//     */
//    public void createToolbar(){
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(1,0));
//        ButtonGroup buttonGroup = new ButtonGroup();
//        for (String buttonName : buttonsNames) {
//            JButton button = new JButton(buttonName);
//            button.addActionListener(new ToolbarListener(buttonName));
//            buttonGroup.add(button);
//            panel.add(button);
//        }
//        add(panel, BorderLayout.SOUTH);
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawImage(backgroundImage, 0,0, getWidth(), getHeight(), this);
//        List<Animal> filtered = animals.stream()
//                .filter(animal -> !animal.isRemovedFlag()).collect(Collectors.toList());
//        for(Animal animal: filtered) {
//            animal.drawObject(g);
//        }
//    }
//
//    public class ToolbarListener implements ActionListener {
//
//        private String buttonName;
//
//        public ToolbarListener(String buttonName) {
//            this.buttonName = buttonName;
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent actionEvent) {
//            switch (buttonName){
//                case "Exit":
//                    handleExitClick();
//                    break;
//                case "Info":
//                    handleInfoClick();
//                    break;
//                case "Clear":
//                    handleClear();
//                    break;
//                case "Add Animal":
//                    handleAddAnimal();
//                    break;
//                case "Competition":
//                    handleCompetition();
//                    break;
//                case "Eat":
//                    handleEat();
//                    break;
//            }
//        }
//
//        private void handleCompetition() {
//            JDialog dialog = ChooseCompetitionDialog.newInstance(300, 200, new ChooseCompetitionDialog.OnCompetitionSelectedListener() {
//                @Override
//                public void onCompetitionSelected(Competition selectedCompetition) {
//                    competition = selectedCompetition;
//                }
//            });
//        }
//
//        private void handleAddAnimal() {
//            if(competition.getCompetitionCategory() == AnimalCategory.UNKNOWN) {
//                JOptionPane.showMessageDialog(null,
//                        "Please create competition first");
//                return;
//            }
//            JDialog dialog = AddAnimalDialog.newInstance(500, 500,
//                    competition, createdAnimal -> {
//                createdAnimal.setPan(CompetitionPanel.this);
//                animals.add(createdAnimal);
//                repaint();
//                //TODo:// remove this line after exercise number 3 this is just to see animal is moving and stops when out of energy
//                createdAnimal.setCurrentEnergy(500);
//                createdAnimal.startRunning();
//                System.out.println(createdAnimal);
//            });
//        }
//
//        private void handleClear() {
//            List<Animal> filtered = animals.stream().filter(animal -> !animal.isRemovedFlag()).collect(Collectors.toList());
//            JDialog removeDialog = RemoveAnimalDialog.newInstance(filtered, 300, 200);
//            removeDialog.addWindowListener(new WindowAdapter() {
//                @Override
//                public void windowClosed(WindowEvent e) {
//                    repaint();
//                }
//            });
//        }
//
//        private void handleEat() {
//            JDialog eatDialog = EatDialog.newInstance(animals,500,500);
//        }
//
//        private void handleExitClick(){
//            System.exit(0);
//        }
//
//        private void handleInfoClick() {
//
//            String[] colName = {"Animal", "Category", "Type", "Speed", "Energy Amount",
//                                "Distance", "Energy Consumption"};
//
//            String[][] data = new String[animals.size()][colName.length];
//
//            for(int i = 0; i < animals.size(); i++){
//                data[i][0] = animals.get(i).getName();
//                data[i][1] = animals.get(i).getAnimalCategory().toString();
//                data[i][2] = animals.get(i).getClass().getSimpleName();
//                data[i][3] = animals.get(i).getSpeed() + "";
//                data[i][4] = animals.get(i).getCurrentEnergy() + "";
//                data[i][5] = animals.get(i).getTotalDistance() + "";
//                data[i][6] = animals.get(i).getTotalEnergy() +  "";
//            }
//
//            JTable table = new JTable(data ,colName) {
//                private static final long serialVersionUID = 1L; // Creating an anonymous class to remove the
//                // ability to edit cells.
//
//                /**
//                 * Overriding the original JTable "isCellEditable" to disable the ability to
//                 * edit cells as it's Unnecessary.
//                 *
//                 * @param row-
//                 *            the row number of the cell that's un-editable
//                 * @param column-
//                 *            the column number of the cell that's un-editable
//                 * @return false- always.
//                 */
//                public boolean isCellEditable(int row, int column) {
//                    return false;
//                }
//            };
//            table.setFillsViewportHeight(true);
//            JScrollPane scrollPane = new JScrollPane(table);
//            JDialog infoDialog = createInfoDialog(scrollPane);
//            infoDialog.setVisible(true);
//        }
//
//        private JDialog createInfoDialog(JScrollPane scrollPane) {
//            JDialog infoDialog = new JDialog();
//            infoDialog.add(scrollPane);
//            infoDialog.setAlwaysOnTop(true);
//            infoDialog.setTitle("Animal Info");
//            infoDialog.setSize(900, 700);
//            infoDialog.setLocationByPlatform(true);
//            JButton exit = new JButton("Ok");
//            exit.addActionListener(e -> infoDialog.dispose());
//            infoDialog.add(exit, BorderLayout.SOUTH);
//            return infoDialog;
//        }
//    }
//}
//
