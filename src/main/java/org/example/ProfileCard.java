package week11;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ProfileCard extends Application {

    @Override
    public void start(Stage stage) {

        Label name = new Label("Ali Valiyev");
        name.setTextFill(Color.WHITE);
        name.setFont(Font.font("System", FontWeight.BOLD, 16));

        HBox topBox = new HBox(name);
        topBox.setPadding(new Insets(12));
        topBox.setStyle("-fx-background-color: #2C3E50;");
        topBox.setAlignment(Pos.CENTER);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));

        grid.add(new Label("Department:"), 0, 0);
        grid.add(new Label("Computer Science"), 1, 0);

        grid.add(new Label("Year:"), 0, 1);
        grid.add(new Label("2"), 1, 1);

        grid.add(new Label("GPA:"), 0, 2);
        grid.add(new Label("3.8"), 1, 2);

        Label uni = new Label("New Uzbekistan University");
        uni.setPadding(new Insets(8));
        uni.setAlignment(Pos.CENTER);
        uni.setMaxWidth(Double.MAX_VALUE); // stretch full width
        uni.setStyle("-fx-background-color: #ECF0F1; -fx-font-size: 13;");

        BorderPane root = new BorderPane();
        root.setTop(topBox);
        root.setCenter(grid);
        root.setBottom(uni);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("Profile Card");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}