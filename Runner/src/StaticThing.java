import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    double sizeX,sizeY;
    String nameFile;
    private ImageView imageView;
    public StaticThing(double sizeX, double sizeY,String nameFile) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Image image = new Image(nameFile);
        imageView = new ImageView(image);
        imageView.setFitWidth(sizeX);
        imageView.setFitHeight(sizeY);
    }

    public ImageView getImageView() {
        return imageView;
    }

}
