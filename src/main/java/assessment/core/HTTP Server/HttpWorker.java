package assessment.core;

import java.net.Socket;

public class HttpWorker extends Thread {

    Socket socket;
    String clientRequest;

    public HttpWorker(String req, Socket s) {
        socket = s;
        clientRequest = req;
    }

    public void run() {
        
    }
    
}
