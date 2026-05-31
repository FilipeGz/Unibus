package com.example.unibus

import com.example.unibus.data.NoticeRepository

class AddAvisoActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_add_aviso
    override fun setupScreen() { click("btnEnviarAviso") { NoticeRepository.send(textValue("etAvisoInput")); go(SucessoAvisoActivity::class.java) } }
}
