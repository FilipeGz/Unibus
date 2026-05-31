package com.example.unibus

class GerenciarUsuariosActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_gerenciar_usuarios
    override fun setupScreen() {
        listOf("etSearch", "etSearch2", "etSearch3", "etSearch5", "etSearch6", "ivSearchIcon", "cvSearch").forEach { click(it) { go(EditarUsuarioActivity::class.java) } }
    }
}
