import java.util.*

fun main()
{
    val reader=Scanner(System.`in`)
    val arr1=arrayOf(1,2,3,4,5)
    println("arrayOf() Method: ${Arrays.toString(arr1)}")

    val arr2=Array<Int>(5){0}
    println("\nArray<Type>(size){init}: ${Arrays.toString(arr2)}")



    val arr4=IntArray(5){0}
    println("\nIntArray(size){init}: ${Arrays.toString(arr4)}")

    val arr5 = intArrayOf(1,2,3,4,5)
    println("\nintArrayOf: ${arr5.joinToString()}\n")

    val arr6=arrayOf(intArrayOf(1,2), intArrayOf(3,4), intArrayOf(5,6))
    for(i in arr6)
        print(Arrays.toString(i))

    val arr7=IntArray(5){0}
    println("\nPlease enter array values: ")
    for(i in 0..4)
    {
        print("arr[$i]: ")
        arr7[i]=reader.nextInt()
    }
    println("\nEntered array is: ${Arrays.toString(arr7)}")
    arr7.sort()
    print("\nSorted array with built-in function: ${Arrays.toString(arr7)}")
    arr7.sortDescending()
    var temp:Int
    for(i in arr7.indices)
    {
        for(j in i+1 until arr7.size)
        {
            if(arr7[j]<arr7[i])
            {
                temp=arr7[i]
                arr7[i]=arr7[j]
                arr7[j]=temp
            }
        }
    }
    print("\nSorted array without built-in function: ${Arrays.toString(arr7)}")

}