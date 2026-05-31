package com.example.unibus

class InicialMotoristaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_inicial_motorista
    override fun setupScreen() {
        click("cvNotices") { go(AvisosMotoristaActivity::class.java) }
        click("btnStartRouteMotorista") {
            showCustomDialog(R.layout.dialog_iniciar_rota) { dialog ->
                listOf("btnRouteParangaba", "btnRouteAntBezerra", "btnRouteMessejana").forEach { name ->
                    val viewId = resources.getIdentifier(name, "id", packageName)
                    dialog.findViewById<android.view.View>(viewId)?.setOnClickListener {
                        dialog.dismiss()
                        showCustomDialog(R.layout.dialog_selecionar_origem) { origemDialog ->
                            listOf("btnOriginTerminal", "btnOriginCampus").forEach { originId ->
                                val oid = resources.getIdentifier(originId, "id", packageName)
                                origemDialog.findViewById<android.view.View>(oid)?.setOnClickListener { origemDialog.dismiss(); go(RotaAndamentoActivity::class.java) }
                            }
                        }
                    }
                }
            }
        }
    }
}
