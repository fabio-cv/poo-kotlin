package model

import enums.StatusProduto

class Produto(
    var codigo: Int,
    var designacao: String,
    var preco: Double

) {

    private val movimentosRealizados = mutableListOf<Movimento>()

    fun adicionarMovimento(movimento: Movimento) {
        movimentosRealizados.add(movimento)
    }

    fun calcularValorTotalVendas(): Double {
        var total = 0.0
        for (movimento in movimentosRealizados){
            if (movimento.statusProduto == StatusProduto.PRODUTO_VENDIDO){
                total += preco * -(movimento.quantidadeMovimentada)
            }
        }
        return total
    }
}