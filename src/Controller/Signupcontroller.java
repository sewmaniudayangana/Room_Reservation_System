package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class Signupcontroller {
    public AnchorPane Context4;

    public void openHotelBookingDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HotelBookingDetails.fxml");
        Parent load = FXMLLoader.load(resource);
        Context4.getChildren().clear();
        Context4.getChildren().add(load);


    }

    public void openCreateNewAccount(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CreateNewAccount.fxml");
        Parent load = FXMLLoader.load(resource);
        Context4.getChildren().clear();
        Context4.getChildren().add(load);
    }
}
