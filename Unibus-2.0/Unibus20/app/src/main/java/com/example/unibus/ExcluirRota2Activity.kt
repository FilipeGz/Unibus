package com.example.unibus

class ExcluirRota2Activity : BaseActivity() {
    override val layoutResId = R.layout.activity_excluir_rota_2
    override fun setupScreen() { click("btnSim") { go(SucessoExclusaoPapicuActivity::class.java) }; click("btnNao") { finish() }; click("btnClosePopup") { finish() } }
}
