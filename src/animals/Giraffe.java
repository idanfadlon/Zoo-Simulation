package animals;

import diet.Herbivore;
import diet.IDiet;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Giraffe extends Animal{
    private static final double startWeight = 450;
    private static final Point startPosition = new Point(50,0);
    private static final double minNeckLength = 1;
    private static final double maxNeckLength = 2.5;
    private static final double defaultNeckLength = 1.5;
    private static final String Chew ="Bleats and Stomps its legs, then chews";

    private double neckLength;
    //Constructors
    public Giraffe(String name){
        super(name,startPosition);
        MessageUtility.logConstractor("Giraffe", this.getName());
        this.setWeight(startWeight);
        this.setNeckLength(defaultNeckLength);
        this.setDiet(new Herbivore());
    }
    public Giraffe(String name,Point location){
        super(name,location);
        MessageUtility.logConstractor("Giraffe", this.getName());
        this.setWeight(startWeight);
        this.setNeckLength(defaultNeckLength);
        this.setDiet(new Herbivore());
    }
    public Giraffe(String name, double neckLength){
        super(name,startPosition);
        MessageUtility.logConstractor("Giraffe", this.getName());
        this.setWeight(startWeight);
        this.setNeckLength(neckLength);
        this.setDiet(new Herbivore());
    }

    public void chew(){
        MessageUtility.logSound(this.getName(),Chew);
    }
    @Override
    public void makeSound() {
        chew();

    }

    public boolean setNeckLength(double neckLength){
        boolean flag = false;
        if(neckLength > minNeckLength && neckLength < maxNeckLength){
            this.neckLength = neckLength;
            flag = true;

        }
        MessageUtility.logSetter(this.getName(),"setNeckLength",neckLength,flag);
        return flag;
    }

}