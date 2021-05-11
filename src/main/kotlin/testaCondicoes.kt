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