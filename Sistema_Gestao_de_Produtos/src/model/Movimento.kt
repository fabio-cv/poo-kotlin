package model

import enums.StatusProduto

class Movimento(
    val data: String,
    val quantidadeMovimentada: Int,

    ) {

    var statusProduto: StatusProduto

    init {
        statusProduto = if (quantidadeMovimentada <= 0) {
            StatusProduto.PRODUTO_VENDIDO
        }else {
            StatusProduto.PRODUTO_NO_ARMAZEM
        }
    }
}