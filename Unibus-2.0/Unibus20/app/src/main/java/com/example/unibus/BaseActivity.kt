package com.example.unibus

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.unibus.data.FakeDatabase

abstract class BaseActivity : AppCompatActivity() {
    abstract val layoutResId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId)
        setupCommonBackButtons()
        setupScreen()
    }

    open fun setupScreen() {}

    fun id(name: String): Int = resources.getIdentifier(name, "id", packageName)

    fun click(name: String, action: () -> Unit) {
        val viewId = id(name)
        if (viewId != 0) findViewById<View>(viewId)?.setOnClickListener { action() }
    }

    fun go(target: Class<*>, clear: Boolean = false) {
        val intent = Intent(this, target)
        if (clear) intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun toast(message: String) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

    fun textValue(name: String): String {
        val viewId = id(name)
        if (viewId == 0) return ""
        val view = findViewById<View>(viewId)
        return when (view) {
            is EditText -> view.text.toString().trim()
            is TextView -> view.text.toString().trim()
            else -> ""
        }
    }

    fun setText(name: String, value: String) {
        val viewId = id(name)
        if (viewId != 0) (findViewById<View>(viewId) as? TextView)?.text = value
    }

    fun showSimpleDialog(title: String, message: String, positive: String = "OK", onPositive: (() -> Unit)? = null) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(positive) { dialog, _ -> dialog.dismiss(); onPositive?.invoke() }
            .show()
    }

    fun showCustomDialog(layout: Int, configure: (Dialog) -> Unit = {}) {
        val dialog = Dialog(this)
        dialog.setContentView(layout)
        configure(dialog)
        val closeIds = listOf("btnClose", "btnCloseDialog", "btnClosePopup", "btnFecharPopup", "btnFecharConfirmacao", "btnFecharSucesso")
        closeIds.forEach { name ->
            val viewId = resources.getIdentifier(name, "id", packageName)
            if (viewId != 0) dialog.findViewById<View>(viewId)?.setOnClickListener { dialog.dismiss() }
        }
        dialog.show()
    }

    fun finishDelayed(ms: Long = 900, action: () -> Unit) {
        Handler(Looper.getMainLooper()).postDelayed({ action() }, ms)
    }

    private fun setupCommonBackButtons() {
        listOf("btnBack", "btnVoltar", "btnBackQr", "btnBackAvisos", "btnBackConfirm", "btnBackBg").forEach { name ->
            click(name) { finish() }
        }
    }
}
