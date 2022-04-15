public class Teste {

    public static void main(String[] args){

       ContaSalario cs = new ContaSalario(23,12,"AA", 1000.00,2);
       cs.sacar(500);
       cs.sacar(500);
        cs.depositar(250);
       System.out.println(cs);

   ContaCorrente cc = new ContaCorrente(10,10,"BB", 1000.00, 200);
        cc.sacar(200);
       cc.depositar(700);

       ContaPoupanca cp = new ContaPoupanca(20,20,"CC",1000.00,00.05,20);
        cp.sacar(300);
        cp.depositar(500);

    }
}
