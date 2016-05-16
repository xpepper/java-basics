package it.bemyeye.learn.io.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
    public static void main(String args[]) {
        int port = 12345;
        String host = "127.0.0.1";
        try (Socket socket = new Socket(host, port)) { // try with resources
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
        } catch (ConnectException | UnknownHostException e) {
            System.err.println("OMG! Error in the connection: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("OMG! Generic IO error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
