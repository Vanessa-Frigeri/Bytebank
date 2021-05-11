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