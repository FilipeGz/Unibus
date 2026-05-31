package com.example.unibus

class MapaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_mapa
    override fun setupScreen() {
        click("btnVoltar") { go(LoginActivity::class.java, clear = true) }
        click("etPesquisa") { showCustomDialog(R.layout.popup_pesquisa_rotas) }
        listOf("pontoMapa1", "pontoMapa2", "pontoMapa3", "pontoMapa4", "pontoMapa5").forEach { click(it) { showCustomDialog(R.layout.popup_detalhes_ponto) } }
        click("bottomBar") { go(RotasActivity::class.java) }
    }
}
