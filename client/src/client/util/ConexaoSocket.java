package client.util;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConexaoSocket {

    private static ConexaoSocket instance;
    private Socket socket;

    private ConexaoSocket() {

    }

    public static ConexaoSocket getInstance() {
        if (instance == null) {
            instance = new ConexaoSocket();
        }

        return instance;
    }

    public Socket conectar() throws UnknownHostException, IOException {
        if (socket != null) {
            return socket;
        }
        return new Socket("172.16.0.20", 4000);
    }

    public Socket conexao() {
        return socket;
    }

}
