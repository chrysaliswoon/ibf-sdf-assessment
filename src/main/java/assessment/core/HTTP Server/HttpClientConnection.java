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
        dis = new DataInputStream(is);
        os = sock.getOutputStream();
        dos = new DataOutputStream(os);
    }

    public String read() throws IOException {
        return dis.readUTF();
    }

    public void write(String msg) throws IOException {
        dos.writeUTF(msg);
        dos.flush();
    }

    public void close() throws IOException {
        try {
            dis.close();
            is.close();
            dos.close();
            is.close();
            
        } catch (Exception e) {
           System.out.println(e);
        }

    }
}
