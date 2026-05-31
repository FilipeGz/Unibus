package com.example.unibus

class SucessoExclusaoParangabaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_sucesso_exclusao_parangaba
    override fun setupScreen() { click("btnOk") { go(GerenciarRotasActivity::class.java, clear = true) } }
}
