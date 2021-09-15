package Section_10_ObjectOrientedPart1

class Person2(val name:String, var age: Int){

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
  fun main(){
      val person2 = Person2("Jack", 18)
      person2.speak()
      person2.greet("World")
      println(person2.getYearOfBirth())

      println(person2.name)
      println(person2.age)
  }