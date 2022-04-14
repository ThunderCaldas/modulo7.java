public class ContaCorrente extends Conta {
    private final double valorInicialChequeEspecial;
    private double valorChequeEspecial;
    private Math Match;

    public ContaCorrente(double valorInicialChequeEspecial) {
        this.valorInicialChequeEspecial = valorInicialChequeEspecial;
    }

    public double sacar(double valor) {
        System.out.println("Sacando: " + valor);
        if (valor <= (getSaldo() + valorChequeEspecial)) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saldo atual: " + getSaldo());

            if (getSaldo() < 0) {
                System.out.println("Valor restante do cheque especial: " + getvalorChequeEspecial());
            }
            return valor;
        } else {
            System.out.println("Cheque especial indisponível para esse saque.");
        }
        return 0.0;
    }

    public double depositar(double valor) {
        System.out.println("Depositando: " + valor);
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo atual: " + getSaldo());

        return valor;
    }

    private double getvalorChequeEspecial() {
        double valorChequeEspecial = 100;
        if (getSaldo() < 0)
            return valorChequeEspecial - Match.abs(getSaldo());
        else
            return valorChequeEspecial;

    }
    }
