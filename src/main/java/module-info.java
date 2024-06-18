module org.example.nyoba_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.nyoba_fx to javafx.fxml;
    exports org.example.nyoba_fx;

    opens Dashboard to javafx.fxml;
    exports Dashboard;
}