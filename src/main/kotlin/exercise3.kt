fun main(){
    println("20012021014 Mevada Rajvi")
    var s1=Student("Rajvi","Mevada",19,20012021014,"IT","D","AB15")
    var s2=Student("s2","l2",20,123,"CE","A","AB1")
    var s3=Student("s3","l3",19,456,"IT","B","AB5")
    var s4=Student("s4","l4",20,789,"CE","C","AB9")
    var s5=Student("s5","l5",20,101,"IT","D","AB10")
}

open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }
}
