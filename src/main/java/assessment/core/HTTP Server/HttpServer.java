package assessment.core;

import java.io.*;
import java.net.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
this is the main web server class
 */

public class HttpServer {

    public void startServer(Integer PORT) throws IOException {

        try {
            // ? Set up the server socket and listen to a port number
            ServerSocket server = new ServerSocket(PORT); // creates a server socket that is bound to the specified port
                                                          // number. The maximum number of queued incoming connections
                                                          // is set to 50 (when the queue is full, new connections are
                                                          // // refused).
            System.out.println("Web Server is starting up, listening at port " + PORT + ".");
            System.out.println("You can access http://localhost:" + PORT + " now.");

            while (true) {
                // ? Make the server socket wait for the next client request
                Socket socket = server.accept(); // Once a ServerSocket instance is created,
                System.out.printf("Connected to PORT: %d \n", PORT);

                // ? Local reader from the client
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                // ? Assign http requests
                String req = "";
                String clientRequest = "";
                while ((clientRequest = reader.readLine()) != null) {
                    if (req.equals("")) {
                        req = clientRequest;
                    }
                    if (clientRequest.equals("")) {
                        break;
                    }
                }
                if (req != null && !req.equals("")) {
                    System.out.println("start new HttpWorker");
                    // StringBuilder sbHtml = new StringBuilder();
                    // sbHtml.append("<!DOCTYPE html>");
                    // sbHtml.append("<html>");
                    // sbHtml.append("<head>");
                    // sbHtml.append("</head>");
                    // sbHtml.append("<body>");
                    // sbHtml.append("<h1>Hello World!</h1>");
                    // sbHtml.append("<img src= " + link + ">");
                    // sbHtml.append("<p>This is a test</p>");
                    // sbHtml.append("<hr>");
                    // sbHtml.append("<p>*This page is returned by Web Server.</p>");
                    // sbHtml.append("</body>");
                    // sbHtml.append("</html>");
                    // String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + sbHtml;
                    // socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));

                    break;

                }
            }

        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        } finally {
            System.out.println("Server has been shutdown!");

        }

    }

}
