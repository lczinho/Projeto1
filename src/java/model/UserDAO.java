package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
  private static Connection conn;  
  
  public UserDAO() throws ClassNotFoundException, SQLException{
  conn = MyConnection.getConnection();
  }
  
  //Metodos do curd para a tabela exame
  public void insertUsuario(Usuario ex){
  String sql = "INSERT INTO usuario(nome, email, senha)" + "VALUES (?, ?, ?)";
  
  try{
  PreparedStatement prep = conn.prepareCall(sql);
  prep.setString(1, ex.getNome());
  prep.setString(2, ex.getEmail());
  prep.setString(3, ex.getSenha());
  
  prep.execute();
  prep.close();
  
  } catch (SQLException erro){
      System.out.println("Erro no insert: (");
  }
  
  }//fim do insert

  public ArrayList<Usuario> listUsuario() throws SQLException{
      ArrayList<Usuario> list = new ArrayList<>();
      
      String sql = "select * from logins";
     
      PreparedStatement prep = conn.prepareStatement(sql);
      ResultSet result = prep.executeQuery();
      
      while(result.next()){
          Usuario e = new Usuario();
          
          e.setCodUsuario(result.getInt("idUsuario"));
           e.setNome(result.getString("nome"));
            e.setSenha(result.getString("senha"));
             e.setEmail(result.getString("email"));
             
             list.add(e);
      }
      
      return list;
  }//Fim do metodo list
  
  public void deleteUsuario(int id) throws SQLException{
    String sql = "delete from logins where idUsuario = " + id;
    
    PreparedStatement prep = conn.prepareStatement(sql);
    prep.execute();
    prep.close();
  }
  
}//fim da classe
