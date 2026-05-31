package com.example.unibus

class LotacaoAtingidaAlertaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_lotacao_atingida_alerta
    override fun setupScreen() { click("btnOk") { go(RotaAndamentoActivity::class.java, clear = true) } }
}
