import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a number:")
    val number = scanner.nextInt()

    println("Factorial of $number = ${factorial(number)}")
}

fun factorial(n: Int): Int {
    return if (n == 1) 1 else n * factorial(n - 1)
}

