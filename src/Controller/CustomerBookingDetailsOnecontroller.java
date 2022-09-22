package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class CustomerBookingDetailsOnecontroller {
    public AnchorPane Context6;

    public void openRoomDetailsDetailsfoodmeals(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomDetails&Detailsfoodmeals.fxml");
        Parent load = FXMLLoader.load(resource);
        Context6.getChildren().clear();
        Context6.getChildren().add(load);
    }

    public void openDashBoardForm(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Context6.getChildren().clear();
        Context6.getChildren().add(load);


    }
}
