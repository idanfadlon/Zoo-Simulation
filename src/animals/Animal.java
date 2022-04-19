package animals;

import diet.IDiet;
import food.EFoodType;
import food.IEdible;
import mobility.Mobile;
import mobility.Point;
import utilities.MessageUtility;

public abstract class Animal extends Mobile implements IEdible {

    private String name;
    private double weight;
    private IDiet diet;

    public Animal(String name,Point location){
        super(location);
        this.name = name;
        MessageUtility.logConstractor("Animal",this.name);

    }


    @Override
    public String toString() {
        String s = super.toString();
        return s + ", name = " + name +
                ", weight = " + weight ;

    }
    public abstract void makeSound();
    public abstract EFoodType getFoodType();

    public boolean eat(IEdible food){
        double weightAfterEat = diet.eat(this,food);
        boolean flag = false;
        if(weightAfterEat > 0) {
            this.weight = this.weight + weightAfterEat;
            this.makeSound();
            flag = true;
        }
        MessageUtility.logBooleanFunction(this.getName(),"eat",food.toString(),flag);
        return flag;

    }
    public double move(Point pointToGo){
        double disCheck = super.move(pointToGo);
        if(disCheck != 0) {
            setWeight(getWeight() - (disCheck * getWeight() * 0.00025));
            MessageUtility.logSetter(getName(),"move",pointToGo,true);
        }
        else
            MessageUtility.logSetter(getName(),"move",pointToGo,false);
        return disCheck;

    }
    public String getName() {
        MessageUtility.logGetter(getName(),"getName",name);
        return name;
    }
    public double getWeight(){
        MessageUtility.logGetter(getName(),"getWeight",weight);
        return this.weight;
    }
    public Point getLocation(){
        MessageUtility.logGetter(getName(),"getLoaction",super.getLocation());
        return super.getLocation();
    }
    public IDiet getDiet(){
        MessageUtility.logGetter(getName(),"getDiet",diet);
        return this.diet;
    }
    public boolean setName(String name){
        if(name.equals(""))
        {
            MessageUtility.logSetter(name,"setName",getName(),false);
            return false;
        }
        this.name = name;
        MessageUtility.logSetter(name,"setName",getName(),true);
        return true;

    }
    public boolean setWeight(double weight){
        if(weight <0)
        {
            this.weight = 0;
            MessageUtility.logSetter(name,"setWeight",weight,false);
            return false;
        }
        this.weight = weight;
        MessageUtility.logSetter(name,"setWeight",getName(),true);
        return true;
    }
    public boolean setDiet(IDiet diet){
        this.diet = diet;
        MessageUtility.logSetter(getName(),"setDiet",diet,true);
        return true;
    }




}
