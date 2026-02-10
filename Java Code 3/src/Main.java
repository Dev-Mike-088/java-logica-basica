import java.util.Scanner;


public class Main{
    public static void main(String[] args){

           Scanner sc = new Scanner(System.in);
           boolean continuar = true;


           while(continuar){

               System.out.print("Quanto dinheiro voçê tem:");
               int dinheiro = sc.nextInt();

               System.out.print("Quanto custa o tênis:");
               int tn = sc.nextInt();

               if(dinheiro >= tn){
                   int troco = dinheiro - tn;
                   System.out.println("Meus parábens por sua aquisição, seu troco será de " + troco);
                   continuar = false;
               }else{
                   System.out.println("Me perdoe voçê não tem saldo suficiente =" + dinheiro + " o tênis custa cerca de " + tn);

                   System.out.print("Deseja tentar novamente? (1 = sim, senão digite qualquer número):");
                   int opcao = sc.nextInt();

                   if (opcao != 1) {
                       continuar = false;
                   }
               }
           }
           sc.close();
         }

    }
