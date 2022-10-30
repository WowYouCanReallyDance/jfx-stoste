package com.stoste.appstarter;

import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationStarter extends Application {

    @Override
    public void init() {
        System.out.println("==================> Init runing... <==================");
    }

    @Override
    public void start(Stage stage) {
        System.out.println("==================> Start runing... <==================");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
