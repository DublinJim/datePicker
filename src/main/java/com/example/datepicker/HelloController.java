package com.example.datepicker;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.text.Text;

public class HelloController implements Initializable {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Text txt1;


    @FXML
    private Text txtLabel;

    @FXML
    void getTheDate() {
        LocalDate time = datePicker.getValue();
        txt1.setText(String.valueOf(time));
        txt1.setVisible(true);
        txtLabel.setVisible(true);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtLabel.setVisible(false);
        txt1.setVisible(false);
    }
}
