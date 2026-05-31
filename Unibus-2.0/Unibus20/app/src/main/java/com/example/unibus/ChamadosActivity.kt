package com.example.unibus

class ChamadosActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_chamados
    override fun setupScreen() {
        click("cvSeeMore") { go(ChamadosDetalhadosActivity::class.java) }
        listOf("tvSubject1","tvSubject2","tvSubject3","tvSubject4").forEach { click(it) { go(ChamadoEspecificadoActivity::class.java) } }
    }
}
