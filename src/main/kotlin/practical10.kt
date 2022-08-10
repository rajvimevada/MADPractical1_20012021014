import java.util.Scanner

fun main()
{
    println("20012021014 Mevada Rajvi")
    val reader=Scanner(System.`in`)
    println("For matrix1:")
    print("Enter row: ")
    var r1: Int=reader.nextInt()
    print("Enter column: ")
    var c1: Int=reader.nextInt()
    println("Enter elements: ")
    var arr1=Array(r1){IntArray(c1){0} }
    for(i in 0 until r1)
    {
        for(j in 0 until c1)
        {
            arr1[i][j]=reader.nextInt()
        }
    }
    println("\n\n---------------------------------------\n\n")
    println("For matrix2:")
    print("Enter row: ")
    var r2: Int=reader.nextInt()
    print("Enter column: ")
    var c2: Int=reader.nextInt()
    println("Enter elements: ")
    var arr2=Array(r2){IntArray(c2){0} }
    for(i in 0 until r2)
    {
        for(j in 0 until c2)
        {
            arr2[i][j]=reader.nextInt()
        }
    }


    val sumSubObj=SumSub(arr1,arr2,r1,c1,r2,c2)
    sumSubObj.ans()

    val mulObj=Mul(arr1,arr2,r1,c1,r2,c2)
    mulObj.ans()


}

class SumSub(private val arr1: Array<IntArray>, private val arr2: Array<IntArray>, val ar1: Int, val ac1: Int, val ar2: Int, val ac2: Int)
{
    var r1:Int=ar1
    var c1:Int=ac1
    var r2:Int=ar2
    var c2:Int=ac2

    fun ans()
    {
        if(r1==r2 && c1==c2)
        {
            var sum=Array(r1){IntArray(c1){0} }
            var sub=Array(r1){IntArray(c1){0} }
            for(i in 0 until r2)
            {
                for(j in 0 until c2)
                {
                    sum[i][j]=arr1[i][j]+arr2[i][j]
                    sub[i][j]=arr1[i][j]-arr2[i][j]
                }
            }

            println("\n\n--------------------ADDITION-------------------\n\n")
            for(i in 0 until r2)
            {
                for(j in 0 until c2)
                {
                    print(sum[i][j])
                    print("  ")
                }
                println()
            }

            println("\n\n--------------------SUBTRACTION-------------------\n\n")
            for(i in 0 until r2)
            {
                for(j in 0 until c2)
                {
                    print(sub[i][j])
                    print("  ")
                }
                println()
            }
        }

        else
            println("\n\n-----Addition and subtraction not possible----\n\n")
    }
}

class Mul(private val arr1: Array<IntArray>, private val arr2: Array<IntArray>, val ar1: Int, val ac1: Int, val ar2: Int, val ac2: Int)
{
    var r1:Int=ar1
    var c1:Int=ac1
    var r2:Int=ar2
    var c2:Int=ac2

    fun ans()
    {
        if(c1==r2)
        {
            var mul=Array(r1){IntArray(c2){0} }
            for(i in 0 until r1)
            {
                for(j in 0 until c2)
                {
                    for(k in 0 until c1)
                    {
                        mul[i][j]=mul[i][j]+(arr1[i][k]*arr2[k][j])
                    }
                }
            }
            println("\n\n--------------------MULTIPLICATION-------------------\n\n")
            for(i in 0 until r1)
            {
                for(j in 0 until c2)
                {
                    print(mul[i][j])
                    print("  ")
                }
                println()
            }
        }

        else
            println("Multiplication is not possible")
    }
}