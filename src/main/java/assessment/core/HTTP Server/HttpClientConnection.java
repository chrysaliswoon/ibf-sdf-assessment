package assessment.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 this class handles the the  request and 
 response communication between the server 
 and a client (browser)
 */

public class HttpClientConnection {
    private InputStream is;
    private DataInputStream dis;
    private OutputStream os;
    private DataOutputStream dos;

    public HttpClientConnection(Socket sock) throws IOException {
        is = sock.getInputStream();
        dis = new DataInputStream(is); // For incoming stream
        os = sock.getOutputStream();
        dos = new DataOutputStream(os); // For outgoing stream
    }

    // ? Wait for response from server
    public String read() throws IOException {
        return dis.readUTF();
    }

    //? 
    public void write(String msg) throws IOException {
        dos.writeUTF(msg);
        dos.flush(); // To make sure the data sends
    }
    

    //? Close the streams & socket
    public void close() throws IOException {
        is.close();
        os.close();
    }
}
