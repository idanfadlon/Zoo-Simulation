package animals;

import diet.IDiet;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;

public class Bear extends Animal{
    private String name;
    private static final double INIT_WEIGHT = 308.2;
    private Point location;
    private IDiet diet;
    String furColor;
    public Bear(String name,Point location){
        super(name);
        this.setWeight(INIT_WEIGHT);
        this.location = location;
        this.diet = new Omnivore();
        this.furColor = "GRAY";

    }

    @Override
    public void makeSound() {

    }

    @Override
    public EFoodType getFoodType() {
        return null;
    }

    @Override
    public boolean eat(IEdible edible) {
        return false;
    }

    public Bear(String name){
        super(name);
        this.weight = 308.2;
        this.location = new Point(100,5);
        this.diet = new Omnivore();
        this.furColor = "GRAY";

    }
    public void roar()
    {

    }
    @Override
    public EFoodType getFoodtype() {
        return null;
    }



}
