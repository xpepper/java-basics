package it.bemyeye.learn.io.network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String args[]) {
        int port = 12345;

        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            System.out.println("Server accepting connections at port " + port);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        while (true) {
            try(Socket socket = server.accept()) {
                System.out.println("Accepted connection!");
                OutputStream outputStream = socket.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
                writer.write("Hello Net World!\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
