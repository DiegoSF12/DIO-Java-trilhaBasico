import java.util.Scanner;

public class ContaBanco{
        public static void main(String[] args){
                int numero;
                String agencia;
                String nomeCliente;
                double saldo;

                Scanner scan = new Scanner(System.in);
                System.out.println("Olá, seja bem vindo ao banco X!");
                System.out.print("Para começarmos digite o numero da sua conta: ");
                numero = scan.nextInt();
                scan.nextLine();
                System.out.print("Agora digite o numero da agencia: ");
                agencia = scan.nextLine();
                System.out.print("Agora o seu nome: ");
                nomeCliente = scan.nextLine();
                System.out.print("E por ultimo, mas não menos importante, o valor do seu saldo em conta: ");
                saldo = scan.nextDouble();
                System.out.println("\n");
                
                scan.close();


                System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!\n",nomeCliente);
                System.out.printf("Sua agencia é: %s\nConta numero: %d\nValor saldo: R$%.2f\n",agencia, numero, saldo);

                System.out.println("Nós do Banco X, agradecemos a sua preferencia!\n\n");
                
        }
}      