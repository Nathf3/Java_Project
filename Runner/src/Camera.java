public class Camera {
    private final double k_m = 1;
    private final double f_m = 1.2;
    protected double x;
    protected double y;
    protected double vx;
    protected double vy;
    protected double ax;
    protected double ay;
    protected static double sample_speed=0.016;
    public Camera(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void update(long time, double xHero){
        ax = k_m*(xHero - x) - f_m*vx;
        ay = 0;
        vx += ax*sample_speed;
        vy += ay*sample_speed;
        x += vx*sample_speed;
        y += vy*sample_speed;
    }
    //Getter et Setter -----
    public double getX(){return x;}
    public double getY(){return y;}
    public double getVx(){return vx;}
    public double getVy(){return vy;}
    public double getAx(){return ax;}
    public double getAy(){return ay;}

    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}
    public void setVx(double vx){this.vx = vx;}
    public void setVy(double vy){this.vy = vy;}
    public void setAx(double ax){this.ax = ax;}
    public void setAy(double ay){this.ay = ay;}
    @Override
    public String toString(){
        return this.x+","+this.y;
    }
}
