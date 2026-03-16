package cliente;
import banco.ContaBancaria;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<ContaBancaria> contas;

    // Construtor que recebe uma conta inicial
    public Cliente(String nome, String cpf, ContaBancaria contaInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
        this.contas.add(contaInicial); // ✅ adiciona a conta recebida
    }

    // Método para adicionar outras contas depois
    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }
}