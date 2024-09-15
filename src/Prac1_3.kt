import java.util.Scanner

data class Student(
    val name: String,
    val enrollmentNo: String,
    val branch: String,
    val collegeName: String,
    val batch: String,
    val age: Int
)
fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter student's name:")
    val name = scanner.nextLine()
    print("Enter student's enrollment number:")
    val enrollmentNo = scanner.nextLine()
    print("Enter student's branch:")
    val branch = scanner.nextLine()
    print("Enter student's college name:")
    val collegeName = scanner.nextLine()
    print("Enter student's batch:")
    val batch = scanner.nextLine()
    print("Enter student's age:")
    val age = scanner.nextInt()

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
