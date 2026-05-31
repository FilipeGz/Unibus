package com.example.unibus

class Estatisticas2Activity : BaseActivity() {
    override val layoutResId = R.layout.activity_estatisticas_2
    override fun setupScreen() { click("btnOpenCalendar") { showCustomDialog(R.layout.dialog_calendario) } }
}
