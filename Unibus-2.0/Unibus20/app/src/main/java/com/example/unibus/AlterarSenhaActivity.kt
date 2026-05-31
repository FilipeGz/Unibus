package com.example.unibus

import com.example.unibus.data.AuthRepository

class AlterarSenhaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_alterar_senha
    override fun setupScreen() {
        click("btnSalvar") {
            val nova = textValue("editNovaSenha")
            val confirmar = textValue("editConfirmarSenha")
            when {
                nova.length < 6 -> toast("A senha precisa ter pelo menos 6 caracteres.")
                nova != confirmar -> toast("As senhas não conferem.")
                AuthRepository.updatePassword(nova) -> showSimpleDialog("Senha atualizada", "Sua senha foi alterada com sucesso.", "Voltar ao login") { go(LoginActivity::class.java, clear = true) }
                else -> toast("Não foi possível atualizar a senha.")
            }
        }
    }
}
