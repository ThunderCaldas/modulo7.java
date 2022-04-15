public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public  ContaCorrente(int numero, int agencia, String banco, double saldo,double chequeEspecial) {
        super (numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public double sacar(double valor) {
        System.out.println("Sacando: " + valor);
        if(valor <= getSaldo()+chequeEspecial && getSaldo()+chequeEspecial - valor >0) {
            setSaldo(getSaldo() - valor);
            System.out.println("Operação concluída:");
            System.out.println("Saldo restante com cheque especial:" + getSaldo());
        }else{
            System.out.println("Operação cancelada");
            System.out.println("Saldo restante com cheque especial:" + getSaldo());
        }
      return valor;
    }

    @Override
    public double depositar(double valor) {
        System.out.println("Depositando: " + valor);
        setSaldo(getSaldo() + valor);
        System.out.println("Seu saldo atualizado: " + getSaldo());
        return valor;
    }
}
