package com.example.unibus

class AcompanhamentoRotaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_acompanhamento_rota
    override fun setupScreen() {
        click("btnQrCodeAluno") { go(QrCodeActivity::class.java) }
        click("btnPosicaoNaRotaAluno") { showCustomDialog(R.layout.popup_detalhes_ponto) }
        click("btnPesquisarPontosAluno") { showCustomDialog(R.layout.popup_pesquisa_rotas) }
        listOf("pontoMapa1", "pontoMapa2", "pontoMapa3", "pontoMapa4", "pontoMapa5").forEach { click(it) { showCustomDialog(R.layout.popup_detalhes_ponto) } }
        click("navInicioMapaAluno") { go(MapaActivity::class.java, clear = true) }
        click("navSuporteMapaAluno") { go(SuporteActivity::class.java) }
    }
}
