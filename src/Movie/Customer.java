package Movie;

import java.util.ArrayList;
import java.util.Collection;

public class Customer {
    private String Name;
    private String Surname;
    private String ID;
    private String password;
    private String email;

    public String getName() {
        return Name;
    }
    public String getSurname() {
        return Surname;
    }
    public String getID() {
        return ID;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public Customer(String ID, String password, String email, String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
        this.ID = ID;
        this.password = password;
        this.email = email;

    }
    @Override
    public String toString(){
        return this.ID+","+this.password+","+this.Name+","+this.Surname+","+this.email;
    }
}
