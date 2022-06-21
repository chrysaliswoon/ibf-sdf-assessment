package assessment.core;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerMain 
{
    public static void main( String[] args ) throws IOException
    {
        Integer PORT = 3000;

        //? Create a Thread Pool
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        
        // while (true) {
            //? Create the Server
            HttpServer server = new HttpServer();
            server.startServer(PORT);
        // }
    }
}
