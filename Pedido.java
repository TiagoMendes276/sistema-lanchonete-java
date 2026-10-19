package atv1410;

import java.util.ArrayList;

public class Pedido {

    private Cliente cliente;
    private ArrayList<itemPedido> itens;
    private double taxaEntrega;
    //pra fazer essa parte eu pesquisei muita coisa pois faltei a ultima aula e fiquei totalmente perdido em como fazer o codigo.
    //mas com a pesquisa eu aprendi como tudo funciona(eu acho).

    public Pedido(Cliente cliente, double taxaEntrega) {
        this.cliente = cliente;
        this.taxaEntrega = taxaEntrega;
        this.itens = new ArrayList<>();
    }

    public Pedido(Cliente cliente) {
        this(cliente, 5.00);
    }

    public boolean adicionarItem(Produto produto, int quantidade) {
    if (produto.baixarEstoque(quantidade)) {
        itens.add(new itemPedido(produto, quantidade));
        return true;
    } else {
        System.out.println("Pedido recusado: estoque insuficiente.");
        return false;
    }
}
    public double valorTotal(){
        double subtotal = 0;
        for(itemPedido item : itens){
            subtotal += item.subtotal();
        }
        double desconto = subtotal * cliente.descontoPercentual()/100;
        return subtotal - desconto + taxaEntrega;       
    }
    public void finalizar(){
        cliente.registrarCompra(valorTotal());
    }
    public void exibirResumo(){
        double subtotal = 0;
        System.out.println("Cliente: "+cliente.getNome());
        System.out.println("itens do pedido: ");
        for(itemPedido item : itens){
            System.out.printf("%s x%d - R$ %.2f%n", item.getProduto().getNome(), item.getQuantidade(), item.subtotal());
            subtotal+=item.subtotal();
        }
        double desconto = subtotal * cliente.descontoPercentual()/100;
        double total = subtotal - desconto + taxaEntrega;
        System.out.printf("desconto: R$ %.2f%n",desconto);
        System.out.printf("taxa de entrega: R$ %.2f%n",taxaEntrega);
        System.out.printf("total: R$ %.2f%n",total);
        
    }
}
