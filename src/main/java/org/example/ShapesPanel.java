package week11;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class ShapesPanel extends Application {

    @Override
    public void start(Stage stage) {

        Rectangle rect = new Rectangle(80, 60);
        rect.setFill(Color.RED);
        rect.setArcWidth(20);
        rect.setArcHeight(20);
        rect.setStroke(Color.BLACK);
        rect.setStrokeWidth(2);

        Circle circle = new Circle(40);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        Ellipse ellipse = new Ellipse(50, 30);
        ellipse.setFill(Color.GREEN);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(2);

        HBox root = new HBox(20, rect, circle, ellipse);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}