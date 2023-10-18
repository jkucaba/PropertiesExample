module com.jakubku.props {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.props to javafx.fxml;
    exports com.jakubku.props;
}