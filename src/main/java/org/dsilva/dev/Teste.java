void main() {
    //Inferencia de tipos com declaracao com var
    var nomeItem1 = "Refresco do Chaves";
    var descricaoItem1 = "Suco de limão que parece de tamarindo e tem gosto de groselha";
    var emPromocaoItem1 = false;
    var precoItem1 = 2.99;
    var idItem1 = 1L;
    int categoriaItem1 = 4;

    var nomeItem2 = "Sanduiche de Presunto do Chaves";
    var descricaoItem2 = "Sanduiche de presunto simples, mas feito com muito amor.";
    var emPromocaoItem2 = true;
    var precoItem2 = 3.50;
    var precoComDescontoItem2 = 2.99;
    var idItem2 = 3_000_000_001L;
    int categoriaItem2 = 2;

 //   double porcentagemDesconto = (preco - precoComDesconto) / preco;


    /*
     * 1 - Entradas
     * 2 - Pratos Principais
     * 3 - Sobremesas
     * 4 - Bebidas*/
    IO.println("Nome: " + nomeItem1);
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
    }
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
}

