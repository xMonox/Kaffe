package presentation;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import presentation.controller.GuiController;

/**
 * Created by Svend B on 27-11-2017.
 */
public class Calender {
        Stage primaryStage;
        HBox hBox, hBoxCalender, hBoxSaveAndCancel, hBoxCombo, hBoxLabelsForCombo;
        VBox vBox, vBoxChreateShift;
        GuiController guiController;
        Label lblUserId, lblDatePickerStart, lblDatePickerEnd, lblStartShift, lblEndShift;
        Button btnCreateShift, btnEditShift, btnDeleteShift, btnSave, btnCancel;
        TextField txtUserId;
        DatePicker datePicker1, datePicker2;
        ComboBox comboBox1, comboBox2;


    public HBox getCalender(GuiController guiController, Stage primaryStage ){
        this.guiController   = guiController;
        this.primaryStage    = primaryStage;
        hBox                 = new HBox();
        hBoxSaveAndCancel    = new HBox();
        hBoxCalender         = new HBox();
        vBox                 = new VBox();
        hBoxCombo            = new HBox();
        hBoxLabelsForCombo   = new HBox();

        datePicker1          = new DatePicker();
        datePicker2          = new DatePicker();

        comboBox1             = new ComboBox();
        comboBox1.getItems().addAll("01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09,00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "00:00");
        comboBox2             = new ComboBox();
        comboBox2.getItems().addAll("01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09,00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "00:00");

        btnCreateShift       = new Button("Opret vagt");
        btnDeleteShift       = new Button("Slet vagt");
        btnEditShift         = new Button("Rediger vagt");
        btnSave              = new Button("Gem");
        btnCancel            = new Button("Annuller");


        lblUserId            = new Label("Bruger ID");
        lblDatePickerStart   = new Label("Start dato");
        lblDatePickerEnd     = new Label("Slut dato");
        lblStartShift        = new Label("Start vagt");
        lblEndShift          = new Label("Slut vagt");


        txtUserId            = new TextField();

        hBoxSaveAndCancel.getChildren().addAll(btnSave, btnCancel);
        hBoxCombo.getChildren().addAll(comboBox1, comboBox2);
        hBoxLabelsForCombo.getChildren().addAll(lblStartShift, lblEndShift);
        hBoxLabelsForCombo.setSpacing(10);

        vBoxChreateShift     = new VBox();
        vBoxChreateShift.getChildren().addAll(lblUserId, txtUserId, lblDatePickerStart, datePicker1, lblDatePickerEnd, datePicker2, hBoxLabelsForCombo, hBoxCombo, hBoxSaveAndCancel);
        vBoxChreateShift.setSpacing(10);
        vBoxChreateShift.setMinWidth(250);
        vBoxChreateShift.setMaxWidth(250);



        hBoxCalender.getChildren().addAll( btnCreateShift, btnDeleteShift, btnEditShift, vBoxChreateShift);

        hBox.getChildren().addAll(hBoxCalender);
        hBox.setPadding(new Insets(50));


        btnCreateShift.setOnAction(event -> btnCreateShiftClicked());



     return hBox;
    }

    public void btnCreateShiftClicked() {


    }

}

