package model

class Cargo(
    val nome: String, // ex:Programador,...
) {

    val listaPermissoes = mutableSetOf<Permissao>()

    fun adicionarPermissao(permissao: Permissao) {
        listaPermissoes.add(permissao)
    }

    fun removerPermissao(permissao: Permissao) {
        listaPermissoes.remove(permissao)
    }

    fun verificarSeTemPermissao(permissao: Permissao): Boolean {
        for (p in listaPermissoes) {
            if (p == permissao) {
                return true
            }
        }
        return false
    }
}