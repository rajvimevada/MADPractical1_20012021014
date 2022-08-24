fun main() {
    println("20012021014 Mevada Rajvi")
    val car1 = Carr("BMW, 2018", "Aman", 105, 100000.0, 98950.0)
    car1.getCarFullDetails()

    val car2 = Carr("BMW, 2019", "Karan", 20, 400000.0, 399800.0)
    car2.getCarFullDetails()

    val Cars = ArrayList<Carr> (2)
    val car3 = Carr("Toyota, 2017","KJS",100,1080000.0,1079000.0)
    val car4 = Carr("Maruti, 2020","NPP",200,4000000.0,3998000.0)
    Cars.add(car3)
    Cars.add(car4)

    for (i in Cars){
        println("-------------------")
        i.getCarFullDetails()
    }
}

class Carr(private val model: String, private val owner: String, private val miles: Int, private val originalPrice: Double, private val currentPrice: Double) {
    init {
        println("Object of class is Created and Init is Called.")
    }

    private fun info(): String {
        return model
    }

    private fun carOwner(): String {
        return owner
    }

    private fun milesDrive(): Int {
        return miles
    }

    private fun OrginalPrice(): Double {
        return originalPrice
    }

    private fun CurrentPrice(): Double {
        return currentPrice
    }

    fun getCarFullDetails() {
        println("===================")
        println("Car Information : ${info()}")
        println("Car owner : ${carOwner()}")
        println("Miles Drive : ${milesDrive()}")
        println("Original Car Price : ${OrginalPrice()}")
        println("Current Car Price : ${CurrentPrice()}")
        println("===================\n")
    }
}