package com.example.addition;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AddController {

    @FXML
    private TextField firstNumberText;

    @FXML
    private TextField secondNumberText;

    @FXML
    private TextField resultText;

    @FXML
    private Button calculateButton;

    @FXML
    private Button resetButton;

    @FXML
    void onCalculateButtonClicked(ActionEvent event) {
        try {

            int a = Integer.parseInt(firstNumberText.getText());
            int b = Integer.parseInt(secondNumberText.getText());

            Utility test = new Utility(a, b);

            resultText.setText(String.valueOf(test.add()));
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    @FXML
    void onResetButtonClicked(ActionEvent event) {
        firstNumberText.clear();
        secondNumberText.clear();
        resultText.clear();

    }

}