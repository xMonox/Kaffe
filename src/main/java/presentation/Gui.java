package presentation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import presentation.controller.GuiController;
import sun.applet.Main;
import sun.rmi.runtime.Log;

public class Gui extends Application{
    private GuiController guiController;
    public Scene scene;
    private LoginScene loginScene;

    @Override
    public void start(Stage primaryStage) {
        guiController = new GuiController();
            scene = guiController.loginScene();
//        scene = new LoginScene().getScene(guiController, primaryStage);
        primaryStage = guiController.getPrimaryStage();
//        scene.getStylesheets().add(Main.class.getResource("/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
