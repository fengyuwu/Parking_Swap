import java.util.*;
import static java.lang.System.out;

public class Arrays{
    static String leave;
    static String arrive; 
    static String Status ="";
    static Tup User;

    class Tup{
        String latitude;
            String longitude;
            String id;
            String lot;
            public Tup(String c,String a, String b,String d){
                this.latitude = a;
                this.longitude = b;
                this.id = c;
                this.lot = d;
        }
        String getLot(){
            return lot;
        }
    }   


    public Queues(Tup user, String status){
        Status = status;
        User = user;
    }

        static ArrayList<Tup> SectorOne_A = new ArrayList<Tup>();
        static ArrayList<Tup> SectorTwo_A = new ArrayList<Tup>();
        static ArrayList<Tup> SectorThree_A = new ArrayList<Tup>();
        static ArrayList<Tup> SectorFour_A = new ArrayList<Tup>();
        static ArrayList<Tup> SectorFive_A = new ArrayList<Tup>();
        static ArrayList<Tup> SectorSix_A = new ArrayList<Tup>();
        static ArrayList<Tup> SectorSeven_A = new ArrayList<Tup>();
        static ArrayList<Tup> SectorEight_A = new ArrayList<Tup>();
        static ArrayList<Tup> SectorNine_A = new ArrayList<Tup>();
        static ArrayList<Tup> SectorTen_A = new ArrayList<Tup>();


        static ArrayList<Tup> SectorOne_L = new ArrayList<Tup>();
        static ArrayList<Tup> SectorTwo_L = new ArrayList<Tup>();
        static ArrayList<Tup> SectorThree_L = new ArrayList<Tup>();
        static ArrayList<Tup> SectorFour_L = new ArrayList<Tup>();
        static ArrayList<Tup> SectorFive_L = new ArrayList<Tup>();
        static ArrayList<Tup> SectorSix_L = new ArrayList<Tup>();
        static ArrayList<Tup> SectorSeven_L = new ArrayList<Tup>();
        static ArrayList<Tup> SectorEight_L = new ArrayList<Tup>();
        static ArrayList<Tup> SectorNine_L = new ArrayList<Tup>();
        static ArrayList<Tup> SectorTen_L = new ArrayList<Tup>();
        
/*
    SectorOne-      Arena, Lake LaSalle, Alumni A, Alumni B, Alumni C
    SectorTwo-      Stadium
    SectorThree-    special event, Baird B, Slee A, Slee B
    SectorFour-     Jacobs B, Jacobs C
    SectorFive-     Hochstetter B, Cooke A, Cooke B
    SectorSix-      crofts
    SectorSeven-    Governors B, Governors C, Governors D, Governors E
    SectorEight-    Ketter, Jarvis A, Jarvis B
    SectorNine-     Fargo, Richmond A, Richmond B, Red Jacket, Spaulding
    SectorTen-      Abbott A, Parker, Sherman, Townsend, Main Bailey, Clark
*/



    public void SectorSixMatch(){
        if(SectorSix_L.isEmpty()){
                    System.out.println("There are no users to match");
                }else{
                    for(int i = 0; i < SectorSix_L.size(); i++)
                            {
                        
                            if(SectorSix_L.get(i).getLot().equals(SectorSix_A.get(0).getLot())){
                                    leave = SectorSix_L.get(i).getLot();
                                    arrive = SectorSix_A.get(0).getLot();       
                                    SectorSix_L.remove(i);
                                    SectorSix_A.remove(0);      
                            }
                }
            
            leave = SectorSix_L.get(0).getLot();
            arrive = SectorSix_A.get(0).getLot();   
            SectorSix_L.remove(0);
            SectorSix_A.remove(0);
                }
    }
    
    public void SectorSevenMatch(){
        //
        if(SectorSeven_L.isEmpty()){
            System.out.println("There are no users to match");
        }else{
            for(int i = 0; i < SectorSeven_L.size(); i++)
                    {
                
                    if(SectorSeven_L.get(i).getLot().equals(SectorSeven_A.get(0).getLot())){
                            leave = SectorSeven_L.get(i).getLot();
                            arrive = SectorSeven_A.get(0).getLot();       
                            SectorSeven_L.remove(i);
                            SectorSeven_A.remove(0);      
                    }
        }
    
    leave = SectorSeven_L.get(0).getLot();
    arrive = SectorSeven_A.get(0).getLot();   
    SectorSeven_L.remove(0);
    SectorSeven_A.remove(0);
        }
            
    }

