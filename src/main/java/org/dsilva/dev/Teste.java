void main() {
    String nome = "Sanduiche de Presunto do Chaves";
    String descricao = "Sanduiche de presunto simples, mas feito com muito amor.";
    boolean emPromocao = true;
    double preco = 3.50;
    double precoComDesconto = 2.99;
    long id = 3_000_000_000L;

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
