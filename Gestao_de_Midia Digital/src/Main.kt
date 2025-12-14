import bib.BibliotecaDigital
import midia.Filme
import midia.Genero
import midia.Livro
import midia.Musica

fun main() {
    val bibliotecaDigital = BibliotecaDigital()

    val livro1 = Livro(
        "Dom Quixote", 1605,
        "Miguel de Cervantes", 1328
    )

    val musica1 = Musica(
        "Beat It", 1982, "Michael Jackson",
        "Thriller"
    )

    val filme1 = Filme(
        "The Shawshank Redemption", 1994,
        "Frank Darabont", "2h 22m", Genero.DRAMA
    )

    bibliotecaDigital.adicionarMidia(livro1)
    bibliotecaDigital.adicionarMidia(musica1)
    bibliotecaDigital.adicionarMidia(filme1)

    bibliotecaDigital.listarDetalhesCompletos()

    println("\n---------------------------------------------------------------")
    println("Iniciando reprodução da Musica")
    bibliotecaDigital.tentarReproduzir("Beat IT")

    println("---------------------------------------------------------------")
    println("Iniciando reprodução do Filme")
    bibliotecaDigital.tentarReproduzir("THE SHAWSHANK REDEMPTION")

    println("---------------------------------------------------------------")
    println("Pesquisa: the")
    val resultados = bibliotecaDigital.buscarPorTitulo("the")

    if (resultados.isEmpty()) {
        println("Nenhuma mídia encontrada.")
    } else {
        for (midia in resultados) {
            println(midia.detalhesFormatados())
        }
    }
}