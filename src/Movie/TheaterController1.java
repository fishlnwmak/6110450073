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
    Label Tag;
    @FXML
    ImageView check1, check2, check3, check4, check5, check6, check7, check8, check9, check10, check11, check12;
    @FXML
    ImageView chair1, chair2, chair3, chair4, chair5, chair6, chair7, chair8, chair9, chair10, chair11, chair12;
    private ArrayList<Theater> theaters = new ArrayList<>();
    public void initialize() throws IOException {
        Read("Booking.csv");

    }
    private ArrayList<String> seatT1 = new ArrayList<>();
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

    }
    @FXML public void WriteT1(ArrayList<String> seat){
        String Seperate = File.separator;
        String x = System.getProperty("user.dir") + Seperate + "resources";
        String Filename = x + Seperate + "Booking.csv";
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;


        try {

            fileWriter = new FileWriter(Filename);
            printWriter = new PrintWriter(fileWriter);
            for(String a:seat){
                printWriter.println(a);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            printWriter.close();
        }


    }
    public void Read(String file) throws IOException {
        theaters = new ArrayList<>();
        String Seperator = File.separator;
        String Directory = System.getProperty("user.dir") + Seperator + "resources";
        String Filename = Directory + Seperator + "Booking.csv";
        System.out.println(Filename);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(Filename);
            bufferedReader = new BufferedReader(fileReader);
            String k = null;
            while((k = bufferedReader.readLine())!=null){
                String[] intel = k.split(",");
                for(int i = 0;i<intel.length;i++){
                    theaters.add(new Theater(intel[i]));
                    System.out.println(intel[i]);
                    if(intel[i].equals("A1T1")){
                        Price.addmoney(100);
                        chair1.setVisible(false);
                        chair1.setDisable(true);

                        check1.setVisible(true);
                        check1.setDisable(true);
                    }
                    if(intel[i].equals("A2T1")){
                        Price.addmoney(100);
                        chair2.setVisible(false);
                        chair2.setDisable(true);

                        check2.setVisible(true);
                        check2.setDisable(true);
                    }
                    if(intel[i].equals("A3T1")){
                        Price.addmoney(100);
                        chair3.setVisible(false);
                        chair3.setDisable(true);

                        check3.setVisible(true);
                        check3.setDisable(true);
                    }
                    if(intel[i].equals("A4T1")){
                        Price.addmoney(100);
                        chair4.setVisible(false);
                        chair4.setDisable(true);

                        check4.setVisible(true);
                        check4.setDisable(true);
                    }
                    if(intel[i].equals("B1T1")){
                        Price.addmoney(100);
                        chair5.setVisible(false);
                        chair5.setDisable(true);

                        check5.setVisible(true);
                        check5.setDisable(true);
                    }
                    if(intel[i].equals("B2T1")){
                        Price.addmoney(100);
                        chair6.setVisible(false);
                        chair6.setDisable(true);

                        check6.setVisible(true);
                        check6.setDisable(true);
                    }
                    if(intel[i].equals("B3T1")){
                        Price.addmoney(100);
                        chair7.setVisible(false);
                        chair7.setDisable(true);

                        check7.setVisible(true);
                        check7.setDisable(true);
                    }
                    if(intel[i].equals("B4T1")){
                        Price.addmoney(100);
                        chair8.setVisible(false);
                        chair8.setDisable(true);

                        check8.setVisible(true);
                        check8.setDisable(true);
                    }
                    if(intel[i].equals("C1T1")){
                        Price.addmoney(120);
                        chair9.setVisible(false);
                        chair9.setDisable(true);

                        check9.setVisible(true);
                        check9.setDisable(true);
                    }
                    if(intel[i].equals("C2T1")){
                        Price.addmoney(120);
                        chair10.setVisible(false);
                        chair10.setDisable(true);

                        check10.setVisible(true);
                        check10.setDisable(true);
                    }
                    if(intel[i].equals("C3T1")){
                        Price.addmoney(120);
                        chair11.setVisible(false);
                        chair11.setDisable(true);

                        check11.setVisible(true);
                        check11.setDisable(true);
                    }
                    if(intel[i].equals("C4T1")){
                        Price.addmoney(120);
                        chair12.setVisible(false);
                        chair12.setDisable(true);

                        check12.setVisible(true);
                        check12.setDisable(true);
                    }
                    if(intel[i].equals("A1T2")){
                        chair13.setVisible(false);
                        chair13.setDisable(true);

                        check13.setVisible(true);
                        check13.setDisable(true);
                    }
                    if(intel[i].equals("A2T2")){
                        chair14.setVisible(false);
                        chair14.setDisable(true);

                        check14.setVisible(true);
                        check14.setDisable(true);
                    }
                    if(intel[i].equals("A3T2")){
                        chair15.setVisible(false);
                        chair15.setDisable(true);

                        check15.setVisible(true);
                        check15.setDisable(true);
                    }
                    if(intel[i].equals("A4T2")){
                        chair16.setVisible(false);
                        chair16.setDisable(true);

                        check16.setVisible(true);
                        check16.setDisable(true);
                    }
                    if(intel[i].equals("B1T2")){
                        chair17.setVisible(false);
                        chair17.setDisable(true);

                        check17.setVisible(true);
                        check17.setDisable(true);
                    }
                    if(intel[i].equals("B2T2")){
                        chair18.setVisible(false);
                        chair18.setDisable(true);

                        check18.setVisible(true);
                        check18.setDisable(true);
                    }
                    if(intel[i].equals("B3T2")){
                        chair19.setVisible(false);
                        chair19.setDisable(true);

                        check19.setVisible(true);
                        check19.setDisable(true);
                    }
                    if(intel[i].equals("B4T2")){
                        chair20.setVisible(false);
                        chair20.setDisable(true);

                        check20.setVisible(true);
                        check20.setDisable(true);
                    }
                    if(intel[i].equals("C1T2")){
                        chair21.setVisible(false);
                        chair21.setDisable(true);

                        check21.setVisible(true);
                        check21.setDisable(true);
                    }
                    if(intel[i].equals("C2T2")){
                        chair22.setVisible(false);
                        chair22.setDisable(true);

                        check22.setVisible(true);
                        check22.setDisable(true);
                    }
                    if(intel[i].equals("C3T2")){
                        chair23.setVisible(false);
                        chair23.setDisable(true);

                        check23.setVisible(true);
                        check23.setDisable(true);
                    }
                    if(intel[i].equals("C4T2")){
                        chair24.setVisible(false);
                        chair24.setDisable(true);

                        check24.setVisible(true);
                        check24.setDisable(true);
                    }
                    if(intel[i].equals("D1T2")){
                        chair25.setVisible(false);
                        chair25.setDisable(true);

                        check25.setVisible(true);
                        check25.setDisable(true);
                    }
                    if(intel[i].equals("D2T2")){
                        chair26.setVisible(false);
                        chair26.setDisable(true);

                        check26.setVisible(true);
                        check26.setDisable(true);
                    }
                    if(intel[i].equals("A1T3")){
                        chair27.setVisible(false);
                        chair27.setDisable(true);

                        check27.setVisible(true);
                        check27.setDisable(true);
                    }
                    if(intel[i].equals("A2T3")){
                        chair28.setVisible(false);
                        chair28.setDisable(true);

                        check28.setVisible(true);
                        check28.setDisable(true);
                    }
                    if(intel[i].equals("A3T3")){
                        chair29.setVisible(false);
                        chair29.setDisable(true);

                        check29.setVisible(true);
                        check29.setDisable(true);
                    }
                    if(intel[i].equals("A4T3")){
                        chair30.setVisible(false);
                        chair30.setDisable(true);

                        check30.setVisible(true);
                        check30.setDisable(true);
                    }
                    if(intel[i].equals("B1T3")){
                        chair31.setVisible(false);
                        chair31.setDisable(true);

                        check31.setVisible(true);
                        check31.setDisable(true);
                    }
                    if(intel[i].equals("B2T3")){
                        chair32.setVisible(false);
                        chair32.setDisable(true);

                        check32.setVisible(true);
                        check32.setDisable(true);
                    }
                    if(intel[i].equals("B3T3")){
                        chair33.setVisible(false);
                        chair33.setDisable(true);

                        check33.setVisible(true);
                        check33.setDisable(true);
                    }
                    if(intel[i].equals("B4T3")){
                        chair34.setVisible(false);
                        chair34.setDisable(true);

                        check34.setVisible(true);
                        check34.setDisable(true);
                    }
                    if(intel[i].equals("C1T3")){
                        chair35.setVisible(false);
                        chair35.setDisable(true);

                        check35.setVisible(true);
                        check35.setDisable(true);
                    }
                    if(intel[i].equals("C2T3")){
                        chair36.setVisible(false);
                        chair36.setDisable(true);

                        check36.setVisible(true);
                        check36.setDisable(true);
                    }
                    if(intel[i].equals("C3T3")){
                        chair37.setVisible(false);
                        chair37.setDisable(true);

                        check37.setVisible(true);
                        check37.setDisable(true);
                    }
                    if(intel[i].equals("C4T3")){
                        chair38.setVisible(false);
                        chair38.setDisable(true);

                        check38.setVisible(true);
                        check38.setDisable(true);
                    }
                    if(intel[i].equals("D1T3")){
                        chair39.setVisible(false);
                        chair39.setDisable(true);

                        check39.setVisible(true);
                        check39.setDisable(true);
                    }
                    if(intel[i].equals("D2T3")){
                        chair40.setVisible(false);
                        chair40.setDisable(true);

                        check40.setVisible(true);
                        check40.setDisable(true);
                    }
                    if (intel[i].equals("A1T4")) {
                        chair41.setVisible(false);
                        chair41.setDisable(true);

                        check41.setVisible(true);
                        check41.setDisable(true);
                    }
                    if (intel[i].equals("A2T4")) {
                        chair42.setVisible(false);
                        chair42.setDisable(true);

                        check42.setVisible(true);
                        check42.setDisable(true);
                    }
                    if (intel[i].equals("A3T4")) {
                        chair43.setVisible(false);
                        chair43.setDisable(true);

                        check43.setVisible(true);
                        check43.setDisable(true);
                    }
                    if (intel[i].equals("A4T4")) {
                        chair44.setVisible(false);
                        chair44.setDisable(true);

                        check45.setVisible(true);
                        check45.setDisable(true);
                    }
                    if (intel[i].equals("B1T4")) {
                        chair46.setVisible(false);
                        chair46.setDisable(true);

                        check46.setVisible(true);
                        check46.setDisable(true);
                    }
                    if (intel[i].equals("B2T4")) {
                        chair47.setVisible(false);
                        chair47.setDisable(true);

                        check47.setVisible(true);
                        check47.setDisable(true);
                    }
                    if (intel[i].equals("B3T4")) {
                        chair48.setVisible(false);
                        chair48.setDisable(true);

                        check48.setVisible(true);
                        check48.setDisable(true);
                    }
                    if (intel[i].equals("B4T4")) {
                        chair49.setVisible(false);
                        chair49.setDisable(true);

                        check49.setVisible(true);
                        check49.setDisable(true);
                    }
                    if (intel[i].equals("C1T4")) {
                        chair50.setVisible(false);
                        chair50.setDisable(true);

                        check50.setVisible(true);
                        check50.setDisable(true);
                    }
                    if (intel[i].equals("C2T4")) {
                        chair51.setVisible(false);
                        chair51.setDisable(true);

                        check51.setVisible(true);
                        check51.setDisable(true);
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



