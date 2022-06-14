module com.example.addition {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.addition to javafx.fxml;
    exports com.example.addition;
}