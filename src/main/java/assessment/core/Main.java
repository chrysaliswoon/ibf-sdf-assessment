package assessment.core;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main 
{
    public static void main( String[] args ) throws IOException
    {
        for(int i = 0; i < args.length; i++) {
            Integer PORT = Integer.parseInt(args[i]);
            HttpServer server = new HttpServer();
            server.startServer(PORT);
            // System.out.println(args[i]);
        }

        // Integer PORT = args[i];

        // //? Create a Thread Pool
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        
        // // while (true) {
            //? Create the Server
            // HttpServer server = new HttpServer();
            // server.startServer(PORT);
        // // }
    }
}
