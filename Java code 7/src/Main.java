import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 1000;
        int opcao;


        do {
            opcao = mostrarMenu(sc);
            switch (opcao) {
                case 1:
                    mostrarSaldo(saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser depositado:");
                    int deposito = sc.nextInt();
                    saldo = depositar(saldo, deposito);
                    System.out.println("Deposito realizado com sucesso, este é seu novo saldo R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Seu saldo atual é de R$" + saldo);
                    System.out.print("Informe o valor que você deseja sacar:");
                    int saque = sc.nextInt();

                    int saldoS = sacar(saldo, saque);

                    if (saldoS != saldo) {
                        System.out.println("Saque realizado com sucesso, seu novo saldo é de R$" + saldoS + " e o saque realizado foi de R$" + saque);
                        saldo = saldoS;
                    } else {
                        System.out.println("Você não tem saldo suficiente para realizar o saque");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar nosso sistema bancário!!!");
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;
            }

        } while (opcao != 4);
    }

    public static int mostrarMenu(Scanner sc) {
        System.out.println("Bem vindo ao Banco MM, segue abaixo o menu");
        System.out.println("----MENU----");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - sacar");
        System.out.println("4 - sair");
        System.out.print("Me diga o que você deseja fazer:");
        int opcao = sc.nextInt();
        return opcao;
    }

    public static void mostrarSaldo(int saldo) {
        System.out.println("Seu saldo atual é de " + saldo);
    }

    public static int depositar(int saldo, int deposito) {
        return saldo += deposito;
    }

    public static int sacar(int saldo, int saque) {
        if (saque <= saldo) {
            return saldo - saque;
        } else {
            return saldo;
        }
    }


}