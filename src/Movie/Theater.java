package Movie;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Theater {
    private String ticket;
    private String theanum;


    public void Theater(String ticket ,String theanum){
        this.ticket=ticket;
        this.theanum = theanum;



    }
    @Override
    public String toString(){
        return this.ticket+""+this.theanum;
    }

    public String gettheanum() {
        return theanum;
    }

    public String getTicket() {
        return ticket;
    }
}

















