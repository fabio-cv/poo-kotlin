package model

class Utilizador(
    val nome: String,
    var email: String,
    senha: String

) {

    private val senhaHash = senha.hashCode().toString()//senha cifrada

    fun validarSenha(senha: String): Boolean{
        return senha.hashCode().toString() == senhaHash
    }

    fun getSenhaHash(): String {
        return senhaHash
    }

    val cargos = mutableListOf<Cargo>()
}