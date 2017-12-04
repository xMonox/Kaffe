package presentation;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.print.PrinterJob;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import jfxtras.labs.scene.control.CalendarLabel;
import jfxtras.scene.control.LocalDatePicker;
import jfxtras.scene.control.agenda.Agenda;
import presentation.controller.GuiController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

/**
 * Created by Svend B on 27-11-2017.
 */
public class Calender {
        Stage primaryStage;
        HBox root, hBoxLeft, hBoxRight, hBoxCalender, hBoxSaveAndCancel, hBoxCombo, hBoxLabelsForCombo;
        GridPane gridPane;
        VBox vBox, vBoxChreateShift;
        GuiController guiController;
        Label lblUserId, lblDatePickerStart, lblDatePickerEnd, lblStartShift, lblEndShift;
        Button btnCreateShift, btnEditShift, btnDeleteShift, btnSave, btnCancel;
        TextField txtUserId;
        DatePicker datePicker1, datePicker2;
        ComboBox comboBox1, comboBox2;
        Agenda agenda;

    public HBox getCalender(GuiController guiController, Stage primaryStage ){
        this.guiController  = guiController;
        this.primaryStage   = primaryStage;
        this.root           = new HBox();

        hBoxSaveAndCancel    = new HBox();
        hBoxCalender         = new HBox();
        vBox                 = new VBox();
        hBoxCombo            = new HBox();
        hBoxLabelsForCombo   = new HBox();

        this.hBoxLeft            = new HBox();
        this.hBoxRight           = new HBox();
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
        lblUserId.getStyleClass().add("labels");
        lblDatePickerEnd.getStyleClass().add("labels");
        lblDatePickerStart.getStyleClass().add("labels");
        lblStartShift.getStyleClass().add("labels");
        lblEndShift.getStyleClass().add("labels");

        txtUserId            = new TextField();

        hBoxLeft.setMinWidth(960);
        hBoxLeft.setMaxHeight(560);
        hBoxRight.setMinWidth(320);
        hBoxCalender.setSpacing(20);


         agenda = new Agenda().withLocale(Locale.GERMAN);
         agenda.allowDraggingProperty().setValue(false);
//        hBoxLeft.getChildren().add(agenda.withLocale(Locale.GERMAN));
        agenda.appointments().addAll(new Agenda.AppointmentImplLocal()
                .withStartLocalDateTime(LocalDate.now().atTime(12,00))
                .withEndLocalDateTime(LocalDate.now().atTime(15,00))
                .withSummary("Julles vagt")
        );


        agenda.setMinWidth(960);
        agenda.setMinHeight(560);

        agenda.localeProperty().setValue(Locale.GERMAN);

        hBoxSaveAndCancel.getChildren().addAll(btnSave, btnCancel);
        hBoxCombo.getChildren().addAll(comboBox1, comboBox2);
        hBoxLabelsForCombo.getChildren().addAll(lblStartShift, lblEndShift);
        hBoxLabelsForCombo.setSpacing(10);

        vBoxChreateShift     = new VBox();
        vBoxChreateShift.getChildren().addAll(lblUserId, txtUserId, lblDatePickerStart, datePicker1, lblDatePickerEnd, datePicker2, hBoxLabelsForCombo, hBoxCombo, hBoxSaveAndCancel);
        vBoxChreateShift.setSpacing(10);
        vBoxChreateShift.setMinWidth(250);
        vBoxChreateShift.setMaxWidth(250);

        hBoxCalender.getChildren().addAll( btnCreateShift, btnDeleteShift, btnEditShift);

        vBox.getChildren().addAll(agenda.withLocale(Locale.GERMAN), hBoxCalender);

        hBoxRight.getChildren().addAll(vBoxChreateShift);

        root.getChildren().addAll(vBox, hBoxRight);

            btnSave.setOnAction(event -> btnSaveClicked());
//        btnCreateShift.setOnAction(event -> btnCreateShiftClicked());


        return root;
    }

    public void btnSaveClicked() {

      agenda.appointments().addAll(new Agenda.AppointmentImplLocal()
              .withStartLocalDateTime((datePicker1.getValue()).atTime(Integer.parseInt(comboBox1.getSelectionModel().getSelectedItem().toString().split(":")[0]), 00))
                .withEndLocalDateTime((datePicker2.getValue()).atTime(Integer.parseInt(comboBox2.getSelectionModel().getSelectedItem().toString().split(":")[0]), 00))

               .withDescription("Julles vagt")

       );


    }
      /*  public HBox hBoxRight() {
        /*
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

    } */

        }

