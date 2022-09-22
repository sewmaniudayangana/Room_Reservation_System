package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class HotelIncomecontroller {
    public AnchorPane Context8;

    public void openDashBoardForm(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Context8.getChildren().clear();
        Context8.getChildren().add(load);
    }
}
