package Section_10_ObjectOrientedPart1

open class Person1(open val name:String, open var age: Int){
    init {
        println("Object was Created")
    }
    fun speak(){
        println("Hello!")
    }
    fun greet(name: String){
        println("Hello $name!")
    }
    fun getYearOfBirth() = 2016 - age

 }
   class Student(override val name: String, override var age: Int, val studentID: Long): Person1(name, age){
        fun isIntelligent() = true
   }
   class Employee(override val name: String,  override var age: Int): Person1(name, age){
        fun receivePayment(){
            println("Received Payment.")
        }
   }

   fun main(){
    val student = Student("John", 25, 2938704573)
    student.speak()
    student.greet("John")

    println(student.isIntelligent())
       val employee = Employee("Marry", 30)
       employee.getYearOfBirth()
       employee.receivePayment()

       println("Name of the Student ${student.name} and Age of the Student ${student.age}")
       println("ID of the Student ${student.studentID}")

   }
