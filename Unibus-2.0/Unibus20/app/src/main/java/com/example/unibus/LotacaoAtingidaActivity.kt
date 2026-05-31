package com.example.unibus

class LotacaoAtingidaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_lotacao_atingida
    override fun setupScreen() { click("cvBtnContainer") { go(LerQrCodeActivity::class.java) } }
}
