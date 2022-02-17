package com.example.datepicker;

import java.time.LocalDate;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Text txt1;

    @FXML
    void getTheDate() {
        LocalDate time = datePicker.getValue();
        txt1.setText(String.valueOf(time));

    }

}
