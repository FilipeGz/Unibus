package com.example.unibus

class EditarRotaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_editar_rota
    override fun setupScreen() {
        click("btnCancel") { finish() }
        click("btnSave") { showSimpleDialog("Rota atualizada", "Dados da rota atualizados com sucesso.", "OK") { go(GerenciarRotasActivity::class.java, clear = true) } }
    }
}
