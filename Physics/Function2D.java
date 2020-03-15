
public interface Function2D{
    
   Vector2D gradient(Vector2D p);  
    //double evaluateXDerivative(double x, double y); 
   // double evaluateYDerivative(double x, double y); 
    double evaluateHeight(Vector2D p);
    double evaluateFriction(Vector2D p);
}