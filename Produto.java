package atv1410;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.estoque = estoque;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 10);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("preço invalido!");
        }
        else{
            System.out.println("preço valido!");
            this.preco = preco;
        }
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getEstoque(){
        return estoque;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public boolean baixarEstoque(int quantidade){
        if(quantidade > 0 && estoque>=quantidade){
            estoque-=quantidade;
            System.out.println("concluido açao de baixar estoque!");
            return true;
        }else{
            System.out.println("quantidade invalida!");
            return false;
        }
    }
}
