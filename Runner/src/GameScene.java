import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;


class GameScene extends Scene {
    private final String HERO_FILENAME ="heros.png";
    private final String BACKGROUND_FILENAME ="desert.png";
    private final double BACKGROUND_WIDTH = (new Image("img/" + BACKGROUND_FILENAME)).getWidth();
    private final double BACKGROUND_HEIGHT = (new Image("img/" + BACKGROUND_FILENAME)).getHeight();
    private final int BACKGROUND_Y_OFFSET = 25;
    protected int length;
    protected int width;
    protected Camera camera=new Camera(0,0);
    protected StaticThing backgroundLeft;
    protected StaticThing backgroundRight;

    protected Hero hero=new Hero(600,200,200,200,HERO_FILENAME,100000000);
    private int numberOfLives;
    public GameScene(Pane pane, int length,int width) {
        super(pane,length,width,true);
        this.length=length;
        this.width=width;
        backgroundLeft = new StaticThing(0, 0, BACKGROUND_FILENAME, camera.getX(), camera.getY() + BACKGROUND_Y_OFFSET, length, width);
        backgroundRight = new StaticThing(0, 0, BACKGROUND_FILENAME, camera.getX() - BACKGROUND_WIDTH, camera.getY() + BACKGROUND_Y_OFFSET, length, width);
        AnimationTimer timer = new AnimationTimer()
        {
            public void handle(long time){
                hero.update(time);

                camera.update(time,hero.getX());
                update(time);
            }
        };

        pane.getChildren().add(backgroundLeft.getImageView());
        pane.getChildren().add(backgroundRight.getImageView());
        pane.getChildren().add(hero.getSprite());
        timer.start();
    }

    private void update(long time) {
        backgroundLeft.getImageView().setViewport(new Rectangle2D(camera.getX() % BACKGROUND_WIDTH, camera.getY() + BACKGROUND_Y_OFFSET, length, width));
        backgroundRight.getImageView().setViewport(new Rectangle2D(camera.getX() % BACKGROUND_WIDTH - BACKGROUND_WIDTH, camera.getY() + BACKGROUND_Y_OFFSET, length, width));

    }


}
