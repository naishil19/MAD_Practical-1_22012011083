import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the first number:")
    val num1 = scanner.nextDouble()

    print("Enter the second number:")
    val num2 = scanner.nextDouble()

    println("Addition of $num1 & $num2 is: ${add(num1, num2)}")
    println("Subtraction of $num1 & $num2 is: ${subtract(num1, num2)}")
    println("Multiplication of $num1 & $num2 is: ${multiply(num1, num2)}")
    println("Division of $num1 & $num2 is: ${divide(num1, num2)}")
}

fun add(a: Double, b: Double): Double {
    return a + b
}

fun subtract(a: Double, b: Double): Double {
    return a - b
}

fun multiply(a: Double, b: Double): Double {
    return a * b
}

fun divide(a: Double, b: Double): Double {
    return if (b != 0.0) a / b else Double.NaN
}
