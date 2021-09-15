package Section_10_ObjectOrientedPart1

abstract class Person3(open val name: String, open var age: Int){

     abstract fun speak()
     fun greet(name: String){
       println("Hello $name!")
     }
    fun getYearOfBirth() = 2016 - age
  }
  class Student1(override val name: String, override var age: Int, val studentID: Long): Person3(name, age){
        fun isIntelligent() = true

      override fun speak() {
          println("Hi there, I'm a Student!")
      }
  }
  class Employee2(override val name: String, override var age:Int): Person3(name, age){
        fun receivePayment(){
            println("Received Payment")
        }

      override fun speak() {
          println("Hi I'm an Employee")
      }
  }

 fun main(){
    val student1 = Student1("John", 25,345621)
     student1.speak()

    println(student1.isIntelligent())

     val employee2 = Employee2("Marry", 32)
     employee2.getYearOfBirth()

     employee2.receivePayment()
     employee2.speak()
 }
