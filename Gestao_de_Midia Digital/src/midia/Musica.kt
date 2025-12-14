package midia

class Musica(
    titulo: String,
    anoPublicacao: Int,
    private val artista: String,
    private val album: String

) : Midia(titulo, anoPublicacao), Reproduzivel {

    override fun detalhesFormatados(): String {
        return "Musica: $titulo | Artista: $artista | Ano de Publicação: $anoPublicacao | " +
                "Album: $album"
    }

    override fun iniciarReproducao() {
        println("Reproduzindo $titulo...")
    }

    override fun pararReproducao() {
        println("Parando de reproduzir $titulo")
    }
}