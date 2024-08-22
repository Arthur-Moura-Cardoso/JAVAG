package bd_java;
import java.sql.*;

public class BD_Java {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bancodedados";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url, username, password);
            
            Statement st = con.createStatement();
            
            ResultSet resultSet = st.executeQuery( "select * from estudante");
            
            while(resultSet.next()){
             System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + resultSet.getInt(3) );
            }
            
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
