package presentation.controller;

import javafx.stage.Stage;

public class GuiController {
    private Stage primaryStage;

    public GuiController() {
        this.primaryStage = new Stage();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}
