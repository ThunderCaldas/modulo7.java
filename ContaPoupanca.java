public class ContaPoupanca extends Conta{
    private double taxaPoupanca;
    private int diaPoupanca;


    public ContaPoupanca(int numero, int agencia, String banco, double saldo, double taxaPoupanca, int diaPoupanca) {
        super(numero, agencia, banco, saldo);
        this.taxaPoupanca = taxaPoupanca;
        this.diaPoupanca = diaPoupanca;
    }


  public double sacar(double valor){
      System.out.println("Sacando: " + valor);        
        setSaldo(getSaldo() - valor);
      System.out.println("Valor restante: " + getSaldo());
      return valor;
        }

    @Override
    public double depositar(double valor) {
        System.out.println("Depositando: " + valor);
        if(diaPoupanca >= 20){
            setSaldo((getSaldo() + valor) * taxaPoupanca);
            System.out.println("Total de rendimento na poupança: " + getSaldo() );
        }else{
            setSaldo(getSaldo()+valor);
            System.out.println("Valor depositado sem rendimento:" + getSaldo());
        }
        return valor;
    }
}
