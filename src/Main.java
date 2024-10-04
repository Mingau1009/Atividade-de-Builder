import pizza.Pizza;
import pizza.PizzaBuilder;
import relatorio.Relatorio;
import relatorio.RelatorioBuilder;
import veiculo.Veiculo;
import veiculo.VeiculoBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pizzas");
        System.out.println();
        Pizza pizzaDeFrango =new PizzaBuilder()
                .setMassa("massa normal")
                .setTamanho("Grande")
                .setIngredientes("Presunto, mussarela, frango, oregano, cheddar")
                .build();

        Pizza pizzaDeEstrogonorve = new PizzaBuilder()
                .setMassa("Massa padrão")
                .setTamanho("Grande")
                .setIngredientes("Mussarela, presunto, estrogonofe, batata palha")
                .build();
        System.out.println(pizzaDeFrango.toString());
        System.out.println(pizzaDeEstrogonorve.toString());

        System.out.println("Veiculos");
        System.out.println();
        Veiculo moto = new VeiculoBuilder()
                .setTipo("Moto")
                .setCor("Azul")
                .setQuantidadeDeRodas("2 rodas")
                .build();

        Veiculo GT3 = new VeiculoBuilder()
                .setTipo("Carro corrida")
                .setCor("Branco")
                .setQuantidadeDeRodas("4 rodas")
                .build();
        System.out.println(moto.toString());
        System.out.println(GT3.toString());

        System.out.println("Relatório");
        System.out.println();

        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Meu primeiro amor")
                .setCorpo("Ela foi como a vida, que me ilumina, e me leva ao nascer.")
                .setRodape("Fontes da minha cabeça")
                .build();
        System.out.println(relatorio.toString());



    }
}