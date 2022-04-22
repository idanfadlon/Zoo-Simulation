package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import utilities.MessageUtility;

public class Herbivore implements IDiet{
    @Override
    public boolean canEat(EFoodType food) {
        boolean herbivore = false;
        if(food == EFoodType.VEGETABLE)
            herbivore = true;
        MessageUtility.logBooleanFunction(this.toString(),"canEat",food,herbivore);
        return herbivore;
    }

    @Override
    public double eat(Animal animal, IEdible food) {
        if(canEat(food.getFoodtype()))
            return (animal.getWeight() * 0.07);
        return 0;
    }
    public String toString(){
        return "[" + this.getClass().getSimpleName() + "]";
    }

}
