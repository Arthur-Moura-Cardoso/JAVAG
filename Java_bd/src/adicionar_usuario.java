
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macar
 */
public class adicionar_usuario {
    
    public static String adicionar_usuario(String[] usuario){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Restaurante";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            Statement st = con.createStatement();
            
            String sql;
            if(usuario[0].equals("cliente") ){
                sql = "insert into Clientes (CPF, Nome, Sexo, Idade, Endereco, Email, Telefone) values(?,?,?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, usuario[1] /*cpf*/);
                stmt.setString(2, usuario[2] /*nome*/);
                stmt.setString(3, usuario[3] /*sexo*/);
                stmt.setString(4, usuario[4] /*idade*/);
                stmt.setString(5, usuario[5] /*endereco*/);
                stmt.setString(6, usuario[6] /*email*/);
                stmt.setString(7, usuario[7] /*tel*/);
                stmt.execute();
                return "Cliente cadastrado com Sucesso !";
            }
            if(usuario[0].equals("funcionario") ){
                sql = "insert into Funcionarios (CPF, Nome, Sexo, Idade, Endereco, Email, Telefone, Cargo) values(?,?,?,?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, usuario[1] /*cpf*/);
                stmt.setString(2, usuario[2] /*nome*/);
                stmt.setString(3, usuario[3] /*sexo*/);
                stmt.setString(4, usuario[4] /*idade*/);
                stmt.setString(5, usuario[5] /*endereco*/);
                stmt.setString(6, usuario[6] /*email*/);
                stmt.setString(7, usuario[7] /*tel*/);
                stmt.setString(8, usuario[8] /*cargo*/);
                stmt.execute();
                return "Funcionario cadastrado com Sucesso !";
            }
            
            if(usuario[0].equals("pratos") ){
                sql = "insert into Pratos (Nome, Descricao, Valor) values(?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, usuario[1] /*nome*/);
                stmt.setString(2, usuario[2] /*descricao*/);
                stmt.setString(3, usuario[3] /*valor*/);

                stmt.execute();
                return "Prato cadastrado com Sucesso !";
            }
            
            
            con.close();
            return "Erro";
        }
        catch(Exception e) {
            System.out.println(e);
            return "erro ao cadastrar";
        }
    }
}
