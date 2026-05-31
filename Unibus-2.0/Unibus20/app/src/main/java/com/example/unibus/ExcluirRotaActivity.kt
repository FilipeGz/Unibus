package com.example.unibus

class ExcluirRotaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_excluir_rota
    override fun setupScreen() { click("btnSim") { go(SucessoExclusaoParangabaActivity::class.java) }; click("btnNao") { finish() }; click("btnClosePopup") { finish() } }
}
