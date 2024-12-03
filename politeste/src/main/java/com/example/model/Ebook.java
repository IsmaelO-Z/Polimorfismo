package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Ebook extends Obra { 
    private String urlMarcadagua;

    @Override
    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 0.5) {
            System.out.println("O desconto não pode ser aplicado pois exede 50%.");
            return false;
        }
        double desconto = super.getValor() * porcentagem;
        super.setValor(super.getValor() - desconto);
        return true;
    }
}