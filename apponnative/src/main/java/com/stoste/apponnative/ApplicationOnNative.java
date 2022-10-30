package com.stoste.apponnative;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ApplicationOnNative extends Application {

    private Button btn0;
    private Button btn1;
    private BorderPane bdp0;
    private BorderPane bdp1;
    private Scene scene0;
    private Scene scene1;
    private Stage stage;

    @Override
    public void init() {
        System.out.println("==================> Init runing... <==================");
        btn0 = new Button();
        btn0.setText("Click One");
        btn0.setStyle("-fx-background-color: rgba(36, 99, 210, 0.5); -fx-min-width: 260px; -fx-min-height: 60px; -fx-background-radius: 30px;");
        btn0.setOnAction(actionEvent -> stage.setScene(scene1));
        btn1 = new Button();
        btn1.setText("Click Two");
        btn1.setStyle("-fx-background-color: rgba(210, 68, 192, 0.5); -fx-min-width: 260px; -fx-min-height: 120px; -fx-background-radius: 60px;");
        btn1.setOnAction(actionEvent -> stage.setScene(scene0));

        bdp0 = new BorderPane(btn0);
        bdp1 = new BorderPane(btn1);

        scene0 = new Scene(bdp0, 600, 500);
        scene1 = new Scene(bdp1, 600, 500);
    }

    @Override
    public void start(Stage stage) {
        System.out.println("==================> Start runing... <==================");
        this.stage = stage;
        stage.setScene(scene0);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
