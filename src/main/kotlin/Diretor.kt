class Diretor(
    name: String,
    cpf: String,
    salary: Double,
    password: Int,
    val plr: Double
) : Employee(
    employeeName = name,
    employeeCPF = cpf,
    employeeSalary = salary,
    employeePassword = password
) {

    override val calculateBonus: Double
        get() {
            return super.calculateBonus + employeeSalary + plr
        }

    override fun employeeAuthentication(password: Int): Boolean {
        if (this.employeePassword == password) {
            return true
        }
        return false
    }
}