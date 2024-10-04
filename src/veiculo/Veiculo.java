package veiculo;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private String quantidadeDeRodas;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantidadeDeRodas(String quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.tipo + "\n" +
                " Cor do Veículo: " + this.cor + "\n" +
                " Quantidade de Rodas: " + this.quantidadeDeRodas + "\n";
    }
}
