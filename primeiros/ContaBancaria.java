
import java.util.Scanner;

public class ContaBancaria {

    int numeroConta;
    String nomeTitular;
    double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo= saldo;
    }

    public void sacar( double valor){
        if(saldo>valor){
            saldo -=valor;
            System.out.println("O saldo atual é "+ saldo);
        } else{
            System.out.println("Saldo indisponível");
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("O saldo atual é "+ saldo);
    }

    public void transferir( double valor){
        if(saldo< valor){
            System.out.println("Saldo insuficiente");
        } else{
            saldo -= valor;
            System.out.println("Transferência efetuada com sucesso. \n O saldo autal é "+ saldo);
        }
    }

    public void exibirSaldo(){
        System.out.println("O saldo atual é "+ saldo);
    }

    public void exibirDados(){
        System.out.println("A conta pertence a "+nomeTitular);
        System.out.println("O número da conta é "+ numeroConta);
    }

    /*TESTANDO */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ContaBancaria conta = new ContaBancaria(123, "Jéssica Jones", 100);

        System.out.println("Segue abaixo os detalhes da conta: ");
        conta.exibirDados();

        System.out.println("Escolha a opção que deseja");
        System.out.println("1- Ver saldo, 2- sacar, 3- depositar, 4- transferir");
         int opcao = scanner.nextInt();

         switch (opcao) {
            case 1:
                 conta.exibirSaldo();
                 break;
            case 2:
                System.out.println("Digte o valor para saque:");
                double valor = scanner.nextDouble();
                conta.sacar(valor);
                break;
            case 3:
            System.out.println("Digite o valor para depósito:");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                break;
            case 4:
                System.out.println("Digite o valor para transferência:");
                double valorTransferencia = scanner.nextDouble();
                conta.transferir(valorTransferencia);
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
         
}


