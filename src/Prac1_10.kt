class Car(
    val type: String,
    val model: String,
    val price: Double,
    val owner: String,
    var milesDriven: Int
) {
    // Function to get car information
    fun getCarInfo(): String {
        return "Type: $type, Model: $model, Owner: $owner, Miles Driven: $milesDriven"
    }

    // Function to get the original car price
    fun getOriginalPrice(): Double {
        return price
    }

    // Function to get the current car price
    fun getCurrentPrice(): Double {
        // Assuming the car depreciates by 10% for every 10,000 miles driven
        val depreciationRate = 0.10
        val depreciation = (milesDriven / 10000) * depreciationRate * price
        return price - depreciation
    }

    // Function to display car information
    fun displayCarInfo() {
        println(getCarInfo())
        println("Original Price: $$price")
        println("Current Price: $${getCurrentPrice()}")
    }
}

fun main() {
    // Creating an instance of the Car class
    val myCar = Car("Sedan", "Toyota Camry", 30000.0, "John Doe", 15000)

    // Displaying car information
    myCar.displayCarInfo()
}
