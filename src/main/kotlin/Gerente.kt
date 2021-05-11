class Gerente(
    val nomeGerente: String,
    val cpfGerente: String,
    val salarioGerente: Double,
    val senhaGerente: Int
) {
    fun calculaBonus(): Double {
        return salarioGerente * 0.2
    }

    fun autenticaFuncionario(senha: Int): Boolean {
        if (this.senhaGerente == senha) {
            return true
        }
        return false
    }
}