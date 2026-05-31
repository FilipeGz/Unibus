package com.example.unibus

class AvisosMotoristaActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_avisos_motorista
    override fun setupScreen() { click("btnAddMessage") { go(AddAvisoActivity::class.java) } }
}
