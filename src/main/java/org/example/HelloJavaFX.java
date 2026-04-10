import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage stage) {

        Text name = new Text("Your Full Name");
        name.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Text id = new Text("Student ID: 123456");
        id.setFill(Color.RED);

        VBox vbox = new VBox(10, name, id);
        vbox.setAlignment(Pos.CENTER);

        StackPane root = new StackPane(vbox);

        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("Student Card");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}