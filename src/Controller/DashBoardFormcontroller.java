package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormcontroller {
    public AnchorPane Context1;

    public void openCreateNewAccount(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CreateNewAccount.fxml");
        Parent load = FXMLLoader.load(resource);
        Context1.getChildren().clear();
        Context1.getChildren().add(load);


    }

    public void openSignup(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Signup.fxml");
        Parent load = FXMLLoader.load(resource);
        Context1.getChildren().clear();
        Context1.getChildren().add(load);
    }
}












