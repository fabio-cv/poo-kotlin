package bib

import midia.Midia
import midia.Reproduzivel

class BibliotecaDigital {
    private val colecao = mutableSetOf<Midia>()

    fun adicionarMidia(midia: Midia) {
        colecao.add(midia)
    }

    fun buscarPorTitulo(termo: String): MutableSet<Midia> {
        val resultado = mutableSetOf<Midia>()
        for (midia in colecao) {
            if (midia.titulo.contains(termo, ignoreCase = true)) {
                resultado.add(midia)
            }
        }
        return resultado
    }

    fun listarDetalhesCompletos() {
        for (midia in colecao) {
            println(midia.detalhesFormatados())
            println("Anos desde do lançamento: ${midia.calcularAnosDesdeLancamento()} anos")
            println("---------------------------------------------------------------")
        }
    }

    fun tentarReproduzir(titulo: String) {

        for (midia in colecao) {
            if (midia.titulo.contains(titulo, ignoreCase = true)) {
                if (midia is Reproduzivel) {
                    midia.iniciarReproducao()
                }else{
                    println("A mídia não é reproduzivel")
                }
                return
            }
        }
        println("A mídia não foi encontrada na biblioteca")


    }


}