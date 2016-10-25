

public class User
{
    public int id;
    public String where;
  	 public User( String location)
  	 {
		 //int id = num;
		 where = location;
		 id = id + 1;
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