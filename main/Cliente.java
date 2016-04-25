/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Anna
 */
public class Cliente extends Usuário { 
    
     long[] favoritos;
     ItemCardapio[] carrinho;
    
    
        public Cliente (String login, String senha, String nome, long id) {
            super(login, senha, nome, id);
}
   
    public long[] getFavoritos () {
        return favoritos;
    }
    public ItemCardapio[] getCarrinho () {
        return carrinho;
    }
    
    public String getLogin() {
        return getLogin();
    }
    public String getSenha() {
        return getSenha();
    }
    public String getNome() {
        return getNome();
    }
    public long getId() {
        return getId();
    }
    public void setLogin(String login) {
        this.setLogin(login);
    }
    public void setSenha(String senha) {
        this.setSenha(senha);
    }
    public void setNome(String nome) {
        this.setNome(nome);
    }
    public void setId(long id) {
        this.setId(id);
    }
    public void adicionarNoCarrinho(ItemCardapio item) {
        
    }
    public void removerDoCarrinho(int id){
        
    }
    public void efetuarPedido() {
        
    }
    
    public static void main (String[]args) {
        Cliente e = new Cliente ("eduardaottoni", "1234", "eduarda ottoni", 9999);
        
        System.out.println (e.getLogin());
        System.out.println (e.getSenha());
        System.out.println (e.getNome());
        System.out.println (e.getId());
        
    }
}
