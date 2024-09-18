fun main() {
    print("Enter a number: ")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null) {
        println("$number is " + if (number % 2 == 0) "even" else "odd")
    } else {
        println("Invalid input.")
    }
}
