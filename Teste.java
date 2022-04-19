
import java.util.Scanner;

public class Teste {



    public static void main(String[] args) throws Exception {

        System.out.println("Qual opção deseja acessar?");

        int opcao;
        do {
            System.out.println("1 - Conta Corrente.");
            System.out.println("2 - Conta Salário.");
            System.out.println("3 - Conta poupança.");
            System.out.println("4 - Saldo total.");
            System.out.println("0 - Sair.");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            process(opcao);
            break;
        } while (opcao != 0);

    }

    public static void process(int opcao) throws Exception {
        ContaCorrente cc = new ContaCorrente(10, 10, "BB", 1000.00, 200);
        ContaSalario cs = new ContaSalario(10, 10, "BB", 1000.00, 3);
        ContaPoupanca cp = new ContaPoupanca(10, 10, "BB", 1000.00, 0.05, 20);


//---------------------------------------- Conta Corrente -----------------------------
        switch (opcao) {
            case 1: {
                System.out.println("Você selecionou Conta Corrente");
                System.out.println("Seu saldo é: R$" + cc.getSaldo());
                System.out.println("Seu cheque especial é: R$" + cc.getChequeEspecial());
                System.out.println("-----------------------------------------------------");
                int opcao1;
                do {
                    System.out.println("------------- Qual operação deseja ------------------");
                    System.out.println(" 1 - Sacar");
                    System.out.println(" 2 - Depositar");
                    System.out.println(" 3 - Transferir para Conta Poupança");
                    System.out.println(" 0 - Sair");
                    Scanner scanner = new Scanner(System.in);
                    opcao1 = scanner.nextInt();

                    process1(opcao1);

                } while (opcao1 != 0);
                break;
            }

//------------------------------------------- Conta Salário -------------------------------------------
            case 2: {
                System.out.println("Você selecionou Conta Salário");
                System.out.println("Seu saldo na Conta Salário: R$" + cs.getSaldo());
                System.out.println("-----------------------------------------------------");

                int opcao2;
                do {
                    System.out.println("------------- Qual operação deseja ------------------");
                    System.out.println(" 1 - Sacar");
                    System.out.println(" 2 - Depositar");
                    System.out.println(" 3 - Transferir para Conta Corrente");
                    System.out.println(" 0 - Sair");
                    Scanner scanner = new Scanner(System.in);
                    opcao2 = scanner.nextInt();

                    process2(opcao2);

                } while (opcao2 != 0);
                break;
            }

//---------------------------------- Conta Poupança  -------------------------------

            case 3: {
                System.out.println("Você selecionou Conta Poupança");
                System.out.println("Seu saldo na Conta Poupança: R$" + cp.getSaldo());
                System.out.println("Taxa de retorno da poupança: " + cp.getTaxaPoupanca());
                System.out.println("-----------------------------------------------------");

                int opcao3;
                do {
                    System.out.println("------------- Qual operação deseja ------------------");
                    System.out.println(" 1 - Depositar");
                    System.out.println(" 2 - Transferir para Conta Corrente");
                    System.out.println(" 0 - Sair");
                    Scanner scanner = new Scanner(System.in);
                    opcao3 = scanner.nextInt();


                    process3(opcao3);
                } while (opcao3 != 0);
                break;

            }
            case 4: {
                System.out.println("Saldo total, somando todas as contas: R$" +
                        (cc.getSaldo() + cp.getSaldo() + cs.getSaldo()));
                break;
            }
        }
    }
    //-----------------------------------------------Conta Corrente Comando CASE

    public static void process1(int opcao1) throws Exception {
        ContaCorrente cc = new ContaCorrente(10, 10, "BB", 1000.00, 200);
        ContaSalario cs = new ContaSalario(10, 10, "BB", 1000.00, 3);
        ContaPoupanca cp = new ContaPoupanca(10, 10, "BB", 1000.00, 0.05, 20);
        switch (opcao1) {

            case 1: {
                System.out.println("Qual o valor deseja sacar :");
                Scanner scanner = new Scanner(System.in);
                double sacar = scanner.nextDouble();
                cc.sacar(sacar);
                break;
            }

            case 2: {
                System.out.println("Qual valor deseja depositar :");
                Scanner scanner = new Scanner(System.in);
                double depositar = scanner.nextDouble();
                cc.depositar(depositar);
                break;
            }

            case 3: {
                System.out.println("Qual valor deseja transferir para a Conta Poupança:");
                Scanner scanner = new Scanner(System.in);
                double transferir = scanner.nextDouble();
                cc.setSaldo(cs.getSaldo() - transferir);
                cp.setSaldo(cc.getSaldo() + transferir);
                System.out.println("Valor atualizado na Conta Corrente: R$" + cc.getSaldo());
                System.out.println("Valor atualizado na Conta Poupança: R$" + (cp.getSaldo() + transferir));
                break;
            }
        }
    }

    //------------------------------------------------ Conta Salário


    public static void process2(int opcao2) throws Exception {
        ContaCorrente cc = new ContaCorrente(10, 10, "BB", 1000.00, 200);
        ContaSalario cs = new ContaSalario(10, 10, "BB", 1000.00, 3);
        ContaPoupanca cp = new ContaPoupanca(10, 10, "BB", 1000.00, 0.05, 20);

        switch (opcao2) {

            case 1:{

                System.out.println("Qual o valor deseja sacar :");
                Scanner scanner = new Scanner(System.in);
                double sacar = scanner.nextDouble();
                cs.sacar(sacar);
                break;
            }

            case 2:{
                System.out.println("Qual valor deseja depositar :");
                Scanner scanner = new Scanner(System.in);
                double depositar = scanner.nextDouble();
                cs.depositar(depositar - cs.getTributos());
                break;
            }

            case 3 : {
                System.out.println("Qual valor deseja transferir para a Conta Corrente:");
                Scanner scanner = new Scanner(System.in);
                double transferir = scanner.nextDouble();
                cs.setSaldo(cs.getSaldo() - transferir);
                cc.setSaldo(cc.getSaldo() + transferir);
                System.out.println("Valor atualizado na Conta Salário: R$" + cs.getSaldo());
                System.out.println("Valor atualizado na Conta Corrente: R$" + cc.getSaldo());
                break;
            }
        }
    }

    //---------------------------------- Conta Poupança  -------------------------------

    public static void process3(int opcao3) throws Exception{
        ContaCorrente cc = new ContaCorrente(10, 10, "BB", 1000.00, 200);
        ContaSalario cs = new ContaSalario(10, 10, "BB", 1000.00, 3);
        ContaPoupanca cp = new ContaPoupanca(10, 10, "BB", 1000.00, 0.05, 20);
        switch (opcao3) {

            case 1: {
                System.out.println("Qual valor deseja depositar :");
                Scanner scanner = new Scanner(System.in);
                double depositar = scanner.nextDouble();
                cp.depositar(depositar);
                break;
            }
            case 2: {
                System.out.println("Qual valor deseja transferir para a Conta Corrente:");
                Scanner scanner = new Scanner(System.in);
                double transferir = scanner.nextDouble();
                cp.setSaldo(cc.getSaldo() - transferir);
                cc.setSaldo(cs.getSaldo() + transferir);
                System.out.println("Valor atualizado na Conta Poupança: R$" + cp.getSaldo());
                System.out.println("Valor atualizado na Conta Corrente: R$" + cc.getSaldo());
                break;
            }
        }
    }
}
