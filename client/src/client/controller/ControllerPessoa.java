package client.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.Scanner;

import server.Pessoa;
import client.util.ConexaoSocket;
import client.view.ViewPessoa;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerPessoa {

    private Scanner leitura;
    private ViewPessoa viewPessoa;

    public ControllerPessoa(Scanner leitura) {
        this.leitura = leitura;
    }

    public void menuBuscarPessoa() throws UnknownHostException, IOException, ClassNotFoundException {
        String idPessoa = viewPessoa.menuBuscarPessoa();
        System.out.println(buscarPessoa(idPessoa).toString());
    }

    public Pessoa buscarPessoa(String id) {
        System.out.println("| Buscando Pessoa ...");
        Pessoa pessoa = null;
        try (Socket socket = new Socket("172.16.0.249", 4000)) {
            PrintStream saida = new PrintStream(socket.getOutputStream());
            saida.println(id);
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            pessoa = (Pessoa) in.readObject();
            
            System.out.println("+---------------------------------------------------+");
            System.out.println("| id:   " + pessoa.getId());
            System.out.println("| Nome: " + pessoa.getNome());
            System.out.println("| Cpf:  " + pessoa.getCpf());
            System.out.println("+---------------------------------------------------+");
            System.out.println("| DIGITE ENTER PARA CONTINUAR... ");
            leitura.nextLine();
        } catch (IOException ex) {
            Logger.getLogger(ControllerPessoa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoa;
    }

    public void menuNovaPessoa() {

    }

    public void menuPessoa() throws UnknownHostException, IOException, ClassNotFoundException {
        boolean ehSair = false;

        this.viewPessoa = new ViewPessoa(this.leitura);

        while (!ehSair) {
            switch (viewPessoa.menuPessoa()) {
                case "1": {
                    menuNovaPessoa();

                    break;
                }

                case "2": {
                    menuBuscarPessoa();

                    break;
                }

                case "0": {
                    System.exit(0);

                    break;
                }

                default:
                    viewPessoa.menuOpcaoInexistente();
            }
        }
    }

    // GETTERS AND SETTERS
    public Scanner getLeitura() {
        return leitura;
    }

    public void setLeitura(Scanner leitura) {
        this.leitura = leitura;
    }

    public ViewPessoa getViewPessoa() {
        return viewPessoa;
    }

    public void setViewPessoa(ViewPessoa viewPessoa) {
        this.viewPessoa = viewPessoa;
    }
}
