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
            String[] partes = linha.split(",");
            for (String parte : partes){
                parte = parte.replace("[", " ");
                parte = parte.replace("]", " ");
                parte = parte.replace("{", " ");
                parte = parte.replace("}", " ");
                parte = parte.replace('\"', ' ');

                IO.println(parte);
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