package model;

import java.sql.SQLException;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    
    public Usuario(){
    
    }
    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    
    public Usuario(int cod, String nome, String email, String senha) {
        this.idUsuario = cod;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getCodUsuario() {
        return idUsuario;
    }

    public void setCodUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }   

    public boolean isLogged() throws ClassNotFoundException, SQLException {
        UserDAO udao = new UserDAO();
        Usuario uBanco = udao.listOneUsuario(this.idUsuario);
                
        if(uBanco.getNome()!= null){
            //Nome de usuario encontrado e verifica a senha
            return(this.senha.equals(uBanco.getSenha()));
        }else{
            return false;
        }
        
    }

}