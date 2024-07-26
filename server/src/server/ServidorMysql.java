package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * @since 25/07/2024
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class ServidorMysql implements Servidor {

    public HashMap<String, Pessoa> requisitar() {
        HashMap<String, Pessoa> pessoas = new HashMap<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://172.16.3.7:3308/sistema", "root", "senha");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM pessoa");
            System.out.println("chegou aqui");
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String nome = resultSet.getString("nome");
                String cpf = resultSet.getString("cpf");
                Pessoa pessoa = new Pessoa(nome, id, "M", cpf);
                pessoas.put(id, pessoa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pessoas;
    }

}
