package com.example.unibus

class LerQrCodeActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_ler_qrcode
    override fun setupScreen() {
        click("cvCameraView") { go(EntradaLiberadaActivity::class.java) }
        click("navInicioMotoristaMapa") { go(InicialMotoristaActivity::class.java, clear = true) }
    }
}
