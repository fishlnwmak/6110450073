package Movie;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;
import java.util.ArrayList;


public class RegisController {
    ArrayList<Customer> customers = new ArrayList<>();
    @FXML
    TextField ID;
    @FXML
    TextField PASS;
    @FXML TextField name;
    @FXML TextField surname;
    @FXML TextField email;
    private  ArrayList<Customer> Listcustomer = new ArrayList<>();
    @FXML
    Button regis;
    @FXML
    Label Error;
    @FXML
    public void ConfirmRegis(ActionEvent actionEvent){


         int count = 0;
        for(int i=0;i<customers.size();i++){
            if(ID.getText().equals(customers.get(i).getID())){
                count = count+1;
            }
        }
    if(count==0){
        customers.add(new Customer(ID.getText(),PASS.getText(),name.getText(),surname.getText(),email.getText()));
    }
    else{
        Error.setVisible(true);

    }
    }
 }