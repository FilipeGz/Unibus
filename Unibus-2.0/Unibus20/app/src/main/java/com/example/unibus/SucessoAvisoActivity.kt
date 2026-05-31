package com.example.unibus

class SucessoAvisoActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_sucesso_aviso
    override fun setupScreen() { click("btnReturn") { go(InicialMotoristaActivity::class.java, clear = true) } }
}
