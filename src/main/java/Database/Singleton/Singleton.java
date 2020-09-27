package Database.Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
	
	private Connection connection = null;

	private String host = "localhost";
	
	private String database = "bethaprogram";
	
	private String url = "jdbc:mysql://" + host + "/" + database;

	private String usuario = "root";

	private String senha = "";

	private Singleton() {
            try {
                connection = DriverManager.getConnection(url, usuario, senha);
            } catch (SQLException e) {
                System.out.println("Erro ao se conectar ao banco, contate o suporte de TI\n" + e.getMessage());
            }
	}
	
	private static Singleton instacia = null;
	
	public static synchronized Singleton getIntancia() {
            if(instacia == null) {
                instacia = new Singleton();
            }
            return instacia;
	}
	
	
	public boolean fecharConexao() {
            if (connection != null) {
                try {
                    connection.close();
                    return true;
                }catch (SQLException e) {
                    System.out.println("Erro ao fechar a conexao com o banco, contate o suporte de TI\n" + e.getMessage());
                }
            }
            return false;
	}
	
}