import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Me informe um número inteiro:");
        int number = sc.nextInt();
        int contador = 0;
        for(int i = 0; i <= number; i++){
            System.out.println(i);
            contador += 1;
        }
        System.out.println("Existe "+ contador + " Números nesta sequencia");


    }
}