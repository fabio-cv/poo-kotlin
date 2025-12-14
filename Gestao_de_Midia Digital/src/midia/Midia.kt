package midia

import java.time.Year

abstract class Midia(
    val titulo: String,
    val anoPublicacao: Int

) {

    abstract fun detalhesFormatados(): String

    fun calcularAnosDesdeLancamento(): Int {
        var anoAtual = Year.now().value
        return anoAtual - anoPublicacao
    }
}