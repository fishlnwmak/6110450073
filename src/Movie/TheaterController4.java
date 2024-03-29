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

public class TheaterController4 extends Controller {
    @FXML
    Button Book;
    @FXML
    Label Tag;
    @FXML
    ImageView chair41, chair42, chair43, chair44, chair45, chair46, chair47, chair48, chair49, chair50, chair51;
    @FXML
    ImageView check41, check42, check43, check44, check45, check46, check47, check48, check49, check50, check51;
    private ArrayList<Theater> theaters = new ArrayList<>();
    private ArrayList<String> seatT1 = new ArrayList<>();
    private ArrayList<String> Bookseat = new ArrayList<>();
    @FXML
    public void changepic4(MouseEvent mouseEvent){
        ImageView chair = (ImageView) mouseEvent.getSource() ;
        if(chair.equals(chair41)){
            check41.setVisible(true);
            chair41.setVisible(false);


        }
        else if(chair.equals(check41)){
            chair41.setVisible(true);
            check41.setVisible(false);
        }
        if(chair.equals(chair42)) {
            check42.setVisible(true);
            chair42.setVisible(false);

        }
        else if(chair.equals(check42)){
            chair42.setVisible(true);
            check42.setVisible(false);
        }
        if(chair.equals(chair43)){
            check43.setVisible(true);
            chair43.setVisible(false);


        }
        else if(chair.equals(check43)){
            chair43.setVisible(true);
            check43.setVisible(false);
        }
        if(chair.equals(chair44)){
            check44.setVisible(true);
            chair44.setVisible(false);


        }
        else if(chair.equals(check44)){
            chair44.setVisible(true);
            check44.setVisible(false);
        }
        if(chair.equals(chair45)){
            check45.setVisible(true);
            chair45.setVisible(false);


        }
        else if(chair.equals(check45)){
            chair45.setVisible(true);
            check45.setVisible(false);
        }
        if(chair.equals(chair46)){
            check46.setVisible(true);
            chair46.setVisible(false);


        }
        else if(chair.equals(check46)){
            chair46.setVisible(true);
            check46.setVisible(false);
        }
        if(chair.equals(chair47)){
            check47.setVisible(true);
            chair47.setVisible(false);


        }
        else if(chair.equals(check47)){
            chair47.setVisible(true);
            check47.setVisible(false);
        }
        if(chair.equals(chair48)){
            check48.setVisible(true);
            chair48.setVisible(false);


        }
        else if(chair.equals(check48)){
            chair48.setVisible(true);
            check48.setVisible(false);
        }
        if(chair.equals(chair49)){
            check49.setVisible(true);
            chair49.setVisible(false);


        }
        else if(chair.equals(check49)){
            chair49.setVisible(true);
            check49.setVisible(false);
        }
        if(chair.equals(chair50)){
            check50.setVisible(true);
            chair50.setVisible(false);


        }
        else if(chair.equals(check50)){
            chair50.setVisible(true);
            check50.setVisible(false);
        }
        if(chair.equals(chair51)){
            check51.setVisible(true);
            chair51.setVisible(false);


        }
        else if(chair.equals(check51)){
            chair51.setVisible(true);
            check51.setVisible(false);
        }


    }
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
            String k;
            while((k = bufferedReader.readLine())!=null){
                String[] intel = k.split(" ");
                for(int i = 0;i<intel.length;i++){
                    theaters.add(new Theater(intel[i]));
                    System.out.println(intel[i]);
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
                        check44.setVisible(true);
                        check44.setDisable(true);
                    }
                    if (intel[i].equals("B1T4")) {
                        chair45.setVisible(false);
                        chair45.setDisable(true);
                        check45.setVisible(true);
                        check45.setDisable(true);
                    }
                    if (intel[i].equals("B2T4")) {
                        chair46.setVisible(false);
                        chair46.setDisable(true);

                        check46.setVisible(true);
                        check46.setDisable(true);
                    }
                    if (intel[i].equals("B3T4")) {
                        chair47.setVisible(false);
                        chair47.setDisable(true);

                        check47.setVisible(true);
                        check47.setDisable(true);
                    }
                    if (intel[i].equals("B4T4")) {
                        chair48.setVisible(false);
                        chair48.setDisable(true);

                        check48.setVisible(true);
                        check48.setDisable(true);
                    }
                    if (intel[i].equals("C1T4")) {
                        chair49.setVisible(false);
                        chair49.setDisable(true);

                        check49.setVisible(true);
                        check49.setDisable(true);
                    }
                    if (intel[i].equals("C2T4")) {
                        chair50.setVisible(false);
                        chair50.setDisable(true);

                        check50.setVisible(true);
                        check50.setDisable(true);
                    }
                    if (intel[i].equals("C3T4")) {
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
    @FXML public void WriteT1(ArrayList<String> seat) throws IOException {

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
            fileReader.close();
            userreader.close();
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
    @FXML public void seat41to51(ActionEvent actionEvent) throws IOException {


        if(chair41.isVisible()== false&&!(chair41.isDisable())){
            Price.addmoney(200);
            seatT1.add("A1T4");
            chair41.setDisable(true);
            check41.setDisable(true);
        }
        if(chair42.isVisible()== false&&!(chair42.isDisable())){
            Price.addmoney(200);
            seatT1.add("A2T4");

            chair42.setDisable(true);
            check42.setDisable(true);

        }
        if(chair43.isVisible()== false&&!(chair43.isDisable())){
            Price.addmoney(200);
            seatT1.add("A3T4");

            chair43.setDisable(true);
            check43.setDisable(true);

        }
        if(chair44.isVisible()== false&&!(chair44.isDisable())){
            Price.addmoney(200);
            seatT1.add("A4T4");

            chair44.setDisable(true);
            check44.setDisable(true);

        }
        if(chair45.isVisible()== false&&!(chair45.isDisable())){
            Price.addmoney(250);
            seatT1.add("B1T4");

            chair45.setDisable(true);
            check45.setDisable(true);


        }
        if(chair46.isVisible()== false&&!(chair46.isDisable())){
            Price.addmoney(250);
            seatT1.add("B2T4");

            chair46.setDisable(true);
            check46.setDisable(true);

        }
        if(chair47.isVisible()== false&&!(chair47.isDisable())){
            Price.addmoney(250);
            seatT1.add("B3T4");

            chair47.setDisable(true);
            check47.setDisable(true);

        }
        if(chair48.isVisible()== false&&!(chair48.isDisable())){
            Price.addmoney(250);
            seatT1.add("B4T4");


            chair48.setDisable(true);
            check48.setDisable(true);

        }
        if(chair49.isVisible()== false&&!(chair49.isDisable())){
            Price.addmoney(300);
            seatT1.add("C1T4");


            chair49.setDisable(true);
            check49.setDisable(true);

        }
        if(chair50.isVisible()== false&&!(chair50.isDisable())){
            Price.addmoney(300);
            seatT1.add("C2T4");

            chair50.setDisable(true);
            check50.setDisable(true);

        }
        if(chair51.isVisible()== false&&!(chair51.isDisable())){
            Price.addmoney(300);
            seatT1.add("C3T4");

            chair51.setDisable(true);
            check51.setDisable(true);

        }

        WriteT1(seatT1);
        String string = Integer.toString(Price.getPrice());
        Tag.setText(string);
        Book.setDisable(true);




    }

}
