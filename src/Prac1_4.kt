import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a number:")
    val number = scanner.nextInt()

    println("$number is " + if (number % 2 == 0) "even" else "odd")
}
