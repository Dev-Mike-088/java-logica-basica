import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quanto dinheiro voçê tem: ");
        int dinheiro = sc.nextInt();

        System.out.print("Digite quanto custa esse tênis: ");
        int tn = sc.nextInt();

        if (dinheiro >= tn){
            int troco = dinheiro - tn;
            System.out.println("Meus parábens voçê pode adquirir este Tênis e seu troco será de R$ " + troco);
        }else{
            System.out.println("Me perdoe voçê não conseguirá comprar este Tênis, poís seu saldo é de R$ " + dinheiro + " e ele custa R$ " + tn);
        }

        sc.close();
    }
}