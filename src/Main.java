import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    Label spawn;
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage myStage) {
        myStage.setTitle("Catch them if you can...");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene( rootNode,700, 700);
        myStage.setScene(myScene);
        spawn = new Label("");
        final Button btnRun = new Button("Catch ME!");
        Button btnZz = new Button("Z-z-z...");
        btnRun.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btnRun.setTranslateX(Math.random()*150-10);
                btnRun.setTranslateY(Math.random()*150-10);
            }
        });
        btnRun.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                spawn.setText("*crash*");
            }
        });
        btnZz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                spawn.setText("Uhm, hello?");
            }
        });
        btnRun.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                spawn.setText("*crash*");
            }
        });
        rootNode.getChildren().addAll(btnZz, btnRun, spawn);
        myStage.show();
    }
}
