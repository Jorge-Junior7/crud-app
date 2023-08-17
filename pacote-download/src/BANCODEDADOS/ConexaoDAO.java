package BANCODEDADOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "A3servidor";

    public static Connection conectaBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao obter conexão com o banco de dados", ex);
        }
    }

}
