package atv1410;

public class ClienteFidelidade extends Cliente {

    private int pontos;

    public ClienteFidelidade(String nome, String telefone, int pontos) {
        super(nome, telefone);
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public double descontoPercentual() {
        if (pontos < 100 && pontos >= 0) {
            return 5;
        } else if (pontos >= 100) {
            return 10;
        } else {
            System.out.println("valor invalido!");
            return 0;
        }
    }

    @Override
    //professor nessa parte eu pesquisei esse "pontos+=(int)valor; confesso q desconhecia essa forma de converter double para int.
    //Aviso!!!! esse comentario é inteiramente humano!!
    public void registrarCompra(double valor) {
        if(valor>0){
            pontos +=(int)valor;
        }
    }
}
