module fr.haronman.projectrogue {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.haronman.projectrogue to javafx.fxml;
    exports fr.haronman.projectrogue;
}