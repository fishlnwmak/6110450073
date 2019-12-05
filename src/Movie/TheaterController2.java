package Movie;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class TheaterController2 extends Controller{
    @FXML
    ImageView check13, check14, check15, check16, check17, check18, check19, check20, check21, check22, check23, check24, check25, check26;
    @FXML
    ImageView chair13, chair14, chair15, chair16, chair17, chair18, chair19, chair20, chair21, chair22, chair23, chair24, chair25, chair26;

    private ArrayList<String> seatT1 = new ArrayList<>();
    private ArrayList<Theater> theaters = new ArrayList<>();
    @FXML public void seat13to26(ActionEvent actionEvent){

        if(chair13.isVisible()== false&&!(chair13.isDisable())){
            Price.addmoney(140);
            seatT1.add("A1T2");
            chair13.setDisable(true);
            check13.setDisable(true);

        }

        if(chair14.isVisible()== false&&!(chair14.isDisable())){
            Price.addmoney(140);
            seatT1.add("A2T2");
            chair14.setDisable(true);
            check14.setDisable(true);

        }

        if(chair15.isVisible()== false&&!(chair15.isDisable())){
            Price.addmoney(140);
            seatT1.add("A3T2");
            chair15.setDisable(true);
            check15.setDisable(true);

        }

        if(chair16.isVisible()== false&&!(chair16.isDisable())){
            Price.addmoney(140);
            seatT1.add("A4T2");
            chair16.setDisable(true);
            check16.setDisable(true);

        }

        if(chair17.isVisible()== false&&!(chair17.isDisable())){
            Price.addmoney(140);
            seatT1.add("B1T2");

            chair17.setDisable(true);
            check17.setDisable(true);

        }
        if(chair18.isVisible()== false&&!(chair18.isDisable())){
            Price.addmoney(140);
            seatT1.add("B2T2");

            chair18.setDisable(true);
            check18.setDisable(true);

        }
        if(chair19.isVisible()== false&&!(chair19.isDisable())){
            Price.addmoney(140);
            seatT1.add("B3T2");

            chair19.setDisable(true);
            check19.setDisable(true);

        }
        if(chair20.isVisible()== false&&!(chair20.isDisable())){
            Price.addmoney(140);
            seatT1.add("B4T2");

            chair20.setDisable(true);
            check20.setDisable(true);

        }
        if(chair21.isVisible()== false&&!(chair21.isDisable())){
            Price.addmoney(140);
            seatT1.add("C1T2");
            chair21.setDisable(true);
            check21.setDisable(true);

        }
        if(chair22.isVisible()== false&&!(chair22.isDisable())){
            Price.addmoney(140);
            seatT1.add("C2T2");
            chair22.setDisable(true);
            check22.setDisable(true);

        }
        if(chair23.isVisible()== false&&!(chair23.isDisable())){
            Price.addmoney(140);
            seatT1.add("C3T2");
            chair23.setDisable(true);
            check23.setDisable(true);

        }
        if(chair24.isVisible()== false&&!(chair24.isDisable())){
            Price.addmoney(140);
            seatT1.add("C4T2");
            chair24.setDisable(true);
            check24.setDisable(true);

        }
        if(chair25.isVisible()== false&&!(chair25.isDisable())){
            Price.addmoney(160);
            seatT1.add("D1T2");
            chair25.setDisable(true);
            check25.setDisable(true);

        }
        if(chair26.isVisible()== false&&!(chair26.isDisable())){
            Price.addmoney(160);
            seatT1.add("D2T2");
            chair26.setDisable(true);
            check26.setDisable(true);

        }

        WriteT1(seatT1);


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
    @FXML public void Read(String file) {
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
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void initialize() throws IOException {
        Read("Booking.csv");

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
    @FXML public void changepic2(MouseEvent mouseEvent){
        ImageView chair = (ImageView) mouseEvent.getSource() ;
        if(chair.equals(chair13)){
            check13.setVisible(true);
            chair13.setVisible(false);


        }
        else if(chair.equals(check13)){
            chair13.setVisible(true);
            check13.setVisible(false);
        }

        if(chair.equals(chair14)){
            check14.setVisible(true);
            chair14.setVisible(false);


        }
        else if(chair.equals(check14)){
            chair14.setVisible(true);
            check14.setVisible(false);
        }


        if(chair.equals(chair15)){
            check15.setVisible(true);
            chair15.setVisible(false);


        }
        else if(chair.equals(check15)){
            chair15.setVisible(true);
            check15.setVisible(false);
        }


        if(chair.equals(chair16)){
            check16.setVisible(true);
            chair16.setVisible(false);


        }
        else if(chair.equals(check16)){
            chair16.setVisible(true);
            check16.setVisible(false);
        }


        if(chair.equals(chair17)){
            check17.setVisible(true);
            chair17.setVisible(false);


        }
        else if(chair.equals(check17)){
            chair17.setVisible(true);
            check17.setVisible(false);
        }

        if(chair.equals(chair18)){
            check18.setVisible(true);
            chair18.setVisible(false);


        }
        else if(chair.equals(check18)){
            chair18.setVisible(true);
            check18.setVisible(false);
        }

        if(chair.equals(chair19)){
            check19.setVisible(true);
            chair19.setVisible(false);


        }
        else if(chair.equals(check19)){
            chair19.setVisible(true);
            check19.setVisible(false);
        }

        if(chair.equals(chair20)){
            check20.setVisible(true);
            chair20.setVisible(false);


        }
        else if(chair.equals(check20)){
            chair20.setVisible(true);
            check20.setVisible(false);
        }

        if(chair.equals(chair21)){
            check21.setVisible(true);
            chair21.setVisible(false);


        }
        else if(chair.equals(check21)){
            chair21.setVisible(true);
            check21.setVisible(false);
        }

        if(chair.equals(chair22)){
            check22.setVisible(true);
            chair22.setVisible(false);


        }
        else if(chair.equals(check22)){
            chair22.setVisible(true);
            check22.setVisible(false);
        }

        if(chair.equals(chair23)){
            check23.setVisible(true);
            chair23.setVisible(false);


        }
        else if(chair.equals(check23)){
            chair23.setVisible(true);
            check23.setVisible(false);
        }

        if(chair.equals(chair24)){
            check24.setVisible(true);
            chair24.setVisible(false);


        }
        else if(chair.equals(check24)){
            chair24.setVisible(true);
            check24.setVisible(false);
        }
        if(chair.equals(chair25)){
            check25.setVisible(true);
            chair25.setVisible(false);


        }
        else if(chair.equals(check25)){
            chair25.setVisible(true);
            check25.setVisible(false);
        }
        if(chair.equals(chair26)){
            check26.setVisible(true);
            chair26.setVisible(false);


        }
        else if(chair.equals(check26)){
            chair26.setVisible(true);
            check26.setVisible(false);
        }


    }
}
