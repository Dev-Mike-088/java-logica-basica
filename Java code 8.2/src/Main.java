import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("me informe um número seu lindo:");
        int number = sc.nextInt();
        int contadorP = 0;
        int contadorI = 0;

        for (int i = 1; i <= number; i++) {
            if(i % 2 == 0){
                System.out.println("Esse número é par " + i);
                contadorP += 1;
            }else{
                System.out.println("Esse número é ímpar " + i);
                contadorI += 1;
            }
        }
        System.out.println("Voçê tem " + contadorP + " números pares e " + contadorI + " números ímpares");
    }
}