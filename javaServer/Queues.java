import java.util.*;
import static java.lang.System.out;

public class Queues{
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
*/



	public void SectorOneMatch(){
		if(SectorOne_L.isEmpty()){
                	System.out.println("There are no users to match");
                }else{
                	for(int i = 0; i < SectorOne_L.size(); i++)
                		    {
                		
                        	if(SectorOne_L.get(i).getLot().equals(SectorOne_A.get(0).getLot())){
                                	leave = SectorOne_L.get(i).getLot();
                                	arrive = SectorOne_A.get(0).getLot();		
                                	SectorOne_L.remove(i);
                                    SectorOne_A.remove(0);		
                        	}
                }
			
			leave = SectorOne_L.get(0).getLot();
			arrive = SectorOne_A.get(0).getLot();	
			SectorOne_L.remove(0);
			SectorOne_A.remove(0);
                }
	}
	
	public void SectorTwoMatch(){
		//
		if(SectorTwo_L.isEmpty()){
        	System.out.println("There are no users to match");
        }else{
        	for(int i = 0; i < SectorTwo_L.size(); i++)
        		    {
        		
                	if(SectorTwo_L.get(i).getLot().equals(SectorTwo_A.get(0).getLot())){
                        	leave = SectorTwo_L.get(i).getLot();
                        	arrive = SectorTwo_A.get(0).getLot();		
                        	SectorTwo_L.remove(i);
                            SectorTwo_A.remove(0);		
                	}
        }
	
	leave = SectorTwo_L.get(0).getLot();
	arrive = SectorTwo_A.get(0).getLot();	
	SectorTwo_L.remove(0);
	SectorTwo_A.remove(0);
        }
         	
	}

	public void SectorThreeMatch(){
		if(SectorThree_L.isEmpty()){
        	System.out.println("There are no users to match");
        }else{
        	for(int i = 0; i < SectorThree_L.size(); i++)
        		    {
        		
                	if(SectorThree_L.get(i).getLot().equals(SectorThree_A.get(0).getLot())){
                        	leave = SectorThree_L.get(i).getLot();
                        	arrive = SectorThree_A.get(0).getLot();		
                        	SectorThree_L.remove(i);
                        	SectorThree_A.remove(0);		
                	}
        }
	
	leave = SectorThree_L.get(0).getLot();
	arrive = SectorThree_A.get(0).getLot();	
	SectorThree_L.remove(0);
	SectorThree_A.remove(0);
        }
	}

	public void SectorFourMatch(){		
		if(SectorFour_L.isEmpty()){
        	System.out.println("There are no users to match");
        }else{
        	for(int i = 0; i < SectorFour_L.size(); i++)
        		    {
        		
                	if(SectorFour_L.get(i).getLot().equals(SectorFour_A.get(0).getLot())){
                        	leave = SectorFour_L.get(i).getLot();
                        	arrive = SectorFour_A.get(0).getLot();		
                        	SectorFour_L.remove(i);
                        	SectorFour_A.remove(0);		
                	}
        }
	
	leave = SectorFour_L.get(0).getLot();
	arrive = SectorFour_A.get(0).getLot();	
	SectorFour_L.remove(0);
	SectorFour_A.remove(0);
        }
	}

	public void SectorFiveMatch(){	
		if(SectorFive_L.isEmpty()){
        	System.out.println("There are no users to match");
        }else{
        	for(int i = 0; i < SectorFive_L.size(); i++)
        		    {
        		
                	if(SectorFive_L.get(i).getLot().equals(SectorFive_A.get(0).getLot())){
                        	leave = SectorFive_L.get(i).getLot();
                        	arrive = SectorFive_A.get(0).getLot();		
                        	SectorFive_L.remove(i);
                        	SectorFive_A.remove(0);		
                	}
        }
	
	leave = SectorFive_L.get(0).getLot();
	arrive = SectorOne_A.get(0).getLot();	
	SectorFive_L.remove(0);
	SectorFive_A.remove(0);
        }
	}                                        			







	//arrival placement
	public static void Park(Tup User){
		

		if(User.getLot().equals("Arena") || User.getLot().equals("Lake LaSalle") || User.getLot().equals("Alumni A") || User.getLot().equals("Alumni B") || User.getLot().equals("Alumni C")){
                	SectorOne_A.add(User);         	
        	}else if(User.getLot().equals("Stadium")){
                	SectorTwo_A.add(User);
        	}else if(User.getLot().equals("Special Event") || User.getLot().equals("Baird B") || User.getLot().equals("Slee A") || User.getLot().equals("Slee B")){
               		SectorThree_A.add(User);
        	}else if(User.getLot().equals("Jacobs B") || User.getLot().equals("Jacobs C")){
                	SectorFour_A.add(User);
        	}else if(User.getLot().equals("Hochstetter B") || User.getLot().equals("Cooke A") || User.getLot().equals("Cooke B")){
                	SectorFive_A.add(User);
        	}
         Park(User);
	}
	


	//leaving placement
	
	public static void Leave(Tup User){
		


		if(User.getLot().equals("Arena") || User.getLot().equals("Lake LaSalle") || User.getLot().equals("Alumni A") || User.getLot().equals("Alumni B") || User.getLot().equals("Alumni C")){
                	SectorOne_L.add(User);
        	}else if(User.getLot().equals("Stadium")){
                	SectorTwo_L.add(User);
        	}else if(User.getLot().equals("Special Event") || User.getLot().equals("Baird B") || User.getLot().equals("Slee A") || User.getLot().equals("Slee B")){
                	SectorThree_L.add(User);
        	}else if(User.getLot().equals("Jacobs B") || User.getLot().equals("Jacobs C")){
                	SectorFour_L.add(User);
        	}else if(User.getLot().equals("Hochstetter B") || User.getLot().equals("Cooke A") || User.getLot().equals("Cooke B")){
                	SectorFive_L.add(User);
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


