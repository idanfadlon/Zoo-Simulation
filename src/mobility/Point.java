package mobility;


public class Point {
    private static final int MAX_X = 800;
    private static final int MAX_Y = 600;
    private int x;
    private int y;


    public Point(int x, int y){
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

    public int getX(){
        return x;
    }



    public int getY(){
        return y;
    }


    @Override
    public String toString(){
        return "Point " + "(" + x + ", " + y + ")";
    }
}
