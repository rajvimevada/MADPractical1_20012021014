fun main()
{
    println("20012021014 Mevada Rajvi")
    val carObj=Car()
    println("Type: ${carObj.type}\nModel: ${carObj.model}\nprice: ${carObj.price}\nOwner: ${carObj.owner}\nprice with Function: ${carObj.getCarPrice()}")
}

class Car
{
    val type: String = "SportsCar"
    val model: String="Mustang GT"
    val price: Long=38940
    val owner: String= "Ford"
    fun getCarPrice() : Long
    {
        return price
    }
}