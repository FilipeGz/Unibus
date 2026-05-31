package com.example.unibus.data

object FakeDatabase {
    val users = mutableListOf(
        User("Leandro Soares", "2026001", "123456", "2026001@edu.unifor.br", UserProfile.ALUNO),
        User("Motorista Unibus", "2026002", "123456", "motorista@unibus.com", UserProfile.MOTORISTA),
        User("Administrador Unibus", "2026003", "123456", "admin@unibus.com", UserProfile.ADMIN)
    )

    val routes = mutableListOf(
        BusRoute("1", "Parangaba", "Faculdade ↔ Terminal", "18:00, 20:30, 22:40"),
        BusRoute("2", "Ant. Bezerra / Papicu", "Faculdade ↔ Terminais", "18:10, 20:40, 22:40"),
        BusRoute("3", "Messejana / Eusébio", "Faculdade ↔ Terminais", "18:20, 20:50, 22:40")
    )

    val notices = mutableListOf(
        Notice("1", "Motorista", "Rota Parangaba sairá às 22h40."),
        Notice("2", "Motorista", "Atenção aos pontos de parada próximos."),
        Notice("3", "Sistema", "Apresente o QR Code ao motorista para validação.")
    )

    val tickets = mutableListOf(
        SupportTicket("1", "Atraso na rota", "Ônibus atrasou no terminal.", "Aluno"),
        SupportTicket("2", "Ponto sem sinalização", "Ponto próximo precisa de identificação.", "Aluno"),
        SupportTicket("3", "Dúvida sobre QR Code", "Aluno não conseguiu validar o embarque.", "Aluno")
    )

    var tripState = TripState()
    var recoveryMatricula: String? = null
    var recoveryCode: String = "123456"
}
