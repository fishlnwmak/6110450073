package Movie;
import com.sun.javafx.collections.ArrayListenerHelper;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;


public class Controller {
    @FXML
    Button Btn1;
    @FXML
    javafx.scene.image.ImageView Pic1;
    @FXML
    TextArea textF;
    @FXML
    javafx.scene.image.ImageView Pic2;
    @FXML
    javafx.scene.image.ImageView Pic3;
    @FXML
    javafx.scene.image.ImageView Pic4;
    @FXML
    javafx.scene.image.ImageView Pic5;
    @FXML
    javafx.scene.image.ImageView Pic6;
    @FXML
    ImageView Poster;
    @FXML
    Button Btn2;
    @FXML Button Btnlogin;
    @FXML
    Button BtnNext1, BtnNext2;
    int n = 0;
    @FXML
    Text text1;
    @FXML
    TextArea textArea;
    @FXML Button T1,T11,T111,T2,T22,T222,T3,T33,T333,T4,T44,T444,T5,T55,T555,T6,T66,T666,Logout;



    //    //รง 1
    @FXML ImageView check1,check2,check3,check4,check5,check6,check7,check8,check9,check10,check11,check12;
    @FXML ImageView check13,check14,check15,check16,check17,check18,check19,check20,check21,check22,check23,check24,check25,check26;
    @FXML ImageView check27,check28,check29,check30,check31,check32,check33,check34,check35,check36,check37,check38,check39,check40;
    @FXML ImageView check41,check42,check43,check44,check45,check46,check47,check48,check49,check50,check51,check52,check53,check54;
    @FXML ImageView check55,check56,check57,check58,check59,check60,check61,check62,check63,check64,check65,check66,check67,check68,check69,check70;
    @FXML ImageView check71,check72,check73,check74,check75,check76,check77,check78,check79,check80,check81,check82,check83,check84,check85,check86;









    @FXML
    ImageView chair1,chair2,chair3,chair4,chair5,chair6,chair7,chair8,chair9,chair10,chair11,chair12;
    @FXML ImageView chair13,chair14,chair15,chair16,chair17,chair18,chair19,chair20,chair21,chair22,chair23,chair24,chair25,chair26;
    @FXML ImageView chair27,chair28,chair29,chair30,chair31,chair32,chair33,chair34,chair35,chair36,chair37,chair38,chair39,chair40;
    @FXML ImageView chair41,chair42,chair43,chair44,chair45,chair46,chair47,chair48,chair49,chair50,chair51,chair52,chair53,chair54;
    @FXML ImageView chair55,chair56,chair57,chair58,chair59,chair60,chair61,chair62,chair63,chair64,chair65,chair66,chair67,chair68,chair69,chair70;
    @FXML ImageView chair71,chair72,chair73,chair74,chair75,chair76,chair77,chair78,chair79,chair80,chair81,chair82,chair83,chair84,chair85,chair86;


