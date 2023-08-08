import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //A quilometragem no inicio da viagem - E
        //A quilometragem no posto de gasolina - E
        //Quantos litros foram abastecidos - E
        //Calcular (P) e exibir (S) a média de quilometros por litros
        Scanner entrada = new Scanner(System.in);
        double kmInicio, kmPosto, qtdLitros, consumo;
        System.out.println("Digite a km no início da viagem: ");
        kmInicio = entrada.nextDouble();
        System.out.println("Digite a km no posto de gasolina: ");
        kmPosto = entrada.nextDouble();
        System.out.println("Digite quantos litros foram abastecidos: ");
        qtdLitros = entrada.nextDouble();
        consumo = (kmPosto - kmInicio) / qtdLitros;
        System.out.println("Nessa viagem o veículo consumiu " + String.format("%.1f", consumo) + "km/l");
    }
}
