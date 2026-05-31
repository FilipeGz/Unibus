package com.example.unibus

class SuporteActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_suporte
    override fun setupScreen() { click("btnSend") { go(SucessoSuporteActivity::class.java) } }
}
