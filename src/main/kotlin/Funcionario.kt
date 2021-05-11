class Funcionario(
    val nomeFuncionario: String,
    val cpfFuncionario: String,
    val salarioFuncionario: Double
) {
    fun calculaBonus(): Double {
        return salarioFuncionario * 0.1
    }

}