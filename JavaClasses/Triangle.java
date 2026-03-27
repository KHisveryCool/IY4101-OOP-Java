/**
 * Triangle class - Concrete class (Subclass of Shape)
 * Represents a triangle geometric shape.
 * A triangle is defined by three vertices (Coordinates objects).
 */

public class Triangle extends Shape{ // triangle extends to shape

    private Coordinates p1; // first vertex of the triangle
    private Coordinates p2; // second vertex of the triangle
    private Coordinates p3; // third vertex of the triangle

    public Triangle(Coordinates p1, Coordinates p2, Coordinates p3){ // Initialize parent Shape class with 3 sides, position is null
        super(3, null); //since we have 3 seperates coordinates we will use null
        this.p1 = p1; // first vertex ( Coordinates object )
        this.p2 = p2; // second vertex ( Coordinates object )
        this.p3 = p3; // third vertex ( Coordinates object )
    }

    @Override
    public double getArea(){
        //for this method we will use Heron's formula

        //calculate distance using the method we wrote in coordinates class
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);

        //calculate the semiperemeter
        double s = (a + b +c) / 2;

        //Apply Herons Formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;

    }

    @Override
    public double getPerimeter(){

        //find the distance again
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);

        //now calculate the perimeter
        double perimeter = a+b+c;

        return perimeter;

    }

    @Override
    public void scale(int factor, boolean sign){
        //since triangle has a null position we should scale the three vertices directly

        p1.scale(factor, sign);
        p2.scale(factor, sign);
        p3.scale(factor, sign);
    }

    @Override
    public void translate(int dx,int dy){
        // We are going to move each vertice
        p1.translate(dx, dy);
        p2.translate(dx, dy);
        p3.translate(dx, dy);
    }
    
    @Override
    public String display(){
        return "Triangle\n  Vertex 1: " + p1.display() + "\n  Vertex 2: " + p2.display() + "\n  Vertex 3: " + p3.display() + "\n  Area: " + getArea() + "\n  Perimeter: " + getPerimeter();
    }

}
