
public class App {

    public static void main(String[] args) throws Exception {
        ContaBancaria c1 = new ContaBancaria(1001, "Ana Silva", 500.0);
        ContaBancaria c2 = new ContaBancaria(1002, "Carlos Souza", 300.0);

        System.out.printf("Saldo inicial (c1): R$ %.2f\n", c1.getSaldo());
        c1.depositar(150.0);
        System.out.printf("Após depósito de R$150 (c1): R$ %.2f\n", c1.getSaldo());
        boolean saque1 = c1.sacar(700.0);
        System.out.println("Tentativa de saque de R$700 (c1): " + (saque1 ? "sucesso" : "falha"));
        System.out.printf("Saldo final (c1): R$ %.2f\n", c1.getSaldo());

        System.out.println();

        System.out.printf("Saldo inicial (c2): R$ %.2f\n", c2.getSaldo());
        c2.depositar(200.0);
        System.out.printf("Após depósito de R$200 (c2): R$ %.2f\n", c2.getSaldo());
        boolean saque2 = c2.sacar(100.0);
        System.out.println("Tentativa de saque de R$100 (c2): " + (saque2 ? "sucesso" : "falha"));
        System.out.printf("Saldo final (c2): R$ %.2f\n", c2.getSaldo());

    }
}
