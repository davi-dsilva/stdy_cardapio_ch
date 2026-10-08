package org.dsilva.dev.modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cardapio {
    private final ItemCardapio[] itens; //private só pode ser acessado dentro da mesma classe
    //instanciando a classe ItemCardapio com construtor

    public Cardapio(String nomeArquivo) throws IOException {
    Path arquivo = Paths.get(nomeArquivo);
    String conteudoArquivo = Files.readString(arquivo);
    String[] linhas = conteudoArquivo.split("\n");

    itens = new ItemCardapio[linhas.length];
    for(int i = 0; i < linhas.length; i++) {
        String linha = linhas[i];
        if(nomeArquivo.endsWith(".csv")) {
            //lendo arquivo.csv
            String[] partes = linha.split(";");
            long id = Long.parseLong(partes[0]);
            String nome = partes[1];
            String descricao = partes[2];
            double preco = Double.parseDouble(partes[3]);
            CategoriaCardapio categoria = CategoriaCardapio.valueOf(partes[4]);

            ItemCardapio item;

            boolean impostoIsento = Boolean.parseBoolean(partes[7]);

            if (impostoIsento) {
                item = new ItemCardapioIsento(id, nome, descricao, preco, categoria);
            } else {
                item = new ItemCardapio(id, nome, descricao, preco, categoria);
            }

            boolean emPromocao = Boolean.parseBoolean(partes[5]);
            if (emPromocao) {
                double precoComDesconto = Double.parseDouble(partes[6]);
                item.setPromocao(precoComDesconto);
            }

            itens[i] = item;

        }else if(nomeArquivo.endsWith(".json")) {
            //lendo arquvi.json
            linha = linha.replace("[", " ");
            linha = linha.replace("]", " ");
            linha = linha.replace("{", " ");
            linha = linha.replace("}", " ");
            linha = linha.replace('\"', ' ');
            String[] partes = linha.split(",");


            String parteID = partes[0];
            String[] propriedadeEvalorID = parteID.split(":");
            String valorID = propriedadeEvalorID[1].trim();
            long id = Long.parseLong(valorID);

            String parteNome = partes[1];
            String[] propriedadeEvalorNome = parteNome.split(":");
            String nome = propriedadeEvalorNome[1].trim();


            String parteDesc = partes[2];
            String[] propriedadeEvalorDesc = parteDesc.split(":");
            String descricao = propriedadeEvalorDesc[1].trim();

            String partePreco = partes[3];
            String[] propriedadeEvalorPreco = partePreco.split(":");
            String valorPreco = propriedadeEvalorPreco[1].trim();
            double preco = Double.parseDouble(valorPreco);

           String parteCategoria = partes[4];
           String[] propriedadeEvalorCategoria = parteCategoria.split(":");
           String valorCategoria = propriedadeEvalorCategoria[1].trim();
           CategoriaCardapio categoria = CategoriaCardapio.valueOf(valorCategoria);


            String parteEmPromocao = partes[5];
            String[] propriedadeEvalorEmPromocao = parteEmPromocao.split(":");
            String valorEmPromocao = propriedadeEvalorEmPromocao[1].trim();

            ItemCardapio item = new ItemCardapio(id, nome, descricao, preco, categoria);
            itens [i] = item;

            boolean emPromocao = Boolean.parseBoolean(valorEmPromocao);
            if (emPromocao) {
                String partePrecoDesconto = partes[6];
                String[] propriedadeEvalorPrecoDesconto = partePrecoDesconto.split(":");
                String valorPrecoDesconto = propriedadeEvalorPrecoDesconto[1].trim();
                double precoDesconto = Double.parseDouble(valorPrecoDesconto);
                item.setPromocao(precoDesconto);
            }



        }else {
            IO.println("extensão de arquivo Não foi reconhecida");
        }
    }
    }

    public double getSomaDosPrecos() {
        double totalDePrecos = 0.0;
        int i = 0;
        while (i < getItens().length) {
            double preco = getItens()[i].getPreco();
            totalDePrecos = totalDePrecos + preco;
            i++;
        }
        return totalDePrecos;
    }

    public int getTotalDeItensEmPromocao() { //substitui por um for-each
        int totalItensEmPromocao = 0;
        for (ItemCardapio item : getItens()) {
            if (item.isEmPromocao()) {
                totalItensEmPromocao++;
            }
        }
        return totalItensEmPromocao;
    }


    // Achar o primeiro preco que é maior que 10
    public double getPrimeiroPrecoMaiorQueLimite(double precoLimite) {

        double precoMaiorQueLimite = -1.0;
        for (ItemCardapio item : getItens()) {
            if (item.getPreco() > precoLimite) {
                precoMaiorQueLimite = item.getPreco();
                break;
            }



        }
        return precoMaiorQueLimite;
    }
    public ItemCardapio getItemPorId(long idSelecionado) {
        return itens[((int) idSelecionado) - 1];
    }

    public ItemCardapio[] getItens() {
        return itens;
    }
}