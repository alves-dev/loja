package persistencia;

//import com.microsoft.sqlserver.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexao {

    public static String base = "db_loja";

    private static Connection conexao;
    String usuario = "igor";
    String pass = "igor";

    public conexao() {
        try {              
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //esse é o correto
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ////String url = "jdbc:odbc:myodbc;database="+base+";"+"user="+usuario+";password="+pass; //esse é o correto
            String url = "jdbc:sqlserver://localhost:1433;database="+base+";"+"user="+usuario+";password="+pass;
            //String url = "jdbc:sqlserver://192.168.1.56:1433;database="+base+";"+"user="+usuario+";password="+pass;

            conexao = DriverManager.getConnection(url);
            //System.out.println("conexao ok");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro de conexão. Verifique a Base de Dados indicada !" + "\n" + erro.getMessage(), "Conexão", 3);
            erro.printStackTrace();
        }
    }

    // Mtodos pblicos:
    public Connection getConexao() {
        return conexao;
    }

}
