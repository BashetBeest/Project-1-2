

public class PuttingCourse implements Function2D{
   
    private Vector2D start; 
    private Vector2D flag; 
    private Vector2D height; //couldnt decide if it should be function or a vector
    private Ball ball; 
    private double friction; //friction coefficient 
    private double tolerance; //hole tolerance 
    private double maxVelocity; 
   
     /**
      * constructor
      * @param height 
      * @param start
      * @param flag
      * @param ball
      * @param friction
      * @param maxVelocity
      * @param tolerance
      */
    public PuttingCourse(Vector2D height, Vector2D start, Vector2D flag, Ball ball, double friction, double maxVelocity, double tolerance){
        this.height = height; 
        this.start = start; 
        this.flag = flag; 
        this.ball = ball; 
        this.friction = friction; 
        this.maxVelocity = maxVelocity;
        this.tolerance = tolerance;
    }
     
    @Override
     /**
      * methof to evaluate the height
      * @return the height as a double 
     */ 
    public double evaluateHeight(Vector2D vector){
        //TODO complete the method
        return 0; 
    }
    /**
     *  method to evaluate the slope 
     * @return 
     */
    @Override 
    public Vector2D gradient(Vector2D vector){
        double x0 = vector.getX(); 
        double y0 = vector.getY();
        //TODO complete this method
        

    }
    /**
     * method that evaluates the friction
     * @return friction coefficient 
     */
    @Override
    public double evaluateFriction(){
        //TODO complete the method
        return 0; 
    } 
    /**
     * getter for the ball
     * @return ball
     */
    public Ball getBall(){
        return ball; 
    }
    /**
     * getter for the aimed position
     * @return flag
     */
    public Vector2D getFlag(){
        return flag; 
    }
    /**
     * getter for the starting position
     * @return start position
     */
    public Vector2D getStart(){
        return start; 
    }
    /**
     * getter for the friction coefficient
     * @return friction coefficient
     */
    public double getFrictionCoefficient(){
        return friction; 
    }
    /**
     * getter for the makximum velocity
     * @return maximum velocity
     */
    public double getMaxVelocity(){
        return maxVelocity; 
    }
    /**
     * getter for the hole tolerance coefficient 
     * @return the tolerance value
     */
    public double getTolerance(){
        return tolerance;
    }






}