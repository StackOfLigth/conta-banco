import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
       
        Scanner leitura = new Scanner(System.in).useLocale(Locale.US); // IMPORT DA CLASSE SCANNER

        //DECLARANDO AS VARIAVEIS
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        Double initDeposito;
        Double initSaldo = 0.0;

        //Entrada de dados
        System.out.println("Olá, Bem-Vindo Para criar sua conta, informe os seguintes dados: ");

        System.out.println("Digite seu nome: ");
        nomeCliente = leitura.nextLine();

        System.out.println("Digite o número da sua agencia: ");
        numeroAgencia = leitura.nextLine();

        System.out.println("Digite o número da sua conta: ");
        numeroConta = leitura.nextInt();

        System.out.println("Digite o valor do depósito inicial: ");
        initDeposito = leitura.nextDouble();

        
        Double saldoAtual = initDeposito + initSaldo;

        //Formatação stiplo templateString
        String mensagem = String.format("Olá %s,\nObrigado por criar uma conta em nosso banco, sua agência é: %s, conta: %d e seu saldo: R$ %.2f já está disponível para saque!", nomeCliente, numeroAgencia, numeroConta, saldoAtual);

        
        
        System.out.println(mensagem);//EXIBIR MENSAGEM
        
        leitura.close(); // Fecha o Scanner após o uso
    }
}