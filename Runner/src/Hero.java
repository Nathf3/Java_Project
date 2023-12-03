import javafx.geometry.Rectangle2D;

public class Hero extends AnimatedThing{
    private final static int HERO_LENGTH=100;
    private final static int HERO_WIDTH=75;
    private long count_timer=0;
    private final int[] hero_max_index_list ={6,2,6,2};
    private final int[] hero_x_view_list0 = {20, 95, 175, 272, 348, 426};
    private final int[] hero_x_view_list1 = {20, 95};
    private final int[] hero_x_view_list2 = {10, 85, 160, 256, 340, 424,530};
    private final int[] hero_x_view_list3 = {20, 95};
    protected int updateN=0;
    protected int heroState;
    public Hero(double x, double y,double x_view, double y_view ,  String fileName,int framePeriod) {
        super(x, y, fileName, x_view, y_view, HERO_LENGTH, HERO_WIDTH, framePeriod);
        sprite.setX(x_view);
        sprite.setY(y_view);
    }

    public void update(long time) {

        if(time-count_timer>framePeriod) {
            updateN=(updateN+1)% 6;
            sprite.setViewport(new Rectangle2D(hero_x_view_list0[updateN], 0, HERO_WIDTH, HERO_LENGTH));
            count_timer=time;
        }
    }
    public double get_xHero(){return x;}
    public double get_yHero(){return x;}



}
