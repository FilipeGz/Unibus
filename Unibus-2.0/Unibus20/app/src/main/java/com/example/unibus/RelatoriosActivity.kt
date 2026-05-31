package com.example.unibus

class RelatoriosActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_relatorios
    override fun setupScreen() {
        click("cvFilters") { showSimpleDialog("Filtros", "Tentativas inválidas, picos de uso e solicitações de acessibilidade.") }
    }
}
