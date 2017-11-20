package presentation;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import presentation.controller.GuiController;

public class MainScene {
    private GuiController guiController;
    private Scene scene;
    private Stage stage;

    public Scene getScene() {
        this.guiController = new GuiController();
        this.stage = guiController.getPrimaryStage();
        scene = new Scene(new HBox(), 1280, 720);
        return scene;
    }
}
