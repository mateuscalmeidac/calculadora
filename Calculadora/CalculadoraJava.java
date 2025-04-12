import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar operação
        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        // Ler operação escolhida
        int operacao = scanner.nextInt();

        // Solicitar os números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Realizar a operação escolhida
        if (operacao == 1) {
            System.out.println("Resultado: " + (num1 + num2)); // Soma
        } else if (operacao == 2) {
            System.out.println("Resultado: " + (num1 - num2)); // Subtração
        } else if (operacao == 3) {
            System.out.println("Resultado: " + (num1 * num2)); // Multiplicação
        } else if (operacao == 4) {
            if (num2 != 0) {
                System.out.println("Resultado: " + ((double) num1 / num2)); // Divisão
            } else {
                System.out.println("Erro: divisão por ZERO não pode ser executada!!!");
            }
        } else {
            System.out.println("Opção inválida! Escolha uma operação válida.");
        }

        // Fim da operação calculadora
        scanner.close();  // Fechar o scanner
    }
}