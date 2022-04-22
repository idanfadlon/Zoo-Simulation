package animals;

import diet.Carnivore;
import diet.IDiet;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

import java.awt.*;
import java.util.Random;

public class Lion extends Animal{


    private static final EFoodType LION = EFoodType.NOTFOOD;
    private static final double startWeight = 408.2;
    private static final Point startPosition = new Point(20,0);
    private static final String roar= "Roars, then stretches and shakes its mane";
    private int scarCount = 0;

    public Lion(String color,int size,int horSpeed,int verSpeed){
        super(color,size,horSpeed,verSpeed);
        this.setWeight(this.getSize()*1.5);
        this.setDiet(new Carnivore());
        loadImages(color);
    }
//    public Lion(String name,Point location){
//        super(name,location);
//        MessageUtility.logConstractor("Lion", this.getName());
//        this.setWeight(startWeight);
//        this.setDiet(new Carnivore());
//    }


    @Override
    public EFoodType getFoodType() {
        return null;
    }


    public void roar(){

    }

    @Override
    public void makeSound() {
        roar();

    }


    public boolean eat(IEdible food) {
        boolean flag = super.eat(food);
        if (flag){
            this.setScar(1);
        }
        return flag;
    }

    public boolean setScar(int scar){
        boolean flag = false;
        Random rand = new Random();
        if ( rand.nextInt(2) == 1) {
            scarCount+= scar;
            flag = true;
        }


        return flag;
    }

    public EFoodType getFoodtype(){

        return LION;
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