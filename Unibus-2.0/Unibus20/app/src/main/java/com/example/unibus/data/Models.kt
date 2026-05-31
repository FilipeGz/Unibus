package com.example.unibus.data

enum class UserProfile { ALUNO, MOTORISTA, ADMIN }

data class User(
    val name: String,
    val matricula: String,
    var password: String,
    val email: String,
    val profile: UserProfile,
    var qrEnabled: Boolean = true,
    var released: Boolean = true
)

data class BusRoute(
    val id: String,
    var name: String,
    var direction: String,
    var schedules: String
)

data class Notice(val id: String, val author: String, val message: String)
data class SupportTicket(val id: String, val title: String, val description: String, val user: String)
data class TripState(var routeName: String = "", var origin: String = "", var occupied: Int = 0, val capacity: Int = 40)
