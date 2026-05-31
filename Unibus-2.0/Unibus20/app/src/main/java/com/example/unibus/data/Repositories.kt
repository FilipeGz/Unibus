package com.example.unibus.data

object AuthRepository {
    fun login(identifier: String, password: String): User? {
        val value = identifier.trim().lowercase()
        return FakeDatabase.users.firstOrNull {
            (it.matricula.lowercase() == value || it.email.lowercase() == value || it.profile.name.lowercase() == value) && it.password == password
        }
    }

    fun startPasswordRecovery(identifier: String): Boolean {
        val value = identifier.trim().lowercase()
        val user = FakeDatabase.users.firstOrNull { it.matricula.lowercase() == value || it.email.lowercase() == value }
        FakeDatabase.recoveryMatricula = user?.matricula
        return user != null
    }

    fun validateRecoveryCode(code: String): Boolean = code.trim() == FakeDatabase.recoveryCode

    fun updatePassword(newPassword: String): Boolean {
        val matricula = FakeDatabase.recoveryMatricula ?: return false
        val user = FakeDatabase.users.firstOrNull { it.matricula == matricula } ?: return false
        user.password = newPassword
        return true
    }
}

object RouteRepository {
    fun all() = FakeDatabase.routes
    fun create(name: String, direction: String, schedules: String) {
        FakeDatabase.routes.add(BusRoute((FakeDatabase.routes.size + 1).toString(), name, direction, schedules))
    }
}

object NoticeRepository {
    fun all() = FakeDatabase.notices
    fun send(message: String) {
        FakeDatabase.notices.add(0, Notice(System.currentTimeMillis().toString(), "Motorista", message))
    }
}

object QrCodeService {
    fun validateStudentQr(raw: String): String {
        val available = FakeDatabase.tripState.capacity - FakeDatabase.tripState.occupied
        if (available <= 0) return "Lotação Máxima Atingida"
        val user = FakeDatabase.users.firstOrNull { it.matricula == raw.trim() || raw.contains(it.matricula) }
        return if (user != null && user.released && user.qrEnabled) {
            FakeDatabase.tripState.occupied += 1
            "Entrada Liberada"
        } else "Entrada Recusada"
    }
}
