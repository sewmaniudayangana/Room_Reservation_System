package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class HotelBookingDetailscontroller {
    public AnchorPane Context5;

    public void openCustomerBookingDetailsOne(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CustomerBookingDetailsOne.fxml");
        Parent load = FXMLLoader.load(resource);
        Context5.getChildren().clear();
        Context5.getChildren().add(load);

       }

    public void openSignup(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/Signup.fxml");
        Parent load = FXMLLoader.load(resource);
        Context5.getChildren().clear();
        Context5.getChildren().add(load);
    }

    public void openDashBoardForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Context5.getChildren().clear();
        Context5.getChildren().add(load);
    }
}
