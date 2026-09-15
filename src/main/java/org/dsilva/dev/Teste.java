void main() {
    //Inferencia de tipos com declaracao com var
    var nome = "Sanduiche de Presunto do Chaves";
    var descricao = "Sanduiche de presunto simples, mas feito com muito amor.";
    var emPromocao = true;
    var preco = 3.50;
    var precoComDesconto = 2.99;
    var id = 3_000_000_000L;
    int categoria = 2;

    double porcentagemDesconto = (preco - precoComDesconto) / preco;


    /*
     * 1 - Entradas
     * 2 - Pratos Principais
     * 3 - Sobremesas
     * 4 - Bebidas*/
    IO.println("Nome: " + nome);
    //--------------Operadores de condicao em Java ---------------------
    System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);
    if (emPromocao){
        IO.println("Preco: de " + preco + " por " + precoComDesconto);
    } else {
        IO.print("Preco: " + preco);
    }

    if (categoria == 1){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Entradas");
    }else if (categoria == 2){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Pratos Principais");
    }else if (categoria == 3){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Sobremesas");
    }else if (categoria == 4){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Bebidas");
    }else{
        IO.println("Categoria Não foi encontrada");
    }

    switch (categoria){
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
            break;

    }
}

