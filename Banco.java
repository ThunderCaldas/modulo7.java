public class Banco extends Conta {
    private String cliente;
    private double saldoTotal;

    public Banco(String cliente, int numero, int agencia, String banco, double saldo, double saldoTotal){
        super (numero, agencia, banco, saldo);
        this.cliente = cliente;
        this.saldoTotal = saldoTotal;
    }

    public double saldoTotal(double valor){
        double saldoTotal = getSaldo();
        System.out.println("Saldo total na sua conta é: R$" + saldoTotal);
        return saldoTotal;
    }




    @Override
    public double sacar(double valor) {
        return 0;
    }

    @Override
    public double depositar(double valor) {
        return 0;
    }
}
