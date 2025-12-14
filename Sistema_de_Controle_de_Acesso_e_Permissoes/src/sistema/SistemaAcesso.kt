package sistema

import model.Cargo
import model.Permissao
import model.Utilizador

class SistemaAcesso {
    private val utilizadoresRegistados = mutableSetOf<Utilizador>()

    fun registarUtilizador(nome: String, email: String, senha: String) {
        val senhaHash = senha.hashCode().toString()
        val novoUtilizador = Utilizador(nome, email, senhaHash)

        utilizadoresRegistados.add(novoUtilizador)
    }

    fun atribuirCargo(nomeUtilizador: String, cargo: Cargo) {
        for (utilizador in utilizadoresRegistados) {
            if (utilizador.nome.equals(nomeUtilizador, ignoreCase = true)) {
                utilizador.cargos.add(cargo)
                return
            }
        }
        println("model.Utilizador $nomeUtilizador não encontrado")
    }

    fun autenticar(email: String, senha: String): Utilizador? {
        for (utilizador in utilizadoresRegistados) {
            if (email == utilizador.email && utilizador.validarSenha(senha)) {
                println("Autenticação bem sucedida\n")
                return utilizador
            }
        }
        println("Autenticação falhou: Email ou Senha incorrectos\n")
        return null
    }

    fun verificarPermissao(emailUtilizador: String, permissao: Permissao): Boolean {
        for (utilizador in utilizadoresRegistados){
            if (emailUtilizador == utilizador.email){
                for (c in utilizador.cargos){
                    if (c.verificarSeTemPermissao(permissao)){
                        return true
                    }
                }
            }
        }
        return false
    }
}