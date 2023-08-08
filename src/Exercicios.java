import java.util.Scanner;

public class Exercicios {
    //Constante de memória
    static final double cotacaoDolar = 3.5;
    public static void main(String[] args) {
        //Ong recebe doações em dólares
        //A conversão do valor doado em reais

        Scanner entrada = new Scanner(System.in);
        double valorDolar = 0, cotacao, valorReais;
        System.out.println("Digite o valor da doação: $ ");
        valorDolar = entrada.nextDouble();
        System.out.println("Digite a cotação do dolar no dia de hoje: ");
        cotacao = entrada.nextDouble();
        //Usando a variável
        valorReais = valorDolar * cotacao;
        System.out.println("O valor da doação recebida em reais foi de R$ " + valorReais);
        //Usando a constante de memória
        valorReais = valorDolar * cotacaoDolar;
        System.out.println("O valor da doação recebida em reais foi de R$ " + String.format("%.2f", valorReais));
    }
}
