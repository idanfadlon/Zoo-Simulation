package animals;

import diet.Herbivore;
import diet.IDiet;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

import java.awt.*;

public class Giraffe extends Animal{
    private static final double startWeight = 450;
    private static final Point startPosition = new Point(50,0);
    private static final double minNeckLength = 1;
    private static final double maxNeckLength = 2.5;
    private static final double defaultNeckLength = 1.5;
    private static final String Chew ="Bleats and Stomps its legs, then chews";
    private double neckLength;

    public Giraffe(String color,int size,int horSpeed,int verSpeed){
        super(color,size,horSpeed,verSpeed);
        this.setWeight(this.getSize()*2.2);
        this.setDiet(new Herbivore());
        loadImages(color);

    }
//    public Giraffe(String name,Point location){
//        super(name,location);
//        this.setWeight(startWeight);
//        this.setNeckLength(defaultNeckLength);
//        this.setDiet(new Herbivore());
//        MessageUtility.logConstractor("Giraffe", this.getName());
//    }
//    public Giraffe(String name, double neckLength){
//        super(name,startPosition);
//        this.setWeight(startWeight);
//        this.setNeckLength(neckLength);
//        this.setDiet(new Herbivore());
//        MessageUtility.logConstractor("Giraffe", this.getName());
//    }

    public void chew(){

    }
    @Override
    public void makeSound() { chew();}

    @Override
    public EFoodType getFoodType() {
        return null;
    }

    public boolean setNeckLength(double neckLength){
        boolean flag = false;
        if(neckLength > minNeckLength && neckLength < maxNeckLength){
            this.neckLength = neckLength;
            flag = true;

        }
        return flag;
    }

    @Override
    public EFoodType getFoodtype() {
        return null;
    }

    @Override
    public String getAnimalName() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void eatInc() {

    }

    @Override
    public int getIntCount() {
        return 0;
    }

    @Override
    public boolean getChanges() {
        return false;
    }

    @Override
    public void setChanges(boolean state) {

    }

    @Override
    public boolean eat(int energy) {
        return false;
    }

    @Override
    public void loadImages(String nm) {

    }

    @Override
    public void drawObject(Graphics g) {

    }

    @Override
    public String getColor() {
        return null;
    }
}
