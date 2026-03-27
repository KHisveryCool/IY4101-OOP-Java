/**
 * Square class - Concrete class (Subclass of Shape)
 * Represents a square geometric shape.
 * A square has 4 equal sides that are all the same length
 */

public class Square extends Shape { // Square extends to shape
    private int side; // we only need side as a private variable
    
    public Square(Coordinates coord, int side){ // Constructor class that initialises a Square with coordinates and a side length
        super(4, coord); // Initialises a parent shape class with 4 sides and the coord represents the square's position
        this.side = side; 
    }
    
    @Override // Calculate and return the area of the square
    public double getArea(){
        return (side * side); // Simple formula side * side
    }

    @Override
    public double getPerimeter(){ // Calculates and returns the perimeter of the square
        return (4 * side); // 4 * side
    }

    @Override
    public void scale(int factor, boolean sign){ // Scales the square by multiplying or dividing the side length by a factor, also scales pthe position using the parent class.
        super.scale(factor , sign); // Scale the position and the side based on the sign
        if(sign){ // if true then we multiply by factor
            side = (side * factor);
        }else{ // if false we divide by factor
            side = (side / factor);
        }
    }

    @Override
    public String display(){ // Formated string to show all square info
        return "Square\n  " + getCoordinates().display() + "\n  Side: " + side + "\n  Area: " + getArea() + "\n  Perimeter: " + getPerimeter();
    }

}