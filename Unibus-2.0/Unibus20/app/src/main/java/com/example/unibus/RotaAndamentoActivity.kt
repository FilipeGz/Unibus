package com.example.unibus

class RotaAndamentoActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_rota_andamento
    override fun setupScreen() {
        click("cvMainInfo") { go(LotacaoAtingidaActivity::class.java) }
        click("cvBtnContainer") { showCustomDialog(R.layout.popup_confirmacao_rota) { dialog ->
            val sim = resources.getIdentifier("btnSim", "id", packageName)
            val nao = resources.getIdentifier("btnNao", "id", packageName)
            dialog.findViewById<android.view.View>(sim)?.setOnClickListener { dialog.dismiss(); showCustomDialog(R.layout.popup_sucesso_rota) { d -> finishDelayed(900) { d.dismiss(); go(InicialMotoristaActivity::class.java, clear = true) } } }
            dialog.findViewById<android.view.View>(nao)?.setOnClickListener { dialog.dismiss() }
        } }
        click("btnBack") { go(InicialMotoristaActivity::class.java, clear = true) }
    }
}
