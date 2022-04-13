fun main(){
   var banker= Banker("Tessa", 25)
    var farmer= Farmer("Effence",20)
    var doctor= Doctor("Naima",22)
    banker.eat()
    farmer.sleep()
    doctor.talk("Come in")
    println(banker.countMoney(arrayOf(3,14,22,15)))
    doctor.treatPatient("Marie","Malaria")
    farmer.eat()
   // doctor.eat()
    //banker.eat()
    farmer.introduction()
    banker.introduction()
    doctor.introduction()


}
open class Person(var name: String, var age: Int){
    fun talk(words:String){
        println(words)
    }

    open fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzzz")
    }
    open fun introduction(){
        println("Hi my name is $name")
    }
}
class Banker(name: String, age: Int): Person(name, age){

    fun countMoney(notes: Array<Int>):Int{
        var sum = 0
        notes.forEach { note->
            sum+=note
        }
        return sum
    }

}

class Doctor(name: String, age: Int): Person(name,age){

    fun treatPatient(patient: String, disease: String){
        println("Dr $name is treating $patient for $disease")
    }

    override fun introduction() {
      //  super.introduction()
        println("Hi, my name is Dr $name")
    }
}
class Farmer( name: String, age: Int): Person(name, age){

    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
        //super.eat()
        println("I am eating all the food that I have grown")
    }
}

