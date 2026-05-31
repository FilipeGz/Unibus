package com.example.unibus

class SucessoExclusaoPapicuActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_sucesso_exclusao_papicu
    override fun setupScreen() { click("btnOk") { go(GerenciarRotasActivity::class.java, clear = true) } }
}
