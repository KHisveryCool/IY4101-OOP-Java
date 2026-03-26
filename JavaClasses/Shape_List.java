import java.util.ArrayList;

public class Shape_List {
    private ArrayList<Shape> listofShapes;

    public Shape_List(){
        listofShapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s){
        listofShapes.add(s);
    }

    public Shape removeShape(int pos){
        if(pos >= 0 && pos < listofShapes.size()){
            return listofShapes.remove(pos);
        }
        return null;
    }

    public Shape getShape(int pos){
        if(pos>= 0 && pos<listofShapes.size()){
            return listofShapes.get(pos);
        }
        return null;
    }

    public void translate(int dx, int dy) {
        for (Shape shape : listofShapes) {
            shape.translate(dx, dy);
        }
    }

    public void scale(int factor, boolean sign) {
        for (Shape shape : listofShapes) {
            shape.scale(factor,sign);
        }
    }

    public double area(int pos){
        if(pos >= 0 && pos < listofShapes.size()){
            return listofShapes.get(pos).getArea();
        }
        return 0.0;
    }

    public double perimeter(int pos){
        if(pos >= 0 && pos < listofShapes.size()){
            return listofShapes.get(pos).getPerimeter();
        }
        return 0.0;
    }

    public int getNumberofShapes(){
        return listofShapes.size();
    }

    public String display(){
        String result = "";

        for(Shape shape : listofShapes){
            result += shape.display() + "\n";
        }
        return result;
    }
    
}
