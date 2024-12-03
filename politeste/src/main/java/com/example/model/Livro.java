package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Livro extends Obra {
    private int tiragem;

    @Override
    public boolean aplicarDesconto(double porcentagem) {

        if (porcentagem > 0.3) {
            System.out.println("O desconto não pode ser aplicado pois exede 30%.");
            return false;
        }
        double desconto = super.getValor() * porcentagem;
        super.setValor(super.getValor() - desconto);
        return true;
    }
}
