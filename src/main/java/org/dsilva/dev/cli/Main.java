
import org.dsilva.dev.modelo.Cardapio;
import org.dsilva.dev.modelo.ItemCardapio;


void main() {

    Cardapio cardapio = new Cardapio();  //criados anteriormente como ItemCardapio[]

    String linha = IO.readln("Digite um ID de um item de cardápio: "); //recebe valor
    long idSelecionado = Long.parseLong(linha); //armazena valor na variavel idSelecionado

    ItemCardapio itemSelecionado = cardapio.itens[((int) idSelecionado) - 1]; //Busca o item diretamente no array de itens dentro do objeto Cardapio

    IO.println("ID : " + itemSelecionado.id);
    IO.println("Nome: " + itemSelecionado.nome);
    IO.println("Categoria: " + itemSelecionado.obtemNomeCategoria());
    IO.println("Descrição: " + itemSelecionado.descricao);

    if (itemSelecionado.emPromocao) {
        IO.println("Item em Promoção! \uD83E\uDD11");
        var porcentagemDesconto = itemSelecionado.calculaPorcentagemDesconto();
        IO.println("Preco: de " + itemSelecionado.preco + " por " + itemSelecionado.precoComDesconto);
        System.out.println("Porcentagem de Desconto: " + porcentagemDesconto);
    } else {
        IO.print("Preco: " + itemSelecionado.preco);
        IO.println("Item não está em promoçao");
    }
    IO.println("Imposto: " + itemSelecionado.calculaImposto());

    IO.println("_".repeat(100));
    IO.println("Soma dos Preços: " + cardapio.obtemSomaDosPrecos());
    IO.println("Total de itens em promoção: " + cardapio.obtemTotalDeItensEmPromoção());

    double precoLimite = 10.0;
    IO.println("O primeiro preço que é maior que " + precoLimite + ": " + cardapio.obtemPrimeiroPrecoMaiorQueLimite(precoLimite));

    //Todos os preços menos que o Limite
    IO.println("_".repeat(100));
    for (ItemCardapio item : cardapio.itens) {
        if (item.preco <= precoLimite) {
            IO.println("Preço menor que " + precoLimite + ": " + item.preco);
        }
    }
}
