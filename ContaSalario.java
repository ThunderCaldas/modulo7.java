public class ContaSalario extends Conta implements Tributos{
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
            System.out.println("Operação concluída:");
            System.out.println("Saldo restante:" + getSaldo());
            return valor;
        }else {
            System.out.println("Quantidade de saques ultrapassado");

        }
        return 0;
    }

        @Override
        public double getTributos(){
            double getTributos = (10);
            return getTributos;
        }

    @Override
    public double depositar(double valor) {
        System.out.println("Depositando: " + valor );
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo total sem tributos: R$" + getSaldo());
        System.out.println("Valor dos tributos: " + getTributos());
        System.out.println("Valor total com tributos: R$" + (getSaldo() - getTributos()));
        return valor;
        }
}
