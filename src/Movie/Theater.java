package Movie;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Theater {
    private String ticket;
    private ArrayList<String> seatT1 = new ArrayList<>();
    public Theater(String ticket){
        this.ticket=ticket;
    }
    public String getTicket() {
        return ticket;
    }
    @Override
    public String toString(){
        return this.ticket;
    }
}

















