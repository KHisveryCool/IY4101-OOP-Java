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
            
        }
    }
}
