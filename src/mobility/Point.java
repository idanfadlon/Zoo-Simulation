package mobility;


public class Point {
    private static final int MAX_X = 800;
    private static final int MAX_Y = 600;
    private int x;
    private int y;

    /**
     * Constructor
     *
     * @param x - the x coordinate at point
     * @param y - the y coordinate at point
     */
    public Point(int x, int y){
    //add check if the parameters are correct according to the given range at HW
        this.x = Math.abs(x);
        this.y = Math.abs(y);

    }
    public Point(Point point){
        this.x = point.getX();
        this.y = point.getY();
    }

    public static boolean checkBoundaries(Point p){
        return p.x<= MAX_X && p.x>= 0 && p.y <=MAX_Y && p.y >=0;
    }
    /**
     * getter for x coordinate
     *
     * @return the x coordinate
     */
    public int getX(){
        return x;
    }


    /**
     * getter for y coordinate
     *
     * @return the y coordinate
     */
    public int getY(){
        return y;
    }


    /**
     * A method which will represent the instance as a string
     *
     * @return string which represent the instance
     */
    @Override
    public String toString(){
        return "Point " + "(" + x + ", " + y + ")";
    }
}
