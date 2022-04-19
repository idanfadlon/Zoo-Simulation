package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import utilities.MessageUtility;

public class Carnivore implements IDiet {

    @Override
    public boolean canEat(EFoodType food) {
        boolean carnivore = false;
        if(food == EFoodType.MEAT)
            carnivore = true;
        MessageUtility.logBooleanFunction(this.toString(),"canEat",food,carnivore);
        return carnivore;
    }

    @Override
    public double eat(Animal animal, IEdible food) {
        if(canEat(food.getFoodtype()))
            return (animal.getWeight() * 0.10);
        return 0;
    }

    public String toString(){
        return "[" + this.getClass().getSimpleName() + "]";
    }



}
