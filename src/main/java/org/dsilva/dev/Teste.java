void main() {
    //Inferencia de tipos com declaracao com var
    var nome = "Sanduiche de Presunto do Chaves";
    var descricao = "Sanduiche de presunto simples, mas feito com muito amor.";
    var emPromocao = true;
    var preco = 3.50;
    var precoComDesconto = 2.99;
    var id = 3_000_000_000L;

    double porcentagemDesconto = (preco - precoComDesconto) / preco;

    System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);

    double valorDesconto = preco * porcentagemDesconto;
    IO.println("Valor Desconto: " + valorDesconto);

    IO.println("Preço com desconto (calculado): " + (preco - valorDesconto)); //o Parenteses Altera a procedencia da opecao para Não dar erro de

    int x = 11;
    int y = 2;
    int z = x / y;

    IO.println(z);

    int w = x % y;
    IO.println(w);
}
