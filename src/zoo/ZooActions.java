package zoo;

import animals.*;
import food.IEdible;
import mobility.Point;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/*
This program written by :
Matan Ohayon ID:311435614
Idan Fadlon ID:208057505
 */

public class ZooActions {

    public static boolean eat(Object animal, IEdible food){
        if(animal instanceof Animal)
            return ((Animal) animal).eat(food);
        return true;
    }
    public static boolean move(Object animal, Point point){
        if (animal instanceof Animal)
            if(((Animal) animal).move(point) !=0)
                return true;
        return false;
    }

    public static void main(String[] args){
        Animal[] Zoo = buildZoo();
        zooMove(Zoo);
         zooEat(Zoo);


    }
    /*
    The function zooMove is trying to simulate moving of animal to another locations
     */
    public static void zooMove(Animal[] zoo) {

        int counter =1;
        Scanner scanner = new Scanner(System.in);
        for (Animal animal : zoo)
        {
            int x, y;
            Point newLocation;
            System.out.println("Please enter new location for the animal number "+ counter +"\n");
            System.out.println("Enter X cordinate: \n");
            x = scanner.nextInt();
            System.out.println("Enter Y cordinate: \n");
            y = scanner.nextInt();
            newLocation = new Point(x,y);
            move(animal,newLocation);
            counter++;
        }
    }
    /*
    The function zooEat is trying to simulate an Eating of animal by another animal
     */
    public static void zooEat(Animal[] Zoo)
    {
        Animal[] newZoo = Zoo;
        int size = Zoo.length/2;
        Random random = new Random();

        for(int i = 0; i<size; i++)
        {
            int first = random.nextInt(Zoo.length);
            int second = random.nextInt(Zoo.length);
            if (Zoo[first] != null && Zoo[second] != null)
                if(eat(Zoo[first],Zoo[second])) {
                    newZoo[second] = null;

                }

        }
    }
    /*
    The function buildZoo is getting input such as name and location from the user and build the zoo
     */
    private static Animal[] buildZoo()
    {
        System.out.println("Please enter the number of animals you want to be in the zoo\n");
        Scanner scanner = new Scanner(System.in);
        int sizeOfZoo = scanner.nextInt();

        Animal[] Zoo = new Animal[sizeOfZoo];
        int counter =1;
        Scanner scannerChoice = new Scanner(System.in);
        Scanner Strscanner = new Scanner(System.in);
        for (Animal animal:Zoo)
        {
            int x,y;
            Point location;
            String animalName;
            System.out.println("Please choose the type of the animal number " + counter + ":");
            System.out.println(" For Bear: 1\n For Elephant: 2\n For Girrafe: 3\n For Lion: 4\n For Turtle: 5\n");
            int choice = scannerChoice.nextInt();

            while (choice <1 || choice > 5) {
                System.out.println("Wrong choice ! try again\n");
                choice = scannerChoice.nextInt();
            }
            System.out.println("Enter the location for this animal\n");
            System.out.println("Enter X cordinate: \n");
            x = scannerChoice.nextInt();
            System.out.println("Enter Y cordinate: \n");
            y = scannerChoice.nextInt();
            System.out.println("Enter the name of this animal\n");
            animalName = Strscanner.nextLine();
            switch (choice)
            {
                case 1:
                    location = new Point(x,y);
                    if(Point.checkBoundaries(location))
                        Zoo[counter-1] = new Bear(animalName,location);
                    else
                        Zoo[counter-1] = new Bear(animalName);
                    break;
                case 2:
                    location = new Point(x,y);
                    if(Point.checkBoundaries(location))
                        Zoo[counter-1] = new Elephant(animalName,location);
                    else
                        Zoo[counter-1] = new Elephant(animalName);
                    break;
                case 3:
                    location = new Point(x,y);
                    if(Point.checkBoundaries(location))
                        Zoo[counter-1] = new Giraffe(animalName,location);
                    else
                        Zoo[counter-1] = new Giraffe(animalName);
                    break;
                case 4:
                    location = new Point(x,y);
                    if(Point.checkBoundaries(location))
                        Zoo[counter-1] = new Lion(animalName,location);
                    else
                        Zoo[counter-1] = new Lion(animalName);
                    break;
                case 5:
                    location = new Point(x,y);
                    if(Point.checkBoundaries(location))
                        Zoo[counter-1] = new Turtle(animalName,location);
                    else
                        Zoo[counter-1] = new Turtle(animalName);
                    break;

            }
            counter++;
        }

        return Zoo;
    }



}
