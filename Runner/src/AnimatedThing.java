import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class AnimatedThing {
    protected double x;
    protected double y;
    protected ImageView sprite =new ImageView();
    protected int index;
    protected int framePeriod;
    protected double x_view;
    protected double y_view;
    protected  int max_index;

    public AnimatedThing(double x, double y,String fileName, double x_view, double y_view,int length,int width,int framePeriod) {
        this.x = x;
        this.y = y;
        this.framePeriod = framePeriod;
        sprite.setImage(new Image("img/"+fileName));
        sprite.setViewport(new Rectangle2D(x_view,y_view,width,length));
    }

    //getter
    public double getX() {return x;}
    public double getY() {return y;}
    public ImageView getSprite(){return sprite;}
    public double getX_offset() {return x_view;}
    public double getY_offset() {return y_view;}
    public int getIndex() {return index;}
    public int getFramePeriod() {return framePeriod;}
    public int getMax_index(){return max_index;}
    //setter

    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public void setSprite(ImageView sprite) {this.sprite = sprite;}
    public void setX_offset(double x_offset) {this.x_view = x_view;}
    public void setY_offset(double y_offset) {this.y_view = y_view;}
    public void setIndex(int index) {this.index = index;}
    public void setFramePeriod(int framePeriod) {this.framePeriod = framePeriod;}
    public void setMax_index(int max_index) {this.max_index = max_index;}
}
