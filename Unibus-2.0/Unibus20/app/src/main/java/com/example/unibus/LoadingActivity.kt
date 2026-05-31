package com.example.unibus

class LoadingActivity : BaseActivity() {
    override val layoutResId = R.layout.activity_loading
    override fun setupScreen() { finishDelayed(1100) { go(nextTarget ?: MapaActivity::class.java, clear = true) } }
    companion object { var nextTarget: Class<*>? = null }
}
