package br.com.sistema.model;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private String data;
    private ArrayList< Cliente > cliente;

    public void setCliente(String nome, String cpf, String telefone, String email) {
        this.cliente = cliente;
    }

    public void setCliente(ArrayList< Cliente > cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList< Cliente > getCliente() {
        return cliente;
    }

    public Evento(String nome, String data, ArrayList< Cliente > cliente) {
        this.nome = nome;
        this.data = data;
        this.cliente = cliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    @Override
    public String toString() {
        return "Evento" +
                "\nNome: " +nome+
                "\nData: " +data+
                "\nClientes: \n" +cliente;
    }
}
