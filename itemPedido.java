
package atv1410;

public class itemPedido {
    private Produto produto;
    private int quantidade;
    public itemPedido(Produto produto,int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public Produto getProduto(){
        return produto;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public double subtotal(){
        return produto.getPreco() * quantidade;
    }
}
