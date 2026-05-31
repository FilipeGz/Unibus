package com.example.unibus

class InicialAdminActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_inicial_admin
    override fun setupScreen() {
        click("cvTicketsCount") { go(ChamadosActivity::class.java) }
        click("btnGeneralStats") { go(Estatisticas2Activity::class.java) }
        click("btnManageRoutes") { go(GerenciarRotasActivity::class.java) }
        click("btnManageUsers") { go(GerenciarUsuariosActivity::class.java) }
        click("btnReports") { go(RelatoriosActivity::class.java) }
    }
}
