package Movie;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.*;


public class Controller{

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
    private int n = 0;
    @FXML
    Button T1, T11, T111, T2, T22, T222, T3, T33, T333, T4, T44, T444, T5, T55, T555, T6, T66, T666, Logout;
    @FXML
    public void onmousepress1(MouseEvent event) {

        textF.setVisible(true);
        textF.setText("ผลงานเรื่องราวจุดเริ่มต้นของ “Joker” จากผู้กำกับฯ ทอดด์ ฟิลลิปส์ ที่จะพาไปรู้จักกับโลกของอาร์เธอร์ เฟลค โดยมีการถ่ายทอดการแสดง" + "\n" +
                "ไว้อย่างน่าประทับใจโดยวาคิน ฟีนิกซ์ อาร์เธอร์เป็นชายคนหนึ่งที่ต้องเผชิญหน้ากับความโหดร้ายทารุณและสังคมที่เต็มไป");

        Poster.setImage(new Image("resources/images/1.jpg"));
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
        Poster.setImage(new Image("resources/images/2.jpg"));
        Poster.setVisible(true);
        Pic1.setVisible(false);
        Pic2.setVisible(false);
        Pic3.setVisible(false);
        Pic4.setVisible(false);
        Pic5.setVisible(false);
        Pic6.setVisible(false);
        Btn2.setVisible(true);
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
        Poster.setImage(new Image("resources/images/3.jpg"));
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
        Poster.setImage(new Image("resources/images/4.jpg"));
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
        Poster.setImage(new Image("resources/images/5.jpg"));
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
        Poster.setImage(new Image("resources/images/6.jpg"));
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


    @FXML public void toInfor(ActionEvent actionEvent){
        Button b = (Button) actionEvent.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("InformationID.fxml"));
        try {
            stage.setScene(new Scene(loader.load(),1280,800));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.show();


    }

    Money Price = new Money();
    @FXML public void data(ActionEvent actionEvent)throws IOException{
        File file = new File("Booking.csv");
        String FileSeparator = File.separator;
        String Directory = System.getProperty("user.dir") + FileSeparator + "resources";
        String Filename = Directory + FileSeparator + file;

        ProcessBuilder pb = new ProcessBuilder("Notepad.exe",Filename);
        pb.start();
    }}