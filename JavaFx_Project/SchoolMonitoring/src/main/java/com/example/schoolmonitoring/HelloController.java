package com.example.schoolmonitoring;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    public ImageView imageView;
    public Label messageLabel;
    @FXML
    private Label studentInfo;

    @FXML
    private Label studentName;

    @FXML
    private TextField stuNameTextField;
    @FXML
    private Label stuRegNo;
    @FXML
    private TextField stuRegNoTextField;
    @FXML
    private Label stuAdd;
    @FXML
    private TextField stuAddTextField;

    @FXML
    protected TextField getStudentName() {
        return stuNameTextField;
    }

    @FXML
    public TextField getStuRegNoTextField() {
        return stuRegNoTextField;
    }

    @FXML
    public TextField getStuAddTextField() {
        return stuAddTextField;
    }

    @FXML
    protected void onSubmitButtonClick() {
        studentName.setVisible(false);
        stuNameTextField.setVisible(false);
        stuRegNo.setVisible(false);
        stuRegNoTextField.setVisible(false);
        stuAdd.setVisible(false);
        stuAddTextField.setVisible(false);
        String out = String.format("Welcome to Dirckson School : \n %s \n %s \n %s", getStudentName().getText(), getStuRegNoTextField().getText(), getStuAddTextField().getText());
        studentInfo.setStyle("-fx-font-weight: bold");
        studentInfo.setText(out);
    }


}