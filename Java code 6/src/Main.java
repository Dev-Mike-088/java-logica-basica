import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do{
            System.out.print("Deseja comprar o produto? Se sim digite 1; Não digite 2:");
            opcao = sc.nextInt();
            if(opcao == 1){
                System.out.print("Qual seu saldo:");
                int saldo = sc.nextInt();

                System.out.print("Qual o valor do Produto:");
                int valorProduto = sc.nextInt();

                int troco = comprar(saldo, valorProduto);

                if(troco != saldo){
                    System.out.println("Compra realizada com sucesso, seu saldo é de " + troco);
                }else{
                    System.out.println("Compra não efetuada!!!");
                }
            }else if (opcao == 2) {
                System.out.println("Obrigado por visitar nosso sistema!!");
            }else{
                System.out.println("Numero digitado não corresponde ao nosso sistema!!!!");
            }
        }while(opcao != 2);
    }
    public static int comprar(int saldo, int valorProduto) {
        if (saldo >= valorProduto) {
            return saldo - valorProduto;
        }else {
            return saldo;
        }
    }
}