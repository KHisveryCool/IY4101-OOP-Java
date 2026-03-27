/**
 * Circle class - concrete class ( Subclass of Shape )
 * Represents a circle geometric shape
 * A circle has a radius property and is defined by center position
 */

public class Circle extends Shape { // Circle extends to shape
    private double radius; // only need radius as a private variable

    public Circle(Coordinates coord, double radius){ // Constructor class to initialise a circle with coordinates and radius
        super(0, coord); // Call parent Shape constructor with 0 sides (Circle has no sides) and coord represents the circle position
        this.radius=radius;
    }

    @Override
    public double getArea(){ // Calculate and returns the area of the circle
        return (Math.PI * radius* radius); // Area formula π * r²
    }

    @Override
    public double getPerimeter(){ // Calculates and returns the perimeter ( circumference ) of the circle.
        return (2* Math.PI * radius); // Perimeter formula: 2 * π * r
    }

    @Override
    public void scale(int factor, boolean sign){ // Scales the circle by multiplying or dividing the radius by factor and scales the position using the parent class method.
        super.scale(factor , sign); // scale the position and the radius based on the sign
        if(sign){ // sign is true then
            radius = (radius * factor); // multiply radius by factor
        }else{ // sign is false then
            radius = (radius / factor); // divide radius by factor
        }
    }

    @Override
    public String display(){ // formatted string to display circle info
        return "Circle\n  " + getCoordinates().display() + "\n  Radius: " + radius + "\n  Area: " + getArea() + "\n  Perimeter: " + getPerimeter();
    }
}
