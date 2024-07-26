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

    public Map<String, Pessoa> requisitar(String id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema", "canpse", "1743");
            Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM trigger_table WHERE processed = 0");
            while (resultSet.next()) {
                System.out.println("Trigger activated: " + resultSet.getInt("id"));
                statement.executeUpdate("UPDATE trigger_table SET processed = 1 WHERE id = " + resultSet.getInt("id"));
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new HashMap<String, Pessoa>();
    }
    
}
