package main;

public class Restaurante extends Usuário {
    
    Pedido[] pedidosEspera;
    ItemCardapio[] cardapio;
    long idRestaurante;
    
    
        public Restaurante (String login, String senha, String nome, long id) {
            super(login, senha, nome, id);
    }
        public Pedido [] getPedidosEspera () {
            return pedidosEspera;
        }
        public ItemCardapio [] getCardapio () {
            return cardapio;
        }
        
        public void listarPedidos () {
            
        }
        public void cancelarPedido () {
            
        }
        public void confirmarEnvio () {
            
        }
        
        public void adicionarPrato (long idRestaurante) {
            
        }
        
        public void removerPrato (long idRestaurante) {
            
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
    public void setCardapio(ItemCardapio[] cardapio) {
        this.cardapio = cardapio;
    }
    public static void main (String[]args) {
        Restaurante y = new Restaurante ("china48", "1234", "china 48", 9999);
        
        System.out.println (y.login);
        System.out.println (y.senha);
        System.out.println (y.nome);
        System.out.println (y.id);
        
    }
}