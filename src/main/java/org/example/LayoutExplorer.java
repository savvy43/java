package week11;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class LayoutExplorer extends Application {

    @Override
    public void start(Stage stage) {

        HBox topBox = new HBox(10);
        topBox.setPadding(new Insets(10));
        topBox.setStyle("-fx-background-color: gold;");
        topBox.getChildren().addAll(
                new Button("File"),
                new Button("Save"),
                new Button("Cancel")
        );

        VBox leftBox = new VBox(8);
        leftBox.setPadding(new Insets(10));
        leftBox.getChildren().addAll(
                new Label("Courses"),
                new Label("CS101"),
                new Label("CS201"),
                new Label("CS221"),
                new Label("CS301")
        );

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(10));

        grid.add(new Label("First Name:"), 0, 0);
        grid.add(new TextField(), 1, 0);

        grid.add(new Label("Last Name:"), 0, 1);
        grid.add(new TextField(), 1, 1);

        BorderPane root = new BorderPane();
        root.setTop(topBox);
        root.setLeft(leftBox);
        root.setCenter(grid);

        Scene scene = new Scene(root, 450, 300);

        stage.setTitle("Layout Explorer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}