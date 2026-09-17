
void main() {
    class ItemCardapio {
        //  Aulas Sobre POO sintaxe de Classes

        //atributos da classe
        String nome;
        String descricao;
        boolean emPromocao;
        double preco;
        long id;
        double precoComDesconto;
        int categoria;

        //Métodos
        double calculaPorcentagemDesconto(){
            return (preco - precoComDesconto) / preco * 100;
        }

        String obtemNomeCategoria() {
            IO.println("-".repeat(50));
            String nomeCategoria;
            switch (categoria) {
                case 1:
                    nomeCategoria = "Entradas";
                    break;
                case 2:
                    nomeCategoria = "Pratos Principais";
                    break;
                case 3:
                    nomeCategoria = "Sobremesas";
                    break;
                case 4:
                    nomeCategoria = "Bebidas";
                    break;
                default:
                    nomeCategoria = "Não foi encontrada uma Categoria";

            }
        return nomeCategoria;
        }
    }
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
            "\ncategoria: " + item1.obtemNomeCategoria());

    var item2 = new ItemCardapio();
    item2.nome = "Sanduiche de Presunto do Chaves";
    item2.descricao = "Sanduiche de presunto simples, mas feito com muito amor.";
    item2.emPromocao = true;
    item2.preco = 3.50;
    item2.precoComDesconto = 2.99;
    item2.id = 3_000_000_001L;
    item2.categoria = 2;

    System.out.println("nome: " + item2.nome +
            "\ndescição: " + item2.descricao +
            "\nestá em promoção: " + item2.emPromocao +
            "\npreço: " + item2.preco +
            "\nid: " + item2.id +
            "\ncategoria: " + item2.obtemNomeCategoria());


 //   double porcentagemDesconto = (preco - precoComDesconto) / preco;


    /*
     * 1 - Entradas
     * 2 - Pratos Principais
     * 3 - Sobremesas
     * 4 - Bebidas*/
    IO.println("Nome: " + item2.nome);
    IO.println("----Item não está em promoção---");
    //--------------Operadores de condicao em Java ---------------------

    if (item2.emPromocao){
        var porcentagemDesconto = item2.calculaPorcentagemDesconto();
        System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);
        IO.println("Preco: de " + item2.preco + " por " + item2.precoComDesconto);
    } else {
        IO.print("Preco: " + item2.preco);
        IO.println("Item não está em promoçao");
    }

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

