package Movie;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;



public class TheaterController1 extends Controller{
    @FXML
    Button Book;
    @FXML
    Label Tag;
    @FXML
    ImageView check1, check2, check3, check4, check5, check6, check7, check8, check9, check10, check11, check12;
    @FXML
    ImageView chair1, chair2, chair3, chair4, chair5, chair6, chair7, chair8, chair9, chair10, chair11, chair12;
    private ArrayList<Theater> theaters = new ArrayList<>();
    private ArrayList<String> text = new ArrayList<>();
    public void initialize() throws IOException {
        Read("Booking.csv");


    }
    private ArrayList<String> seatT1 = new ArrayList<>();
    private ArrayList<String> Bookseat = new ArrayList<>();
    @FXML public void changepic1(MouseEvent mouseEvent){
        ImageView chair = (ImageView) mouseEvent.getSource() ;
        String num = "";
        if(chair.equals(chair1)){
            check1.setVisible(true);
            chair1.setVisible(false);
        }
        else if(chair.equals(check1)){
            chair1.setVisible(true);
            check1.setVisible(false);
        }
        if(chair.equals(chair2)){
            check2.setVisible(true);
            chair2.setVisible(false);


        }
        else if(chair.equals(check2)){
            chair2.setVisible(true);
            check2.setVisible(false);
        }

        if(chair.equals(chair3)){
            check3.setVisible(true);
            chair3.setVisible(false);


        }
        else if(chair.equals(check3)){
            chair3.setVisible(true);
            check3.setVisible(false);
        }

        if(chair.equals(chair4)){
            check4.setVisible(true);
            chair4.setVisible(false);


        }
        else if(chair.equals(check4)){
            chair4.setVisible(true);
            check4.setVisible(false);
        }

        if(chair.equals(chair5)){
            check5.setVisible(true);
            chair5.setVisible(false);


        }
        else if(chair.equals(check5)){
            chair5.setVisible(true);
            check5.setVisible(false);
        }

        if(chair.equals(chair6)){
            check6.setVisible(true);
            chair6.setVisible(false);


        }
        else if(chair.equals(check6)){
            chair6.setVisible(true);
            check6.setVisible(false);
        }

        if(chair.equals(chair7)){
            check7.setVisible(true);
            chair7.setVisible(false);


        }
        else if(chair.equals(check7)){
            chair7.setVisible(true);
            check7.setVisible(false);
        }

        if(chair.equals(chair8)){
            check8.setVisible(true);
            chair8.setVisible(false);


        }
        else if(chair.equals(check8)){
            chair8.setVisible(true);
            check8.setVisible(false);
        }

        if(chair.equals(chair9)){
            check9.setVisible(true);
            chair9.setVisible(false);


        }
        else if(chair.equals(check9)){
            chair9.setVisible(true);
            check9.setVisible(false);
        }

        if(chair.equals(chair10)){
            check10.setVisible(true);
            chair10.setVisible(false);


        }
        else if(chair.equals(check10)){
            chair10.setVisible(true);
            check10.setVisible(false);
        }

        if(chair.equals(chair11)){
            check11.setVisible(true);
            chair11.setVisible(false);


        }
        else if(chair.equals(check11)){
            chair11.setVisible(true);
            check11.setVisible(false);
        }

        if(chair.equals(chair12)){
            check12.setVisible(true);
            chair12.setVisible(false);


        }
        else if(chair.equals(check12)){
            chair12.setVisible(true);
            check12.setVisible(false);
        }
    }
    @FXML public void seat1to12(ActionEvent actionEvent) {


        if(chair1.isVisible()== false&&!(chair1.isDisable())){
            Price.addmoney(100);
            seatT1.add("A1T1");
            chair1.setDisable(true);
            check1.setDisable(true);



        }
        if(chair2.isVisible()== false&&!(chair2.isDisable())){
            Price.addmoney(100);
            seatT1.add("A2T1");
            chair2.setDisable(true);
            check2.setDisable(true);


        }
        if(chair3.isVisible()== false&&!(chair3.isDisable())){
            Price.addmoney(100);
            seatT1.add("A3T1");
            chair3.setDisable(true);
            check3.setDisable(true);


        }
        if(chair4.isVisible()== false&&!(chair4.isDisable())){
            Price.addmoney(100);
            seatT1.add("A4T1");
            chair4.setDisable(true);
            check4.setDisable(true);


        }
        if(chair5.isVisible()== false&&!(chair5.isDisable())){
            Price.addmoney(100);
            seatT1.add("B1T1");
            chair5.setDisable(true);
            check5.setDisable(true);


        }
        if(chair6.isVisible()== false&&!(chair6.isDisable())){
            Price.addmoney(100);
            seatT1.add("B2T1");
            chair6.setDisable(true);
            check6.setDisable(true);

        }
        if(chair7.isVisible()== false&&!(chair7.isDisable())){
            Price.addmoney(100);
            seatT1.add("B3T1");
            chair7.setDisable(true);
            check7.setDisable(true);

        }
        if(chair8.isVisible()== false&&!(chair8.isDisable())){
            Price.addmoney(100);
            seatT1.add("B4T1");
            chair8.setDisable(true);
            check8.setDisable(true);

        }
        if(chair9.isVisible()== false&&!(chair9.isDisable())){
            Price.addmoney(120);
            seatT1.add("C1T1");
            chair9.setDisable(true);
            check9.setDisable(true);

        }
        if(chair10.isVisible()== false&&!(chair10.isDisable())){
            Price.addmoney(120);
            seatT1.add("C2T1");
            chair10.setDisable(true);
            check10.setDisable(true);

        }
        if(chair11.isVisible()== false&&!(chair11.isDisable())){
            Price.addmoney(120);
            seatT1.add("C3T1");
            chair11.setDisable(true);
            check11.setDisable(true);

        }
        if(chair12.isVisible()== false&&!(chair12.isDisable())){
            Price.addmoney(120);
            seatT1.add("C4T1");
            chair12.setDisable(true);
            check12.setDisable(true);

        }
        WriteT1(seatT1);
        String string = Integer.toString(Price.getPrice());
        Tag.setText(string);
        Book.setDisable(true);

    }
    @FXML public void WriteT1(ArrayList<String> seat){

        String FileSeparator = File.separator;
        String x = System.getProperty("user.dir") + FileSeparator + "resources";
        String Filename = x + FileSeparator + "Booking.csv";
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;


        String userSeparator = File.separator;
        String d = System.getProperty("user.dir") + userSeparator + "resources";
        String userFilename = d + userSeparator + "Username.txt";
        FileReader userreader = null;
        BufferedReader bufferUserreader = null;


        try {
            fileReader = new FileReader(Filename);
            bufferedReader = new BufferedReader(fileReader);
            userreader = new FileReader(userFilename);
            bufferUserreader = new BufferedReader(userreader);
            String U = bufferUserreader.readLine();
            String User = U;
            String k = null;
            while((k = bufferedReader.readLine())!=null){
                String s = k;
                Bookseat.add(s);


            }
            fileWriter = new FileWriter(Filename);
            printWriter = new PrintWriter(fileWriter);
            for(String b:Bookseat){
                printWriter.println(b);
            }

            for(String a:seat){
                printWriter.print(a);
                printWriter.print(" Book by ");
                printWriter.println(User);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            printWriter.close();
        }


    }
    public void Read(String file) throws IOException {

        theaters = new ArrayList<>();
        String Separator = File.separator;
        String Directory = System.getProperty("user.dir") + Separator + "resources";
        String Filename = Directory + Separator + "Booking.csv";
        System.out.println(Filename);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(Filename);
            bufferedReader = new BufferedReader(fileReader);
            String k = null;
            while((k = bufferedReader.readLine())!=null){
                String[] intel = k.split(" ");
                for(int i = 0;i<intel.length;i++){
                    theaters.add(new Theater(intel[i]));
                    if(intel[i].equals("A1T1")){
                        chair1.setVisible(false);
                        chair1.setDisable(true);
                        check1.setVisible(true);
                        check1.setDisable(true);
                    }
                    if(intel[i].equals("A2T1")){

                        chair2.setVisible(false);
                        chair2.setDisable(true);

                        check2.setVisible(true);
                        check2.setDisable(true);
                    }
                    if(intel[i].equals("A3T1")){

                        chair3.setVisible(false);
                        chair3.setDisable(true);

                        check3.setVisible(true);
                        check3.setDisable(true);
                    }
                    if(intel[i].equals("A4T1")){

                        chair4.setVisible(false);
                        chair4.setDisable(true);

                        check4.setVisible(true);
                        check4.setDisable(true);
                    }
                    if(intel[i].equals("B1T1")){
                        chair5.setVisible(false);
                        chair5.setDisable(true);

                        check5.setVisible(true);
                        check5.setDisable(true);
                    }
                    if(intel[i].equals("B2T1")){

                        chair6.setVisible(false);
                        chair6.setDisable(true);

                        check6.setVisible(true);
                        check6.setDisable(true);
                    }
                    if(intel[i].equals("B3T1")){

                        chair7.setVisible(false);
                        chair7.setDisable(true);

                        check7.setVisible(true);
                        check7.setDisable(true);
                    }
                    if(intel[i].equals("B4T1")){

                        chair8.setVisible(false);
                        chair8.setDisable(true);

                        check8.setVisible(true);
                        check8.setDisable(true);
                    }
                    if(intel[i].equals("C1T1")){

                        chair9.setVisible(false);
                        chair9.setDisable(true);

                        check9.setVisible(true);
                        check9.setDisable(true);
                    }
                    if(intel[i].equals("C2T1")){

                        chair10.setVisible(false);
                        chair10.setDisable(true);

                        check10.setVisible(true);
                        check10.setDisable(true);
                    }
                    if(intel[i].equals("C3T1")){

                        chair11.setVisible(false);
                        chair11.setDisable(true);

                        check11.setVisible(true);
                        check11.setDisable(true);
                    }
                    if(intel[i].equals("C4T1")){

                        chair12.setVisible(false);
                        chair12.setDisable(true);

                        check12.setVisible(true);
                        check12.setDisable(true);
                    }
                }
                Tag.setText(Integer.toString(Price.getPrice()));



            }
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
    @FXML public void backtotheaterselection(ActionEvent actionEvent){

        Button b = (Button) actionEvent.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        try {
            stage.setScene(new Scene(loader.load(),1280,800));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.show();
    }


}



