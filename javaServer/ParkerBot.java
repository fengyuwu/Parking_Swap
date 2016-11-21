import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class ParkerBot implements Runnable
{
   class Tup
   {

       String latitude;
       String longitude ;
       String id ;
       String lot;
       public Tup(String c,String a, String b,String d){
           this.latitude = a;
           this.longitude = b;
           this.id = c;
           this.lot = d;
}

        String getID()
       {
		   return id;
	   }
	     String getLat()
	          {
	   		   return latitude;
	   }
	     String getLong()
	          {
	   		   return longitude;
	   }
	     String getLot()
	          {
	   		   return lot;
	   }
}

   private Socket s;
   private Scanner in;
   private PrintWriter out;
   public ArrayList<String> parkingList = new ArrayList<String>();
   public static Queue<Tup> leavers = new LinkedList();
   public static Queue<Tup> parkers = new LinkedList();
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
				while(id.length() <0)
				{
					id = in.next();
				}
				System.out.println(id);

				String lat = in.next();
				while(lat.length()<0)
				{
					lat = in.next();
				}
				System.out.println(lat);

				String longt = in.next();
				while(longt.length()<0)
				{
					longt = in.next();
				}
				System.out.println(longt);
				String lotId = in.next();
				while(lotId.length()<0)
				{
					lotId = in.next();
				}
				System.out.println(lotId);
				Tup user = new Tup(id,lat,longt,lotId);
				lock.lock();
					parkers.add(user);
				lock.unlock();

				lock.lock();
				Tup M = leavers.poll();
				lock.unlock();
				while(M ==null )
				{
					lock.lock();
					M = leavers.poll();
					lock.unlock();
				}
				//System.out.println(M);
				String name = M.id;
				String nlat = M.latitude;
				String nlong = M.longitude;
				String nLot = M.lot;
				System.out.println("SENDING from Parker");
				System.out.println(name);
				out.println(name);
				out.flush();
				System.out.println(nlat);
				out.println(nlat);
				out.flush();
				System.out.println(nlong);
				out.println(nlong);
				out.flush();
				System.out.println(nLot);
				out.println(nLot);
				out.flush();


				continue;
			}
			else if(test.equals("LEAVE"))
			{
				String id = in.next();

				while(id.length()<0)
				{
					id = in.next();
				}
				System.out.println(id);
				String lat = in.next();

				while(lat.length()<0)
				{
					lat = in.next();
				}
				System.out.println(lat);
				String longt = in.next();

				while(longt.length()<0)
				{
					longt = in.next();
				}
				System.out.println(longt);
				String lottt = in.next();

				while(lottt.length()<0)
				{
					lottt= in.next();
				}
				System.out.println(lottt);
				Tup Jaskir = new Tup(id,lat,longt,lottt);
				lock.lock();
				leavers.add(Jaskir );
				lock.unlock();

				lock.lock();
				System.out.println(parkers);
				Tup M = parkers.poll();
				lock.unlock();
				while(M == null)
				{
					    lock.lock();
						M = parkers.poll();
						lock.unlock();
				}
								//System.out.println(M);
				String ids = M.id;
				String latss =  M.latitude;
				String longtss = M.longitude;
				String lotss = M.lot;

				System.out.println("SENDING");
				System.out.println(ids);
				out.println(ids);
				out.flush();
				System.out.println(latss);
				out.println(latss);
				out.flush();
				System.out.println(longtss);
				out.println(longtss);
				out.flush();
				System.out.println(lotss);
				out.println(lotss);
				out.flush();
				continue;
			}


		}
	}

}
