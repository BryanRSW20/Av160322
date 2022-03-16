package br.com.sistema.model;

public class ItensDoPedido{
    private Produto produto;
    private int qtde;


    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "Produto: " +produto+
                "\n Quantidade: " + qtde
                ;

    }

}

