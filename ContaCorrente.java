public class ContaCorrente extends Conta implements  Tributos{
    private double chequeEspecial;

    public  ContaCorrente(int numero, int agencia, String banco, double saldo,double chequeEspecial) {
        super (numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }
    public double getChequeEspecial(){
        return chequeEspecial;
    }

    @Override
    public double sacar(double valor) {
        System.out.println("Sacando: " + valor);
        if(valor <= getSaldo()+chequeEspecial && getSaldo()+chequeEspecial - valor >0) {
            setSaldo(getSaldo() - valor);
            System.out.println("Operação concluída:");
            System.out.println("Saldo restante com cheque especial:" + (getSaldo() + getChequeEspecial()));
        }else{
            System.out.println("Operação cancelada");
            System.out.println("Saldo restante com cheque especial:" + (getSaldo() + getChequeEspecial()));
        }
        return getSaldo();
    }


    public double getTributos(){
        double getTributos = (-10);
        return getTributos;
    }

    @Override
    public double depositar(double valor) {
        System.out.println("Depositando: " + valor );
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo total sem tributos: R$" + (getSaldo() + getTributos()));
        System.out.println("Valor total com tributos: R$" + (getSaldo()));
        System.out.println("Valor dos tributos: " + ( - getTributos()));
        return getSaldo();

    }

}
