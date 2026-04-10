package week11;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class ColorMixer extends Application {

    @Override
    public void start(Stage stage) {

        double r = 0.23;
        double g = 0.50;
        double b = 0.80;

        Rectangle rect = new Rectangle(200, 200);
        Color color = new Color(r, g, b, 1);
        rect.setFill(color);

        Text rText = new Text(String.format("R: %.2f", r));
        Text gText = new Text(String.format("G: %.2f", g));
        Text bText = new Text(String.format("B: %.2f", b));

        int ri = (int)(r * 255);
        int gi = (int)(g * 255);
        int bi = (int)(b * 255);
        String hex = String.format("#%02X%02X%02X", ri, gi, bi);

        Text hexText = new Text(hex);
        hexText.setFont(Font.font("System", FontWeight.BOLD, 14));

        VBox root = new VBox(8, rect, rText, gText, bText, hexText);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root);

        stage.setTitle("Color Mixer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}