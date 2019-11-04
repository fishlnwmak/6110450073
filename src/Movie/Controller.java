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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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



    //    //รง 1
    @FXML ImageView check1;
    @FXML ImageView check2;
    @FXML ImageView check3;
    @FXML ImageView check4;
    @FXML ImageView check5;
    @FXML ImageView check6;
    @FXML ImageView check7;
    @FXML ImageView check8;
    @FXML ImageView check9;
    @FXML ImageView check10;
    @FXML ImageView check11;
    @FXML ImageView check12;
    @FXML ImageView check13;
    @FXML ImageView check133;
    @FXML ImageView check14;
    @FXML ImageView check144;
    @FXML ImageView check15;
    @FXML ImageView check155;
    @FXML ImageView check16;
    @FXML ImageView check166;
    @FXML ImageView check17;
    @FXML ImageView check18;
    @FXML ImageView check19;
    @FXML ImageView check20;
    @FXML ImageView check21;
    @FXML ImageView check22;
    @FXML ImageView check23;
    @FXML ImageView check24;
    @FXML ImageView check25;
    @FXML ImageView check26;
    @FXML ImageView check27;
    @FXML ImageView check28;
    @FXML ImageView check29;
    @FXML ImageView check30;
    @FXML ImageView check31;
    @FXML ImageView check32;
    @FXML ImageView check33;
    @FXML ImageView check34;
    @FXML ImageView check35;
    @FXML ImageView check36;
    @FXML ImageView check37;
    @FXML ImageView check38;
    @FXML ImageView check39;
    @FXML ImageView check40;
    @FXML ImageView check41;
    @FXML ImageView check42;
    @FXML ImageView check43;
    @FXML ImageView check44;
    @FXML ImageView check45;
    @FXML ImageView check46;
    @FXML ImageView check47;
    @FXML ImageView check48;








    @FXML
    ImageView chair1;
    @FXML
    ImageView chair2;
    @FXML
    ImageView chair3;
    @FXML
    ImageView chair4;
        @FXML
    ImageView chair5;
    @FXML
    ImageView chair6;
    @FXML
    ImageView chair7;
    @FXML
    ImageView chair8;
    @FXML
    ImageView chair9;
    @FXML
    ImageView chair10;
    @FXML
    ImageView chair11;
    @FXML
    ImageView chair12;
    @FXML
    ImageView chair13;
    @FXML
    ImageView chair133;
    @FXML
    ImageView chair14;
    @FXML
    ImageView chair144;
    @FXML
    ImageView chair15;
    @FXML
    ImageView chair155;
    @FXML
    ImageView chair16;
    @FXML
    ImageView chair166;
    @FXML
    ImageView chair17;
    @FXML
    ImageView chair18;
    @FXML
    ImageView chair19;
    @FXML
    ImageView chair20;
    @FXML
    ImageView chair21;
    @FXML
    ImageView chair22;
    @FXML
    ImageView chair23;
    @FXML
    ImageView chair24;
    @FXML
    ImageView chair25;
    @FXML
    ImageView chair26;
    @FXML
    ImageView chair27;
    @FXML
    ImageView chair28;
    @FXML
    ImageView chair29;
    @FXML
    ImageView chair30;
    @FXML
    ImageView chair31;
    @FXML
    ImageView chair32;
    @FXML
    ImageView chair33;
    @FXML
    ImageView chair34;
    @FXML
    ImageView chair35;
    @FXML
    ImageView chair36;
    @FXML
    ImageView chair37;
    @FXML
    ImageView chair38;
    @FXML
    ImageView chair39;
    @FXML
    ImageView chair40;
    @FXML
    ImageView chair41;
    @FXML
    ImageView chair42;
    @FXML
    ImageView chair43;
    @FXML
    ImageView chair44;
    @FXML
    ImageView chair45;
    @FXML
    ImageView chair46;
    @FXML
    ImageView chair47;
    @FXML
    ImageView chair48;
