package presentation;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import presentation.controller.GuiController;

/**
 * Created by Svend B on 27-11-2017.
 */
public class Calender {
        Stage primaryStage;
        HBox hBox;
        VBox vBox;
        GuiController guiController;
        Label lblCalender;
        Button btnCreateShift, btnEditShift, btnDeleteShift;



    public HBox getCalender(GuiController guiController, Stage primaryStage ){
        hBox                 = new HBox();
        vBox                 = new VBox();
        this.guiController   = guiController;
        this.primaryStage    = primaryStage;
        btnCreateShift       = new Button("Opret vagt");
        btnDeleteShift       = new Button("Slet vagt");
        btnEditShift         = new Button("Rediger vagt");
        lblCalender          = new Label("Her skal kalenderen være");



        vBox.getChildren().addAll(btnCreateShift, btnDeleteShift, btnEditShift);

        hBox.getChildren().addAll(lblCalender, vBox);
        hBox.setPadding(new Insets(50));


     return hBox;
    }

}

