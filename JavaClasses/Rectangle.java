public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(Coordinates coord, int width, int length){
        super(4,coord);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 2*width + 2*length;
        return perimeter;
    }

    @Override
    public void scale(int factor, boolean sign){

        super.scale(factor, sign);
        if(sign){
            width = width * factor;
            length = length * factor;
        }else{
            width = width / factor;
            length = length / factor;
        }
    }

    @Override
    public String display(){
    return "Rectangle at " + getCoordinates().display() + ", Width: " + width + ", Length: " + length + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}

