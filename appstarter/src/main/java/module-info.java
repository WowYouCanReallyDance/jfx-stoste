module com.stoste.appstarter {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;

    opens com.stoste.appstarter to
            javafx.base,
            javafx.controls,
            javafx.fxml,
            javafx.graphics,
            javafx.media,
            javafx.swing,
            javafx.web;

    exports com.stoste.appstarter;
}