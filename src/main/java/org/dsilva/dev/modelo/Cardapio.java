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

    for(int i = 0; i < linhas.length; i++) {
        String linha = linhas[i];
        if(nomeArquivo.endsWith(".csv")) {
            String[] partes = linha.split(";");
            for (int j = 0; j < partes.length; j++) {
                String parte = partes[j];
                IO.println("Parte: " + j + ":" + parte);
            }
        }else if(nomeArquivo.endsWith(".json")) {
            
        }else {
            IO.println("extensão de arquivo Não foi reconhecida");
        }
    }

    ItemCardapio iten1 = new ItemCardapio(1L,"item1","item1",2.3,CategoriaCardapio.BEBIDAS);

        itens = new ItemCardapio[1];
        getItens()[0] = iten1;

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