package com.example.unibus

class ChamadosDetalhadosActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_chamados_detalhados
    override fun setupScreen() { listOf("cvArrow1","cvArrow2","cvArrow3","cvArrow4").forEach { click(it) { go(ChamadoEspecificadoActivity::class.java) } } }
}
