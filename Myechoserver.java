import java.net.*;
import java.io.*;
class Myechoserver
{
 public static void main(String args[])throws IOException
 {
  ServerSocket ss = new ServerSocket(3333);
  Socket s = ss.accept();
  DataInputStream din = new DataInputStream(s.getInputStream());
  DataOutputStream dout = new DataOutputStream(s.getOutputStream());
  BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
  String str = " ",str2 = " ";
  while(!str.equals("stop"))
  {
   str = din.readUTF();
   System.out.println("clientsays:"+str);
   dout.writeUTF(str);
   dout.flush();
  }
  din.close();
  s.close();
  ss.close();
 }
}

