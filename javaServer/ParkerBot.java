import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class ParkerBot implements Runnable
{
   private Socket s;
   private Scanner in;
   private PrintWriter out;
   public ArrayList<String> parkingList = new ArrayList<String>();
   public static Queue<String> leavers = new LinkedList();
   public static Queue<String> parkers = new LinkedList();
   public ReentrantLock lock = new ReentrantLock();

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
			String message = in.next();
			//String test = message.replace("\\r","");
			String test = message;
			System.out.println("TEST VAL:");
			System.out.println(test);
			if(test.equals("PARK"))
			{
				String id = in.next();
				System.out.println(id);
				lock.lock();
				parkers.add(id);
				lock.unlock();
				out.println("OOO yeah FINDING YOU A SPOT \n");
				out.flush();
				lock.lock();
				String M = leavers.poll();
				lock.unlock();
				while(M ==null )
				{
					lock.lock();
					M = leavers.poll();
					lock.unlock();
				}
				//System.out.println(M);
				out.println(M);
				out.flush();

				continue;
			}
			else if(test.equals("LEAVE"))
			{
				String id = in.next();
				System.out.println(id);
				lock.lock();
				leavers.add(id);
				lock.unlock();
				out.println("GETTING YOU HOOKED UP WITH A PARKER \n");
				out.flush();
				lock.lock();
				System.out.println(parkers);
				String M = parkers.poll();
				lock.unlock();
				while(M == null)
				{
					    lock.lock();
						M = parkers.poll();
						lock.unlock();
				}
								//System.out.println(M);
				out.println(M);

				//out.println("mark");
				out.flush();



				continue;
			}

			else
			{
				System.out.println(test.length());
				out.println("PLEASE ENTER EITHER PARK OR LEAVE");
				out.flush();
				continue;

			}


		}
	}

}