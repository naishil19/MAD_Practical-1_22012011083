import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter an integer value:")
    val intValue: Int = scanner.nextInt()
    val doubleValue: Double = intValue.toDouble()
    println("Double Value (From Integer): $doubleValue")

    print("Enter a string value representing an integer:")
    val stringValue: String = scanner.next()
    val intValueFromString: Int = stringValue.toInt()
    println("Integer Value (From String): $intValueFromString")

    print("Enter a string value representing a double:")
    val doubleStringValue: String = scanner.next()
    val doubleValueFromString: Double = doubleStringValue.toDouble()
    println("Double Value (From String): $doubleValueFromString")
}
