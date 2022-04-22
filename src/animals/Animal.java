package animals;

import diet.IDiet;
import food.EFoodType;
import food.IEdible;
import graphics.IAnimalBehavior;
import graphics.IDrawable;
import graphics.ZooPanel;
import mobility.Mobile;
import mobility.Point;
import utilities.MessageUtility;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Animal extends Mobile implements IEdible, IDrawable, IAnimalBehavior {


    private double weight;
    private IDiet diet;
    private final int EAT_DISTANCE =10;
    private int size;
    private String col;
    private int horSpeed;
    private int verSpeed;
    private boolean coordChanged;
    private Thread thread;
    private int x_dir =1;
    private int y_dir =1;
    private int eatCount;
    private ZooPanel pan;
    protected BufferedImage img1, img2;
    private static int AnimalAmount =0;



    public Animal(String color, int size, int horSpeed, int verSpeed){
        this.col = color;
        this.size = size;
        this.horSpeed = horSpeed;
        this.verSpeed = verSpeed;
        AnimalAmount++;

    }
    public static int getAnimalAmount(){
        return AnimalAmount;
    }
    public BufferedImage getImg1(){
        return img1;
    }
    public BufferedImage getImg2(){
        return img2;
    }


//    public String toString() {
//        String s = super.toString();
//        return s + ", name = " + getAnimalName() +
//                ", weight = " + weight ;
//
//    }
    public abstract void makeSound();
    public abstract EFoodType getFoodType();


    public boolean eat(IEdible food){
        double weightAfterEat = diet.eat(this,food);
        boolean flag = false;
        if(weightAfterEat != 0) {
            this.weight = this.weight + weightAfterEat;
            makeSound();
            flag = true;
        }

        return flag;

    }
    public void setPanel(ZooPanel panel){
        this.pan = panel;
    }
    public JPanel getPanel(){
        return this.pan;
    }
    public double move(Point pointToGo){
        double disCheck = super.move(pointToGo);
        if(disCheck != 0) {
            setWeight(getWeight() - (disCheck * getWeight() * 0.00025));

        }
        return disCheck;

    }

    public double getWeight(){

        return this.weight;
    }
    public Point getLocation(){

        return super.getLocation();
    }
    public IDiet getDiet(){
        return this.diet;
    }
//    public boolean setName(String name){
//        if(name.equals(""))
//        {
//            MessageUtility.logSetter(name,"setName",name,false);
//            return false;
//        }
//        else {
//
//            MessageUtility.logSetter(name, "setName", name, true);
//            return true;
//        }
//    }
    public boolean setWeight(double weight){
        if(weight <0)
        {
            this.weight = 0;
            return false;
        }
        this.weight = weight;
        return true;
    }
    public boolean setDiet(IDiet diet){
        this.diet = diet;
        return true;
    }

    public String getCol()
    {
        return this.col;
    }
    public int getSize(){
        return size;
    }

//    public static String getPicturePath(){
//
//    }



}
