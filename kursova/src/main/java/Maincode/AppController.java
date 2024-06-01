package Maincode;
        import Maincode.logger.LOGGER;
        import java.net.URL;
        import java.util.ResourceBundle;

        import Maincode.tarufList.TarufList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.Scene;
        import javafx.scene.control.ChoiceBox;
        import javafx.scene.control.ComboBox;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.stage.Stage;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.control.TextArea;
        import javafx.scene.control.TextField;

public class AppController implements Initializable {


    @FXML
    private TextField fromField;


    @FXML
    private TextField toField;

    @FXML
    private TextField inputDeleteTaruf;
    @FXML
    private ChoiceBox<String> chooseTarufType;

    @FXML
    private TextArea textarea;
    @FXML
    void closeapp(ActionEvent event) {

        LOGGER.info("ty");

    }


    @FXML
    void showTarufs(ActionEvent event) {
        //System.out.println("echo");

        String mesaage = TarufList.printAllTarufs();
        textarea.appendText("Наявні тарифи\n");
        textarea.appendText(mesaage);

    }

    @FXML
    void loadFromFile(ActionEvent event) {
        TarufList.loadTarufsFromXmlFile();
    }

    @FXML
    void saveInFile(ActionEvent event) {
        TarufList.saveTarufsToXmlFile();
    }

    @FXML
    void findInRange(ActionEvent event){
        try {
            double from = Double.parseDouble(fromField.getText());
            double to = Double.parseDouble(toField.getText());
            String tarufs = TarufList.finderinPayrollRange(from,to);
            textarea.appendText("Тарифи в заданому діапазоні:\n");
            textarea.appendText(tarufs);
        }
        catch (Exception e){
            textarea.appendText("Введені невірні дані");
        }
    }

    @FXML
    void countClients(ActionEvent event){
        int clients = TarufList.measureAllClients();
        textarea.appendText("Кількість клієнтів: " + clients);
    }

    @FXML
    void addNewWindow(ActionEvent event) {
        try {
            Stage newWindow = new Stage();
            newWindow.setTitle("Add taruf");
            if (chooseTarufType.getValue() == "Тариф тільки мобільний звязок") {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("addtarufmob.fxml"));
                newWindow.setScene(new Scene(loader.load(), 800, 400));
                newWindow.show();
            }
            if (chooseTarufType.getValue() == "Мобільний зв'язок і SMS") {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("addtarufmobsms.fxml"));
                newWindow.setScene(new Scene(loader.load(), 800, 400));
                newWindow.show();
            }
            if (chooseTarufType.getValue() == "Мобільний зв'язок SMS і MMS") {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("addtarufmobsmsmms.fxml"));
                newWindow.setScene(new Scene(loader.load(), 800, 400));
                newWindow.show();
            }
            if (chooseTarufType.getValue() == "Мобільний зв'язок SMS MMS і інтернет") {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("addtarufmobsmsmmsinet.fxml"));
                newWindow.setScene(new Scene(loader.load(), 800, 600));
                newWindow.show();
            }
        }
        catch (Exception e){
            System.out.println("Error while creating window");
        }

    }

    @FXML
    void addSetPayrollWindow(ActionEvent event){

        try {
            Stage newWindow = new Stage();
            newWindow.setTitle("Set payroll");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("setpayroll.fxml"));
            newWindow.setScene(new Scene(loader.load(), 800, 400));
            newWindow.show();

        }
        catch (Exception e){

        }
    }

    @FXML
    void sortTarufsByPayroll(ActionEvent event){
        String message = TarufList.getSortedByPayroll();
        textarea.appendText(message);
    }

    @FXML
    void deleteTaruf(ActionEvent event){
        String name = inputDeleteTaruf.getText();
        TarufList.deleteTaruf(name);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        chooseTarufType.getItems().addAll("Тариф тільки мобільний звязок","Мобільний зв'язок і SMS","Мобільний зв'язок SMS і MMS","Мобільний зв'язок SMS MMS і інтернет");
        chooseTarufType.getSelectionModel().selectFirst();
        textarea.setEditable(false);
    }


}
