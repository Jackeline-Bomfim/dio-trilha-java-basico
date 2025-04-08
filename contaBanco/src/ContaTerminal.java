



public class ContaTerminal extends Conta {
    public static void main(String[] args) throws Exception {

        System.out.println("Digite o número da Conta: ");
        int conta = Integer.parseInt(System.console().readLine());    
        System.out.println("Digite o número da Agência: ");
        String agencia = System.console().readLine();     
        System.out.println("Digite o nome do Nome do Cliente: ");
        String nome = System.console().readLine(); 
        System.out.println("Digite o saldo da Conta: ");
        double saldo = Double.parseDouble(System.console().readLine());

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }   
}
