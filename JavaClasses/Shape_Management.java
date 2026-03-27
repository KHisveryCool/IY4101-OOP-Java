import java.util.Scanner;

/**
 * Shape_Management class - Concrete class (Main/Driver class)
 * Provides a menu-driven console application for managing geometric shapes.
 * Allows users to add, remove, display, translate, and scale shapes.
 */

public class Shape_Management { // Main method - entry point of the program
    // Displays a menu and handles user input to perform various shape operations.
    public static void main(String[] args) {
        Shape_List shapes = new Shape_List(); // create a shapelist to store shapes
        Scanner scanner = new Scanner(System.in); // create a scanner for user input
        int choice = -1; // Initialise a choice variable can't be 0 because 0 quits the program

        while (choice != 0) { // As long as the choice isnt 0 the program will continue
            //Displays menu options
            System.out.println("----------------------------------------------------");
            System.out.println("\n1: Add a shape");
            System.out.println("2: Remove a shape");
            System.out.println("3: Get shape info");
            System.out.println("4: Area and perimeter");
            System.out.println("5: Display all shapes");
            System.out.println("6: Translate all shapes");
            System.out.println("7: Scale all shapes");
            System.out.println("0: Quit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            System.out.println("----------------------------------------------------");
            
            //Handles user's menu choice
            switch(choice) {

                //case 1: add a shape
                case 1: {
                    // Display shape options to uyser
                    System.out.println("\n1: Rectangle, 2: Square, 3: Circle, 4: Triangle");
                    System.out.print("\nChoose shape: ");
                    int shapeType = scanner.nextInt(); // Read shape type
                    System.out.println("----------------------------------------------------");
                    
                    // Add rectangle if user chooses 1
                    if(shapeType == 1) {
                        
                        //Prompt user to enter rectangle coordinates
                        System.out.print("\nEnter x coordinate: ");
                        int x = scanner.nextInt();
                        System.out.print("\nEnter y coordinate: ");
                        int y = scanner.nextInt();

                        //Prompt user to enter rectangle dimensions
                        System.out.print("\nEnter width: ");
                        int width = scanner.nextInt();
                        System.out.print("\nEnter length: ");
                        int length = scanner.nextInt();
                        
                        //Create Coordinates object with x and y values
                        Coordinates coord = new Coordinates(x, y);
                        // Create Rectangle object with coordinates, width, and length
                        Rectangle rectangle = new Rectangle(coord, width, length);
                        // Add the rectangle to the shape list
                        shapes.addShape(rectangle);
                        System.out.println("\nRectangle added!");
                        System.out.println("----------------------------------------------------");
                    }

                    // Add Square if user chooses 2
                    else if(shapeType == 2) {
                        
                        //Prompt user to enter square coordinates
                        System.out.print("\nEnter x coordinate: ");
                        int x = scanner.nextInt();
                        System.out.print("\nEnter y coordinate: ");
                        int y = scanner.nextInt();

                        // Prompt user to enter square side length
                        System.out.print("\nEnter side length: ");
                        int side = scanner.nextInt();

                        // Create coordinates object with x and y values
                        Coordinates coord = new Coordinates(x, y);
                        // Create square object with coordinates and side length
                        Square square = new Square(coord, side);
                        // Add the square to the shape list
                        shapes.addShape(square);
                        System.out.println("\nSquare Added");
                        System.out.println("----------------------------------------------------");
                    }

                    // Add Circle if user chooses 3
                    else if(shapeType == 3) {
                        // Prompt user to enter circle center coordinates
                        System.out.print("\nEnter x coordinate: ");
                        int x = scanner.nextInt();
                        System.out.print("\nEnter y coordinate: ");
                        int y = scanner.nextInt();

                        // Prompt user to enter circle radius ( as double for precision )
                        System.out.print("\nEnter radius: ");
                        double radius = scanner.nextDouble();

                        // Create Coordinates object with x and y values
                        Coordinates coord = new Coordinates(x, y);
                        // Create Circle Object with coordinates and radius
                        Circle circle = new Circle(coord, radius);
                        // Add the circle to the shape list
                        shapes.addShape(circle);
                        System.out.println("\nCircle Added");
                        System.out.println("----------------------------------------------------");
                    }

                    //Add Triangle if user chooses 4
                    else if(shapeType == 4) {
                        
                        // Prompt user to enter first vertex coordinates
                        System.out.println("\n[ Enter first vertex: ]");
                        System.out.print("\nEnter x coordinate: ");
                        int x1 = scanner.nextInt();
                        System.out.print("\nEnter y coordinate: ");
                        int y1 = scanner.nextInt();
                        
                        // Prompt user to enter second vertex coordinates
                        System.out.println("\n[ Enter second vertex: ]");
                        System.out.print("\nEnter x coordinate: ");
                        int x2 = scanner.nextInt();
                        System.out.print("\nEnter y coordinate: ");
                        int y2 = scanner.nextInt();
                        
                        // Prompt user to enter third vertex coordinates
                        System.out.println("\n[ Enter third vertex: ]");
                        System.out.print("\nEnter x coordinate: ");
                        int x3 = scanner.nextInt();
                        System.out.print("\nEnter y coordinate: ");
                        int y3 = scanner.nextInt();

                        // Create three Coordinates objects for the vertices
                        Coordinates p1 = new Coordinates(x1, y1);
                        Coordinates p2 = new Coordinates(x2, y2);
                        Coordinates p3 = new Coordinates(x3, y3);

                        // Create Triangle object with the three vertices
                        Triangle triangle = new Triangle(p1, p2, p3);

                        // Add the triangle to the shape list
                        shapes.addShape(triangle);
                        System.out.println("\nTriangle Added");
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                }
                
                // Case 2: Remove a shape by position
                case 2: {
                    
                    // Prompt user to enter the position of the shape to remove
                    System.out.print("\nEnter position to remove: ");
                    int pos = scanner.nextInt();

                    // Attempt to remove the shape at a specified position
                    Shape removed = shapes.removeShape(pos); // Removes shape by position
                    
                    //Check if the removal was successful
                    if(removed != null) {
                        
                        // If the shape was removed successfully, display confirmation message
                        System.out.println("\nShape removed!");
                        System.out.println("----------------------------------------------------");
                    } else {
                        
                        // if shape was not removed ( invalid position ), display error message
                        System.out.println("\nInvalid position!");
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                }
                
                // Case 3: Get information about a shape by position
                case 3: {

                    // Prompt user to enter the position of the shape
                    System.out.print("\nEnter position: ");
                    int pos = scanner.nextInt();

                    // Retrieve the shape at a specified position
                    Shape shape = shapes.getShape(pos);

                    // Check if the shape exists at the given position
                    if(shape != null) { 

                        // If the shape exists, it displays its detailed information
                        System.out.println(shape.display());
                        System.out.println("----------------------------------------------------");
                    } else {

                        // If the shape does not exist ( Invalid Position ), display error message
                        System.out.println("\nInvalid position!");
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                }

                // Case 4: Get area and perimeter of a shape by position
                case 4: {

                    // Prompt user to enter the position of the shape
                    System.out.print("\nEnter position: ");
                    int pos = scanner.nextInt();

                    //Check if position is valid ( within the range of shapes in the list )
                    if(pos >= 0 && pos < shapes.getNumberofShapes()) {

                        // If position is valid, display the area and perimeter
                        System.out.println("\nArea: " + shapes.area(pos));
                        System.out.println("Perimeter: " + shapes.perimeter(pos));
                        System.out.println("----------------------------------------------------");
                    } else {

                        // If the position is invalid, display error message
                        System.out.println("\nInvalid position!");
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                }

                // Case 5: Display all shapes
                case 5: {

                    // Call the display method to show all shapes and their information
                    System.out.println(shapes.display());
                    break;
                }
                
                // Case 6: Translate all shapes
                case 6: {

                    // Prompt user to enter the translation distance in x direction
                    System.out.print("\nEnter dx (x distance): ");
                    int dx = scanner.nextInt();

                    // Prompt user to enter the translation distance in y direction
                    System.out.print("\nEnter dy (y distance): ");
                    int dy = scanner.nextInt();

                    // Call the translate method to move all shapes
                    shapes.translate(dx, dy);
                    System.out.println("\nAll shapes translated!");
                    System.out.println("----------------------------------------------------");
                    break;
                }

                // Case 7: Scale all shapes
                case 7: {

                    // Prompt user to enter the scaling factor
                    System.out.print("\nEnter scale factor: ");
                    int factor = scanner.nextInt();

                    // Prompt user to choose between multiplication ( true ) or division ( false )
                    System.out.print("\nMultiply (true) or Divide (false)?: ");
                    boolean sign = scanner.nextBoolean();

                    // call the scalea method to resize all shapes
                    shapes.scale(factor, sign);
                    System.out.println("\nAll shapes scaled!");
                    System.out.println("----------------------------------------------------");
                    break;
                }
            }
        }
        
        //Close scanner resource when the program ends.
        scanner.close();
        
    }
}