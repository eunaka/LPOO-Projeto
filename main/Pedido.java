package main;

public class Pedido {
 
ItemCardapio[] itens;
long novoIdRestaurante;
long idRestaurante;
long idCliente;
long idPedido;
    public Pedido (long idRestaurante) {
        this.idRestaurante = idRestaurante;
}
    public void VerificarStatus() {
}
    public ItemCardapio[] getItens () {
    return itens;
} 
    public void setIdRestaurante (long idRestaurante){
    this.idRestaurante = novoIdRestaurante;
}
    public static void main (String[]args) {
        Pedido z = new Pedido (9876);
        
        System.out.println (z.idRestaurante); 
    }
}