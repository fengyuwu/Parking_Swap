import java.io.*;
import java.util.*;
import java.net.*;

public class ParkClient
{

	public static void main(String [] args)throws IOException
	{

		Socket s = new Socket( "localhost", 922);
		InputStream instream = s.getInputStream();
		OutputStream outstream  = s.getOutputStream();
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);


			User player = new User ("Smash Lot");



				System.out.println(player);
				out.println(player.getWhere()+"\n");
				out.flush();
				System.out.println("ENTER A WORD");
				Scanner cons = new Scanner(System.in);
				String curWord = cons.nextLine();
				out.print(curWord);
				out.flush();



	}
}