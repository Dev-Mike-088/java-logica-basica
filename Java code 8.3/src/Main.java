import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Me informe um número:");
        int number = sc.nextInt();
        int contadorP = 0;

        boolean vali;

        for (int i = 1; i <= number; i++) {
            vali = ePar(i);
            contadorP += numPar(vali);
            System.out.println(i);
        }

        System.out.println("A quantidade de números pares é de " + contadorP + " Números.");
    }

    public static boolean ePar(int number){
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static int numPar(boolean vali){
        if(vali){
            return + 1;
        }else{
            return 0;
        }
    }
}