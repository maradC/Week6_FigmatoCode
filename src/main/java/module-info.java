module org.example.week6_figmatocode {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week6_figmatocode to javafx.fxml;
    exports org.example.week6_figmatocode;
}