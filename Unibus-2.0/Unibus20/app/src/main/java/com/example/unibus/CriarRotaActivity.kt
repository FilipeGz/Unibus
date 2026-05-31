package com.example.unibus

import com.example.unibus.data.RouteRepository

class CriarRotaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_criar_rota
    override fun setupScreen() {
        click("btnCancel") { finish() }
        click("btnSave") { RouteRepository.create(textValue("etRouteName"), textValue("etDirection"), textValue("etSchedules")); showSimpleDialog("Rota salva", "Rota cadastrada com sucesso.", "OK") { go(GerenciarRotasActivity::class.java, clear = true) } }
    }
}
