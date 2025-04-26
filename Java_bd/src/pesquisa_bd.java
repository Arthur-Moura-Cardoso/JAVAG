import java.sql.*;

/**
 *
 * @author macar
 * 
 */

public class pesquisa_bd {
    public static Object[] pesquisar_tabela(String metodoBusca, String itemBusca, String tabela_busca) {
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Restaurante";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            Statement st = con.createStatement();
                        
            ResultSet resultSet = st.executeQuery( "select * from Clientes");
             if(tabela_busca.equals("funcionarios")) {
                 resultSet = st.executeQuery( "select * from Funcionarios");
             } else if(tabela_busca.equals("pratos")) {
                 resultSet = st.executeQuery( "select * from Pratos");
             }
            String metodoBuscaValor = "";
            
                while(resultSet.next()){
                    if(!tabela_busca.equals("pratos")) {
                        String id = resultSet.getString(1);
                        String cpf = resultSet.getString(2);
                        String nome = resultSet.getString(3);
                        String sexo = resultSet.getString(4);
                        String idade = resultSet.getString(5);
                        String endereco = resultSet.getString(6);
                        String email = resultSet.getString(7);
                        String tel = resultSet.getString(8);
                        String id_filial = "";
                        String cargo = "";

                        if(tabela_busca.equals("funcionarios")) {
                            id_filial = resultSet.getString(9);
                            cargo = resultSet.getString(10);
                        }

                        switch (metodoBusca) {
                            case "id" -> metodoBuscaValor = id;
                            case "cpf" -> metodoBuscaValor = cpf;
                            case "nome" -> metodoBuscaValor = nome;
                        }

                        if(itemBusca.equals(metodoBuscaValor)) {
                            if(tabela_busca.equals("funcionarios")) {
                                Object[] dados = {id, cpf, nome, sexo, idade, endereco, email, tel, id_filial, cargo};
                                return dados;
                            }else if (tabela_busca.equals("clientes")) {
                                Object[] dados = {id, cpf, nome, sexo, idade, endereco, email, tel};
                                return dados;
                            }
                        }
                    }
                    
                        String id = resultSet.getString(1);
                        String nome = resultSet.getString(2);
                        String descricao = resultSet.getString(3);
                        String valor = resultSet.getString(4);
                        
                        switch (metodoBusca) {
                            case "id" -> metodoBuscaValor = id;
                            case "nome" -> metodoBuscaValor = nome;
                        }
                        
                        if(itemBusca.equals(metodoBuscaValor)) {
                            Object[] dados = {id, nome, descricao, valor};
                            return dados;
                        }
                    
                    
                    

                        
  
                    
                }
            
            con.close();
            
        }
        catch(Exception e) {
            System.out.println(e);
        }
        Object[] dados = {"notFound"};
        return dados;
        
    }
}



