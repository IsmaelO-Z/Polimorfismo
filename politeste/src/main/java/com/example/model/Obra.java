package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public abstract class Obra {
    private int id;
    private String titulo;
    private String isbn;
    private double valor;

    public abstract boolean aplicarDesconto(double porcentagem);

    //public boolean aplicarDesconto(double porcentagem){
    //if (porcentagem > 0.5) {
    //    System.out.println("O desconto não pode ser aplicado");
    //    return false;
    //}
    //double desconto = this.valor * porcentagem;
    //this.valor = this.valor-desconto;
    //return true;   
    //}
}