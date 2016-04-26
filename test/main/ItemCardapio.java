package main;

public class ItemCardapio {
    
    long id;
    String nome;
    double preco;
    
        public ItemCardapio (long id, String nome, double preco) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
    }
        public long getId() {
        return id;
    }
        public String getNome() {
        return nome;
    }
        public void setNome(String nome) {
        this.nome = nome;
    }
        public double getPreco() {
        return preco;
    }
        public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public static void main (String[]args) {
        ItemCardapio x = new ItemCardapio (98996269, "frango com pure", 10.0);
        
        System.out.println (x.id);
        System.out.println (x.nome);
        System.out.println (x.preco);
        
    }
}