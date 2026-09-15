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
}
