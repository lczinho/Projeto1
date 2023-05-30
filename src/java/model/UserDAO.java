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
  
  //Metodos do cruid para a tabela exame
  public void insertUsuario(Usuario ex){
  String sql = "INSERT INTO logins(login, email, senha) VALUES (?, ?, ?)";
  
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
           e.setNome(result.getString("login"));
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
  
  //Atualizar registros do BD
  public void updateUsuario(Usuario ex) throws SQLException{
     String query = "UPDATE logins SET login = ?, "
             + "senha = ?, email = ?"
             + "WHERE idUsuario = ?"; 
     
     
      PreparedStatement prep = conn.prepareCall(query);
      
      prep.setString(1, ex.getNome());
      prep.setString(2, ex.getSenha());
      prep.setString(3, ex.getEmail());
      prep.setInt(4, ex.getCodUsuario());
      
      //Executando query pronta no BD
      prep.execute();
      prep.close();
  }
  
  //Selecionar um registo apenas
  public Usuario listOneUsuario(int i) throws SQLException{
      String query = "Select * FROM logins " + "WHERE idUsuario = " + i;
      
      PreparedStatement prep =  conn.prepareCall(query);
      ResultSet result = prep.executeQuery();
     
      Usuario ex = new Usuario();
      if(result.next()){
          ex.setCodUsuario(result.getInt("idUsuario"));
          ex.setNome(result.getString("login"));
          ex.setSenha(result.getString("senha"));
          ex.setEmail(result.getString("email"));
      }
      
      return ex;
}
  
}//fim da classe
