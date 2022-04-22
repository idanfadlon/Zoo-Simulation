package mobility;

import privateutiles.MathUtils;
import utilities.MessageUtility;



public abstract class Mobile implements ILocatable{

    private Point location;
    private double totalDistance = 0;

    public Mobile (){
        this.totalDistance =0;
    }
    public boolean setLocation(Point p){
        boolean ok = Point.checkBoundaries(p);
        if (ok)
            this.location = p;
        return ok;
    }


    private void addTotalDistance(double distance){
        if (distance >= 0)
            this.totalDistance += distance;
        else
            System.out.println("Cant move negative distance");
    }



    private double calcDistance(Point point){
        return MathUtils.distance(location.getX(), location.getX(), point.getX(), point.getY());
    }

    public double move(Point pointToGo){
        if(!Point.checkBoundaries(pointToGo))
            return 0;
        double distance = calcDistance(pointToGo);
        addTotalDistance(distance);
        return distance;
    }
    @Override
    public Point getLocation() {

        return location;
    }
    public String toString(){

        return "Location: " + location + ", Total Distance: " + totalDistance;
    }
    public double getTotalDistance() {
        return totalDistance;
    }
}
