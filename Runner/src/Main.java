public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTile("Hello World");
        Group root = new Group();
        Pane pane = new Pane(root);
        Scene theScene = new Scene(pane,600,400,true);
        primaryStage.setScene(theScene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}