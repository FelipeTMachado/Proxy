package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        System.out.println("Servidor Ligando");
        try (ServerSocket serverSocket = new ServerSocket(4000)) {
            System.out.println("Socket aberto");
            ProxyCacheServidor proxy = new ProxyCacheServidor(new ServidorMysql());
            while (true) {
                System.out.println("Esperando por requisição do cliente");
                Socket socket = serverSocket.accept();
                InputStreamReader in = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(in);
                String x;
                ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
                HashMap<String, Pessoa> pessoas = proxy.requisitar();
                
                while ((x = reader.readLine()) != null) {
                    saida.writeObject(pessoas.get(x));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
