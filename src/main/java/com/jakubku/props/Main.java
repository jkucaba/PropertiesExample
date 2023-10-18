package com.jakubku.props;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Employee employee = new Employee("Łukasz", 12);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label = new Label();
        Button button = new Button("Double Salary");
        button.setOnAction(e -> {
            int salary = employee.getSalary();
            employee.setSalary(salary * 2);
        });
        employee.getSalaryProperty()
                .addListener(o->label
                        .setText(
                                "Name: "
                                        + employee.getName()
                                        + " | Salary: "
                                        + employee.getSalary()));//dodanie obserwatora
        root.getChildren().addAll(label, button);
        Scene scene = new Scene(root, 550, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
