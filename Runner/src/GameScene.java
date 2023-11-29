import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;


class GameScene extends Scene {
    private Camera camera;
    private StaticThing backgroundLeft;
    private StaticThing backgroundRight;
    private int numberOfLives;
    public GameScene(Group root,Camera camera) {
        super(root);
        this.camera = camera;
        backgroundLeft = new StaticThing(600,400,"img/desert.png");
        backgroundRight = new StaticThing(600,400,"img/desert.png");
        render();
        root.getChildren().add(backgroundLeft.getImageView());
        root.getChildren().add(backgroundRight.getImageView());
    }
    private void render() {
        double cameraX = camera.getX();
        double cameraY = camera.getY();
        // Update positions based on the camera
        backgroundLeft.getImageView().setTranslateX(-cameraX%600);
        backgroundLeft.getImageView().setTranslateY(-cameraY%400);

        backgroundRight.getImageView().setTranslateX(-cameraX%600+600);
        backgroundRight.getImageView().setTranslateY(-cameraY%400);
    }
}
