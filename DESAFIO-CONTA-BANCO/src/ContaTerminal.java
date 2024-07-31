import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero; 
        String agencia; 
        String nome; 
        double saldo = 237.48;
        
System.out.println("Por Favor, digite seu nome: ");
 nome = scanner.next();

 System.out.println("Por Favor, digite sua Agencia: ");
 agencia = scanner.next();


 
 System.out.println("Por Favor, digite o número da sua agencia: ");
 numero = scanner.nextInt();

 System.out.println("Olá "+ nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+ " e seu saldo "+saldo+ " já está disponível para saque");
    }
    
}
