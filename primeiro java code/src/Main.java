public class Main{
    public static void main(String[] args){
        int dinheiro = 769;
        int tn = 269;

        if (dinheiro >= tn){
            int din = dinheiro - tn;

            System.out.println("Meus parábens voçê comprou seu tn e tem um saldo de R$"+ din);
        } else {
            System.out.println("Voçê não conseguirá comprar o tn pois seu saldo é de R$"+dinheiro+" e o preço do tn é igual à R$"+tn);
        }
    }

}