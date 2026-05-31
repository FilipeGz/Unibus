package com.example.unibus

class EntradaLiberadaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_entrada_liberada
    override fun setupScreen() { click("btnOk") { go(RotaAndamentoActivity::class.java, clear = true) } }
}
