package animals;

import diet.Herbivore;
import diet.IDiet;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

import java.awt.*;

public class Elephant extends Animal{
    private static final double startWeight = 500;
    private static final Point startPosition = new Point(50,90);
    private static final double minTrunkLength = 0.5;
    private static final double maxTrunkLength = 3;
    private static final double startTrunkLength = 1;
    private static final String Chew = "Trumpets with joy while flapping its ears, then chews";
    private  double trunkLength;

    public Elephant(String name){
        super(name,startPosition);
        setWeight(startWeight);
        setTrunkLength(startTrunkLength);
        setDiet(new Herbivore());
    }
    public Elephant(String name,Point location){
        super(name,location);
        setWeight(startWeight);
        setTrunkLength(startTrunkLength);
        setDiet(new Herbivore());
    }
    public Elephant(String name,double trunkLength){
        super(name,startPosition);
        setWeight(startWeight);
        setTrunkLength(trunkLength);
        setDiet(new Herbivore());
    }

    public void chew(){
        MessageUtility.logSound(getName(),Chew);
    }
    @Override
    public void makeSound() {}

    @Override
    public EFoodType getFoodType() {
        return null;
    }

    @Override
    public boolean eat(IEdible edible) {
        return false;
    }


    public boolean setTrunkLength(double trunkLength)
    {
        if (trunkLength>=minTrunkLength && trunkLength <= maxTrunkLength) {
            this.trunkLength = trunkLength;
            MessageUtility.logSetter(getName(),"setTrunkLength",trunkLength,true);
            return true;
        }
        MessageUtility.logSetter(getName(),"setTrunkLength",trunkLength,false);
        return false;
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
        return null;
    }
}
