package assessment.core;

import java.io.*;  
import java.net.*;  
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
this is the main web server class
 */

public class HttpServer {

    public void startServer(Integer PORT) throws IOException {
        //? Create a server socket and listen to a port
        ServerSocket server = new ServerSocket(PORT); // creates a server socket that is bound to the specified port number. The maximum number of queued incoming connections is set to 50 (when the queue is full, new connections are refused).
        System.out.printf("Waiting for client connection on PORT %d \n", PORT);

        // ? Listen for incoming Client connection
        Socket sock = server.accept(); // Once a ServerSocket instance is created, call accept() to start listening for incoming client requests:
        System.out.println("Connection accepted \n");

        //? Read data from client
    }

}
