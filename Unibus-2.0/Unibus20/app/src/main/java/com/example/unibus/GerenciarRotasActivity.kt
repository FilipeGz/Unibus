package com.example.unibus

class GerenciarRotasActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_gerenciar_rotas
    override fun setupScreen() {
        click("btnNewRoute") { go(CriarRotaActivity::class.java) }
        click("btnEdit1") { go(EditarRotaActivity::class.java) }
        click("btnEdit2") { go(EditarRotaActivity::class.java) }
        click("btnDelete1") { go(ExcluirRotaActivity::class.java) }
        click("btnDelete2") { go(ExcluirRota2Activity::class.java) }
    }
}
