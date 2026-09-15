void main() {
    //Inferencia de tipos com declaracao com var
    var nome = "Sanduiche de Presunto do Chaves";
    var descricao = "Sanduiche de presunto simples, mas feito com muito amor.";
    var emPromocao = true;
    var preco = 3.50;
    var precoComDesconto = 2.99;
    var id = 3_000_000_000L;
    int categoria = 1;

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
    }if (categoria == 2){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Pratos Principais");
    }if (categoria == 3){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Sobremesas");
    }if (categoria == 4){ //comparacao da variavel com o valor igual == diferente !=
                IO.println("Categoria: Bebidas");
    }
}