    //    @FXML public void ToT1(ActionEvent event) throws IOException{
//        if(R1.isSelected() == true){
//            Button b = (Button) event.getSource();
//            Stage stage = (Stage) b.getScene().getWindow();
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("T1.fxml"));
//
//            stage.setScene(new Scene(loader.load(),900,600));
//            stage.show();
//        }

    @FXML public void Login(ActionEvent actionEvent)throws IOException{
        FileReader fileReader = new FileReader("");


    }
    @FXML
    public void onmousepress1(MouseEvent event) {

        textF.setVisible(true);
        textF.setText("ผลงานเรื่องราวจุดเริ่มต้นของ “Joker” จากผู้กำกับฯ ทอดด์ ฟิลลิปส์ ที่จะพาไปรู้จักกับโลกของอาร์เธอร์ เฟลค โดยมีการถ่ายทอดการแสดง" + "\n" +
                "ไว้อย่างน่าประทับใจโดยวาคิน ฟีนิกซ์ อาร์เธอร์เป็นชายคนหนึ่งที่ต้องเผชิญหน้ากับความโหดร้ายทารุณและสังคมที่เต็มไป");

        Poster.setImage(new Image("images/1.jpg"));
        Poster.setVisible(true);
        Pic1.setVisible(false);
        Pic2.setVisible(false);
        Pic3.setVisible(false);
        Pic4.setVisible(false);
        Pic5.setVisible(false);
        Pic6.setVisible(false);
        Btn2.setVisible(true);
        n = 1;
        T1.setVisible(false);
        T11.setVisible(false);
        T111.setVisible(false);
        T2.setVisible(false);
        T22.setVisible(false);
        T222.setVisible(false);
        T3.setVisible(false);
        T33.setVisible(false);
        T333.setVisible(false);
        T4.setVisible(false);
        T44.setVisible(false);
        T444.setVisible(false);
        T5.setVisible(false);
        T55.setVisible(false);
        T555.setVisible(false);
        T6.setVisible(false);
        T66.setVisible(false);
        T666.setVisible(false);
        Logout.setVisible(false);




    }

    @FXML
    public void onmousepress2(MouseEvent mouseEvent) {
        textF.setVisible(true);
        textF.setText("ซึซึกิ  จิโรคิจิ’ (ลุงของโซโนโกะ) ชนะการประมูลผลงานเลื่องชื่อของ ‘แวนโก๊ะ’  เป็นภาพวาดดอกทานตะวันที่เคย" + "\n" +
                "มอดไหม้ไปพร้อมไฟสงครามที่ญี่ปุ่น   ต่อมา ‘ซึซึกิ’ ได้ประกาศผ่านโทรทัศน์ว่ามีการจัดนิทรรศการภาพวาดโดยจะ" + "\n" +
                "นำมาจัดแสดงภาพวาดอกทานตะวันนี้ถึง 7 ภาพ นับเป็นครั้งแรกของโลก ภายในหอศิลป์ ‘เรย์คล็อก’  ที่มีระบบ" + "\n" +
                "รักษาความปลอดภัยสูง  แล้วได้เรียกตัวผู้คุ้มกันระดับหัวกะทิที่ถูกขนานนามว่า ‘กลุ่มซามูไรทั้ง 7’  ให้มาดูแล" + "\n" +
                "หนึ่งในนั้นมี  ‘โมริ โคโกโร่’ ด้วย\n" +
                "ทว่าระหว่างการเตรียมงานนิทรรศการมีการขนภาพวาดดอกทานตะวันทางอากาศจากนิวยอร์กมายังญี่ปุ่น" + "\n" +
                "‘จอมโจรคิด’ ได้กระทำการอุกอาจจนเกือบทำให้ผู้โดยสารถึงแก่ชีวิต");
        Poster.setImage(new Image("images/2.jpg"));
        Poster.setVisible(true);
        Pic1.setVisible(false);
        Pic2.setVisible(false);
        Pic3.setVisible(false);
        Pic4.setVisible(false);
        Pic5.setVisible(false);
        Pic6.setVisible(false);
        Btn2.setVisible(true);
        BtnNext1.setVisible(true);
        n = 2;
        T1.setVisible(false);
        T11.setVisible(false);
        T111.setVisible(false);
        T2.setVisible(false);
        T22.setVisible(false);
        T222.setVisible(false);
        T3.setVisible(false);
        T33.setVisible(false);
        T333.setVisible(false);
        T4.setVisible(false);
        T44.setVisible(false);
        T444.setVisible(false);
        T5.setVisible(false);
        T55.setVisible(false);
        T555.setVisible(false);
        T6.setVisible(false);
        T66.setVisible(false);
        T666.setVisible(false);
        Logout.setVisible(false);

    }

    @FXML
    public void onmousepress3(MouseEvent mouseEvent) {
        textF.setVisible(true);
        textF.setText("เรื่องราวสานต่อจากภาคแรก เมื่อเจ้าหญิงออโรร่าต้องการแต่งงานกับเจ้าชายแต่ มาเลฟิเซนต์ไม่เห็นด้วย" + "\n" +
                " ก่อให้เกิดชนวนศึกครั้งใหม่ เมื่อราชินีอิงกริต (รับบทโดยมิเชล ไฟเฟอร์) ตั้งกองกำลังทหารเพื่อสู้กับมาเลฟิเซนต์" + "\n" +
                " และ เผ่าพันธุ์สัตว์วิเศษ เรื่องราวก้าวข้ามเทพนิยายสู่แอคชั่นแฟนตาซีฟอร์มยักษ์ และการกลับมาอีกครั้งของ" + "\n" +
                " แองเจลิน่า โจลี่ สยายปีกนางฟ้าปีศาจในบทของมาเลฟิเซนต์\n" +
                "\n");
        Poster.setImage(new Image("images/3.jpg"));
        Poster.setVisible(true);
        Pic1.setVisible(false);
        Pic2.setVisible(false);
        Pic3.setVisible(false);
        Pic4.setVisible(false);
        Pic5.setVisible(false);
        Pic6.setVisible(false);
        Btn2.setVisible(true);
        n = 3;
        T1.setVisible(false);
        T11.setVisible(false);
        T111.setVisible(false);
        T2.setVisible(false);
        T22.setVisible(false);
        T222.setVisible(false);
        T3.setVisible(false);
        T33.setVisible(false);
        T333.setVisible(false);
        T4.setVisible(false);
        T44.setVisible(false);
        T444.setVisible(false);
        T5.setVisible(false);
        T55.setVisible(false);
        T555.setVisible(false);
        T6.setVisible(false);
        T66.setVisible(false);
        T666.setVisible(false);
        Logout.setVisible(false);
    }

    @FXML
    public void onmousepress4(MouseEvent mouseEvent) {
        textF.setVisible(true);
        textF.setText("ขุนแผน ฟ้าฟื้น ผลงานการกำกับเรื่องล่าสุดของ ก้องเกียรติ โขมศิริ พร้อมเหล่านักแสดงนำ อาทิ มาริโอ้ เมาเร่อ" + "\n" +
                "ณัทธนพล ทินโรจน์ (ฟิลลิป เดอะเฟซเมน), ฟ้า ยงวรี งามเกษม, แองเจลิน่า โฟรม็องโต้ และนักแสดงอีกคับคั่ง" + "\n" +
                " เรื่องราวของแก้ว เด็กหนุ่มสุพรรณบุรีที่จดจำเรื่องราวของตัวเองไม่ได้ เขาออกเดินทางตามหาความทรงจำว่าเขา" + "\n" +
                "เป็นใครและเป็นลูกของใคร ในขณะเดียวกันก็ต้องผจญภัยไปกับแก๊งค์เพื่อนสุดฮา โดยมีวิชาคาถาอาคมที่ร่ำเรียนมา" + "\n" +
                "คอยช่วยเหลือเพื่อกำจัดอุปสรรคที่ขวางกั้น");
        Poster.setImage(new Image("images/4.jpg"));
        Poster.setVisible(true);
        Pic1.setVisible(false);
        Pic2.setVisible(false);
        Pic3.setVisible(false);
        Pic4.setVisible(false);
        Pic5.setVisible(false);
        Pic6.setVisible(false);
        Btn2.setVisible(true);

        n = 4;
        T1.setVisible(false);
        T11.setVisible(false);
        T111.setVisible(false);
        T2.setVisible(false);
        T22.setVisible(false);
        T222.setVisible(false);
        T3.setVisible(false);
        T33.setVisible(false);
        T333.setVisible(false);
        T4.setVisible(false);
        T44.setVisible(false);
        T444.setVisible(false);
        T5.setVisible(false);
        T55.setVisible(false);
        T555.setVisible(false);
        T6.setVisible(false);
        T66.setVisible(false);
        T666.setVisible(false);
        Logout.setVisible(false);
    }

    @FXML
    public void onmousepress5(MouseEvent mouseEvent) {
        textF.setVisible(true);
        textF.setText("กว่า 2 ทศวรรษ หลังจากที่ ซาราห์ คอนเนอร์สามารถช่วยโลกไว้ได้ด้วยการทำลายหุ่นเหล็กทั้งหมดและหยุดวันตัดสิน" + "\n" +
                "Judgment Day ดานิ รามอส ซึ่งอาศัยอยู่กับพี่ชายในเม็กซิโกก่อนที่หุ่นเหล็กสังหารตัวใหม่โค๊ดเนม Rev-9" + "\n" +
                " จะถูกส่งมาจากโลกอนาคตเพื่อฆ่าเธอ โดยเธอได้รับการช่วยเหลือจาก 2 นักรบ Grace มนุษย์กึ่งจักรกลจากอนาคต" + "\n" +
                " ที่มีภารกิจปกป้องเธอ และหญิงเหล็ก ซาราห์ คอนเนอร์ พร้อมทั้งการกลับมาช่วยเหลือของ T-800 อีกครั้ง");
        Poster.setImage(new Image("images/5.jpg"));
        Poster.setVisible(true);
        Pic1.setVisible(false);
        Pic2.setVisible(false);
        Pic3.setVisible(false);
        Pic4.setVisible(false);
        Pic5.setVisible(false);
        Pic6.setVisible(false);
        Btn2.setVisible(true);

        n = 5;
        T1.setVisible(false);
        T11.setVisible(false);
        T111.setVisible(false);
        T2.setVisible(false);
        T22.setVisible(false);
        T222.setVisible(false);
        T3.setVisible(false);
        T33.setVisible(false);
        T333.setVisible(false);
        T4.setVisible(false);
        T44.setVisible(false);
        T444.setVisible(false);
        T5.setVisible(false);
        T55.setVisible(false);
        T555.setVisible(false);
        T6.setVisible(false);
        T66.setVisible(false);
        T666.setVisible(false);
        Logout.setVisible(false);
    }

    @FXML
    public void onmousepress6(MouseEvent mouseEvent) {
        textF.setVisible(true);
        textF.setText("หลังจากรอดพ้นในวันที่เหล่าคนตายครองโลก เหล่าบรรดาสี่ผู้รอดชีวิต Columbus, Tallahasse, Wichita" + "\n" +
                " และ Little Rock ได้ย้ายมาอยู่ที่ใจกลางเมืองของประเทศอเมริกา แต่ทว่าพวกเขาก็ยังต้องเผชิญหน้า" + "\n" +
                "กับเหล่าฝูงซอมบี้อยู่ดี แต่ในคราวนี้ซอมบี้พวกนั้นมีวิวัฒนาการณ์มากกว่าเดิม");
        Poster.setImage(new Image("images/6.jpg"));
        Poster.setVisible(true);
        Pic1.setVisible(false);
        Pic2.setVisible(false);
        Pic3.setVisible(false);
        Pic4.setVisible(false);
        Pic5.setVisible(false);
        Pic6.setVisible(false);
        Btn2.setVisible(true);

        n = 6;
        T1.setVisible(false);
        T11.setVisible(false);
        T111.setVisible(false);
        T2.setVisible(false);
        T22.setVisible(false);
        T222.setVisible(false);
        T3.setVisible(false);
        T33.setVisible(false);
        T333.setVisible(false);
        T4.setVisible(false);
        T44.setVisible(false);
        T444.setVisible(false);
        T5.setVisible(false);
        T55.setVisible(false);
        T555.setVisible(false);
        T6.setVisible(false);
        T66.setVisible(false);
        T666.setVisible(false);
        Logout.setVisible(false);
    }

    @FXML
    public void Back(ActionEvent event) {


        Poster.setVisible(false);
        Pic1.setVisible(true);
        Pic2.setVisible(true);
        Pic3.setVisible(true);
        Pic4.setVisible(true);
        Pic5.setVisible(true);
        Pic6.setVisible(true);
        Btn2.setVisible(false);
        textF.setVisible(false);
        n = 0;
        T1.setVisible(true);
        T11.setVisible(true);
        T111.setVisible(true);
        T2.setVisible(true);
        T22.setVisible(true);
        T222.setVisible(true);
        T3.setVisible(true);
        T33.setVisible(true);
        T333.setVisible(true);
        T4.setVisible(true);
        T44.setVisible(true);
        T444.setVisible(true);
        T5.setVisible(true);
        T55.setVisible(true);
        T555.setVisible(true);
        T6.setVisible(true);
        T66.setVisible(true);
        T666.setVisible(true);
        Logout.setVisible(true);
    }

    @FXML
    public void Nexttotheater1(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("T1.fxml"));
        stage.setScene(new Scene(loader.load(), 900, 600));
        stage.show();

        }
    @FXML
    public void Nexttotheater2(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("T2.fxml"));
        stage.setScene(new Scene(loader.load(), 900, 600));
        stage.show();

    }
    @FXML
    public void Nexttotheater3(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("T3.fxml"));
        stage.setScene(new Scene(loader.load(), 900, 600));
        stage.show();

    }
    @FXML
    public void Nexttotheater4(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("T4.fxml"));
        stage.setScene(new Scene(loader.load(), 900, 600));
        stage.show();

    }
    @FXML
    public void Nexttotheater5(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("T5.fxml"));
        stage.setScene(new Scene(loader.load(), 900, 600));
        stage.show();

    }
    @FXML
    public void Nexttotheater6(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("T6.fxml"));
        stage.setScene(new Scene(loader.load(), 900, 600));
        stage.show();

    }
    @FXML public void WriteT1(ArrayList<String> seatT1){
        String Seperate = File.separator;
        String x = System.getProperty("user.dir") + Seperate + "resources";
        String Filename = x + Seperate + "Booking.csv";
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(Filename);
            printWriter = new PrintWriter(fileWriter);
            for(String seat:seatT1){
                printWriter.println(seat);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(printWriter!=null){
                printWriter.close();
            }
        }


    }
    ArrayList<String> seatT1 = new ArrayList<>();
    Theater theater = new Theater();

    ArrayList<Theater> g = new ArrayList<>();



    @FXML public void seat1to12(ActionEvent actionEvent){


        if(chair1.isVisible()== false&&!(chair1.isDisable())){
            seatT1.add("A1,Theater1");

             chair1.setDisable(true);
             check1.setDisable(true);



        }
        if(chair2.isVisible()== false&&!(chair2.isDisable())){
            seatT1.add("A2,Theater1");
            chair2.setDisable(true);
            check2.setDisable(true);


        }
        if(chair3.isVisible()== false&&!(chair3.isDisable())){
            seatT1.add("A3,Theater1");
            chair3.setDisable(true);
            check3.setDisable(true);


        }
        if(chair4.isVisible()== false&&!(chair4.isDisable())){
            seatT1.add("A4,Theater1");
            chair4.setDisable(true);
            check4.setDisable(true);


        }
        if(chair5.isVisible()== false&&!(chair5.isDisable())){
            seatT1.add("B1,Theater1");
            chair5.setDisable(true);
            check5.setDisable(true);


        }
        if(chair6.isVisible()== false&&!(chair6.isDisable())){
            seatT1.add("B2,Theater1");
            chair6.setDisable(true);
            check6.setDisable(true);

        }
        if(chair7.isVisible()== false&&!(chair7.isDisable())){
            seatT1.add("B3,Theater1");
            chair7.setDisable(true);
            check7.setDisable(true);

        }
        if(chair8.isVisible()== false&&!(chair8.isDisable())){
            seatT1.add("B4,Theater1");
            chair8.setDisable(true);
            check8.setDisable(true);

        }
        if(chair9.isVisible()== false&&!(chair9.isDisable())){
            seatT1.add("C1,Theater1");
            chair9.setDisable(true);
            check9.setDisable(true);

        }
        if(chair10.isVisible()== false&&!(chair10.isDisable())){
            seatT1.add("C2,Theater1");
            chair10.setDisable(true);
            check10.setDisable(true);

        }
        if(chair11.isVisible()== false&&!(chair11.isDisable())){
            seatT1.add("C3,Theater1");
            chair11.setDisable(true);
            check11.setDisable(true);

        }
        if(chair12.isVisible()== false&&!(chair12.isDisable())){
            seatT1.add("C4,Theater1");
            chair12.setDisable(true);
            check12.setDisable(true);

        }
        WriteT1(seatT1);



    }

    @FXML public void seat13to26(ActionEvent actionEvent){
        Theater T1 = new Theater();
        if(chair13.isVisible()== false&&!(chair13.isDisable())){
            chair13.setDisable(true);
            check13.setDisable(true);

        }

        if(chair14.isVisible()== false&&!(chair14.isDisable())){
            chair14.setDisable(true);
            check14.setDisable(true);

        }

        if(chair15.isVisible()== false&&!(chair15.isDisable())){
            chair15.setDisable(true);
            check15.setDisable(true);

        }

        if(chair16.isVisible()== false&&!(chair16.isDisable())){
            chair16.setDisable(true);
            check16.setDisable(true);

        }

        if(chair17.isVisible()== false&&!(chair17.isDisable())){

            chair17.setDisable(true);
            check17.setDisable(true);

        }
        if(chair18.isVisible()== false&&!(chair18.isDisable())){

            chair18.setDisable(true);
            check18.setDisable(true);

        }
        if(chair19.isVisible()== false&&!(chair19.isDisable())){

            chair19.setDisable(true);
            check19.setDisable(true);

        }
        if(chair20.isVisible()== false&&!(chair20.isDisable())){

            chair20.setDisable(true);
            check20.setDisable(true);

        }
        if(chair21.isVisible()== false&&!(chair21.isDisable())){

            chair21.setDisable(true);
            check21.setDisable(true);

        }
        if(chair22.isVisible()== false&&!(chair22.isDisable())){

            chair22.setDisable(true);
            check22.setDisable(true);

        }
        if(chair23.isVisible()== false&&!(chair23.isDisable())){

            chair23.setDisable(true);
            check23.setDisable(true);

        }
        if(chair24.isVisible()== false&&!(chair24.isDisable())){

            chair24.setDisable(true);
            check24.setDisable(true);

        }
        if(chair25.isVisible()== false&&!(chair25.isDisable())){

            chair25.setDisable(true);
            check25.setDisable(true);

        }
        if(chair26.isVisible()== false&&!(chair26.isDisable())){

            chair26.setDisable(true);
            check26.setDisable(true);

        }


    }

    @FXML public void seat27to40(ActionEvent actionEvent){
        Theater T1 = new Theater();
        if(chair27.isVisible()== false&&!(chair27.isDisable())){


            chair27.setDisable(true);
            check27.setDisable(true);

        }
        if(chair28.isVisible()== false&&!(chair28.isDisable())){

            chair28.setDisable(true);
            check28.setDisable(true);

        }
        if(chair29.isVisible()== false&&!(chair29.isDisable())){


            chair29.setDisable(true);
            check29.setDisable(true);


        }
        if(chair30.isVisible()== false&&!(chair30.isDisable())){


            chair30.setDisable(true);
            check30.setDisable(true);

        }
        if(chair31.isVisible()== false&&!(chair31.isDisable())){

            chair31.setDisable(true);
            check31.setDisable(true);

        }
        if(chair32.isVisible()== false&&!(chair32.isDisable())){

            chair32.setDisable(true);
            check32.setDisable(true);

        }
        if(chair33.isVisible()== false&&!(chair33.isDisable())){

            chair33.setDisable(true);
            check33.setDisable(true);

        }
        if(chair34.isVisible()== false&&!(chair34.isDisable())){

            chair34.setDisable(true);
            check34.setDisable(true);

        }
        if(chair35.isVisible()== false&&!(chair35.isDisable())){

            chair35.setDisable(true);
            check35.setDisable(true);

        }
        if(chair36.isVisible()== false&&!(chair36.isDisable())){
            chair36.setDisable(true);
            check36.setDisable(true);

        }
        if(chair37.isVisible()== false&&!(chair37.isDisable())){
            chair37.setDisable(true);
            check37.setDisable(true);

        }
        if(chair38.isVisible()== false&&!(chair38.isDisable())){
            chair38.setDisable(true);
            check38.setDisable(true);

        }
        if(chair39.isVisible()== false&&!(chair39.isDisable())){
            chair39.setDisable(true);
            check39.setDisable(true);

        }
        if(chair40.isVisible()== false&&!(chair40.isDisable())){
            chair40.setDisable(true);
            check40.setDisable(true);

        }


    }

    @FXML public void seat37to47(ActionEvent actionEvent){
        Theater T1 = new Theater();
        if(chair37.isVisible()== false){
            chair37.setDisable(true);
            check37.setDisable(true);
        }
        if(chair38.isVisible()== false){

            chair38.setDisable(true);
            check38.setDisable(true);

        }
        if(chair39.isVisible()== false){

            chair39.setDisable(true);
            check39.setDisable(true);

        }
        if(chair40.isVisible()== false){

            chair40.setDisable(true);
            check40.setDisable(true);

        }
        if(chair41.isVisible()== false){

            chair41.setDisable(true);
            check41.setDisable(true);


        }
        if(chair42.isVisible()== false){

            chair42.setDisable(true);
            check42.setDisable(true);

        }
        if(chair43.isVisible()== false){

            chair43.setDisable(true);
            check43.setDisable(true);

        }
        if(chair44.isVisible()== false){


            chair44.setDisable(true);
            check44.setDisable(true);

        }
        if(chair45.isVisible()== false){


            chair45.setDisable(true);
            check45.setDisable(true);

        }
        if(chair46.isVisible()== false){

            chair46.setDisable(true);
            check46.setDisable(true);

        }
        if(chair47.isVisible()== false){

            chair47.setDisable(true);
            check47.setDisable(true);

        }
        if(chair48.isVisible()== false){

            chair48.setDisable(true);
            check48.setDisable(true);

        }


    }




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

    @FXML public void changepic3(MouseEvent mouseEvent){
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

    @FXML public void changepic4(MouseEvent mouseEvent){
        ImageView chair = (ImageView) mouseEvent.getSource() ;
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


    }





}

