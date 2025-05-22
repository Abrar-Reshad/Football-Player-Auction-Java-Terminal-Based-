package JavaProject;

import java.util.Scanner;

import java.io.IOException;


class wronginput extends java.lang.Exception {

    public String toString(){
        return "Enter valid input.";
    }
}
class largerbid extends java.lang.Exception {

    public String toString(){
        return "Enter larger bid next time.";
    }
}
class dltname extends Exception{
    public String toString(){ return "Enter the correct team name to delete.";}
}



public class Test {
    
    Scanner s = new Scanner(System.in);
    
    
    
    public void main() 
    {
        Scanner s = new Scanner(System.in);
        int auc;
        CreateTeam a = new CreateTeam();
        Auction c = new Auction();
        
        
        
        while(true)
        {
            System.out.println("Welcome to Auction");
            System.out.println("1.Create Team");
            System.out.println("2.Player list for bid");
            System.out.println("3.Enter Auction");
            System.out.println("4.View Registered Team");        
            System.out.println("5.Delete Particular Team");
            System.out.println("6.Exit");

            System.out.print("\nEnter choise: ");
            int b = s.nextInt();
            if(b==1)
            {
                a.create();
            }
            else if (b==2)
            {   
            	a.Login();
                
            }
            else if (b==3)
            {
                a.bid();
            }
            else if(b==4)
            {
            	a.Login2();
                
                
            }
            else if(b==5)
            {
                 try {
					a.deleteteamlist();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            else if (b == 6)
            {
                System.exit(0);
                
            } 
            
            else if (b>=7){
                try {
                    throw new wronginput();
                }
                catch (Exception e1){
                    System.out.println(e1.toString());
                }
            }

            
            System.out.println("");
        }
        
        
    }

    public static void main(String[] args) {
         Test d=new Test ();
         d.main();
}
}