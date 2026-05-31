package com.example.unibus

class RotasActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_rotas
    override fun setupScreen() {
        click("btnRota1") { go(AcompanhamentoRotaActivity::class.java) }
        click("btnRota2") { go(AcompanhamentoRotaActivity::class.java) }
        click("btnRota3") { go(AcompanhamentoRotaActivity::class.java) }
        click("btnNovaRota") { go(RotaIndisponivelActivity::class.java) }
    }
}
