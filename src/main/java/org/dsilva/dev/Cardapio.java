package org.dsilva.dev;

public class Cardapio {
    public ItemCardapio[] itens; //declarando

    //instanciando a classe ItemCardapio com construtor
    public Cardapio() { //construtor
        ItemCardapio item1 = new ItemCardapio(50L, "Refresco do Chaves", "Suco de limão que parece de tamarindo e tem gosto de groselha", 2.99, CategoriaCardapio.BEBIDAS);
        item1.emPromocao = false;

        var item2 = new ItemCardapio(2L, "Sanduiche de Presunto do Chaves", "Sanduiche de presunto simples, mas feito com muito amor.", 3.50, CategoriaCardapio.PRATOS_PRINCIPAIS);
        item2.definePromocao(2.99);

        var item3 = new ItemCardapio(3L, "Torta de Frango da Dona Florinda", "Torta de frango com recheio cremoso e massa crocante.", 12.99, CategoriaCardapio.PRATOS_PRINCIPAIS);
        item3.definePromocao(10.99);

        var item4 = new ItemCardapio(4L, "Pipoca do Quico", "Balde de pipoca preparado com carinho pelo quico", 4.99, CategoriaCardapio.PRATOS_PRINCIPAIS);
        item4.definePromocao(3.99);

        var item5 = new ItemCardapio(5L, "Água de Jamaica", "Água aromatizada com hibisco e toque de açúcar.", 2.50, CategoriaCardapio.BEBIDAS);
        item5.definePromocao(2.00);

        var item6 = new ItemCardapio(6L, "Churros do Chaves", "Churros recheados com doce de leite, clássicos e irresistíveis.", 4.99, CategoriaCardapio.SOBREMESAS);
        item6.definePromocao(3.99);

        var item7 = new ItemCardapio(7L, "Tacos de Carnitas", "Tacos recheados com carne tenra", 25.90, CategoriaCardapio.PRATOS_PRINCIPAIS);

        itens = new ItemCardapio[7]; //array de itens
        itens[0] = item1;
        itens[1] = item2;
        itens[2] = item3;
        itens[3] = item4;
        itens[4] = item5;
        itens[5] = item6;
        itens[6] = item7;
    }

    public double obtemSomaDosPrecos() {
        double totalDePrecos = 0.0;
        int i = 0;
        while (i < itens.length) {
            double preco = itens[i].preco;
            totalDePrecos = totalDePrecos + preco;
            i++;
        }
        return totalDePrecos;
    }

    public int obtemTotalDeItensEmPromoção() { //substitui por um for-each
        int totalItensEmPromocao = 0;
        for (ItemCardapio item : itens) {
            if (item.emPromocao) {
                totalItensEmPromocao++;
            }
        }
        return totalItensEmPromocao;
    }


    // Achar o primeiro preco que é maior que 10
    public double obtemPrimeiroPrecoMaiorQueLimite(double precoLimite) {

        double precoMaiorQueLimite = -1.0;
        for (ItemCardapio item : itens) {
            if (item.preco > precoLimite) {
                precoMaiorQueLimite = item.preco;
                break;
            }

        }
        return precoMaiorQueLimite;
    }
}