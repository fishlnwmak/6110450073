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

public class TheaterController3 extends Controller{
    @FXML
    Button Book;
    @FXML
    Label Tag;
    @FXML
    ImageView check27, check28, check29, check30, check31, check32, check33, check34, check35, check36, check37, check38, check39, check40;
    @FXML
    ImageView chair27, chair28, chair29, chair30, chair31, chair32, chair33, chair34, chair35, chair36, chair37, chair38, chair39, chair40;
    private ArrayList<Theater> theaters = new ArrayList<>();
    private ArrayList<String> seatT1 = new ArrayList<>();
    private ArrayList<String> Bookseat = new ArrayList<>();
    public void initialize() throws IOException {
        Read("Booking.csv");

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
                    System.out.println(intel[i]);
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
    @FXML public void WriteT1(ArrayList<String> seat){

        String Separate = File.separator;
        String x = System.getProperty("user.dir") + Separate + "resources";
        String Filename = x + Separate + "Booking.csv";
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;


        String userSeparate = File.separator;
        String d = System.getProperty("user.dir") + userSeparate + "resources";
        String userFilename = d + userSeparate + "Username.txt";
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
    @FXML public void seat27to40(ActionEvent actionEvent){
        if(chair27.isVisible()== false&&!(chair27.isDisable())){
            Price.addmoney(140);
            seatT1.add("A1T3");

            chair27.setDisable(true);
            check27.setDisable(true);

        }
        if(chair28.isVisible()== false&&!(chair28.isDisable())){
            Price.addmoney(140);
            seatT1.add("A2T3");
            chair28.setDisable(true);
            check28.setDisable(true);

        }
        if(chair29.isVisible()== false&&!(chair29.isDisable())){
            Price.addmoney(140);
            seatT1.add("A3T3");

            chair29.setDisable(true);
            check29.setDisable(true);


        }
        if(chair30.isVisible()== false&&!(chair30.isDisable())){
            Price.addmoney(140);
            seatT1.add("A4T3");

            chair30.setDisable(true);
            check30.setDisable(true);

        }
        if(chair31.isVisible()== false&&!(chair31.isDisable())){
            Price.addmoney(140);
            seatT1.add("B1T3");
            chair31.setDisable(true);
            check31.setDisable(true);

        }
        if(chair32.isVisible()== false&&!(chair32.isDisable())){
            Price.addmoney(140);
            seatT1.add("B2T3");
            chair32.setDisable(true);
            check32.setDisable(true);

        }
        if(chair33.isVisible()== false&&!(chair33.isDisable())){
            Price.addmoney(140);
            seatT1.add("B3T3");
            chair33.setDisable(true);
            check33.setDisable(true);

        }
        if(chair34.isVisible()== false&&!(chair34.isDisable())){
            Price.addmoney(140);
            seatT1.add("B4T3");
            chair34.setDisable(true);
            check34.setDisable(true);

        }
        if(chair35.isVisible()== false&&!(chair35.isDisable())){
            Price.addmoney(160);
            seatT1.add("C1T3");
            chair35.setDisable(true);
            check35.setDisable(true);

        }
        if(chair36.isVisible()== false&&!(chair36.isDisable())){
            Price.addmoney(160);
            seatT1.add("C2T3");
            chair36.setDisable(true);
            check36.setDisable(true);

        }
        if(chair37.isVisible()== false&&!(chair37.isDisable())){
            Price.addmoney(160);
            seatT1.add("C3T3");
            chair37.setDisable(true);
            check37.setDisable(true);

        }
        if(chair38.isVisible()== false&&!(chair38.isDisable())){
            Price.addmoney(160);
            seatT1.add("C4T3");
            chair38.setDisable(true);
            check38.setDisable(true);

        }
        if(chair39.isVisible()== false&&!(chair39.isDisable())){
            Price.addmoney(200);
            seatT1.add("D1T3");
            chair39.setDisable(true);
            check39.setDisable(true);

        }
        if(chair40.isVisible()== false&&!(chair40.isDisable())){
            Price.addmoney(200);
            seatT1.add("D2T3");
            chair40.setDisable(true);
            check40.setDisable(true);

        }
        WriteT1(seatT1);
        String string = Integer.toString(Price.getPrice());
        Tag.setText(string);
        Book.setDisable(true);


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
    @FXML public void changepic3(MouseEvent mouseEvent) {
        ImageView chair = (ImageView) mouseEvent.getSource() ;

        if(chair.equals(chair27)){
            check27.setVisible(true);
            chair27.setVisible(false);


        }
        else if(chair.equals(check27)){
            chair27.setVisible(true);
            check27.setVisible(false);
        }

        if(chair.equals(chair28)){
            check28.setVisible(true);
            chair28.setVisible(false);


        }
        else if(chair.equals(check28)){
            chair28.setVisible(true);
            check28.setVisible(false);
        }

        if(chair.equals(chair29)){
            check29.setVisible(true);
            chair29.setVisible(false);


        }
        else if(chair.equals(check29)){
            chair29.setVisible(true);
            check29.setVisible(false);
        }

        if(chair.equals(chair30)){
            check30.setVisible(true);
            chair30.setVisible(false);


        }
        else if(chair.equals(check30)){
            chair30.setVisible(true);
            check30.setVisible(false);
        }
        if(chair.equals(chair31)){
            check31.setVisible(true);
            chair31.setVisible(false);


        }
        else if(chair.equals(check31)){
            chair31.setVisible(true);
            check31.setVisible(false);
        }

        if(chair.equals(chair32)){
            check32.setVisible(true);
            chair32.setVisible(false);


        }
        else if(chair.equals(check32)){
            chair32.setVisible(true);
            check32.setVisible(false);
        }

        if(chair.equals(chair33)){
            check33.setVisible(true);
            chair33.setVisible(false);


        }
        else if(chair.equals(check33)){
            chair33.setVisible(true);
            check33.setVisible(false);
        }

        if(chair.equals(chair34)){
            check34.setVisible(true);
            chair34.setVisible(false);


        }
        else if(chair.equals(check34)){
            chair34.setVisible(true);
            check34.setVisible(false);
        }

        if(chair.equals(chair35)){
            check35.setVisible(true);
            chair35.setVisible(false);


        }
        else if(chair.equals(check35)){
            chair35.setVisible(true);
            check35.setVisible(false);
        }

        if(chair.equals(chair36)){
            check36.setVisible(true);
            chair36.setVisible(false);


        }
        else if(chair.equals(check36)){
            chair36.setVisible(true);
            check36.setVisible(false);
        }
        if(chair.equals(chair37)){
            check37.setVisible(true);
            chair37.setVisible(false);


        }
        else if(chair.equals(check37)){
            chair37.setVisible(true);
            check37.setVisible(false);
        }
        if(chair.equals(chair38)){
            check38.setVisible(true);
            chair38.setVisible(false);


        }
        else if(chair.equals(check38)){
            chair38.setVisible(true);
            check38.setVisible(false);
        }
        if(chair.equals(chair39)){
            check39.setVisible(true);
            chair39.setVisible(false);


        }
        else if(chair.equals(check39)){
            chair39.setVisible(true);
            check39.setVisible(false);
        }
        if(chair.equals(chair40)){
            check40.setVisible(true);
            chair40.setVisible(false);


        }
        else if(chair.equals(check40)){
            chair40.setVisible(true);
            check40.setVisible(false);
        }






    }

}
