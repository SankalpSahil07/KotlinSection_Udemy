package Section_10_ObjectOrientedPart1

class Person{

    var name: String = "Sarah"
    var age : Int = 42

    fun speak(){
        println("Hello World")
    }
    fun greet(){
        println("Hello $name!")
    }
    fun getYearOfBirth(): Int{
        return 2016 - age
    }
    fun getYearOfBirthDuplicate() = 2016 - age

 }

  fun main(){
    val person1 = Person()
     println("Name of the Person ${person1.name}")
     println("Age of the Person ${person1.age}")
     println(person1.getYearOfBirth())
     println(person1.getYearOfBirthDuplicate())

    val person2 = Person()
    person2.name = "James"
    person2.age = 25
    println("Name of the Second Person is ${person2.name}")
    person1.greet()
    person2.speak()

  }