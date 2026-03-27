/**
 * Rectangle class - Concrete class (Subclass of Shape)
 * Represents a rectangle geometric shape.
 * A rectangle has its own width and length properties.
 */

public class Rectangle extends Shape { // class extends to rectangle as a shape
    private int width; // width of the rectangle, private
    private int length; // length of the rectangle, private

    public Rectangle(Coordinates coord, int width, int length){ // constructor to initialise a rectangle with coordinates, width, and length
        super(4,coord); //  // Call parent Shape constructor with 4 sides (rectangle has 4 sides) and coord represents the rectangles position
        this.width = width; // width of the rectangle
        this.length = length; // length of the rectangle
    }

    @Override // Overides the abstract class of getArea 
    public double getArea(){
        return (width * length); // calculates the area by multiplying width and length.
    }

    @Override // Overides the abstract class of getArea
    public double getPerimeter(){
        double perimeter = (2*width + 2*length); // calculates the perimeter of a rectangle using formula
        return perimeter; // return the perimeter
    }

    @Override
    public void scale(int factor, boolean sign){ // Scales position using parent class method ; scales the rectangle by factor and either dividing or multiplying.

        super.scale(factor, sign); // Scale the position and scale width and length based on the sign
        if(sign){ // if sign true we multiply by the factor
            width = (width * factor);
            length = (length * factor);
        }else{ // if sign false we divide by the factor
            width = (width / factor);
            length = (length / factor);
        }
    }

    @Override
    public String display(){ // Return a formatted string with information about the rectangle. 
        return "Rectangle\n  " + getCoordinates().display() + "\n  Width: " + width + "\n  Length: " + length + "\n  Area: " + getArea() + "\n  Perimeter: " + getPerimeter();
    }
}