import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = ArrayList<Int>()

    print("Enter the number of elements:")
    val n = scanner.nextInt()

    print("Enter the elements:")
    for (i in 0 until n) {
        numbers.add(scanner.nextInt())
    }

    val maxNumber = numbers.maxOrNull()

    if (maxNumber != null) {
        println("Largest element = $maxNumber")
    } else {
        println("The list is empty.")
    }
}
