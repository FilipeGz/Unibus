package com.example.unibus.core

import android.content.Context
import com.example.unibus.data.UserProfile

object SessionManager {
    private const val PREF = "unibus_session"
    fun saveLogin(context: Context, matricula: String, profile: UserProfile, remember: Boolean) {
        context.getSharedPreferences(PREF, Context.MODE_PRIVATE).edit()
            .putString("matricula", if (remember) matricula else "")
            .putString("profile", profile.name)
            .putBoolean("remember", remember)
            .apply()
    }
    fun rememberedMatricula(context: Context): String = context.getSharedPreferences(PREF, Context.MODE_PRIVATE).getString("matricula", "") ?: ""
    fun rememberEnabled(context: Context): Boolean = context.getSharedPreferences(PREF, Context.MODE_PRIVATE).getBoolean("remember", false)
}
