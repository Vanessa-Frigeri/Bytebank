class Gerente(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
) : Employee(
    employeeName = name,
    employeeCPF = cpf,
    employeeSalary = salary,
    employeePassword = password
) {

    override val calculateBonus: Double
        get() {
            return super.calculateBonus + employeeSalary
        }

    override fun employeeAuthentication(password: Int): Boolean {
        if (this.employeePassword == password) {
            return true
        }
        return false
    }
}