
package atv1410;


public class Cliente {
    private String nome;
    private String telefone;
    public Cliente(String nome,String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public Cliente(String nome){
        this(nome,"nao informado");
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public double descontoPercentual(){
        return 0;
    }
    public void registrarCompra(double valor){
        
    }
}
