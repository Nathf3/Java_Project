import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    private final int WINDOW_LENGTH=600;
    private final int WINDOW_WIDTH=400;
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Runner");
        Group root = new Group();
        Pane pane = new Pane(root);
        //Scene theScene = new Scene(pane, 600, 400,true);
       // primaryStage.setScene(theScene);
        //primaryStage.show();
        GameScene gameScene = new GameScene(pane,WINDOW_LENGTH,WINDOW_WIDTH);

        primaryStage.setScene(gameScene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}