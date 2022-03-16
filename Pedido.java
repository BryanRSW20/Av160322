package br.com.sistema.model;

import java.util.ArrayList;

public class Pedido {
    private String descricao;
    private String data;
    private double total;
    private ArrayList< ItensDoPedido> itens;

    public Pedido(){
        itens = new ArrayList<>();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setItens(Produto produto, int qtde){
        ItensDoPedido itensDoPedido = new ItensDoPedido();
        itensDoPedido.setProduto(produto);
        itensDoPedido.setQtde(qtde);

        itens.add(itensDoPedido);

        total += produto.getPreco() * qtde;

    }


    @Override
    public String toString() {
        return "Pedido" +
                "\nDescrição: " +descricao+
                "\nData: " +data+
                "\nItens do Pedido: "+itens   ;
    }
}
