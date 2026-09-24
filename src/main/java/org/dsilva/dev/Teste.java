
void main() {

    Cardapio cardapio = new Cardapio();  //criados anteriormente como ItemCardapio[]

    String linha = IO.readln("Digite um ID de um item de cardápio: "); //recebe valor
    long idSelecionado = Long.parseLong(linha); //armazena valor na variavel idSelecionado

    ItemCardapio itemSelecionado = cardapio.itens[((int) idSelecionado) - 1]; //Busca o item diretamente no array de itens dentro do objeto Cardapio

    IO.println("ID : " + itemSelecionado.id);
    IO.println("Nome: " + itemSelecionado.nome);
    IO.println("Categoria: " + itemSelecionado.obtemNomeCategoria());
    IO.println("Descrição: " + itemSelecionado.descricao);

    if (itemSelecionado.emPromocao) {
            IO.println("Item em Promoção! \uD83E\uDD11");
        var porcentagemDesconto = itemSelecionado.calculaPorcentagemDesconto();
        IO.println("Preco: de " + itemSelecionado.preco + " por " + itemSelecionado.precoComDesconto);
        System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);
    } else {
        IO.print("Preco: " + itemSelecionado.preco);
        IO.println("Item não está em promoçao");
    }

    double precoLimite = 10.0;
    IO.println("O primeiro preço que é maior que " + precoLimite + ": " + cardapio.obtemPrimeiroPrecoMaiorQueLimite(precoLimite));

    //Todos os preços menos que o Limite
    IO.println("*".repeat(100));
    for (ItemCardapio item : cardapio.itens) {
        if (item.preco <= precoLimite) {
            IO.println("Preço menor que " + precoLimite + ": " + item.preco);
        }
    }
}

class ItemCardapio {
    //  Aulas Sobre POO sintaxe de Classes
    //atributos da classe
    long id;
    String nome;
    String descricao;
    boolean emPromocao;
    double preco;
    double precoComDesconto;
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
    double calculaPorcentagemDesconto() {
        return (preco - precoComDesconto) / preco * 100;
    }

    CategoriaCardapio obtemNomeCategoria() {
        return categoria;
    }

    void definePromocao(double precoComDesconto) { //método void se estiver emPromocao == true e define o valor da promocao
        emPromocao = true;
        this.precoComDesconto = precoComDesconto;
    }
    //Pense no objeto como uma ficha cadastral:
    //
    //Um método com return é como um funcionário que vai até a ficha, lê uma informação e grita a resposta para você ("O preço é 3.50!").
    //
    //Um método void é como um funcionário que vai até a ficha com uma caneta, apaga o valor antigo e escreve o novo valor lá dentro.
    // Ele não grita nada para você (não tem return), mas a alteração física foi feita na ficha do item2.


}

class Cardapio {
    ItemCardapio[] itens; //declarando

    //instanciando a classe ItemCardapio com construtor
    Cardapio() { //construtor
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

    double obtemSomaDosPrecos() {
        double totalDePrecos = 0.0;
        int i = 0;
        while (i < itens.length) {
            double preco = itens[i].preco;
            totalDePrecos = totalDePrecos + preco;
            i++;
        }
        return totalDePrecos;
    }

    int obtemTotalDeItensEmPromoção() { //substitui por um for-each
        int totalItensEmPromocao = 0;
        for (ItemCardapio item : itens) {
            if (item.emPromocao) {
                totalItensEmPromocao++;
            }
        }
        return totalItensEmPromocao;
    }


    // Achar o primeiro preco que é maior que 10
    double obtemPrimeiroPrecoMaiorQueLimite(double precoLimite) {

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

enum CategoriaCardapio {
    ENTRADA, PRATOS_PRINCIPAIS, SOBREMESAS, BEBIDAS
}