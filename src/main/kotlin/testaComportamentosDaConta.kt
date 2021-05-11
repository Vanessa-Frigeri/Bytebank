fun testaComportamentosDaConta() {
    var contaVan = Conta(titular = "Vanessa", numero = 1000)
    var contaTami = Conta(titular = "Tamila", numero = 1002)

    contaVan.fazerDeposito(250.0)

    contaTami.fazerDeposito(40.0)

    contaVan.fazerDeposito(50.0)
    println(contaVan.saldoConta)
    println()

    contaVan.fazerSaque(50.0)
    println(contaVan.saldoConta)
    println()

    contaVan.fazerSaque(500.0)
    println(contaVan.saldoConta)
    println()

    contaVan.fazerTransferencia(contaTami, 140.0)
    println(contaVan.saldoConta)
    println(contaTami.saldoConta)
    println()
}