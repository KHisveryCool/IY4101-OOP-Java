import java.util.ArrayList;

public class Shape_List {
    private ArrayList<Shape> listofShapes;

    public Shape_List(){
        listofShapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s){
        listofShapes.add(s);
    }
}
