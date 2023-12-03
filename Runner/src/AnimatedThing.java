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
        sprite.setViewport(new Rectangle2D(x,y,width,length));
    }

    //getter
    public double getX() {return x;}
    public double getY() {return y;}
    public ImageView getSprite(){return sprite;}
    public double getX_view() {return x_view;}
    public double getY_view() {return y_view;}
    public int getIndex() {return index;}
    public int getFramePeriod() {return framePeriod;}
    public int getMax_index(){return max_index;}
    //setter

    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public void setSprite(ImageView sprite) {this.sprite = sprite;}
    public void setX_view(double x_view) {this.x_view = x_view;sprite.setX(x_view);
         }
    public void setY_view(double y_view) {this.y_view = y_view;}
    public void setIndex(int index) {this.index = index;}
    public void setFramePeriod(int framePeriod) {this.framePeriod = framePeriod;}
    public void setMax_index(int max_index) {this.max_index = max_index;}
}
