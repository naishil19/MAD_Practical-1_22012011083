//1. Printing Arrays using Different Methods
//import java.util.Arrays
//
//fun main() {
//    val array1 = arrayOf(20, 100, 30, 70,50)
//    val array2 = arrayOf(0, 0, 0, 0, 0)
//    val array3 = Array(8) { it }
//    val array4 = IntArray(5)
//    val array5 = intArrayOf(19, 42, 9, 21, 23, 4)
//    val array6 = arrayOf(intArrayOf(1, 9), intArrayOf(4, 2), intArrayOf(2, 1))
//
//    println("Array1: ${Arrays.deepToString(array1)}")
//    println("Array2: ${array2.contentDeepToString()}")
//    println("Array3: ${array3.joinToString()}")
//    println("Array4: ${array4.joinToString()}")
//    println("Array5: ${array5.joinToString()}")
//    println("Array6: ${array6.contentDeepToString()}")
//}
//******************************************************************************************************
//2. Manipulating Arrays with Loops
//fun main() {
//    val array = intArrayOf(19, 42, 9, 21, 23, 4)
//
//    print("Array using range : ")
//    for (i in 0..array.lastIndex) {
//        print("${array[i]} ")
//    }
//    println()
//
//    print("Array using downTo : ")
//    for (i in array.lastIndex downTo 0) {
//        print("${array[i]} ")
//    }
//    println()
//
//    print("Array using until : ")
//    for (i in 0 until array.size) {
//        print("${array[i]} ")
//    }
//    println()
//}
//******************************************************************************************************
//3. Sorting an Array with Built-in Functions
//fun main() {
//    val array = intArrayOf(52, 23, 42, 19, 4)
//    println("Array before sorting : ${array.joinToString()}")
//    array.sort()
//    println("Array after sorting : ${array.joinToString()}")
//}
//******************************************************************************************************
//4. Sorting an Array without Built-in Functions
fun main() {
    val array = intArrayOf(52, 23, 42, 19, 4)
    println("Array before sorting : ${array.joinToString()}")
    bubbleSort(array)
    println("Array after sorting : ${array.joinToString()}")
}

fun bubbleSort(array: IntArray) {
    for (i in array.indices) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}
