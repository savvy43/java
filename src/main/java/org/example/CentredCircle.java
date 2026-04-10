package week11;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class CentredCircle extends Application {

    @Override
    public void start(Stage stage) {

        Pane pane = new Pane();

        Circle circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 300, 300);

        stage.setTitle("Centered Circle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}