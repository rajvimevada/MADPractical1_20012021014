import java.util.Scanner

fun main()
{
    val reader=Scanner(System.`in`)
    println("Enter your name, Enrollment No, Class, Batch, elective subject1 and elective subject2: ")
    val name = readLine()
    val en_no: Int= reader.nextInt()
    val s_class=readLine()
    val batch= readLine()
    val ele_sub1=readLine()
    val ele_sub2=readLine()

    println("\nName: $name\nEnrollment Number: $en_no\nClass: $s_class\nBatch: $batch\nelective subject1: $ele_sub1\nelective subject2: $ele_sub2")
}