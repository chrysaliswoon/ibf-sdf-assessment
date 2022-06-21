package assessment.core;


import java.io.IOException;
import java.net.Socket;

public class HttpClient {
   public void startClient(String URL, Integer PORT) throws IOException {
      // ? Connect to the ServerMain
      Socket sock = new Socket(URL, PORT);
      System.out.printf("Connected to PORT %d \n", PORT);
   }
}
