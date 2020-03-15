import java.util.Vector;

public class Vector2D{
    double x; 
    double y; 
    public Vector2D(double x, double y){
     this.x = x;
     this.y= y; 
    }

    public double getX(){
        return x; 
    }

    public double getY(){
        return y; 
    }

    public Vector2D add(Vector2D vector){
        Vector2D result = new Vector2D(this.getX() + vector.getX(), this.getY()+ vector.getY());
        return result; 
    }

    
}