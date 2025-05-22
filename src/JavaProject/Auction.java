package JavaProject;
import java.io.Serializable;
import java.util.Scanner;

public class Auction implements Serializable{
    Scanner s = new Scanner(System.in);
    String Tname;
    int n;
    String Pname;
    int bid;
    int Sprice;
    

    public Auction() {
        
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    
    public String getTname() {
        return Tname;
    }

    public void setTname(String Tname) {
        this.Tname = Tname;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getSprice() {
        return Sprice;
    }

    public void setSprice(int Sprice) {
        this.Sprice = Sprice;
    }
    
  
    
}
