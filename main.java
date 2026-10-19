package atv1410;

public class main {
    public static void main(String[] args) {
        Produto hamburguer = new Produto("Hamburguer", 20.00, 20);
        Produto batata = new Produto("Batata frita", 10.00, 15);
        Produto refrigerante = new Produto("Refrigerante", 5.00, 8);

        System.out.println("===== CENARIO 1: CLIENTES DIFERENTES =====");

        Cliente comum = new Cliente("Carlos", "62999990000");
        Pedido pedidoComum = new Pedido(comum);

        pedidoComum.adicionarItem(hamburguer, 2);
        pedidoComum.adicionarItem(refrigerante, 2);
        pedidoComum.exibirResumo();
        pedidoComum.finalizar();

        ClienteFidelidade fiel = new ClienteFidelidade("Ana", "62988880000", 12);
        Pedido pedidoFiel = new Pedido(fiel);

        pedidoFiel.adicionarItem(hamburguer, 2);
        pedidoFiel.adicionarItem(refrigerante, 2);
        pedidoFiel.exibirResumo();
        pedidoFiel.finalizar();

        System.out.println("\n===== CENARIO 2: FIDELIDADE =====");

        ClienteFidelidade cliente98 = new ClienteFidelidade("Pedro", "62977770000", 98);
        Pedido pedido1 = new Pedido(cliente98);

        pedido1.adicionarItem(batata, 1);
        pedido1.exibirResumo();
        pedido1.finalizar();

        System.out.println("Pontos apos a primeira compra: " + cliente98.getPontos());

        Pedido pedido2 = new Pedido(cliente98);

        pedido2.adicionarItem(batata, 1);
        pedido2.exibirResumo();
        pedido2.finalizar();

        System.out.println("Pontos apos a segunda compra: " + cliente98.getPontos());

        System.out.println("\n===== CENARIO 3: ESTOQUE INSUFICIENTE =====");

        Produto pizza = new Produto("Pizza", 35.00, 3);
        Pedido pedidoEstoque = new Pedido(comum);

        System.out.println("Estoque inicial da pizza: " + pizza.getEstoque());

        pedidoEstoque.adicionarItem(pizza, 5);

        System.out.println("Estoque apos tentativa: " + pizza.getEstoque());

        System.out.println("\n===== CENARIO 4: ESTOQUE FINAL =====");

        System.out.println(hamburguer.getNome() + ": " + hamburguer.getEstoque() + " unidades");
        System.out.println(batata.getNome() + ": " + batata.getEstoque() + " unidades");
        System.out.println(refrigerante.getNome() + ": " + refrigerante.getEstoque() + " unidades");
        System.out.println(pizza.getNome() + ": " + pizza.getEstoque() + " unidades");
    }
}
