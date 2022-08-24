fun main()
{
    println("20012021014 Mevada Rajvi")
    var a: Int=2
    var b: Int=3
    var c:Int
    println("----Initially----\na: $a\nb:  $b\n")

    a=a+b
    b=a-b
    a=a-b
    println("----Without 3rd variable----\na: $a\nb: $b\n")

    c=a
    a=b
    b=c
    println("----With using 3rd variable----\na: $a\nb: $b\n")

}
