package br.com.sistema.model;

public class Produto extends ItensDoPedido {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nNome: " +nome+
                "\nPreço: R$"+preco+ "\n"
                ;

    }
}

