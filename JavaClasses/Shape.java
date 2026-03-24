public abstract class Shape { //Write comments
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

    public abstract double getArea();
    

    public abstract double getPerimeter();
    

    public String display(){
        return "Shape at " + position.display();
    }

}