    public void SectorEightMatch(){
        if(SectorEight_L.isEmpty()){
            System.out.println("There are no users to match");
        }else{
            for(int i = 0; i < SectorEight_L.size(); i++)
                    {
                
                    if(SectorEight_L.get(i).getLot().equals(SectorEight_A.get(0).getLot())){
                            leave = SectorEight_L.get(i).getLot();
                            arrive = SectorEight_A.get(0).getLot();     
                            SectorEight_L.remove(i);
                            SectorEight_A.remove(0);        
                    }
        }
    
    leave = SectorEight_L.get(0).getLot();
    arrive = SectorEight_A.get(0).getLot(); 
    SectorEight_L.remove(0);
    SectorEight_A.remove(0);
        }
    }

    public void SectorNineMatch(){      
        if(SectorNine_L.isEmpty()){
            System.out.println("There are no users to match");
        }else{
            for(int i = 0; i < SectorNine_L.size(); i++)
                    {
                
                    if(SectorNine_L.get(i).getLot().equals(SectorNine_A.get(0).getLot())){
                            leave = SectorNine_L.get(i).getLot();
                            arrive = SectorNine_A.get(0).getLot();      
                            SectorNine_L.remove(i);
                            SectorNine_A.remove(0);     
                    }
        }
    
    leave = SectorNine_L.get(0).getLot();
    arrive = SectorNine_A.get(0).getLot();  
    SectorNine_L.remove(0);
    SectorNine_A.remove(0);
        }
    }

    public void SectorTenMatch(){  
        if(SectorTen_L.isEmpty()){
            System.out.println("There are no users to match");
        }else{
            for(int i = 0; i < SectorTen_L.size(); i++)
                    {
                
                    if(SectorTen_L.get(i).getLot().equals(SectorTen_A.get(0).getLot())){
                            leave = SectorTen_L.get(i).getLot();
                            arrive = SectorTen_A.get(0).getLot();      
                            SectorTen_L.remove(i);
                            SectorTen_A.remove(0);     
                    }
        }
    
    leave = SectorTen_L.get(0).getLot();
    arrive = SectorSix_A.get(0).getLot();   
    SectorTen_L.remove(0);
    SectorTen_A.remove(0);
        }
    }                                                   







    //arrival placement
    public static void Park(Tup User){
        

        if(User.getLot().equals("Arena") || User.getLot().equals("Lake LaSalle") || User.getLot().equals("Alumni A") || User.getLot().equals("Alumni B") || User.getLot().equals("Alumni C")){
                    SectorSix_A.add(User);          
            }else if(User.getLot().equals("Stadium")){
                    SectorSeven_A.add(User);
            }else if(User.getLot().equals("Special Event") || User.getLot().equals("Baird B") || User.getLot().equals("Slee A") || User.getLot().equals("Slee B")){
                    SectorEight_A.add(User);
            }else if(User.getLot().equals("Jacobs B") || User.getLot().equals("Jacobs C")){
                    SectorNine_A.add(User);
            }else if(User.getLot().equals("Hochstetter B") || User.getLot().equals("Cooke A") || User.getLot().equals("Cooke B")){
                    SectorTen_A.add(User);
            }
         Park(User);
    }
    


    //leaving placement
    
    public static void Leave(Tup User){
        


        if(User.getLot().equals("Arena") || User.getLot().equals("Lake LaSalle") || User.getLot().equals("Alumni A") || User.getLot().equals("Alumni B") || User.getLot().equals("Alumni C")){
                    SectorSix_L.add(User);
            }else if(User.getLot().equals("Stadium")){
                    SectorSeven_L.add(User);
            }else if(User.getLot().equals("Special Event") || User.getLot().equals("Baird B") || User.getLot().equals("Slee A") || User.getLot().equals("Slee B")){
                    SectorEight_L.add(User);
            }else if(User.getLot().equals("Jacobs B") || User.getLot().equals("Jacobs C")){
                    SectorNine_L.add(User);
            }else if(User.getLot().equals("Hochstetter B") || User.getLot().equals("Cooke A") || User.getLot().equals("Cooke B")){
                    SectorTen_L.add(User);
            }
           Leave(User);
    }

    public static void main(String[] args) {
        if(Status.equals("Park")){
            Park(User);
        }else if(Status.equals("Leave")){
            Leave(User);
        }       
        
        
        

    }

}

   