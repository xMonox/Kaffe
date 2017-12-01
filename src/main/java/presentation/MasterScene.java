package presentation;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import presentation.controller.GuiController;

/**
 * Created by Svend B on 27-11-2017.
 */
public class MasterScene {

    HBox hBoxTop;
    HBox content;
    VBox vBox;
    Group root;
    Scene scene;
    ToggleButton tglBtnCalendar, tglBtnNews, tglBtnMesseges, tglBtnControlPanel;
    ToggleGroup toggleGroup;
    GuiController guiController;

    public Scene getMasterScene(GuiController guiController) {
//        Locale.setDefault(Constants.DENMARK);
        this.guiController = guiController;
        vBox        = new VBox();
        hBoxTop     = new HBox();
        content     = new HBox();
        root        = new Group();
        toggleGroup = new ToggleGroup();
        tglBtnNews = new ToggleButton("Nyheder");
        tglBtnCalendar = new ToggleButton("Kalender");
        tglBtnMesseges = new ToggleButton("Beskeder");
        tglBtnControlPanel = new ToggleButton("Indstillinger");
        tglBtnCalendar.setMinHeight(30);

        tglBtnCalendar.getStyleClass().add("panel-buttons");
        tglBtnNews.getStyleClass().add("panel-buttons");
        tglBtnMesseges.getStyleClass().add("panel-buttons");
        tglBtnControlPanel.getStyleClass().add("panel-buttons");

        tglBtnCalendar.setToggleGroup(toggleGroup);
        tglBtnNews.setToggleGroup(toggleGroup);
        tglBtnMesseges.setToggleGroup(toggleGroup);
        tglBtnControlPanel.setToggleGroup(toggleGroup);




        hBoxTop.getChildren().addAll(tglBtnNews, tglBtnCalendar, tglBtnMesseges, tglBtnControlPanel);
        hBoxTop.setMaxHeight(30);
        hBoxTop.setMinHeight(30);

        content.setMinHeight(690);
        content.setMaxHeight(690);
        content.setMinWidth(1280);
        content.setMaxWidth(1280);

        content.getChildren().add((guiController.calenderContent()));
        tglBtnCalendar.setSelected(true);

        //make each button load the appropiate content and disable themselves if they're selected.

       toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            Toggle selection = toggleGroup.getSelectedToggle();
            if(selection.equals(tglBtnNews)) {
               content.getChildren().clear();
//                content.getChildren().add(guiController.calendarContent());
                tglBtnNews.setDisable(true);
            } else {
                tglBtnNews.setDisable(false);
            }

            if(selection.equals(tglBtnCalendar)) {
                content.getChildren().clear();
                content.getChildren().add((guiController.calenderContent()));
                tglBtnCalendar.setDisable(true);
            } else {
                tglBtnCalendar.setDisable(false);
            }

            if(selection.equals(tglBtnMesseges)){
                content.getChildren().clear();
//                content.getChildren().add(guiController.customerContent());
                tglBtnMesseges.setDisable(true);
            } else {
                tglBtnMesseges.setDisable(false);
            }

            if(selection.equals(tglBtnControlPanel)) {
                content.getChildren().clear();

//                content.getChildren().add(guiController.customerContent());

                tglBtnControlPanel.setDisable(true);
            } else {
                tglBtnControlPanel.setDisable(false);
            }
        });

//        vBox.getStylesheets().add("presentation/style/style.css");
//        vBox.getStylesheets().add("presentation/style/style.css");
        vBox.getChildren().addAll(hBoxTop, content);
        scene       = new Scene(vBox, 1280, 720);
        return scene;
    }
}

