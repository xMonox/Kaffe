package presentation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import presentation.controller.GuiController;

public class Gui extends Application{
    private GuiController guiController;
    public Scene scene;

    @Override
    public void start(Stage primaryStage) {
        guiController = new GuiController();
        scene = new MainScene().getScene();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
