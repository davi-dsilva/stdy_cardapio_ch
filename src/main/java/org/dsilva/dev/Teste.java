
void main() {
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

        // construtor - serve para definir como o objeti irá ser criado
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
    //instanciando a classe ItemCardapio com construtor
    ItemCardapio item1 = new ItemCardapio(1L,"Refresco do Chaves","Suco de limão que parece de tamarindo e tem gosto de groselha",2.99, 4);
    item1.emPromocao = false;

    var item2 = new ItemCardapio(3_000_000_001L, "Sanduiche de Presunto do Chaves", "Sanduiche de presunto simples, mas feito com muito amor.",3.50, 2);
    item2.definePromocao(2.99);

    //Imprimindo os objetos
    System.out.println("id: " + item1.id +"\nnome: " + item1.nome + "\ndescição: " + item1.descricao + "\nestá em promoção: " + item1.emPromocao + "\npreço: " + item1.preco + "\ncategoria: " + item1.obtemNomeCategoria());
    IO.println("*_*".repeat(50));


    System.out.println("id: " + item2.id +"\nnome: " + item2.nome + "\ndescição: " + item2.descricao + "\nestá em promoção: " + item2.emPromocao + "\npreço: " + item2.preco + "\ncategoria: " + item2.obtemNomeCategoria());
    IO.println("Preço com desconto: " + item2.precoComDesconto);
    IO.println("*_*".repeat(50));



    //--------------Operadores de condicao em Java ---------------------

    if (item2.emPromocao){
        var porcentagemDesconto = item2.calculaPorcentagemDesconto();
        System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);
        IO.println("Preco: de " + item2.preco + " por " + item2.precoComDesconto);
    } else {
        IO.print("Preco: " + item2.preco);
        IO.println("Item não está em promoçao");
    }
/*
    IO. println("Nome: " + item2.nome);
    IO.println("Categoria: " + item2.obtemNomeCategoria());


    IO.println("*".repeat(50) + "arrays" + "*".repeat(50));

    double [] precos = new double[7];

    precos[0] = 2.99 ;
    precos[1] = 3.50;
    precos[2] = 12.99;
    precos[3] = 4.99;
    precos[4] = 2.50;
    precos[5] = 4.99;
    precos[6] = 25.90;

    boolean [] emPromocao = { true, true, false, true , true, false, false};


    IO.println("Preco do Item 3: " + precos[2]);
    IO.println("Tamanho do array: " + precos.length);
    IO.println("Tamanho do array emPromocao: " + emPromocao.length);
    IO.println("O segundo item tem promocao? " + emPromocao[1]);

     /*
    IO.println("*".repeat(50) + "Laços de Repetição" + "*".repeat(50));
    double totalDePrecos = 0.0;
    int i = 0;
    System.out.println("WHILE");
    while (i < precos.length) {
        IO.println("rodou " + i);
        double preco = precos[i];
        totalDePrecos = totalDePrecos + preco;
        i ++;
    }
    IO.println("Soma dos precos: " + totalDePrecos);


    System.out.println("do WHILE");
    int totalDeItensEmPromocao = 0;
    int j = emPromocao.length - 1;
    do {
        IO.println("Rodou " +j);
        if (emPromocao[j]){

            totalDeItensEmPromocao ++;
    }
        j --;
    }while (j >= 0);
    IO.println("Quantidade de itens em promoção: " + totalDeItensEmPromocao);

    System.out.println("for");

    double totalDePrecosComFor = 0.0;
    for (int k = 0; k < precos.length; k++) {
        IO.println("Rodou " + k);
        double preco = precos[k];
        totalDePrecosComFor += preco;
    }
    IO.println("Soma dos preços: " + totalDePrecos);

    double totalDePrecosComForEach =0.0;
    for (double preco : precos) {
        totalDePrecosComForEach += preco;
    }
    IO.println("Soma dos preços (com for each): " + totalDePrecosComForEach);


    // Achar o primeiro preco que é maior que 10
    double precoLimite = 10.0;
    double precoMaiorQueLimite = -1.0;

    for (double preco: precos) {
        if (preco > precoLimite) {
            precoMaiorQueLimite = preco;
            break;
        }

    }
    IO.println("Primeiro Preço maior que " + precoLimite + ": " + precoMaiorQueLimite);

    //Todos os preços menos que o Limite

    for (double preco : precos) {
        if (preco <= precoLimite) {
            IO.println("Preço menor que " + precoLimite + ": " + preco);
            continue;
        }
            IO.println("Processamento pesado para: " + preco); //só processar para valores maiores que 10

    }

*/

}

