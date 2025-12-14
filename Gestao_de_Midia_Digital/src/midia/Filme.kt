package midia

class Filme(
    titulo: String,
    anoPublicacao: Int,
    private val diretor: String,
    private var duracao: String,
    private val genero: Genero

) : Midia(titulo, anoPublicacao), Reproduzivel {

    override fun detalhesFormatados(): String {
        return "Filme: $titulo | Diretor: $diretor | Ano de Publicação: $anoPublicacao | " +
                "Duracao: $duracao | Genero: $genero"
    }

    override fun iniciarReproducao() {
        println("Reproduzindo $titulo...")
    }

    override fun pararReproducao() {
        println("Parando de reproduzir $titulo")
    }
}

