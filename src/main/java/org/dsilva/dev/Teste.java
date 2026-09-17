class ItemCardapio {
    //  Aulas Sobre POO sintaxe de Classes

    //atributos da classe
    String nome;
    String descricao;
    boolean emPromocao;
    double preco;
    long id;
    int categoria;


}

void main() {
    //Inferencia de tipos com declaracao com var


    //instanciando a classe ItemCardapio
    ItemCardapio item1 = new ItemCardapio();
    item1.nome = "Refresco do Chaves";
    item1.descricao = "Suco de limão que parece de tamarindo e tem gosto de groselha";
    item1.emPromocao = false;
    item1.preco = 2.99;
    item1.id = 1L;
    item1.categoria = 4;

    System.out.println("nome: " + item1.nome +
            "\ndescição: " + item1.descricao +
            "\nestá em promoção: " + item1.emPromocao +
            "\npreço: " + item1.preco +
            "\nid: " + item1.id +
            "\ncategoria: " + item1.categoria);


    var nomeItem2 = "Sanduiche de Presunto do Chaves";
    var descricaoItem2 = "Sanduiche de presunto simples, mas feito com muito amor.";
    var emPromocaoItem2 = true;
    var precoItem2 = 3.50;
    var precoComDescontoItem2 = 2.99;
    var idItem2 = 3_000_000_001L;
    int categoriaItem2 = 2;


    class ItemCardapio {
        //  Aulas Sobre POO sintaxe de Classes

        //atributos da classe
        String nome;
        String descricao;
        boolean emPromocao;
        double preco;
        long id;
        int categoria;


    }

 //   double porcentagemDesconto = (preco - precoComDesconto) / preco;


    /*
     * 1 - Entradas
     * 2 - Pratos Principais
     * 3 - Sobremesas
     * 4 - Bebidas*/
    /*IO.println("Nome: " + nomeItem1);
    IO.println("----Item não está em promoção---");
    //--------------Operadores de condicao em Java ---------------------
//    System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);
//    if (emPromocao){
//        IO.println("Preco: de " + preco + " por " + precoComDesconto);
//    } else {
//        IO.print("Preco: " + preco);
//    }

    if (categoriaItem1 == 1){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Entradas");
    }else if (categoriaItem1 == 2){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Pratos Principais");
    }else if (categoriaItem1 == 3){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Sobremesas");
    }else if (categoriaItem1 == 4){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Bebidas");
    }else{
        IO.println("Categoria Não foi encontrada");
    }*/
IO.println("-".repeat(50));
    IO. println("Nome: " + nomeItem2);
    switch (categoriaItem2){
        case 1:
        IO.println("Categoria: Entradas");
        break;
         case 2:
        IO.println("Categoria: Pratos Principais");
        break;
         case 3:
        IO.println("Categoria: Sobremesas");
        break;
         case 4:
        IO.println("Categoria: Bebidas");
        break;
        default:
            IO.println("Categoria Não foi encontrada");

    }

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



}

