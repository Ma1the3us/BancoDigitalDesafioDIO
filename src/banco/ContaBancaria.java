package banco;
import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria {
    protected int numeroAgencia;
    protected int numeroConta;
    protected double saldo;
    protected static int SEQUENCIAL = 1;
    protected List<Transacao> historico; // lista de transações

    public ContaBancaria(int numeroAgencia, double saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = SEQUENCIAL++;
        this.saldo = saldo;
        this.historico = new ArrayList<>();
    }

    // GETTERS
    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // MÉTODOS ABSTRATOS (para sobrescrever nas subclasses)
    public abstract double transferenciaBancaria(double valor, ContaBancaria Destino);

    public abstract double depositar(double deposito);

    public abstract double sacar(double saque);

    // método para imprimir extrato
    public void imprimirExtrato() {
        System.out.println(
                "Extrato da Conta: " + numeroConta + " - Agência: " + numeroAgencia);
        System.out.println("-----------------------------------");
        for (Transacao t : historico) {
            System.out.println(t);
        }
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println();
    }

}
