package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class RoomDetailsDetailsfoodmealscontroller {
    public AnchorPane Context7;

    public void openDashBoardForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Context7.getChildren().clear();
        Context7.getChildren().add(load);



    }

    public void openHotelIncome(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/HotelIncome.fxml");
        Parent load = FXMLLoader.load(resource);
        Context7.getChildren().clear();
        Context7.getChildren().add(load);
    }
}
