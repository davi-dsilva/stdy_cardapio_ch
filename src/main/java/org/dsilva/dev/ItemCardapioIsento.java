package org.dsilva.dev;

import org.dsilva.dev.CategoriaCardapio;
import org.dsilva.dev.ItemCardapio;

class ItemCardapioIsento extends ItemCardapio {

    ItemCardapioIsento(long id, String nome, String descricao, double preco, CategoriaCardapio categoria) {
        super(id, nome, descricao, preco, categoria );
    }

    //Override de método (reescita do método)
    public double calculaImposto(){
        return 0.0;
    }
}
