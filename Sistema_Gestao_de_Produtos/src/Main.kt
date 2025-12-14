//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val listaProdutos = mutableListOf<Produto>()

    //Criar Produto
    val produto = Produto(1,"Pão", 12.0)

    //Criar movimetos e associar ao produto
    val movimento = Movimento("14-12-2025",-5)

    produto.adicionarMovimento(movimento)

    //Calcular total venda de produto
    print("Total das vendas de ${produto.designacao}: ${produto.calcularValorTotalVendas()}")

    //Produto na lista
    listaProdutos.add(produto)
}