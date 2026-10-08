package org.dsilva.dev.cli;

import org.dsilva.dev.modelo.Cardapio;
import org.dsilva.dev.modelo.ItemCardapio;

import java.io.IOException;

public class Main {
    void main() throws IOException {

    //String nomeArquivo = "itens-cardapio.csv";
    String nomeArquivo = "itens-cardapio.json";
    Cardapio cardapio = new Cardapio(nomeArquivo);  //criados anteriormente como ItemCardapio[]

    String linha = IO.readln("Digite um ID de um item de cardápio: "); //recebe valor
    long idSelecionado = Long.parseLong(linha); //armazena valor na variavel idSelecionado

    ItemCardapio itemSelecionado = cardapio.getItemPorId(idSelecionado); //Busca o item diretamente no array de itens dentro do objeto Cardapio

    IO.println("ID : " + itemSelecionado.getId());
    IO.println("Nome: " + itemSelecionado.getNome());
    IO.println("Categoria: " + itemSelecionado.getCategoria());
    IO.println("Descrição: " + itemSelecionado.getDescricao());

    if (itemSelecionado.isEmPromocao()) {
        IO.println("Item em Promoção! \uD83E\uDD11");
        var porcentagemDesconto = itemSelecionado.getPorcentagemDesconto();
        IO.println("Preco: de " + itemSelecionado.getPreco() + " por " + itemSelecionado.getPrecoComDesconto());
        System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);
    } else {
        IO.println("Preco: " + itemSelecionado.getPreco());
        IO.println("\nItem não está em promoção\n");
    }
    IO.println("Imposto: " + itemSelecionado.getImposto());

    IO.println("_".repeat(100));
    IO.println("Soma dos Preços: " + cardapio.getSomaDosPrecos());
    IO.println("Total de itens em promoção: " + cardapio.getTotalDeItensEmPromocao());

    double precoLimite = 10.0;
    IO.println("O primeiro preço que é maior que " + precoLimite + ": " + cardapio.getPrimeiroPrecoMaiorQueLimite(precoLimite));

    //Todos os preços menos que o Limite
    IO.println("_".repeat(100));
    for (ItemCardapio item : cardapio.getItens()) {
        if (item.getPreco() <= precoLimite) {
            IO.println("Preço menor que " + precoLimite + ": " + item.getPreco());
            }
        }
    }
}