package animals;

import diet.Herbivore;
import diet.IDiet;
import food.EFoodType;
import food.IEdible;
import mobility.Point;

public class Elephant extends Animal{
    private String name;
    private double weight;
    private Point location;
    private IDiet diet;
    private  double trunkLength;

    public Elephant(String name,Point location){
        super(name);
        this.weight = 500;
        this.location = location;
        this.diet = new Herbivore();
        this.trunkLength = 1;

    }

    @Override
    public void makeSound() {

    }

    @Override
    public boolean eat(IEdible edible) {
        return false;
    }

    public Elephant(String name){
        super(name);
        this.weight = 500;
        this.location = new Point(50,90);
        this.diet = new Herbivore();
        this.trunkLength = 1;

    }
    public void chew(){

    }

    @Override
    public EFoodType getFoodtype() {
        return null;
    }
}
