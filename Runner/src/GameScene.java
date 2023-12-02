import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.Pane;


class GameScene extends Scene {
    private final String HERO_FILENAME ="heros.png";
    private final String BACKGROUND_FILENAME ="desert.png";
    protected int length;
    protected int width;
    protected Camera camera=new Camera(0,0);
    private StaticThing backgroundLeft;
    private StaticThing backgroundRight;

    protected Hero hero=new Hero(0,220,HERO_FILENAME);
    private int numberOfLives;
    public GameScene(Pane pane, int length,int width) {
        super(pane,length,width,true);
        this.length=length;
        this.width=width;
        backgroundLeft = new StaticThing(length,width,"img/"+BACKGROUND_FILENAME);
        backgroundRight = new StaticThing(length,width,"img/"+BACKGROUND_FILENAME);
        AnimationTimer timer = new AnimationTimer()
        {
            public void handle(long time){
                hero.update(time);
                camera.update(time);
                update(time);
            }
        };

        pane.getChildren().add(backgroundLeft.getImageView());
        pane.getChildren().add(backgroundRight.getImageView());
        pane.getChildren().add(hero.getSprite());
        timer.start();
    }

    private void update(long time) {
        double cameraX = camera.getX();
        double cameraY = camera.getY();
        // Update positions based on the camera
        backgroundLeft.getImageView().setTranslateX(-cameraX%length);
        backgroundLeft.getImageView().setTranslateY(-cameraY%width);

        backgroundRight.getImageView().setTranslateX(-cameraX%length+length);
        backgroundRight.getImageView().setTranslateY(-cameraY%width);
    }

}
