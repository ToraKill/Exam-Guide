module georgian.nordstrom.practiceexam {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens georgian.nordstrom.practiceexam to javafx.fxml, com.google.gson;
    exports georgian.nordstrom.practiceexam;
}