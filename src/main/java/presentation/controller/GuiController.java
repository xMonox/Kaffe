package presentation.controller;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import presentation.Calender;
import presentation.LoginScene;
import presentation.MasterScene;

public class GuiController {
    private Stage primaryStage;
    private LoginScene loginScene;
    private MasterScene masterScene;
    private Calender calender;

    public GuiController() {
        this.primaryStage = new Stage();
        this.loginScene = new LoginScene();
        this.masterScene = new MasterScene();
        this.calender   = new Calender();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Scene loginScene(){
        return loginScene.getScene(this, primaryStage);
    }

    public Scene MasterScene(){
        return masterScene.getMasterScene();
    }

    public HBox calenderContent(){
        return calender.getCalender(this,primaryStage);
    }


}
