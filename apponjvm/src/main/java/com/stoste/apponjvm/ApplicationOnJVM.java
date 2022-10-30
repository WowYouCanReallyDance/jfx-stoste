package com.stoste.apponjvm;

import com.stoste.apponjvm.view.controller.DashboardController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationOnJVM extends Application {

    @Override
    public void init() throws Exception {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ResourceBundle resource = ResourceBundle.getBundle("com.stoste.apponjvm.view.Dashboard");
        URL dashboard = ApplicationOnJVM.class.getResource("view/Dashboard.fxml");
        if (dashboard == null || resource == null) {
            System.out.println("Null for dashboard or resource !!!!!!!!!!!!!!!!!");
            super.stop();
        }
        FXMLLoader loader = new FXMLLoader();
        loader.setResources(resource);
        loader.setLocation(dashboard);
        loader.load();
        DashboardController controller = loader.getController();
        AnchorPane pane = controller.getMainPane();
        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
    }

    public static void main(String[] args) {
        launch(ApplicationOnJVM.class, args);
    }
}
