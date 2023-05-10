package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
  
  }
}
