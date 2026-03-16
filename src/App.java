public class App {

    public static void main(String[] args) {

        // Cliente 1 com Conta Corrente
        ContaBancaria contaCorrente1 = new ContaCorrente(123, 456, 1000, 500); // saldo = 1000, crédito = 500
        Cliente cliente1 = new Cliente("Joao", "12345678900", contaCorrente1);

        // Adicionando uma conta poupança ao mesmo cliente
        ContaBancaria contaPoupanca1 = new ContaPoupanca(123, 789, 500);
        cliente1.adicionarConta(contaPoupanca1);

        // Cliente 2 com Conta Poupança
        ContaBancaria contaPoupanca2 = new ContaPoupanca(123, 101, 800);
        Cliente cliente2 = new Cliente("Maria", "98765432100", contaPoupanca2);
        ContaBancaria contaCorrente2 = new ContaCorrente(123, 456, 1000, 500); // saldo = 1000, crédito = 500
        cliente2.adicionarConta(contaCorrente2);
        // Testando
        System.out.println(cliente1.getNome() + " possui " + cliente1.getContas().size() + " contas.");
        System.out.println(cliente2.getNome() + " possui " + cliente2.getContas().size() + " contas.");

        // Operações de teste cliente 2 (Maria)
        contaCorrente2.depositar(200);
        contaPoupanca2.sacar(100);
        ((ContaPoupanca) contaPoupanca2).renderJuros(); // render juros da poupança

        // Operações de teste
        contaCorrente1.depositar(200);
        contaPoupanca1.sacar(100);
        ((ContaPoupanca) contaPoupanca1).renderJuros(); // render juros da poupança

        // Operações de teste
        contaCorrente2.depositar(200);
        contaPoupanca2.sacar(100);
        ((ContaPoupanca) contaPoupanca1).renderJuros(); // render juros da poupança

        System.out.println("Saldo Conta Corrente do João: " + contaCorrente1.getSaldo());
        System.out.println("Saldo Conta Poupança do João: " + contaPoupanca1.getSaldo());
        // Exibindo saldos de Maria
        System.out.println("Saldo Conta Corrente da Maria: " + contaCorrente2.getSaldo());
        System.out.println("Saldo Conta Poupança da Maria: " + contaPoupanca2.getSaldo());


          // --- Transferência ---
        System.out.println("\nJoão transfere 300 para Maria");
        contaCorrente1.transferenciaBancaria(300, contaCorrente2);

        contaCorrente1.imprimirExtrato();
        contaCorrente2.imprimirExtrato();



    }
}