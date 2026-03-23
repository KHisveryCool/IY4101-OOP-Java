public class Square extends Shape {
    private int side;
    
    public Square(Coordinates coord, int side){
        super(4, coord);
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return side * side;
    }

    @Override
    public double getPerimeter(){
        return 4 * side;
    }

    @Override
    public void scale(int factor, boolean sign){
        super.scale(factor , sign);
        if(sign){
            side = side * factor;
        }else{
            side = side / factor;
        }
    }

    @Override
    public String display(){
    return "Square at " + getCoordinates().display() + ", Side: " + side + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
    // Add getArea(), getPerimeter(), scale(), display()
}