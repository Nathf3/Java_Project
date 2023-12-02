import javafx.geometry.Rectangle2D;

public class Hero extends AnimatedThing{
    private final static int HERO_LENGTH=100;
    private final static int HERO_WIDTH=75;
    private final int[] hero_max_index_list ={6,2,6,2};
    private final int[] hero_x_view_list0 = {20, 95, 175, 272, 348, 426};
    private final int[] hero_x_view_list1 = {20, 95};
    private final int[] hero_x_view_list2 = {10, 85, 160, 256, 340, 424};
    private final int[] hero_x_view_list3 = {20, 95};
    protected int updateN=0;
    protected int heroState;
    public Hero(double x, double y,  String fileName) {
        super(x, y, fileName, 426, 0, HERO_LENGTH, HERO_WIDTH, 1600000);
    }

    public void update(long time) {
        updateN=(updateN+1)%5;
        sprite.setViewport(new Rectangle2D(hero_x_view_list0[updateN],0,HERO_WIDTH,HERO_LENGTH));
    }
}
