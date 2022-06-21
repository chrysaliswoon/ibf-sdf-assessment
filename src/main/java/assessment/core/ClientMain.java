package assessment.core;

import java.io.IOException;

public class ClientMain 
{
    public static void main( String[] args ) throws IOException
    {
        Integer PORT = 3000;

        HttpClient client = new HttpClient();
        client.startClient("localhost", PORT);
    }
}
