package com.example.unibus

class ResponderChamadoActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_responder_chamado
    override fun setupScreen() { click("btnEnviarPopup") { showSimpleDialog("Resposta enviada", "Mensagem enviada com sucesso.", "Voltar ao início") { go(InicialAdminActivity::class.java, clear = true) } } }
}
