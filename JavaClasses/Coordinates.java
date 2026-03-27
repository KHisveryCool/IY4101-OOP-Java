/**
 * Coordinates class - Concrete class
 * Coordinates classa represents a 2D point on a canvas
 * Here we can provide methods to manipulate and display coordinates positions
 */

public class Coordinates {
    private int x; // X coordinate of the point, private
    private int y; // Y coordinate of the point, private

    public Coordinates(int x, int y) { //Constructor class is used here to initialise a Coordinates object with x anda y values
        this.x = x; // the x coordinate
        this.y = y; // the y coordinate
    }
    
    public int getX(){
        return x; // returns the x coordinate of this point
    }

    public int getY(){
        return y; // returns the y value of this point
    }

    public double distance(Coordinates p){ // Calculates the distance between this point and another point using the distance formula
        return Math.sqrt(Math.pow(p.getX() - this.x, 2)+ Math.pow(p.getY() - this.y,2));
    }

    public void translate(int dx, int dy){ // Moves or Translates a given point by adding dx to x and dy to y
        x+= dx;
        y+= dy;
    }

    public void scale(int factor, boolean sign){ // Scales the point by multiplying or dividing by a factor
        if (sign){ // if sign is true then it multiplies, if it is false then it divides
            x= (x * factor);
            y= (y * factor);
        }else{
            x= (x / factor);
            y= (y / factor);}
    }
    
    public String display(){ // Returns a string of the coordinate in the following format
        return "X = "+x+", Y = "+y;
    }
}
