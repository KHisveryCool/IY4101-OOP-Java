import java.util.Scanner;

public class Shape_Management {
    public static void main(String[] args) {
        Shape_List shapes = new Shape_List();
        Scanner scanner= new Scanner(System.in);
        int choice = -1;

        while (choice!=0){
            System.out.println("1: Add a shape");
            System.out.println("2: Remove a shape");
            System.out.println("3: Get shape info");
            System.out.println("4: Area and perimeter");
            System.out.println("5: Display all shapes");
            System.out.println("6: Translate all shapes");
            System.out.println("7: Scale all shapes");
            System.out.println("0: Quit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("1: Rectangle, 2: Square, 3: Circle, 4: Triangle");
                    System.out.print("Choose shape: ");
                    int shapeType = scanner.nextInt();
    
                    if(shapeType == 1) {

                        System.out.print("Enter x coordinate: ");
                        int x = scanner.nextInt();

                        System.out.print("Enter y coordinate: ");
                        int y = scanner.nextInt();
                        
                        System.out.print("Enter width: ");
                        int width = scanner.nextInt();
                        
                        System.out.print("Enter length: ");
                        int length = scanner.nextInt();
                        
                        Coordinates coord = new Coordinates(x, y);
                        Rectangle rectangle = new Rectangle(coord, width, length);
                        shapes.addShape(rectangle);
                        System.out.println("Rectangle added!");
                    }
                       
                else if(shapeType == 2) {
                    // ADD Square code here
                }
                else if(shapeType == 3) {
                    // ADD Circle code here
                }
                else if(shapeType == 4) {
                    // ADD Triangle code here
                }
                
                
                break;
                    
                case 2:
                
                    break;
                
            }
        }
    }
}
