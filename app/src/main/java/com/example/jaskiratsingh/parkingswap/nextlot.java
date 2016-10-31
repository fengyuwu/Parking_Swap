import java.io.*;
import java.util.*;
import java.net.*;

public Class Lots{

	//pull preferred lot from custom settings set by user
	String preferredLot = CustomSettings(lot);

	boolean after3PM;

	//lists of lots with next closest lots (using Govs as example)
	String[] GovEClosest = new String[] {"GovD", "GovB", "GovC", "GovA", "JarvisA", "JarvisB", "CookA", "CookB", "HochA", "HochB", "JacobsA", "BairdA", "BairdB", "SleeA", "SleeB", "AlumniC", "AlumniB"};
	String[] GovDClosest = new String[] {"GovC", "GovB", "GovA", "GovE", "JarvisA", "JarvisB", "CookA", "CookB", "HochA", "HochB", "JacobsA", "BairdA", "BairdB", "SleeA", "SleeB", "AlumniC", "AlumniB"};
	String[] GovCClosest = new String[] {"GovD", "GovA", "GovB", "JarvisA", "JarvisB", "GovE", "CookA", "CookB", "HochA", "HochB", "JacobsA", "BairdA", "BairdB", "SleeA", "SleeB", "AlumniC", "AlumniB"};
	String[] GovBClosest = new String[] {"GovA", "GovD", "GovC", "GovE", "JarvisA", "JarvisB", "CookA", "CookB", "HochA", "HochB", "JacobsA", "BairdA", "BairdB", "SleeA", "SleeB", "AlumniC", "AlumniB"};
	String[] GovAClosest = new String[] {"GovB", "GovC", "GovD", "GovE", "JarvisA", "JarvisB", "CookA", "CookB", "HochA", "HochB", "JacobsA", "BairdA", "BairdB", "SleeA", "SleeB", "AlumniC", "AlumniB"};
	//...

	//method to go to next lot on list
	public String nextLot(String a){
			if (preferredLot == "Governors E"){
				for (int i = 0; i < GovEClosest; i++){
					if (GovEClosest[i] == true){
						return GovEClosest[i];
						break; 
					}	
				}
			}
			if (preferredLot == "Governors D"){
				for (int i = 0; i < GovDClosest; i++){
					if (GovDClosest[i] == true){
						return GovDClosest[i];
						break; 
					}	
				}
			}
			if (preferredLot == "Governors C"){
				for (int i = 0; i < GovCClosest; i++){
					if (GovCClosest[i] == true){
						return GovCClosest[i];
						break; 
					}	
				}
			}

			if (preferredLot == "Governors B"){
				for (int i = 0; i < GovBClosest; i++){
					if (GovBClosest[i] == true){
						return GovBClosest[i];
						break; 
					}	
				}
			}

			if (preferredLot == "Governors A"){
				for (int i = 0; i < GovAClosest; i++){
					if (GovAClosest[i] == true){
						return GovAClosest[i];
						break; 
					}	
				}
			}






	}

	public String getClosestLot(){

		//check if preferred lot is open
		if (preferredLot == false){
			println("Your preferred lot isn't available! Next closest lot is: ");
			return nextLot(preferredLot);
		}
		else{
			println("Your preferred lot is available!");
			return preferredLot;
		}
	}


}