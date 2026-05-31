package com.example.unibus

import com.example.unibus.data.AuthRepository

class ConfirmarCodigoActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_confirmar_codigo
    override fun setupScreen() {
        click("btnReenviar") { toast("Código reenviado. Para teste, use: 123456") }
        click("btnConfirmar") {
            if (AuthRepository.validateRecoveryCode(textValue("editCodigo"))) go(AlterarSenhaActivity::class.java)
            else toast("Código inválido.")
        }
    }
}
