package Movie;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Theater extends Controller {
    private int price;
    private String ticket;


    public void Theater(String ticket,int price){
        this.price=price;
        this.ticket=ticket;
        price = 0;
        ticket = "";



    }
    public void name(String tic){
        ticket += tic+"";



    }
    public void setPrice(int money){
        price +=money;
    }
    public void write(String z) throws IOException{
        FileWriter fileWriter = new FileWriter("");
    }



    }










