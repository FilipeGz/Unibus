package com.example.unibus

class SucessoExclusaoActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_sucesso_exclusao
    override fun setupScreen() { click("btnOk") { go(GerenciarRotasActivity::class.java, clear = true) } }
}
