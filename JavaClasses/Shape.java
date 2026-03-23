public class Shape { //Write comments
    private Coordinates position;
    private int sides;

    public Shape(int noOfSides, Coordinates coord){
        this.sides = noOfSides;
        this.position = coord;
    }

    public Coordinates getCoordinates(){
        return position;
    }

    public int getSides(){
        return sides;
    }

    public void setCoordinates(Coordinates newcoord){
        this.position=newcoord;
    }

    public void translate(int dx, int dy){
        position.translate(dx,dy);
    }

    public void scale(int factor, boolean sign){
        position.scale(factor,sign);
    }

    public double getArea(){
        return 0.0; //place holder, since it will be overwritten later
    }

    public double getPerimeter(){
        return 0.0; //Also a place holder
    }

    public String display(){
        return "Shape at " + position.display();
    }

}

