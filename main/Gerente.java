package main;

public class Gerente extends Usuário {
    
    Restaurante[] restaurantes;
    Cliente[] clientes;
    long restauranteId;
    
    public Gerente (String longin, String senha, String nome, long id) {
        super (login, senha, nome, id);
    
    public Restaurante[] getRestaurantes() {
        return restaurantes;
    }
    public Cliente[] getClientes () {
        return clientes;
    }
    
    public void AdicionarCliente(){
        
    }
    public void AdicionarRestaurante(){
        
    }
    public void adicionarPrato(long restauranteId){
        
    }
    public void removerPrato(long restauranteId){
        
    }
    public void RemoverCliente(){
        
    }
    public void RemoverRestaurante(){
        
    }
    public void ListarClientes(){
        
    }
    public void ListarRestaurantes(){
        
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setRestaurantes(Restaurante[] restaurantes) {
        this.restaurantes = restaurantes;
    }
    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    public static void main (String[]args) {
        Gerente a = new Gerente ("eduardaottoni", "1234", "eduarda ottoni", 9999);
        
        System.out.println (a.login);
        System.out.println (a.senha);
        System.out.println (a.nome);
        System.out.println (a.id);
        
    }
}
