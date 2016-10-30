import java.io.*;
import java.util.*;
import java.net.*;

public class ParkClient
{

	public static void main(String [] args)throws IOException
	{

		System.out.println("attempt");
		Socket s = new Socket( "52.23.175.220", 4922);
		System.out.println("tried");
		InputStream instream = s.getInputStream();
		OutputStream outstream  = s.getOutputStream();
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);


			User player = new User ();
			System.out.println(player.getID());

		Scanner cons = new Scanner(System.in);

		boolean step1 = true;
			while(true)
			{
				//System.out.println(player);
				//out.println(player.getWhere());
				//out.flush();
				if(step1)
				{
					System.out.println();
					System.out.println("YOU WANT TO PARK OR LEAVE?");


					String curWord = cons.nextLine();
					//out.print(curWord +"\n");
					out.println(curWord);
					out.flush();
					out.println(player.getID());
					out.flush();


					//System.out.println("FLUSHED" + curWord);

					String dan = in.nextLine();
					while(dan.length()<1)
					{
						dan = in.nextLine();
					}
					//System.out.println("THISIS DAN");
					System.out.println(dan);
					String lame = dan;

					if(dan.equals(lame)  )
					{
						System.out.println("OK you're matched with :");

						String who = in.nextLine();
						while(who.length()<1)
						{
							who = in.nextLine();
						}
						System.out.println(who);
						System.out.println();

					}
					//System.out.println("THis is the end");
				}
		  }



	}
}