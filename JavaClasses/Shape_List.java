import java.util.ArrayList;

/**
 * Shape_List class - Concrete class (Container class)
 * Manages a collection of Shape objects.
 * Provides methods to add, remove, retrieve, and manipulate multiple shapes.
 */

public class Shape_List {
    private ArrayList<Shape> listofShapes;   // ArrayList to store Shape objects

    // Constructor to initialize an empty ArrayList for storing shapes.
    public Shape_List(){
        listofShapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s){ // Adds a shape to the list
        listofShapes.add(s);
    }

    public Shape removeShape(int pos){ // Removes a shape from the list at a specified position, and checks if the position is valid before removing.
        if(pos >= 0 && pos < listofShapes.size()){
            return listofShapes.remove(pos);
        }
        return null;
    }

    public Shape getShape(int pos){ // Retrieves a shape from the list at a specified position and checks if the position is valid before retrieving.
        if(pos>= 0 && pos<listofShapes.size()){ // pos is the position of the shape that needs to be retrieved
            return listofShapes.get(pos); // the shape object at a specified position
        }
        return null; // null if position is invalid
    }

    public void translate(int dx, int dy) { // Translates all shapes in the list by the specified dx and dy values. Loops through each shape and calls it a translate method
        for (Shape shape : listofShapes) { // for shape in list of shapes
            shape.translate(dx, dy); // we translate and move the distance to move in x and y direction.
        }
    }

    public void scale(int factor, boolean sign) { // Scales all shapes in the list by specified factor, and loops through each shape and calls it a scale method.
        for (Shape shape : listofShapes) { // for shape in list of shapes
            shape.scale(factor,sign); // we scale by factor and sign. If sign is true then it is multiplication and if it is negative then it is division.
        }
    }

    public double area(int pos){ // Calculates and returns the area of shape at a specified positions and checks if the position is valid before calculating.
        if(pos >= 0 && pos < listofShapes.size()){ // pos is the position of the shape
            return listofShapes.get(pos).getArea(); // returns the perimeter of the shape
        }
        return 0.0; //or 0.0 if position is invalid
    }

    public double perimeter(int pos){ // Calculates and returns the perimeter of a shape at a specified position and checks if the position is valid before calculating.
        if(pos >= 0 && pos < listofShapes.size()){ 
            return listofShapes.get(pos).getPerimeter(); // returns the perimeter of the shape
        }
        return 0.0; // or 0.0 if position is invalid
    }

    public int getNumberofShapes(){ // Returns the number of shapes currently in the list
        return listofShapes.size();
    }

    public String display(){ // Returns a formatted string with information about all shapes in the list.
        // Each shape's display information is seperated by newline. 
        String result = "";

        for(Shape shape : listofShapes){
            result += shape.display() + "\n";
        }
        return result;
    }
    
}
