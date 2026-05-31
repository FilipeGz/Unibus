package com.example.unibus

class EntradaRecusadaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_entrada_recusada
    override fun setupScreen() { click("btnOk") { go(RotaAndamentoActivity::class.java, clear = true) } }
}
