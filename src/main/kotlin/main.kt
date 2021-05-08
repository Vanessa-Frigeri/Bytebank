fun main() {
    println("Bem vindo ao Bytebank")
    Conta()
}

class Conta{
    var titularConta: String = ""
    var numeroConta: Int = 0
    var saldoConta: Double = 0.0
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

    for (i in 10 downTo 1 step 2){
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