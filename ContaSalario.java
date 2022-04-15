public class ContaSalario extends Conta{
    private double limiteSaque;

    public ContaSalario(int numero, int  agencia, String banco, double saldo, double limiteSaque){
        super (numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public double sacar(double valor) {

        System.out.println("Realizando saque " + valor);
        if (limiteSaque > 0) {
            setSaldo(getSaldo() - valor);
            limiteSaque--;
            return valor;
        }else {
            System.out.println("Quantidade de saques ultrapassado");

        }
        return 0;
    }

        @Override
    public double depositar(double valor) {
        System.out.println("Depositando: " + valor );
        setSaldo(getSaldo()+valor);
        System.out.println("saldo atual: " + getSaldo());
        return valor;
        }



}
