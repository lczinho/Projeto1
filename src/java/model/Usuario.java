package model;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    
    public Usuario(){
    
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

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public boolean isLogged() {
        return (this.nome.equals("user") && this.senha.equals("1234"));
    }

    String getidUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}