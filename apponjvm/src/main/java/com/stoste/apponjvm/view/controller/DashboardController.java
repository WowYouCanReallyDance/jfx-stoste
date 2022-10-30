package com.stoste.apponjvm.view.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Supplier;

public class DashboardController implements Initializable {

    @FXML
    private AnchorPane mainPane;

    @FXML
    private SplitPane asideBar;

    @FXML
    private TextArea textArea;

    @FXML
    private VBox buttonBar;

    @FXML
    private Button buttonOne;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonOne.setOnMouseClicked(event -> {
            buttonOne.setStyle("-fx-background-color: #F36829");
            for (Node child : buttonBar.getChildren()) {
                ((HBox) child).getChildren().add(((Supplier<Node>) () -> {
                    Button btn = new Button();
                    btn.setStyle("-fx-background-color: #F36829");
                    btn.setPrefSize(buttonOne.getWidth(), buttonOne.getHeight());
                    btn.setText(buttonOne.getText());
                    return btn;
                }).get());
            }
        });
        System.out.println("initializing in " + this.getClass().getSimpleName());
    }

    public AnchorPane getMainPane() {
        return mainPane;
    }

    public void setMainPane(AnchorPane mainPane) {
        this.mainPane = mainPane;
    }

    public SplitPane getAsideBar() {
        return asideBar;
    }

    public void setAsideBar(SplitPane asideBar) {
        this.asideBar = asideBar;
    }

    public TextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(TextArea textArea) {
        this.textArea = textArea;
    }

    public VBox getButtonBar() {
        return buttonBar;
    }

    public void setButtonBar(VBox buttonBar) {
        this.buttonBar = buttonBar;
    }

    public Button getButtonOne() {
        return buttonOne;
    }

    public void setButtonOne(Button buttonOne) {
        this.buttonOne = buttonOne;
    }
}
