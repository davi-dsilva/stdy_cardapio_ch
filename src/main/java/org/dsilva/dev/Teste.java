
void main() {


    /*//Imprimindo os objetos
    System.out.println("id: " + item1.id +"\nnome: " + item1.nome + "\ndescição: " + item1.descricao + "\nestá em promoção: " + item1.emPromocao + "\npreço: " + item1.preco + "\ncategoria: " + item1.obtemNomeCategoria());
    IO.println("*_*".repeat(50));

    System.out.println("id: " + item2.id +"\nnome: " + item2.nome + "\ndescição: " + item2.descricao + "\nestá em promoção: " + item2.emPromocao + "\npreço: " + item2.preco + "\ncategoria: " + item2.obtemNomeCategoria());
    IO.println("Preço com desconto: " + item2.precoComDesconto);
    IO.println("*_*".repeat(50));

    System.out.println("id: " + item3.id +"\nnome: " + item3.nome + "\ndescição: " + item3.descricao + "\nestá em promoção: " + item3.emPromocao + "\npreço: " + item3.preco + "\ncategoria: " + item3.obtemNomeCategoria());
    IO.println("Preço com desconto: " + item3.precoComDesconto);
    IO.println("*_*".repeat(50));

    System.out.println("id: " + item4.id +"\nnome: " + item4.nome + "\ndescição: " + item4.descricao + "\nestá em promoção: " + item4.emPromocao + "\npreço: " + item4.preco + "\ncategoria: " + item4.obtemNomeCategoria());
    IO.println("Preço com desconto: " + item4.precoComDesconto);
    IO.println("*_*".repeat(50));

    System.out.println("id: " + item5.id +"\nnome: " + item5.nome + "\ndescição: " + item5.descricao + "\nestá em promoção: " + item5.emPromocao + "\npreço: " + item5.preco + "\ncategoria: " + item5.obtemNomeCategoria());
    IO.println("Preço com desconto: " + item5.precoComDesconto);
    IO.println("*_*".repeat(50));

    System.out.println("id: " + item6.id +"\nnome: " + item6.nome + "\ndescição: " + item6.descricao + "\nestá em promoção: " + item6.emPromocao + "\npreço: " + item6.preco + "\ncategoria: " + item6.obtemNomeCategoria());
    IO.println("Preço com desconto: " + item6.precoComDesconto);
    IO.println("*_*".repeat(50));

    System.out.println("id: " + item7.id +"\nnome: " + item7.nome + "\ndescição: " + item7.descricao + "\nestá em promoção: " + item7.emPromocao + "\npreço: " + item7.preco + "\ncategoria: " + item7.obtemNomeCategoria());
    //IO.println("Preço com desconto: " + item7.precoComDesconto);
    IO.println("*_*".repeat(50));*/

    Cardapio cardapio = new Cardapio();  //criados anteriormente como ItemCardapio[]

    String linha = IO.readln("Digite um ID de um item de cardápio: "); //recebe valor
    long idSelecionado = Long.parseLong(linha); //armazena valor na variavel idSelecionado

    ItemCardapio itemSelecionado = cardapio.itens[((int)idSelecionado) -1]; //Busca o item diretamente no array de itens dentro do objeto Cardapio

    IO.println("Soma dos Precos: " + cardapio.obtemSomaDosPrecos()); //criado novo método
    IO.println("Total de itens em promoção: " + cardapio.obtemTotalDeItensEmPromoção()); //criado novo método

    double precoLimite = 10.0;
    IO.println("O primeiro preço que é Maior que " + precoLimite + ": " + cardapio.obtemPrimeiroPrecoMaiorQueLimite(10.0));

    IO.println("ID : " + itemSelecionado.id);


    IO.println("Nome: " + itemSelecionado.nome);
    IO.println("Categoria: " + itemSelecionado.obtemNomeCategoria());
    IO.println("Descrição: " + itemSelecionado.descricao);
    IO.println("Em Promoção: " + itemSelecionado.emPromocao);

    if (itemSelecionado.emPromocao){
        var porcentagemDesconto = itemSelecionado.calculaPorcentagemDesconto();
        System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);
        IO.println("Preco: de " + itemSelecionado.preco + " por " + itemSelecionado.precoComDesconto);
    } else {
        IO.print("Preco: " + itemSelecionado.preco);
        IO.println("Item não está em promoçao");
    }
    //Todos os preços menos que o Limite
    IO.println("*".repeat(100));
    for (ItemCardapio item : cardapio.itens) {
        if (item.preco <= precoLimite) {
            IO.println("Preço menor que " + precoLimite + ": " + item.preco);
            continue;
        }
        IO.println("Processamento pesado para: " + item.preco); //só processar para valores maiores que 10

    }


    double [] precos = new double[7];
    precos[0] = 2.99 ;
    precos[1] = 3.50;
    precos[2] = 12.99;
    precos[3] = 4.99;
    precos[4] = 2.50;
    precos[5] = 4.99;
    precos[6] = 25.90;

    boolean [] emPromocao = { true, true, false, true , true, false, false};
/*
    IO.println("Preco do Item 3: " + precos[2]);
    IO.println("Tamanho do array: " + precos.length);
    IO.println("Tamanho do array emPromocao: " + emPromocao.length);
    IO.println("O segundo item tem promocao? " + emPromocao[1]);
*/

/*    double totalDePrecosComFor = 0.0;
    for (int k = 0; k < precos.length; k++) {
        double preco = precos[k];
        totalDePrecosComFor += preco;
    }
    IO.println("Soma dos preços: " + totalDePrecos);

    double totalDePrecosComForEach =0.0;
    for (double preco : precos) {
        totalDePrecosComForEach += preco;
    }
    IO.println("Soma dos preços (com for each): " + totalDePrecosComForEach);*/

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
    ItemCardapio(long id, String nome, String descricao, double preco, CategoriaCardapio categoria){
        //parametros = objeto;
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }
    //Métodos
    double calculaPorcentagemDesconto(){
        return (preco - precoComDesconto) / preco * 100;
    }

    CategoriaCardapio obtemNomeCategoria() {
        return categoria;
    }

    void definePromocao (double precoComDesconto){ //método void se estiver emPromocao == true e define o valor da promocao
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
    itens[0]=item1;
    itens[1]=item2;
    itens[2]=item3;
    itens[3]=item4;
    itens[4]=item5;
    itens[5]=item6;
    itens[6]=item7;
    }

    double obtemSomaDosPrecos(){
        double totalDePrecos = 0.0;
        int i = 0;
        while (i < itens.length) {
            double preco = itens[i].preco;
            totalDePrecos = totalDePrecos + preco;
            i ++;
        }
        return totalDePrecos;
    }

    int obtemTotalDeItensEmPromoção(){ //substitui por um for-each
        int totalItensEmPromocao = 0;
        for (ItemCardapio item :itens){
            if (item.emPromocao) {
                totalItensEmPromocao++;
            }
        }
        return totalItensEmPromocao;
    }


    // Achar o primeiro preco que é maior que 10
    double obtemPrimeiroPrecoMaiorQueLimite(double precoLimite){

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