public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public double distance(Coordinates p){
        return Math.sqrt(Math.pow(p.getX() - this.x, 2)+ Math.pow(p.getY() - this.y,2));
    }

    public void translate(int dx, int dy){
        x+= dx;
        y+= dy;
    }

    public void scale(int factor, boolean sign){
        if (sign){
            x= x * factor;
            y= y * factor;
        }else{
            x= x / factor;
            y= y / factor;}
    }
    
    public String display(){
        return "X = "+x+", Y = "+y;
    }
}
