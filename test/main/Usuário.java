package main;

public class Usuário {
   
  public String login;
  public String senha;
  public String nome;
  public long id;
  
  
 public Usuário (String login, String senha, String nome, long id) {
     
     this.login = login;
     this.senha = senha;
     this.nome = nome;
     this.id = id;
 }
  
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
}