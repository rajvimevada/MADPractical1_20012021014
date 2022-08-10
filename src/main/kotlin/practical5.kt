import java.util.Scanner

fun main()
{
    println("20012021014 Mevada Rajvi")
    val reader = Scanner(System.`in`)
    print("Enter month number: ")
    val num=reader.nextInt()
    print("It is " + when(num)
    {
        1->"January"
        2->"February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else-> "Wrong Input"
    })
}