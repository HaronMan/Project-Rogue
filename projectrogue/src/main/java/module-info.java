module fr.haronman.projectrogue {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.haronman.projectrogue.view to javafx.fxml;
    opens fr.haronman.projectrogue.controller to javafx.fxml;
    exports fr.haronman.projectrogue.view;
}