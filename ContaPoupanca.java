public class ContaPoupanca extends Conta{
    private double valorPoupanca;

    public double valorPoupanca(double valorPoupanca) {
        this.valorPoupanca = valorPoupanca;
        return valorPoupanca;
    }


    @Override
    public double sacar(double valor) {
        System.out.println("Valor acumulado: R$" + valorPoupanca );
        System.out.println("Sacar: R$" + valor);
        setSaldo(getSaldo() - valor);
        System.out.println("Saldo Atual: R$" + (valorPoupanca + getSaldo()));
        return valor;
    }

    @Override
    public double depositar(double valor) {
        System.out.println("Depositar: R$" + valor);
        setSaldo(getSaldo() + valor);
        System.out.println("Salto Atual: R$" + (valorPoupanca + getSaldo()));
        return valor;

    }
}
