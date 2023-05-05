package lucas.desafio.conta.corrente;

/**
 *
 * @author lukas
 */
public class Teste {
    public static void main(String[] args) {      
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//        System.out.println(formatter.format(date));
        ContaCorrente conta = new ContaCorrente("Lucas");
        
        conta.sacar(50.0, 1, 2, 2003);
        conta.depositar(50.0, 1, 2, 2003);
        
        System.out.println(conta);
    }
}
