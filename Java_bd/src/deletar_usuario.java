
import java.sql.*;
import java.util.Arrays;

/**
 *
 * @author macar
*/
public class deletar_usuario {
    public static String deletar_usuario(char[] usuarioId, String tabela, String id){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Restaurante";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            Statement st = con.createStatement();
            
            String sql = "delete from " + tabela + " where " + id + "=" + usuarioId[1];
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.execute();
            con.close(); 
            return "usuario deletado com sucesso";
        }
        catch(Exception e) {
            System.out.println(e);
            return "erro ao deletar";
        }
    }
}