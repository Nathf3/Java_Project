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
    protected int heroState=0;
    protected int isjumping=0;
    public Hero(double x, double y,double x_view, double y_view ,  String fileName,int framePeriod) {
        super(x, y, fileName, x_view, y_view, HERO_LENGTH, HERO_WIDTH, framePeriod);
        sprite.setX(x_view);
        sprite.setY(y_view);
        this.y_view=y_view;
        this.x_view=x_view;
    }

    public void update(long time) {
        sprite.setY(this.y_view);
        sprite.setX(this.x_view);
        if(time-count_timer>framePeriod) {

            if (heroState==0) {
                updateN=(updateN+1)% 6;
                sprite.setViewport(new Rectangle2D(hero_x_view_list0[updateN], 0, HERO_WIDTH, HERO_LENGTH));
            }
            if (heroState==1) {
                if (isjumping<5) {
                    isjumping++;
                    this.y_view=get_y_viewHero()-isjumping*10;
                    sprite.setViewport(new Rectangle2D(hero_x_view_list1[0], 0, HERO_WIDTH, HERO_LENGTH));

                }
                if (isjumping>=5)
                {   isjumping++;
                    this.y_view=get_y_viewHero()+(isjumping*5-5);
                    sprite.setViewport(new Rectangle2D(hero_x_view_list1[1], 0, HERO_WIDTH, HERO_LENGTH));
                    if(isjumping==10){
                    isjumping=0;
                    heroState=0;
                    this.y_view=230;
                    }
                }
            }
            count_timer=time;
        }
    }
    public double get_xHero(){return x;}
    public double get_yHero(){return y;}
    public double get_x_viewHero(){return x_view;}
    public double get_y_viewHero(){return y_view;}
    public void set_y_viewHero(double y){this.y_view=y;}
    public void jump(){
        heroState=1;
    }


}
