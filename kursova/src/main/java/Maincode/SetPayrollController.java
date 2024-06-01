package Maincode;

import Maincode.tarufList.TarufList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class SetPayrollController implements Initializable {


    @FXML
    private ChoiceBox<String> tarufChoice;

    @FXML
    private TextField inputPayroll;

    @FXML
    public void changePayroll(){
        try {
            String name = tarufChoice.getValue();
            double payroll = Double.parseDouble(inputPayroll.getText());
            TarufList.setPayrollByName(name,payroll);
            }
        catch (Exception e){
            System.out.println("Error occurred");
        }
        }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> tarufNames = TarufList.getAllTarufNames();
        tarufChoice.getItems().addAll(tarufNames);
        tarufChoice.getSelectionModel().selectFirst();

    }
}

