package com.example.unibus

class SucessoSuporteActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_sucesso_suporte
    override fun setupScreen() { click("btnBackToStart") { go(MapaActivity::class.java, clear = true) } }
}