//    @FXML
//    ImageView chair49;
//    @FXML
//    ImageView chair50;
//    @FXML
//    ImageView chair51;
//    @FXML
//    ImageView chair52;
//    @FXML
//    ImageView chair53;
//    @FXML
//    ImageView chair54;
//    @FXML
//    ImageView chair55;
//    @FXML
//    ImageView chair56;
//    @FXML
//    ImageView chair57;
//    @FXML
//    ImageView chair58;
//    @FXML
//    ImageView chair59;
//    @FXML
//    ImageView chair60;
//    @FXML
//    ImageView chair61;
//    @FXML
//    ImageView chair62;
//    @FXML
//    ImageView chair63;
//    @FXML
//    ImageView chair64;
//// โรง 3
//    @FXML
//    ImageView chair65;
//    @FXML
//    ImageView chair66;
//    @FXML
//    ImageView chair67;
//    @FXML
//    ImageView chair68;
//    @FXML
//    ImageView chair69;
//    @FXML
//    ImageView chair70;
//    @FXML
//    ImageView chair71;
//    @FXML
//    ImageView chair72;


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
        BtnNext1.setVisible(true);
        n = 1;


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
        Btn2.setVisible(true);
        n = 2;

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
        BtnNext1.setVisible(true);
        n = 3;
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
        BtnNext1.setVisible(true);
        n = 4;
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
        BtnNext1.setVisible(true);
        n = 5;
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
        BtnNext1.setVisible(true);
        n = 6;
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
        BtnNext1.setVisible(false);
        textF.setVisible(false);
        n = 0;
    }

    @FXML
    public void Nexttotheater(ActionEvent event) throws IOException {
        if (n == 1) {
            Button b = (Button) event.getSource();
            Stage stage = (Stage) b.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("T1.fxml"));
            stage.setScene(new Scene(loader.load(), 900, 600));
            stage.show();

        } else if (n == 2) {
            Button b = (Button) event.getSource();
            Stage stage = (Stage) b.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("T2.fxml"));
            stage.setScene(new Scene(loader.load(), 900, 600));
            stage.show();

        } else if (n == 3) {
            Button b = (Button) event.getSource();
            Stage stage = (Stage) b.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("T2.fxml"));
            stage.setScene(new Scene(loader.load(), 900, 600));
            stage.show();

        } else if (n == 4) {
            Button b = (Button) event.getSource();
            Stage stage = (Stage) b.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("T2.fxml"));
            stage.setScene(new Scene(loader.load(), 900, 600));
            stage.show();

        } else if (n == 5) {
            Button b = (Button) event.getSource();
            Stage stage = (Stage) b.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("T2.fxml"));
            stage.setScene(new Scene(loader.load(), 900, 600));
            stage.show();

        } else if (n == 6) {
            Button b = (Button) event.getSource();
            Stage stage = (Stage) b.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("T2.fxml"));
            stage.setScene(new Scene(loader.load(), 900, 600));
            stage.show();

        }

    }



    @FXML public void seat1to12(ActionEvent actionEvent){
        Theater T1 = new Theater();
        if(chair1.isVisible()== false){
             T1.setPrice(120);
             T1.name("A1");
             chair1.setDisable(true);
             check1.setDisable(true);
        }
        if(chair2.isVisible()== false){
            T1.setPrice(120);
            T1.name("A2");
            chair2.setDisable(true);
            check2.setDisable(true);


        }
        if(chair3.isVisible()== false){
            T1.setPrice(120);
            T1.name("A3");
            chair3.setDisable(true);
            check3.setDisable(true);


        }
        if(chair4.isVisible()== false){
            T1.setPrice(120);
            T1.name("A4");
            chair4.setDisable(true);
            check4.setDisable(true);


        }
        if(chair5.isVisible()== false){
            T1.setPrice(120);
            T1.name("B1");
            chair5.setDisable(true);
            check5.setDisable(true);


        }
        if(chair6.isVisible()== false){
            T1.setPrice(120);
            T1.name("B2");
            chair6.setDisable(true);
            check6.setDisable(true);

        }
        if(chair7.isVisible()== false){
            T1.setPrice(120);
            T1.name("B3");
            chair7.setDisable(true);
            check7.setDisable(true);

        }
        if(chair8.isVisible()== false){
            T1.setPrice(120);
            T1.name("B4");
            chair8.setDisable(true);
            check8.setDisable(true);

        }
        if(chair9.isVisible()== false){
            T1.setPrice(150);
            T1.name("C1");
            chair9.setDisable(true);
            check9.setDisable(true);

        }
        if(chair10.isVisible()== false){
            T1.setPrice(150);
            T1.name("C2");
            chair10.setDisable(true);
            check10.setDisable(true);

        }
        if(chair11.isVisible()== false){
            T1.setPrice(150);
            T1.name("C3");
            chair11.setDisable(true);
            check11.setDisable(true);

        }
        if(chair12.isVisible()== false){
            T1.setPrice(150);
            T1.name("C4");
            chair12.setDisable(true);
            check12.setDisable(true);

        }



    }

    @FXML public void seat13to24(ActionEvent actionEvent){
        Theater T1 = new Theater();
        if(chair13.isVisible()== false){
            T1.setPrice(160);
            T1.name("A1");
            chair13.setDisable(true);
            check13.setDisable(true);

        }
        if(chair133.isVisible()== false){
            T1.setPrice(160);
            T1.name("A1");
            chair133.setDisable(true);
            check133.setDisable(true);

        }
        if(chair14.isVisible()== false){
            T1.setPrice(160);
            T1.name("A2");
            chair14.setDisable(true);
            check14.setDisable(true);

        }
        if(chair144.isVisible()== false){
            T1.setPrice(160);
            T1.name("A1");
            chair144.setDisable(true);
            check144.setDisable(true);

        }
        if(chair15.isVisible()== false){
            T1.setPrice(160);
            T1.name("A3");
            chair15.setDisable(true);
            check15.setDisable(true);

        }
        if(chair155.isVisible()== false){
            T1.setPrice(160);
            T1.name("A1");
            chair155.setDisable(true);
            check155.setDisable(true);

        }
        if(chair16.isVisible()== false){
            T1.setPrice(160);
            T1.name("A4");
            chair16.setDisable(true);
            check16.setDisable(true);

        }
        if(chair166.isVisible()== false){
            T1.setPrice(160);
            T1.name("A1");
            chair166.setDisable(true);
            check166.setDisable(true);

        }
        if(chair17.isVisible()== false){
            T1.setPrice(160);
            T1.name("B1");
            chair17.setDisable(true);
            check17.setDisable(true);

        }
        if(chair18.isVisible()== false){
            T1.setPrice(160);
            T1.name("B2");
            chair18.setDisable(true);
            check18.setDisable(true);

        }
        if(chair19.isVisible()== false){
            T1.setPrice(160);
            T1.name("B3");
            chair19.setDisable(true);
            check19.setDisable(true);

        }
        if(chair20.isVisible()== false){
            T1.setPrice(160);
            T1.name("B4");
            chair20.setDisable(true);
            check20.setDisable(true);

        }
        if(chair21.isVisible()== false){
            T1.setPrice(200);
            T1.name("D1");
            chair21.setDisable(true);
            check21.setDisable(true);

        }
        if(chair22.isVisible()== false){
            T1.setPrice(200);
            T1.name("D2");
            chair22.setDisable(true);
            check22.setDisable(true);

        }
        if(chair23.isVisible()== false){
            T1.setPrice(200);
            T1.name("D3");
            chair23.setDisable(true);
            check23.setDisable(true);

        }
        if(chair24.isVisible()== false){
            T1.setPrice(200);
            T1.name("D4");
            chair24.setDisable(true);
            check24.setDisable(true);

        }


    }

    @FXML public void seat25to36(ActionEvent actionEvent){
        Theater T1 = new Theater();
        if(chair25.isVisible()== false){
            T1.setPrice(160);
            T1.name("A1");
            chair25.setDisable(true);
            check25.setDisable(true);
        }
        if(chair26.isVisible()== false){
            T1.setPrice(160);
            T1.name("B2");
            chair26.setDisable(true);
            check26.setDisable(true);

        }
        if(chair27.isVisible()== false){
            T1.setPrice(160);
            T1.name("A4");
            chair27.setDisable(true);
            check27.setDisable(true);

        }
        if(chair28.isVisible()== false){
            T1.setPrice(160);
            T1.name("A2");
            chair28.setDisable(true);
            check28.setDisable(true);

        }
        if(chair29.isVisible()== false){
            T1.setPrice(160);
            T1.name("A3");
            chair29.setDisable(true);
            check29.setDisable(true);


        }
        if(chair30.isVisible()== false){
            T1.setPrice(160);
            T1.name("B1");
            chair30.setDisable(true);
            check30.setDisable(true);

        }
        if(chair31.isVisible()== false){
            T1.setPrice(160);
            T1.name("B4");
            chair31.setDisable(true);
            check31.setDisable(true);

        }
        if(chair32.isVisible()== false){
            T1.setPrice(160);
            T1.name("B3");
            chair32.setDisable(true);
            check32.setDisable(true);

        }
        if(chair33.isVisible()== false){
            T1.setPrice(160);
            T1.name("C4");
            chair33.setDisable(true);
            check33.setDisable(true);

        }
        if(chair34.isVisible()== false){
            T1.setPrice(160);
            T1.name("C3");
            chair34.setDisable(true);
            check34.setDisable(true);

        }
        if(chair35.isVisible()== false){
            T1.setPrice(160);
            T1.name("C2");
            chair35.setDisable(true);
            check35.setDisable(true);

        }
        if(chair36.isVisible()== false){
            T1.setPrice(160);
            T1.name("C1");
            chair36.setDisable(true);
            check36.setDisable(true);

        }


    }

    @FXML public void seat37to47(ActionEvent actionEvent){
        Theater T1 = new Theater();
        if(chair37.isVisible()== false){
            T1.setPrice(160);
            T1.name("A1");
            chair37.setDisable(true);
            check37.setDisable(true);
        }
        if(chair38.isVisible()== false){
            T1.setPrice(160);
            T1.name("B2");
            chair38.setDisable(true);
            check38.setDisable(true);

        }
        if(chair39.isVisible()== false){
            T1.setPrice(160);
            T1.name("A4");
            chair39.setDisable(true);
            check39.setDisable(true);

        }
        if(chair40.isVisible()== false){
            T1.setPrice(160);
            T1.name("A2");
            chair40.setDisable(true);
            check40.setDisable(true);

        }
        if(chair41.isVisible()== false){
            T1.setPrice(160);
            T1.name("A3");
            chair41.setDisable(true);
            check41.setDisable(true);


        }
        if(chair42.isVisible()== false){
            T1.setPrice(160);
            T1.name("B1");
            chair42.setDisable(true);
            check42.setDisable(true);

        }
        if(chair43.isVisible()== false){
            T1.setPrice(160);
            T1.name("B4");
            chair43.setDisable(true);
            check43.setDisable(true);

        }
        if(chair44.isVisible()== false){
            T1.setPrice(160);
            T1.name("B3");
            chair44.setDisable(true);
            check44.setDisable(true);

        }
        if(chair45.isVisible()== false){
            T1.setPrice(160);
            T1.name("C4");
            chair45.setDisable(true);
            check45.setDisable(true);

        }
        if(chair46.isVisible()== false){
            T1.setPrice(160);
            T1.name("C3");
            chair46.setDisable(true);
            check46.setDisable(true);

        }
        if(chair47.isVisible()== false){
            T1.setPrice(160);
            T1.name("C2");
            chair47.setDisable(true);
            check47.setDisable(true);

        }
        if(chair48.isVisible()== false){
            T1.setPrice(160);
            T1.name("C1");
            chair48.setDisable(true);
            check48.setDisable(true);

        }


    }




    @FXML public void changepic1(MouseEvent mouseEvent){
        ImageView chair = (ImageView) mouseEvent.getSource() ;
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
        if(chair.equals(chair133)){
            check133.setVisible(true);
            chair133.setVisible(false);


        }
        else if(chair.equals(check133)){
            chair133.setVisible(true);
            check133.setVisible(false);
        }
        if(chair.equals(chair14)){
            check14.setVisible(true);
            chair14.setVisible(false);


        }
        else if(chair.equals(check14)){
            chair14.setVisible(true);
            check14.setVisible(false);
        }
        if(chair.equals(chair144)){
            check144.setVisible(true);
            chair144.setVisible(false);


        }
        else if(chair.equals(check144)){
            chair144.setVisible(true);
            check144.setVisible(false);
        }

        if(chair.equals(chair15)){
            check15.setVisible(true);
            chair15.setVisible(false);


        }
        else if(chair.equals(check15)){
            chair15.setVisible(true);
            check15.setVisible(false);
        }
        if(chair.equals(chair155)){
            check155.setVisible(true);
            chair155.setVisible(false);


        }
        else if(chair.equals(check155)){
            chair155.setVisible(true);
            check155.setVisible(false);
        }

        if(chair.equals(chair16)){
            check16.setVisible(true);
            chair16.setVisible(false);


        }
        else if(chair.equals(check16)){
            chair16.setVisible(true);
            check16.setVisible(false);
        }
        if(chair.equals(chair166)){
            check166.setVisible(true);
            chair166.setVisible(false);


        }
        else if(chair.equals(check166)){
            chair166.setVisible(true);
            check166.setVisible(false);
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


    }

    @FXML public void changepic3(MouseEvent mouseEvent){
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

