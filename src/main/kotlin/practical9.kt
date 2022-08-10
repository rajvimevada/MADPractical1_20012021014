import java.util.Scanner

fun main()
{
    println("20012021014 Mevada Rajvi")
    val reader=Scanner(System.`in`)
    println("How many elements you want to insert: ")
    var size: Int= reader.nextInt()
    var arr= Array<Int>(size){0}
    println("Enter elements in array: ")
    for(i in 0 until size)
    {
        arr[i]=reader.nextInt()
    }

    println("Your elements are: ")
    for(i in 0 until size)
    {
        println("arr[$i]=${arr[i]}")
    }
    var max=arr[0]
    var index: Int =0
    for(i in 0 until size)
    {
        if(arr[i]>max)
        {
            max=arr[i]
            index=i
        }
    }
    println("Maximum element is: $max\npresent at index: $index")
}