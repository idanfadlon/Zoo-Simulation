package animals;

import diet.IDiet;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import graphics.IDrawable;
import mobility.Point;
import utilities.MessageUtility;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bear extends Animal{
    private static final double startWeight = 308.2;
    private static final Point defaultPosition = new Point(100,5);
    private static final String startFurColor = "GRAY";
    private static final String Roar = "Stands on its hind legs, roars and scratches its belly";
    private String furColor ;


    public Bear(String color,int size,int horSpeed,int verSpeed){
        super(color,size,horSpeed,verSpeed);
        this.setWeight(this.getSize()*1.5);
        this.setDiet(new Omnivore());
        loadImages(color);


    }
//    public Bear(String name,Point location){
//
//        this.setWeight(startWeight);
//        this.setDiet(new Omnivore());
//        this.furColor = startFurColor;
//
//
//    }
//    public Bear(String name,String furColor){
//
//        this.setWeight(startWeight);
//        this.setDiet(new Omnivore());
//        loadImages(furColor);
//
//    }


    @Override
    public void makeSound() { roar();}

    @Override
    public EFoodType getFoodType() {
        return null;
    }

    @Override
    public boolean eat(IEdible edible) {
        return false;
    }

    public void roar()
    {

    }
    @Override
    public EFoodType getFoodtype() {
        return null;
    }

    public boolean colorCheck(String color)
    {
        boolean flag = false;
      for(BearFurColors colors : BearFurColors.values())
          if (colors.getFurColor().equals(color))
              flag = true;

      return flag;
    }

    public boolean setFurColor(String furColor)
    {
        if(colorCheck(furColor))
        {
            this.furColor = furColor;

            return true;
        }
        this.furColor = startFurColor;

        return false;
    }


    @Override
    public String getAnimalName() {
        return null;
    }

    @Override
    public int getSize() {
    return super.getSize();
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
        if (nm.equals("Natural")) {
            try {
                this.img1 = ImageIO.read(new File("C:\\Users\\kibeb\\Downloads\\HW1-ZooProject\\HW1-ZooProject\\src\\assignment2_pictures\\bea_n_1.png"));
                this.img2 = ImageIO.read(new File("C:\\Users\\kibeb\\Downloads\\HW1-ZooProject\\HW1-ZooProject\\src\\assignment2_pictures\\bea_n_2.png"));
            } catch (IOException e) {
                System.out.println("Cannot load image");
            }
        }
        else if(nm.equals("Red")){
            try {
                this.img1 = ImageIO.read(new File("C:\\Users\\kibeb\\Downloads\\HW1-ZooProject\\HW1-ZooProject\\src\\assignment2_pictures\\bea_r_1.png"));
                this.img2 = ImageIO.read(new File("C:\\Users\\kibeb\\Downloads\\HW1-ZooProject\\HW1-ZooProject\\src\\assignment2_pictures\\bea_r_2.png"));
            } catch (IOException e) {
                System.out.println("Cannot load image");
            }
        }
        else {
            try {
                this.img1 = ImageIO.read(new File("C:\\Users\\kibeb\\Downloads\\HW1-ZooProject\\HW1-ZooProject\\src\\assignment2_pictures\\bea_b_1.png"));
                this.img2 = ImageIO.read(new File("C:\\Users\\kibeb\\Downloads\\HW1-ZooProject\\HW1-ZooProject\\src\\assignment2_pictures\\bea_b_2.png"));
            } catch (IOException e) {
                System.out.println("Cannot load image");
            }
        }
    }



    public void drawObject(Graphics g) {
        g.drawImage(img1, 200,200,this.getSize(), this.getSize(),getPanel());
    }

    @Override
    public String getColor() {
        return super.getCol();
    }





}
