public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(Coordinates coord, int width, int length){
        super(4,coord);
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        double perimeter = 2*width + 2*length;
        return perimeter;
    }

    public void scale(int factor,boolean sign){

    }
}
