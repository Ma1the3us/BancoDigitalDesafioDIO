package banco;
public class ContaCorrente extends ContaBancaria {

    private double credito = 1000; // limite de crédito

    public ContaCorrente(int numeroAgencia, double saldo) {
        super(numeroAgencia, saldo);
        
    }

    @Override
    public double transferenciaBancaria(double valor, ContaBancaria contaDestino) {
    if (valor > 0 && valor <= saldo + credito) { // saldo + crédito para ContaCorrente
        saldo -= valor; // debita da conta atual
        contaDestino.saldo += valor; // credita na conta destino

        historico.add(new Transacao("Transferência enviada", valor));
        contaDestino.historico.add(new Transacao("Transferência recebida", valor));

    } else {
        System.out.println("Saldo insuficiente para transferência");
    }
    return saldo;
}

    @Override
    public double depositar(double deposito) {
        if (deposito <= 0) {
            System.out.println("Por favor, selecione uma quantia válida para depósito");
        } else {
            saldo += deposito;
            historico.add(new Transacao("Deposito", deposito));
        }
        return saldo;
    }

    @Override
    public double sacar(double saque) {
        if (saque <= 0 || saque > saldo + credito) {
            System.out.println("Selecione um valor válido para saque");
        } else {
            saldo -= saque;
            historico.add(new Transacao("Saque", saque));
        }
        return saldo;
    }
}