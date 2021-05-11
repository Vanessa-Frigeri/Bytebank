fun main() {
    println("Bem vindo ao Bytebank")

    var contaVan = Conta(titular = "Vanessa", numero = 1000)
    var contaTami = Conta(titular ="Tamila", numero = 1002)


//    contaVan.fazerDeposito(250.0)
//
//    contaTami.fazerDeposito(40.0)
//
//    contaVan.fazerDeposito(50.0)
//    println(contaVan.saldoConta)
//    println()
//
//    contaVan.fazerSaque(50.0)
//    println(contaVan.saldoConta)
//    println()
//
//    contaVan.fazerSaque(500.0)
//    println(contaVan.saldoConta)
//    println()
//
//    contaVan.fazerTransferencia(contaTami, 140.0)
//    println(contaVan.saldoConta)
//    println(contaTami.saldoConta)
//    println()
}

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

fun testaLacos() {
    var i = 0;
    while (i < 10) {
        var titularConta: String = "Vanessa $i"
        val numeroConta: Int = 1000 + i
        var saldoConta: Double = i + 30.0
        println("Titular da Conta: $titularConta")
        println("Numero da Conta: $numeroConta")
        println("Saldo da Conta: $saldoConta")
        println("+++++")
        i++
    }

    for (i in 10 downTo 1 step 2) {
        var titularConta: String = "Vanessa $i"
        val numeroConta: Int = 2000 + i
        var saldoConta: Double = i + 20.0

        println("Titular da Conta: $titularConta")
        println("Numero da Conta: $numeroConta")
        println("Saldo da Conta: $saldoConta")
        println("+++++")
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> {
            println("O saldo é positivo!")
        }
        saldo == 0.0 -> {
            println("O saldo é neutro!")
        }
        else -> {
            println("O saldo é negativo!")
        }
    }
}