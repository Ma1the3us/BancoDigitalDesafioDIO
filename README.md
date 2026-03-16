# Banco Digital em Java - Projeto de POO

## Descrição do Projeto
Este projeto é um **banco digital desenvolvido em Java**, criado como desafio da **DIO (Digital Innovation One)** para reforçar conhecimentos em **Programação Orientada a Objetos (POO)**. Ele explora os pilares da orientação a objetos, como **herança, encapsulamento e polimorfismo**, aplicando-os ao contexto bancário.

O projeto simula operações bancárias reais, como **depósitos, saques, transferências**, e inclui **extrato detalhado** com data e hora de cada transação. Além disso, há gerenciamento de **clientes**, que podem possuir uma ou mais contas bancárias.

## Estrutura do Projeto

### Packages e Classes

#### Package `banco`
Contém todas as classes relacionadas às **contas bancárias e transações**:

1. **`ContaBancaria`** *(abstract)*  
   - Classe base para todas as contas bancárias.  
   - Atributos: `numeroAgencia`, `numeroConta`, `saldo`, `historico`.  
   - Métodos abstratos: `transferenciaBancaria`, `depositar`, `sacar`.  
   - Método concreto `imprimirExtrato()` exibe o histórico da conta com valores e datas.  

2. **`ContaCorrente`** *(extends ContaBancaria)*  
   - Permite saques e transferências usando **saldo + limite de crédito**.  
   - Implementa depósitos, saques e transferências, registrando cada transação.  

3. **`ContaPoupanca`** *(extends ContaBancaria)*  
   - Opera apenas com saldo disponível (sem limite de crédito).  
   - Possui método exclusivo `renderJuros()` para aplicar **1% de juros ao mês**.  

4. **`Transacao`**  
   - Representa cada operação financeira (depósito, saque, transferência).  
   - Armazena **tipo de transação, valor e data/hora**.  

#### Package `cliente`
Contém a classe `Cliente`, que representa clientes do banco e suas contas:

1. **`Cliente`**  
   - Atributos: `nome`, `cpf`, lista de `ContaBancaria`.  
   - Permite criar clientes com uma conta inicial e adicionar novas contas depois.  
   - Mantém uma lista estática de todos os clientes cadastrados.  
   - Método `ListaClientes()` exibe todos os clientes do banco.  

## Funcionalidades

- **Gerenciamento de Clientes:** Cadastra clientes e associa contas bancárias.  
- **Depósito:** Adiciona valores às contas e registra no histórico.  
- **Saque:** Retira valores das contas respeitando saldo e limite de crédito.  
- **Transferência:** Move valores entre contas, atualizando saldos e histórico de ambas.  
- **Extrato:** Mostra todas as transações realizadas com data/hora e saldo atual.  
- **Rendimento da Poupança:** Aplica juros mensais na ContaPoupanca.  

## Tecnologias Utilizadas
- **Java SE 8+**  
- Conceitos de **POO**: abstração, herança, polimorfismo, encapsulamento.  

## Repositório do Projeto

   git clone <URL_DO_REPOSITORIO>