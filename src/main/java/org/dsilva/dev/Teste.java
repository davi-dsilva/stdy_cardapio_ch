
void main() {


    //instanciando a classe ItemCardapio com construtor
    ItemCardapio item1 = new ItemCardapio(1L,"Refresco do Chaves","Suco de limão que parece de tamarindo e tem gosto de groselha",2.99, 4);
    item1.emPromocao = false;

    var item2 = new ItemCardapio(2L, "Sanduiche de Presunto do Chaves", "Sanduiche de presunto simples, mas feito com muito amor.",3.50, 2);
    item2.definePromocao(2.99);

    var item3 = new ItemCardapio(3L, "Torta de Frango da Dona Florinda", "Torta de frango com recheio cremoso e massa crocante.", 12.99,2);
    item3.definePromocao(10.99);

    var item4 = new ItemCardapio(4L, "Pipoca do Quico","Balde de pipoca preparado com carinho pelo quico",4.99,2);
    item4.definePromocao(3.99);

    var item5 = new ItemCardapio(5L, "Água de Jamaica", "Água aromatizada com hibisco e toque de açúcar.",2.50, 4);
    item5.definePromocao(2.00);

    var item6 = new ItemCardapio(6L, "Churros do Chaves", "Churros recheados com doce de leite, clássicos e irresistíveis.", 4.99,3);
    item6.definePromocao(3.99);

    var item7 = new ItemCardapio(7L, "Tacos de Carnitas", "Tacos recheados com carne tenra", 25.90, 2);

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

    ItemCardapio[] cardapio = { item1, item2, item3, item4, item5, item6, item7 };

    String linha = IO.readln("Digite um ID de um item de cardápio: ");
    long idSelecionado = Long.parseLong(linha);
    IO.println(idSelecionado);
    ItemCardapio itemSelecionado = item2; //TODO trocar para buscar o id digitado

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
    int categoria;

    // construtor - serve para definir como o objeto irá ser criado
    ItemCardapio(long id, String nome, String descricao, double preco, int categoria){
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

    String obtemNomeCategoria() {

        String nomeCategoria = switch (categoria) {
            case 1 -> "Entradas";
            case 2 -> "Pratos Principais";
            case 3 -> "Sobremesas";
            case 4 -> "Bebidas";
            default -> "Não foi encontrada uma Categoria";
        };
        IO.println("-".repeat(50));
        return nomeCategoria;
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