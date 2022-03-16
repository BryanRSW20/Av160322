package br.com.sistema;

import br.com.sistema.model.Pedido;
import br.com.sistema.model.Produto;



public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Batata" , 20);
        Produto produto2 = new Produto("Feijão", 15);
        Produto produto3 = new Produto("Ervilha", 5);
        Produto produto4 = new Produto("Chocolate", 8);
        Produto produto5 = new Produto("TV", 1500);
        Produto produto6 = new Produto("Controle Remoto" , 20);
        Produto produto7 = new Produto("Drone" , 2900);
        Produto produto8 = new Produto("Katana", 10000);
        Produto produto9 = new Produto("Salgadinho", 5);
        Produto produto10 = new Produto("Cerveja", 6);
        Produto produto11 = new Produto("Cachorro-Quente", 15);
        Produto produto12 = new Produto("Arroz", 8);
        Produto produto13 = new Produto("Milho", 5);
        Produto produto14 = new Produto("Leite", 4);
        Produto produto15 = new Produto("PiStation 3,14", 1900);
        Produto produto16 = new Produto("Controle TripleShock Pi" , 280);
        Produto produto17 = new Produto("Banana" , 4);
        Produto produto18 = new Produto("Canivete Suíço", 100);
        Produto produto19 = new Produto("Coxinha", 3);
        Produto produto20 = new Produto("Vinho", 2500);

        Pedido pedido = new Pedido();
        pedido.setDescricao("Pedido de Joãozinho");
        pedido.setData("16/3/22");
        pedido.setItens(produto1, 15);
        pedido.setItens(produto2, 6);
        pedido.setItens(produto3, 7);
        pedido.setItens(produto4, 8);
        pedido.setItens(produto5, 1);
        pedido.setItens(produto6, 6);
        pedido.setItens(produto7, 1);
        pedido.setItens(produto8, 1);
        pedido.setItens(produto9, 16);
        pedido.setItens(produto10, 4);

        System.out.println(pedido);


        Pedido pedido1 = new Pedido();
        pedido.setDescricao("Pedido de Fulaninho");
        pedido.setData("20/5/22");
        pedido.setItens(produto11, 15);
        pedido.setItens(produto12, 6);
        pedido.setItens(produto13, 7);
        pedido.setItens(produto14, 8);
        pedido.setItens(produto15, 1);
        pedido.setItens(produto16, 6);
        pedido.setItens(produto17, 1);
        pedido.setItens(produto18, 1);
        pedido.setItens(produto19, 16);
        pedido.setItens(produto20, 4);

        System.out.println(pedido);


    }



}
