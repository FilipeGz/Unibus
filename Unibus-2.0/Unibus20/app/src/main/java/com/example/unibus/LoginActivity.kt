package com.example.unibus

import android.widget.CheckBox
import android.widget.EditText
import com.example.unibus.core.SessionManager
import com.example.unibus.data.AuthRepository
import com.example.unibus.data.UserProfile

class LoginActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_login
    override fun setupScreen() {
        findViewById<EditText?>(id("etMatricula"))?.setText(SessionManager.rememberedMatricula(this))
        findViewById<CheckBox?>(id("cbLembrar"))?.isChecked = SessionManager.rememberEnabled(this)
        click("tvEsqueciSenha") { go(RecuperarSenhaActivity::class.java) }
        click("btnEntrar") {
            val login = textValue("etMatricula")
            val senha = textValue("etSenha")
            if (login.isBlank() || senha.isBlank()) {
                toast("Informe matrícula e senha.")
                return@click
            }
            val user = AuthRepository.login(login, senha)
            if (user == null) {
                toast("Matrícula ou senha incorretos!")
            } else {
                val remember = findViewById<CheckBox?>(id("cbLembrar"))?.isChecked == true
                SessionManager.saveLogin(this, user.matricula, user.profile, remember)
                val target = when (user.profile) {
                    UserProfile.ADMIN -> InicialAdminActivity::class.java
                    UserProfile.MOTORISTA -> InicialMotoristaActivity::class.java
                    UserProfile.ALUNO -> MapaActivity::class.java
                }
                go(LoadingActivity::class.java)
                LoadingActivity.nextTarget = target
                finish()
            }
        }
    }
}
