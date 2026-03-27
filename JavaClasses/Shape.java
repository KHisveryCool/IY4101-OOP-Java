/**
 * Shape Class - Abstract class
 * Represents a generic geometrical shape
 * It is the parent class of Rectangle, Square, Circle and Triangle
 * Contains abstract methods that must be implemented by subclasses.
 */


public abstract class Shape { //Write comments - DONE
    private Coordinates position; // the position of the shape of the canvas, private
    private int sides; // the  number of sides a shape has, private

    public Shape(int noOfSides, Coordinates coord){ // the constructor class that is used to initialise a shape with a number of sides and a position
        this.sides = noOfSides; // number of sides a shape has
        this.position = coord; // the coordinates object representing the shapes position
    }

    public Coordinates getCoordinates(){ // returns the coordinates object representing the shape's position.
        return position; // returns the position of the shapes
    }

    public int getSides(){ // returns the number of sides the shape has
        return sides; // returns the number of sides
    }

    public void setCoordinates(Coordinates newcoord){ // sets a new position for the shape
        this.position=newcoord; // the new coordinates object
    }

    public void translate(int dx, int dy){ // translates ( moves ) the shape by dx and dy by calling the translate method
        position.translate(dx,dy); // the distance to move in x and y direction
    }

    public void scale(int factor, boolean sign){ //scales the shape by calling the scale method on its position.
        position.scale(factor,sign); // factor - the scaling factor , sign - true for multiplication and false for division.
    }

    public abstract double getArea(); // Abstract method to calculate the area of the shape, and must be implemented by all subclasses.
    

    public abstract double getPerimeter(); // Abstract method that calculates the perimeter of the shape, and must be implemented by all subclasses.
    

    public String display(){ // Returns a string representation of the shape
        return "Shape at " + position.display();
    }

}

