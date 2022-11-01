module richard.javaproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens richard.javaproject to javafx.fxml;
    exports richard.javaproject;
}
