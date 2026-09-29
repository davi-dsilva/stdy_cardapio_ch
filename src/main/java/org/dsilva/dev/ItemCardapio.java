package org.dsilva.dev;

public class ItemCardapio {
    //  Aulas Sobre POO sintaxe de Classes
    //atributos da classe
    public long id;
    public String nome;
    public String descricao;
    public boolean emPromocao;
    public double preco;
    public double precoComDesconto;
    CategoriaCardapio categoria;

    // construtor - serve para definir como o objeto irá ser criado
    ItemCardapio(long id, String nome, String descricao, double preco, CategoriaCardapio categoria) {
        //parametros = objeto;
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    //Métodos
    public double calculaPorcentagemDesconto() {
        return (preco - precoComDesconto) / preco * 100;
    }

    public CategoriaCardapio obtemNomeCategoria() {
        return categoria;
    }

    public void definePromocao(double precoComDesconto) { //método void se estiver emPromocao == true e define o valor da promocao
        emPromocao = true;
        this.precoComDesconto = precoComDesconto;
    }

    public double calculaImposto() {
        double imposto;
        if (this.emPromocao){
            imposto = precoComDesconto * 0.1;
        }else {
            imposto = preco * 0.1;
        }
        return imposto;
    }

}