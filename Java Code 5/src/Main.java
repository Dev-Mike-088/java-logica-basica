import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.print("Me diga quanto voçê tem:");
        int dinheiro = sc.nextInt();

        System.out.print("Qual o valor do tênis:");
        int tn = sc.nextInt();

        if(dinheiro > 0) {
            do {

                opcao = mostrarMenu(sc);

                if (opcao == 1) {
                    System.out.println("Seu saldo é de R$ " + dinheiro);

                } else if (opcao == 2) {
                    System.out.println("O valor atual do tênis é de R$ " + tn);

                } else if (opcao == 3) {
                    int troco = dinheiro - tn;
                    if(troco >= 0) {
                        System.out.println("Meus parábens por sua aquisição no valor de R$ " + tn + " o seu saldo atual é de " + troco);
                        dinheiro = troco;
                    } else {
                        System.out.println("Você não tem saldo siuficiente");
                    }
                } else if (opcao == 4) {
                    System.out.print("Informe o valor que deseja inserir:");
                    int valor = sc.nextInt();
                    dinheiro += valor;
                    System.out.println("Seu novo saldo é R$" + dinheiro);

                }else if (opcao == 5) {
                    System.out.println("Obrigado por visitar nossa loja");

                }else {
                    System.out.println(" Opção Inválida, retorne meu caro");

                }

                System.out.println();

            } while (opcao != 5);

        }else {
            System.out.println("Voçê não tem saldo!!!!");
        }


        sc.close();
    }
    public static int mostrarMenu(Scanner sc){
        System.out.println("------MENU------");
        System.out.println("1: Ver saldo");
        System.out.println("2: Ver valor do tênnis");
        System.out.println("3: Comprar o tênis");
        System.out.println("4: Inserir mais dinheiro");
        System.out.println("5: Sair");
        System.out.print("Escolha uma opção:");

        int opcao = sc.nextInt();
        return opcao;
    }

}