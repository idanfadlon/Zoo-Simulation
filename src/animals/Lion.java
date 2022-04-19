package animals;

import diet.Carnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

import java.util.Random;

public class Lion extends Animal{


    private static final EFoodType LION = EFoodType.NOTFOOD;
    private static final double startWeight = 408.2;
    private static final Point startPosition = new Point(20,0);
    private static final String roar= "Roars, then stretches and shakes its mane";
    private int scarCount = 0;

    public Lion(String name){
        super(name,startPosition);
        MessageUtility.logConstractor("Lion", this.getName());
        this.setWeight(startWeight);
        this.setDiet(new Carnivore());
    }
    public Lion(String name,Point location){
        super(name,location);
        MessageUtility.logConstractor("Lion", this.getName());
        this.setWeight(startWeight);
        this.setDiet(new Carnivore());
    }


    @Override
    public EFoodType getFoodType() {
        return null;
    }


    public void roar(){
        MessageUtility.logSound(this.getName(), roar);
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

        MessageUtility.logSetter(this.getName(), "setScar", scar, flag);
        return flag;
    }

    public EFoodType getFoodtype(){
        MessageUtility.logGetter(this.getName(), "getFoodType", LION);
        return LION;
    }
}