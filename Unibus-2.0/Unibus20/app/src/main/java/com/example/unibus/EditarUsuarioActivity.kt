package com.example.unibus

class EditarUsuarioActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_editar_usuario
    override fun setupScreen() {
        click("cvStatusLiberado") { toast("Status Liberado alterado.") }
        click("cvStatusQR") { showCustomDialog(R.layout.popup_sucesso_qrcode) }
    }
}
