package Movie;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class LoginandRegister {
    @FXML
    TextField Usernamelog,Passwordlog,User,Pass,name,surname,email;
    @FXML Label ERRORREGIS,ERRORLOGIN;
    private ArrayList<Customer> PPL = new ArrayList<>();
    public void initialize(){
        Reading("User.txt");
    }
    public void Reading(String folder){
        PPL = new ArrayList<>();
        String Seperator = File.separator;
        String Directory = System.getProperty("user.dir")  + Seperator + "resources";
        String Filename = Directory + Seperator + folder;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        System.out.println(Filename);
        try {
            fileReader = new FileReader(Filename);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                String[] Intel = line.split(",");
                PPL.add(new Customer(Intel[0],Intel[1],Intel[2],Intel[3],Intel[4]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(bufferedReader != null){
                    bufferedReader.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public void Writing(ArrayList<Customer> PPL){
        String Seperate = File.separator;
        String x = System.getProperty("user.dir") + Seperate + "resources";
        String Filename = x + Seperate + "User.txt";
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(Filename);
            printWriter = new PrintWriter(fileWriter);
            for(Customer d:PPL ){
                printWriter.println(d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(printWriter!=null){
                printWriter.close();
            }
        }

    }

    @FXML public void Register(ActionEvent actionEvent){
        int d = 0;
        for(int i = 0;i<PPL.size();i++){
            if(PPL.get(i).getID().equals(User.getText())){
                d+=1;
                ERRORREGIS.setText("ID is already use");

            }
        }
        if(d<1){
            PPL.add(new Customer(User.getText(),Pass.getText(),name.getText(),surname.getText(),email.getText()));
            Writing(PPL);
            ERRORREGIS.setText("done!!");

        }
    }




    @FXML void BacktoLogin(ActionEvent actionEvent)throws IOException{
        Button b = (Button) actionEvent.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        stage.setScene(new Scene(loader.load(),1280,800));
        stage.show();
    }
    @FXML void ToRegis(ActionEvent actionEvent) throws  IOException{
        Button b = (Button) actionEvent.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Regis.fxml"));
        stage.setScene(new Scene(loader.load(),1280,800));
        stage.show();
    }
    @FXML public void LoginBtn(ActionEvent actionEvent) {
        for (int i = 0; i < PPL.size(); i++) {
            if (Usernamelog.getText().equals(PPL.get(i).getID())) {
                if (Passwordlog.getText().equals(PPL.get(i).getPassword())) {
                    Button b = (Button) actionEvent.getSource();
                    Stage stage = (Stage) b.getScene().getWindow();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
                    try {
                        stage.setScene(new Scene(loader.load(), 1280, 800));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    stage.show();
                } else {
                    ERRORLOGIN.setText("Password incorrect");
                    break;
                }


            }  else {
                ERRORLOGIN.setText("Username incorrect");
                }

            }

        }
    }




