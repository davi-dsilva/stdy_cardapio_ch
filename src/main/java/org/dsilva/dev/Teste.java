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

    System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);
    /*
     * 1 - categorias
     * 2 - Entradas
     * 3 - Sobremesas
     * 4 - Bebidas*/

    if (emPromocao){
        IO.println("Preco: de " + preco + " por " + precoComDesconto);
    } else {
        IO.print("Preco: " + preco);
    }
}

