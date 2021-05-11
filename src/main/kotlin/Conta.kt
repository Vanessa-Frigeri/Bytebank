class Conta(
    var titular: String,
    val numero: Int
) {
    var saldoConta: Double = 0.0
        private set

    fun fazerDeposito(valorDeposito: Double) {
        if (valorDeposito > 0) {
            this.saldoConta += valorDeposito
        }
    }

    fun fazerSaque(valorSaque: Double): Boolean {
        if (this.saldoConta >= valorSaque) {
            this.saldoConta -= valorSaque
            return true
        }
        println("Saldo da Conta é insuficiente!")
        return false

    }

    fun fazerTransferencia(contaDestino: Conta, valorTransferencia: Double): Boolean {
        if (this.fazerSaque(valorTransferencia)) {
            contaDestino.fazerDeposito(valorTransferencia)
            println("Transferência realizada!")
            return true
        }
        println("Falha na transferência! Saldo da Conta é insuficiente!")
        return false
    }

}