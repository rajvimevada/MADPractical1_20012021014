import java.util.Scanner

fun main()
{
    println("20012021014 Mevada Rajvi")
    val reader = Scanner(System.`in`)
    print("Enter Number: ")
    var num: Int=reader.nextInt()
    println("Factorial of $num : ${rec(num)}")
    println("Factorial of $num using tail recursion: ${rec_tail(num,1)}")
}

fun rec(num1: Int) :Int
{
    return if(num1==1)
        num1
    else
        num1*rec(num1-1)

}

tailrec fun rec_tail(num1: Int, i: Int): Int
{
    return if(num1==1)
        i

    else
        rec_tail(num1-1, num1*i)
}