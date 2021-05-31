import java.net.*;
import java.io.*;


public class WebClient {
  public static void main(String[] args){
    try{
      Socket s = new Socket("127.0.0.1", 6789);
      System.out.println("Connected to Server Successfully");
      PrintStream ps =new PrintStream(s.getOutputStream());
      InputStream is = s.getInputStream();

      // send request
      ps.println("GET /index.html HTTP/1.1\r\n\r\n");
      ps.flush();
      
      System.out.println(ps);
      
      // Close socket.
      s.close();
    }catch(IOException ioe){
      ioe.printStackTrace();
    }
  }
}