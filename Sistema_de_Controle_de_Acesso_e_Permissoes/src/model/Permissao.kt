package model

enum class Permissao(val descricao: String) {
    CRIAR("Criar novos registos"),
    LER("Ver registos existentes"),
    ATUALIZAR("Modificar registos"),
    ELIMINAR("Remover registos"),
    ADMINISTRAR_UTILIZADORES("Administrar utilizadores e permissões do sistema")
}