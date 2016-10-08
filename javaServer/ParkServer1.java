import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.*;

public class ParkServer1
{
   public static void main(String [] args) throws IOException
   {
	    int portNum = 922;
		ServerSocket server = new ServerSocket(portNum);

		while(true)
		{
			Socket n = server.accept();
			System.out.println("CONNECTED");
			PrintWriter toN = new PrintWriter(n.getOutputStream());

			ParkerBot parker = new ParkerBot(n);
			Thread t = new Thread(parker);
			t.start();

		}





   }
}