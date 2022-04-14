public class Executar {
    public static void main(String[] args) {
        System.out.println("Conta Corrente");
        ContaCorrente cc1 = new ContaCorrente(200);
        cc1.depositar(600);
        cc1.sacar(35);


        System.out.println(" Conta Salario");
        ContaSalario cs1 = new ContaSalario(4);
        cs1.depositar(800);
        cs1.sacar(200);
        cs1.getSaldo();

        System.out.println(" Conta Poupança");
        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.depositar(500);
        cp1.sacar(100);

}
}
