fun main() {
    print("Enter an integer value: ")
    val intValue = readlnOrNull()?.toIntOrNull()
    if (intValue != null) {
        val doubleValue = intValue.toDouble()
        println("Double Value (From Integer): $doubleValue")
    } else {
        println("Invalid integer input.")
    }

    print("Enter a string value representing an integer: ")
    val stringValue = readlnOrNull()
    val intValueFromString = stringValue?.toIntOrNull()
    if (intValueFromString != null) {
        println("Integer Value (From String): $intValueFromString")
    } else {
        println("Invalid integer string input.")
    }

    print("Enter a string value representing a double: ")
    val doubleStringValue = readlnOrNull()
    val doubleValueFromString = doubleStringValue?.toDoubleOrNull()
    if (doubleValueFromString != null) {
        println("Double Value (From String): $doubleValueFromString")
    } else {
        println("Invalid double string input.")
    }
}
