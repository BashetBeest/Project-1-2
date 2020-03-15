

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
      * 
       */ 
    public double evaluateHeight(Vector2D vector){
        //TODO complete the method
        return 0; 
    }
    /**
     * 
     */
    @Override 
    public Vector2D gradient(Vector2D vector){
        double x0 = vector.getX(); 
        double y0 = vector.getY();

        

    }
    /**
     * 
     * @return
     */
    @Override
    public double evaluateFriction(){
        return 0; 
    } 
    /**
     * 
     * @return
     */
    public Ball getBall(){
        return ball; 
    }
    /**
     * 
     * @return
     */
    public Vector2D getFlag(){
        return flag; 
    }
    /**
     * 
     * @return
     */
    public Vector2D getStart(){
        return start; 
    }
    /**
     * 
     * @return
     */
    public double getFrictionCoefficient(){
        return friction; 
    }
    /**
     * 
     * @return
     */
    public double getMaxVelocity(){
        return maxVelocity; 
    }
    /**
     * 
     * @return
     */
    public double getTolerance(){
        return tolerance;
    }






}