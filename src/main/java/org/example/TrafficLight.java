package week11;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class TrafficLight extends Application {

    @Override
    public void start(Stage stage) {

        Circle red = new Circle(30, Color.RED);
        red.setStroke(Color.DARKGRAY);
        red.setStrokeWidth(2);

        Circle yellow = new Circle(30, Color.YELLOW);
        yellow.setStroke(Color.DARKGRAY);
        yellow.setStrokeWidth(2);
        yellow.setOpacity(0.3);

        Circle green = new Circle(30, Color.GREEN);
        green.setStroke(Color.DARKGRAY);
        green.setStrokeWidth(2);
        green.setOpacity(0.3);

        Text text = new Text("Stop");
        text.setFont(Font.font("System", FontWeight.BOLD, 18));

        VBox root = new VBox(5, red, yellow, green, text);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 200, 300);
        scene.setFill(Color.DARKGRAY);

        stage.setTitle("Traffic Light");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}