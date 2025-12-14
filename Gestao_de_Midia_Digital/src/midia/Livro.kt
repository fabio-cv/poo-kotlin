package midia

class Livro(
    titulo: String,
    anoPublicacao: Int,
    private val autor: String,
    private var numPaginas: Int

) : Midia(titulo, anoPublicacao) {

    override fun detalhesFormatados(): String {
        return "Livro: $titulo | Autor: $autor | Ano de Publicação: $anoPublicacao | " +
                "Número de páginas: $numPaginas"
    }
}