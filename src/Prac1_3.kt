data class Student(
    val name: String,
    val enrollmentNo: String,
    val branch: String,
    val collegeName: String,
    val batch: String,
    val age: Int
)

fun main() {
    print("Enter student's name: ")
    val name = readlnOrNull().orEmpty()
    print("Enter student's enrollment number: ")
    val enrollmentNo = readlnOrNull().orEmpty()
    print("Enter student's branch: ")
    val branch = readlnOrNull().orEmpty()
    print("Enter student's college name: ")
    val collegeName = readlnOrNull().orEmpty()
    print("Enter student's batch: ")
    val batch = readlnOrNull().orEmpty()
    print("Enter student's age: ")
    val age = readlnOrNull()?.toIntOrNull() ?: 0

    val student = Student(name, enrollmentNo, branch, collegeName, batch, age)

    println("***************")
    println("Student's Data:")
    println("***************")
    println("Name: ${student.name}")
    println("Enrollment No.: ${student.enrollmentNo}")
    println("Branch: ${student.branch}")
    println("College Name: ${student.collegeName}")
    println("Batch: ${student.batch}")
    println("Age: ${student.age}")
}
