import model.Cargo
import model.Permissao
import sistema.SistemaAcesso

fun main() {
    val sistemaAcesso = SistemaAcesso()

    val gerente = Cargo("Gerente")
    val adm = Cargo("Administrador")

    gerente.adicionarPermissao(Permissao.CRIAR)
    gerente.adicionarPermissao(Permissao.ATUALIZAR)
    gerente.adicionarPermissao(Permissao.ELIMINAR)
    gerente.adicionarPermissao(Permissao.LER)

    adm.adicionarPermissao(Permissao.ADMINISTRAR_UTILIZADORES)

    sistemaAcesso.registarUtilizador("Messi", "messi@gmail.com","messi1234")
    sistemaAcesso.registarUtilizador("Ronaldo", "ronaldo@gmail.com","ronaldocr7")

    sistemaAcesso.atribuirCargo("Messi", gerente)
    sistemaAcesso.atribuirCargo("Ronaldo", adm)

    sistemaAcesso.autenticar("messi@gmail.com","messi1234")
    sistemaAcesso.autenticar("ronaldo@gmail.com", "cr7")

    println(sistemaAcesso.verificarPermissao("messi@gmail.com", Permissao.ELIMINAR))
    println(sistemaAcesso.verificarPermissao("ronaldo@gmail.com", Permissao.ELIMINAR))
}