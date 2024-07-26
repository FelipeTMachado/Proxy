package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        System.out.println("SERVER");
        try (ServerSocket serverSocket = new ServerSocket(4000)) {
            while (true) {
                Socket socket = serverSocket.accept();
                InputStreamReader in = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(in);
                String x;
                ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
                while ((x = reader.readLine()) != null) {
                    System.out.println("voltou otario");
                    System.out.println("Servidor: " + x);
                    saida.writeObject(new Pessoa("", "", "", "000000000000"));
                    System.out.println("voltou otario 2");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
