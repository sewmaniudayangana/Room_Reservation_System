package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Startupcontroller {


    public AnchorPane Context;

    public void OpenDashBoardFrom(ActionEvent actionEvent) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("../View/DashBoardForm.fxml"));
        Scene scene = new Scene(load);
        Stage stage = (Stage) Context.getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
}



