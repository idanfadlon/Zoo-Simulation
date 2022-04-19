package mobility;

import privateutiles.MathUtils;
import utilities.MessageUtility;



public abstract class Mobile implements ILocatable{

    private Point location;
    private double totalDistance = 0;

    public Mobile (Point location){
        setLocation(location);
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
        MessageUtility.logGetter("Mobile","getLocation",this.location);
        return location;
    }
    public String toString(){

        return "Location: " + location + ", Total Distance: " + totalDistance;
    }
    public double getTotalDistance() {
        MessageUtility.logGetter("Mobile","getTotalDistance",this.totalDistance);
        return totalDistance;
    }
}
