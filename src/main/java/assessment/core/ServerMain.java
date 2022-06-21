package assessment.core;

import java.io.IOException;

public class ServerMain 
{
    public static void main( String[] args ) throws IOException
    {
        Integer PORT = 3000;

        HttpServer server = new HttpServer();
        server.startServer(PORT);
    }
}
