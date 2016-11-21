import java.util.*;

public class User
{
	static int id=0;


    public String where;
  	 public User( )
  	 {
		 //int id = num;
		// where = location;
		 Random rand = new Random();
		 this.id= rand.nextInt(999999);


	 }
	 public String getWhere()
	 {
		 return where;
	 }
	 public int getID()
	 {
		 return id;
	 }

	public String toString(){
		return "I am "+where;
	}

}
