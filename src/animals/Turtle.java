package animals;

import diet.Herbivore;
import diet.IDiet;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

import java.awt.*;

public class Turtle extends Animal{
    private static final double startWeight = 1;
    private static final Point startPosition = new Point(80,0);
    private static final int minimumAge = 0;
    private static final int maximumAge = 500;
    private static final int defaultAge = 1;
    private static final String Chew = "Retracts its head in then eats quietly";
    private int Age;
    public Turtle(String color,int size,int horSpeed,int verSpeed){
        super(color,size,horSpeed,verSpeed);
        this.setWeight(this.getSize()*1.5);
        this.setDiet(new Herbivore());
        loadImages(color);
    }
//    public Turtle(String name,int age){
//        super(name, startPosition);
//        MessageUtility.logConstractor("Turtle", this.getName());
//        this.setWeight(startWeight);
//        this.setAge(age);
//        this.setDiet(new Herbivore());
//
//    }
//    public Turtle(String name,Point location){
//        super(name,location);
//        MessageUtility.logConstractor("Turtle",this.getName());
//        this.setWeight(startWeight);
//        this.setAge(defaultAge);
//        this.setDiet(new Herbivore());
//    }


    public void chew(){

    }
    @Override
    public void makeSound() {
        chew();

    }

    @Override
    public EFoodType getFoodType() {
        return null;
    }

    @Override
    public boolean eat(IEdible edible) {
        return false;
    }

    public boolean setAge(int age) {
        boolean flag = false;
        if (age >= minimumAge && age <= maximumAge) {
            this.Age = age;
            flag = true;
        }

        return flag;
    }

    @Override
    //ask class
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
