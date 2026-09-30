package org.dsilva.dev.modelo;

class ItemCardapioIsento extends ItemCardapio {
    //construtor
    ItemCardapioIsento(long id, String nome, String descricao, double preco, CategoriaCardapio categoria) {
        super(id, nome, descricao, preco, categoria );
    }

    //Override de método (reescrita do método)
    @Override //anotação de OVerride é opcional, mas uma boa prática em java
    public double calculaImposto(){

        return 0.0;
    }
}
