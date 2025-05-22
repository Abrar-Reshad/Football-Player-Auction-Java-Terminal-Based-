package JavaProject;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateTeam {
    
    
    Scanner s = new Scanner (System.in);
    String k="Teamdata.txt";
    Test ob=new Test();
    
    int g;
    public void Login()
    
    {   int f=0;
    	do
    	{
    	String Username="123";
    	String Password="password";
    	System.out.println("For developers only!!");
    	System.out.println("Enter Username : ");
    	String username = s.next();
    	
        System.out.println("Enter Password : ");
        String password = s.next();
        
        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome!");
            registeredplayer();
            
            break;
        }

        else if (username.equals(Username)) {
            System.out.println("Invalid Password!Try again");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!Try again");
        } else {
            System.out.println("Invalid Username & Password!Try again");
        }
    }while(f!=1);}
   
    public void Login2()
    {
    	int f=0;
    	do
    	{
    	String Username="123";
    	String Password="password";
    	System.out.println("For developers only!!");
    	System.out.println("Enter Username : ");
    	String username = s.next();
    	
        System.out.println("Enter Password : ");
        String password = s.next();
        
        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome!");
            view();
            break;
        }

        else if (username.equals(Username)) {
            System.out.println("Invalid Password!Try again");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!Try again");
        } else {
            System.out.println("Invalid Username & Password!Try again");
        } 
    }while(f!=1);}
     
    public void create() {
         System.out.println("Enter how many Team you want: ");
         int n = s.nextInt();
        File file = new File(k);
 
        Auction[] a = new Auction[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Auction();            
        }
        s.nextLine();
        try{
            FileWriter f = new FileWriter(file,true);
            for (int i = 0; i < n; i++) {
            System.out.print("Enter Team name: ");
            a[i].setTname(s.nextLine());//takes input
            f.write(a[i].getTname()+"\n");           //writes the input in file
        }
        f.close();
        }catch(Exception e)
        {
            System.out.println(""+e);
        }
        System.out.println("");
        System.out.println("Team Registered Succesfully");
        
}
    public void view()   {
            File file = new File("Teamdata.txt");
            String p;
            
            
            try{
            Scanner in = new Scanner (file);
                System.out.println("");
                int i=1;
                while(in.hasNext())
                {
                    System.out.println("Team "+i+" Name: "+in.next());
                    i++;
                }
                in.close();
            }catch(Exception e){
                System.out.println(""+e);
            }
            
            
        }
      
     
    
    int n;
    Auction[] bid = new Auction[3];
    Player[] pp = new Player[n()];
    int y=0 ;
    Timer time = new Timer();
    TimerTask task = new TimerTask()
    {
    
        public void run()
        {
            System.out.println("");
            System.out.println("Auction over");
            
            if(bid[0].getBid()>bid[1].getBid() && bid[0].getBid()>bid[2].getBid())
            {
                System.out.println("Winning bid is : "+bid[0].getBid());
                System.out.println(pp[y].getPname()+" is Sold");
            }//2 6 5
                
            else if(bid[0].getBid()<bid[1].getBid() && bid[1].getBid()>bid[2].getBid())
            {
                System.out.println("Winning bid is : "+bid[1].getBid());
                System.out.println(pp[y].getPname()+" is Sold");
            }
                
            else{
                System.out.println("Winning bid is : "+bid[2].getBid());
                System.out.println(pp[y].getPname()+" is Sold");}
            
            System.exit(0);
            
                       
        }
    
    };
    
    
    public int m(){
        int i=0;
        try {
            
            File f = new File("Teamdata.txt");
            Scanner in = new Scanner (f);
            while(in.hasNext())
            {
                in.next();
                i++;
            }
            in.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(""+ex);
        }
        return i;
    }
    
    public int n(){
        int i=0;
        try {
            
            File f = new File("Playerdata.txt");
            Scanner in = new Scanner (f);
            while(in.hasNext())
            {
                in.nextLine();
                i++;
            }
            in.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(""+ex);
        }
        return i;
        
        
    }
    int a;
    public void bid()
    {

        try {
           
            if(n==1)
            {
                Test d = new Test();
                d.main();
            }
            
           System.out.println("\t\t\tAuction House");
            System.out.println("Selecte max 3 Team for auction");
            
            int x = m();
           
            
            
            String[] s = new String[x];
            int [] select = new int[x];
            
            File f = new File("Teamdata.txt");
            Scanner in = new Scanner(f);
            int k=0;
            while(in.hasNext())
            {
                s[k]=in.next();
                k++;
            }
            Scanner q = new Scanner(System.in);
           
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < x; j++) {
                    System.out.println(j+" for Team: "+s[j]);
                }
                System.out.println("Enter choise: ");
                select[i] = q.nextInt();
           
            }
            
            int a = select[0];
            int b = select[1];
            int c = select[2];
            
            System.out.println("Team selected Succesfully");
            System.out.println("");
            File ff = new File("Playerdata.txt");
            Scanner inn = new Scanner(ff);
            
            
            
            
            for (int i = 0; i < n(); i++) {
                pp[i] = new Player();
            }
            k=0;
            
            while(inn.hasNext())
            {
                pp[k].setPname(inn.next());             
                pp[k].setPosition(inn.next());               
                pp[k].setPprice(inn.next());
                k++;                
            }
            inn.close();
            
            System.out.println("Select player for Auction\nType Beside number of player's name to Select\n");
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < n(); j++) {
                    System.out.println(j+". Name: "+pp[j].getPname());
                    System.out.println("Position: "+pp[j].getPosition());
                    System.out.println("Price: "+pp[j].getPprice());
                    System.out.println("");
                }      
            }
            System.out.println("Enter your choise: ");
            int j = q.nextInt();
            
           
            y=j;
           
            System.out.println("Selected Player is : "+pp[j].getPname());
            System.out.println("Startiing price: "+pp[j].getPprice());
            System.out.println("");
            System.out.println("Do you want start the Auction");
            System.out.println("1. Type 1 for yes.");
            System.out.println("2. Type 2 for go back");
            int v = q.nextInt();
           
            if(v==1)
             {
                    time.schedule(task, 30*1000);
                    for (int i = 0; i < 3; i++) {
                    bid[i] = new Auction();
                  }
            
                while(true)
                {
                System.out.println(s[a]+" Enter your bid: ");
                //bid[0].setBid(q.nextInt());
                bid[0].setBid(q.nextInt());
                if(bid[0].getBid() <= g) {
                    try{
                        throw new largerbid();
                    } catch (Exception e2) {
                        System.out.println(e2.toString());
                    }
                }
                System.out.println(s[b]+" Enter your bid: ");
                //bid[1].setBid(q.nextInt());
                bid[1].setBid(q.nextInt());
                if(bid[1].getBid() <= g) {
                    try{
                        throw new largerbid();
                    } catch (Exception e2) {
                        System.out.println(e2.toString());
                    }
                }
                //
                System.out.println(s[c]+" Enter your bid: ");
                //bid[2].setBid(q.nextInt());
                bid[2].setBid(q.nextInt());
                if(bid[2].getBid() <= g) {
                    try{
                        throw new largerbid();
                    } catch (Exception e2) {
                        System.out.println(e2.toString());
                    }
                }
                
                }
                
                
                }
            else {
                Test d = new Test();
                d.main();
            }
            
 
            
           
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(CreateTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void registeredplayer()
    {

        Player[] p = new Player[5];
        
        for (int i = 0; i < 5; i++) {
            p[i] = new Player();
        }
        
        p[0].setPname("Messi");
        p[0].setPosition("Forward");
        p[0].setPprice("500");
        p[1].setPname("Neymar");
        p[1].setPosition("Forward");
        p[1].setPprice("600");
        p[2].setPname("Ozil");
        p[2].setPosition("Midfielder");
        p[2].setPprice("300");
        p[3].setPname("Di_Maria");
        p[3].setPosition("Midfielder");
        p[3].setPprice("300");
        p[4].setPname("Thiago_Silva");
        p[4].setPosition("Defender");
        p[4].setPprice("400");
        
        File f = new File("Playerdata.txt");
        
        try{
        FileWriter file = new FileWriter(f);
        
            for (int i = 0; i < 5; i++) {
                file.write(p[i].getPname()+" ");
                file.write(p[i].getPosition()+" ");
                file.write(p[i].Pprice+"\n");
            }
            file.close();
            
        }catch(Exception e){
            
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: "+p[i].getPname());
            System.out.println("Position: "+p[i].getPosition());
            System.out.println("Price: "+p[i].getPprice());
            System.out.println("");
        }
        
    }
    public void deleteteamlist() throws IOException {
        File inputFile = new File("Teamdata.txt");
        File tempFile = new File("myTempFile.txt");

        Path path = Paths.get("Teamdata.txt");

        long lines = 0;
        try {

            // much slower, this task better with sequence access
            //lines = Files.lines(path).parallel().count();

            lines = Files.lines(path).count();

        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        System.out.println("Enter Team name to delete.");
        Scanner g = new Scanner(System.in);
        String t = g.next();
        String lineToRemove = t;
        String currentLine;
        int count=0;

        while((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
            if(trimmedLine!=lineToRemove)
                count++;

        }

        if(lines==count)
        {
            System.out.println("Enter correct team name");
        }
        else{
            System.out.println("Deleted Succesfuly");
        }
        writer.close();
        reader.close();
        
        boolean successful = tempFile.renameTo(inputFile);

        inputFile.delete();
        tempFile.renameTo(inputFile);
        
    }

    
    }