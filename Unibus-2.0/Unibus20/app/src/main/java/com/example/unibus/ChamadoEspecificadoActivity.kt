package com.example.unibus

class ChamadoEspecificadoActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_chamado_especificado
    override fun setupScreen() { click("btnResponder") { go(ResponderChamadoActivity::class.java) } }
}
