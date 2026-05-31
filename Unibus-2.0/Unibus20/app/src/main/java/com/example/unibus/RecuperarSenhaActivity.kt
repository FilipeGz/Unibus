package com.example.unibus

import com.example.unibus.data.AuthRepository

class RecuperarSenhaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_recuperar_senha
    override fun setupScreen() {
        click("btnVoltar") { go(LoginActivity::class.java, clear = true) }
        click("btnEnviar") {
            val identifier = textValue("editEmail")
            if (identifier.isBlank()) { toast("Informe sua matrícula ou e-mail institucional."); return@click }
            if (AuthRepository.startPasswordRecovery(identifier)) {
                toast("Código enviado. Para teste, use: 123456")
                go(ConfirmarCodigoActivity::class.java)
            } else toast("Matrícula/e-mail não encontrado.")
        }
    }
}
