package Maincode;

import Maincode.logger.LOGGER;
import java.util.logging.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import Maincode.tarufList.*;
import Maincode.logger.LOGGER;
public class AddTarufController {
    //public LOGGER logger = new LOGGER();
    @FXML
    private TextField inputAddMinPrice;

    @FXML
    private TextField inputClients;

    @FXML
    private TextField inputMinutes;

    @FXML
    private TextField inputName;
    @FXML
    private Label stat;
    @FXML
    private TextField inputPayroll;

    @FXML
    private TextField inputSMSs;
    @FXML
    private TextField inputAddSMSPrice;

    @FXML
    private TextField inputMMMs;

    @FXML
    private TextField inputAddMMSPrice;

    @FXML
    private TextField inputMegs;

    @FXML
    private TextField inputSpeed;

    @FXML
    private TextField inputAddMegsPrice;


    @FXML
    void addTarufMob(ActionEvent event) {
        try {
            String name = inputName.getText();
            int clients = Integer.parseInt(inputClients.getText());
            double payroll = Double.parseDouble(inputPayroll.getText());
            int minutes = Integer.parseInt(inputMinutes.getText());
            double addMinPrice = Double.parseDouble(inputAddMinPrice.getText());
            TarufList.AddTarufMob(name,clients,payroll,minutes,addMinPrice);
            stat.setText("Добавлено успішно");
        }
        catch (NumberFormatException e){
            stat.setText("Дані введено некоректно");
        };

    }
    @FXML
    void addTarufMobSMS(ActionEvent event) {
        try {
            String name = inputName.getText();
            int clients = Integer.parseInt(inputClients.getText());
            double payroll = Double.parseDouble(inputPayroll.getText());
            int minutes = Integer.parseInt(inputMinutes.getText());
            double addMinPrice = Double.parseDouble(inputAddMinPrice.getText());
            int numofSMS = Integer.parseInt(inputSMSs.getText());
            double addSMSPrice = Double.parseDouble(inputAddSMSPrice.getText());

            TarufList.AddTarufMobSMS(name,clients,payroll,minutes,addMinPrice,numofSMS,addSMSPrice);
            stat.setText("Добавлено успішно");
        }
        catch (NumberFormatException e){
            stat.setText("Дані введено некоректно");
        };
    }

    @FXML
    void addTarufMobSMSMMS(ActionEvent event) {
        try {
            String name = inputName.getText();
            int clients = Integer.parseInt(inputClients.getText());
            double payroll = Double.parseDouble(inputPayroll.getText());
            int minutes = Integer.parseInt(inputMinutes.getText());
            double addMinPrice = Double.parseDouble(inputAddMinPrice.getText());
            int numofSMS = Integer.parseInt(inputSMSs.getText());
            double addSMSPrice = Double.parseDouble(inputAddSMSPrice.getText());
            int numofMMS = Integer.parseInt(inputMMMs.getText());
            double addMMSPrice = Double.parseDouble(inputAddMMSPrice.getText());

            TarufList.AddTarufMobSMSMMS(name,clients,payroll,minutes,addMinPrice,numofSMS,addSMSPrice,numofMMS,addMMSPrice);
            stat.setText("Добавлено успішно");
        }
        catch (NumberFormatException e){
            stat.setText("Дані введено некоректно");
        };
    }

    @FXML
    void addTarufMobSMSMMSInet(ActionEvent event) {
        try {
            String name = inputName.getText();
            int clients = Integer.parseInt(inputClients.getText());
            double payroll = Double.parseDouble(inputPayroll.getText());
            int minutes = Integer.parseInt(inputMinutes.getText());
            double addMinPrice = Double.parseDouble(inputAddMinPrice.getText());
            int numofSMS = Integer.parseInt(inputSMSs.getText());
            double addSMSPrice = Double.parseDouble(inputAddSMSPrice.getText());
            int numofMMS = Integer.parseInt(inputMMMs.getText());
            double addMMSPrice = Double.parseDouble(inputAddMMSPrice.getText());
            int numofInetMegs = Integer.parseInt(inputMegs.getText());
            int inetSpeedInMegs = Integer.parseInt(inputSpeed.getText());
            double addMegsPrice = Double.parseDouble(inputAddMegsPrice.getText());

            TarufList.AddTarufMobSMSMMSInet(name,clients,payroll,minutes,addMinPrice,numofSMS,addSMSPrice,numofMMS,addMMSPrice,numofInetMegs,inetSpeedInMegs,addMegsPrice);
            stat.setText("Добавлено успішно");
        }
        catch (NumberFormatException e){
            stat.setText("Дані введено некоректно");
        };
    }



}


