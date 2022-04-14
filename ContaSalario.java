public class ContaSalario extends Conta{
    private double limiteSaque;

    public ContaSalario(double limiteSaque){
        this.limiteSaque =  limiteSaque;
        }

    @Override
    public double sacar(double valor) {
        if (limiteSaque <= 4) {
            System.out.println("Realizando saque: R$" + valor);
            return valor;
        } else {
            System.out.println("Quantidade de saques ultrapassado");
        }
        return 0.0;
    }

    public double depositar(double valor){
        System.out.println("Depositando: R$" + valor);
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo atual: R$" + getSaldo());
        return valor;
    }

}
