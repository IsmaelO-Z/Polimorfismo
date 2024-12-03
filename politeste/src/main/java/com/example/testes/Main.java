package com.example.testes;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Ebook;
import com.example.model.Item;
import com.example.model.Livro;
import com.example.model.Pedido;

public class Main {
    public static void main(String[] args) {

        Ebook ebook = new Ebook();
        ebook.setTitulo("A revolucao dos bixos");
        ebook.setId(0000001);
        ebook.setIsbn("39486847296-77");
        ebook.setValor(10);
        ebook.setUrlMarcadagua("https://images.unsplash.com/photo-1720048171731-15b3d9d5473f?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDF8MHxmZWF0dXJlZC1waG90b3MtZmVlZHwxfHx8ZW58MHx8fHx8");
        ebook.aplicarDesconto(0.1);

        Livro livro = new Livro();
        livro.setTitulo("Guia completo C++");
        livro.setId(7891234);
        livro.setIsbn("092834023472-38");
        livro.setTiragem(436);
        livro.setValor(60);
        livro.aplicarDesconto(0.5);

        Item item1 = new Item();
        item1.setObra(livro);
        item1.setQuantidade(1);
        
        Item item2 = new Item();
        item2.setObra(ebook);
        item2.setQuantidade(3);

        List<Item> listaItens = new ArrayList<>();
        listaItens.add(item1);
        listaItens.add(item2);

        Pedido pedido = new Pedido();
        pedido.setId(23456);
        pedido.setItens(listaItens);

       for (Item item : listaItens) {
        System.out.println("-------------------------------------");
        System.out.println("Titulo: " + item.getObra().getTitulo());
        System.out.println("Valor: " + item.getObra().getValor());
        System.out.println("Quantidade: " + item.getQuantidade());
        System.out.println("-------------------------------------");
       }
          
    }
}