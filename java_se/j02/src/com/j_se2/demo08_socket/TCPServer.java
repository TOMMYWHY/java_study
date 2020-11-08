package com.j_se2.demo08_socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream is =  socket.getInputStream();
        byte[] bytes = new byte[1024];

        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        OutputStream os =  socket.getOutputStream();
        os.write("recieved".getBytes());
        socket.close();
        serverSocket.close();
    }
}
