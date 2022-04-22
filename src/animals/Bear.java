package animals;

import diet.IDiet;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

import java.awt.*;

public class Bear extends Animal{
    private static final double startWeight = 308.2;
    private static final Point startPosition = new Point(100,5);
    private static final String startFurColor = "GRAY";
    private static final String Roar = "Stands on its hind legs, roars and scratches its belly";
    private String furColor ;

    public Bear(String name){
        super(name,startPosition);
        this.setWeight(startWeight);
        this.setDiet(new Omnivore());
        this.furColor = startFurColor;
        MessageUtility.logConstractor("Bear",this.getName());

    }
    public Bear(String name,Point location){
        super(name,location);
        this.setWeight(startWeight);
        this.setDiet(new Omnivore());
        this.furColor = startFurColor;
        MessageUtility.logConstractor("Bear",this.getName());

    }
    public Bear(String name,String furColor){
        super(name,startPosition);
        this.setWeight(startWeight);
        this.setDiet(new Omnivore());
        this.furColor = furColor;
        MessageUtility.logConstractor("Bear",this.getName());

    }


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
    MessageUtility.logSound(getName(),Roar);
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
      MessageUtility.logBooleanFunction(getName(),"colorCheck",color,flag);
      return flag;

    }

    public boolean setFurColor(String furColor)
    {
        if(colorCheck(furColor))
        {
            this.furColor = furColor;
            MessageUtility.logSetter(getName(),"setFurColor",furColor,true);
            return true;
        }
        this.furColor = startFurColor;
        MessageUtility.logSetter(getName(),"setFurColor",furColor,false);
        return false;
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
    public int getEatCount() {
        return super.getEatCount();


    }

    @Override
    public boolean getChanges() {
        return false;
    }

    @Override
    public void setChanges(boolean state) {

    }

    @Override
    public void loadImages(String nm) {

    }

    @Override
    public void drawObject(Graphics g) {

    }

    @Override
    public String getColor() {
        return this.furColor;
    }
}
