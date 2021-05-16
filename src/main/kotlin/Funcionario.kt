open class Employee(
    val employeeName: String,
    val employeeCPF: String,
    val employeeSalary: Double,
    val employeePassword: Int
) {
    open val calculateBonus: Double
        get() = employeeSalary * 0.1

    open fun employeeAuthentication(password: Int): Boolean {
        if (this.employeePassword == password) {
            return true
        }
        return false
    }

}
