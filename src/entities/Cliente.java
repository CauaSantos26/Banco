package entities;

public class Cliente {
    private final int numeroConta;
    private String nome;
    private double saldo;

    // construtor
    public Cliente(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    // construtor = sobrecarga
    public Cliente(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    // metodo depsitar
    public void depositar(double valor) {
        saldo += valor;

    }

    // metodo sacar
    public void sacar(double valor) {
        saldo -= valor + 5.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente:\n"
                + "Numero da Conta: " + numeroConta
                + "\nNome: " + nome
                + "\nsaldo: " + String.format("%.2f", saldo);

    }
}
