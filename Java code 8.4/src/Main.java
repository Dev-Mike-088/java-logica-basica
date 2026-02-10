import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Me informe um número: ");
        int number = sc.nextInt();
        int somaT = soma(number);

        System.out.println("A soma total do seu número é " + somaT);
    }
    public static int soma(int number) {
        int soma = 0;

        for (int i = 1; i <= number; i++) {
            soma += i;
        }

        return soma;
    }
}