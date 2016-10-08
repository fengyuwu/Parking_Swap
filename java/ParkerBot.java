import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class ParkerBot implements Runnable
{
   private Socket s;
   private Scanner in;
   private PrintWriter out;
   private Queue parkers;
   private Queue leavers;

   public ParkerBot(Socket socke)
   {
	   s = socke;


   }
   public void run()

   {

		try
		{
			try
			{
				in = new Scanner(s.getInputStream());
				out = new PrintWriter(s.getOutputStream());
				doIT();

			}
			finally
			{
				s.close();
			}

		}
		catch(IOException e )
		{
			e.printStackTrace();
		}



   }

	public void doIT() throws IOException
	{
		while(true)
		{
			if(!in.hasNext())
			{
				return;
			}
			String message = in.nextLine();

			System.out.println(message);

		}
	}

	public void runParker(String command)
	{


	}

}