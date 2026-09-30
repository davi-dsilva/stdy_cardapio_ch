package org.dsilva.dev.modelo;

public class ItemCardapio {
    //  Aulas Sobre POO sintaxe de Classes
    //atributos da classe
    private long id;
    private String nome;
    private String descricao;
    private boolean emPromocao;
    private double preco;
    private double precoComDesconto;
    CategoriaCardapio categoria;

    // construtor - serve para definir como o objeto irá ser criado
    public ItemCardapio(long id, String nome, String descricao, double preco, CategoriaCardapio categoria) {
        //parametros = objeto;
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    //Métodos
    public double getPorcentagemDesconto() {

        return (preco - precoComDesconto) / preco * 100;
    }

    public void setPromocao(double precoComDesconto) { //método void se estiver emPromocao == true e define o valor da promocao
        this.emPromocao = true;
        this.precoComDesconto = precoComDesconto;
    }

    public double getImposto() {
        double imposto;
        if (this.isEmPromocao()){
            imposto = getPrecoComDesconto() * 0.1;
        }else {
            imposto = getPreco() * 0.1;
        }
        return imposto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEmPromocao() {
        return emPromocao;
    }

    public void setEmPromocao(boolean emPromocao) {
        this.emPromocao = emPromocao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(double precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }

    public CategoriaCardapio getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCardapio categoria) {
        this.categoria = categoria;
    }
}