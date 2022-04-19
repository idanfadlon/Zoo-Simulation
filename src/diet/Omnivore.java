package diet;

import animals.Animal;
import food.EFoodType;
import food.IEdible;
import utilities.MessageUtility;

public class Omnivore implements IDiet{

    Carnivore carnivore = new Carnivore();
    Herbivore herbivore = new Herbivore();

    @Override
    public boolean canEat(EFoodType food) {
        return false;
    }

    public double eat(Animal animal, IEdible food){
        double value = carnivore.eat(animal, food);
        if(value == 0)
            return herbivore.eat(animal,food);
        return value;

    }


}
