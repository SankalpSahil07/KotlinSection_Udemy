package Section_11_ObjectOrientedPart2

abstract class Course(val topic: String, val price: Double){
       open fun learn(){
            println("Learning a $topic course")
       }
 }

interface Learnable{
    fun learn(){
        println("Learning....")
    }
}

open class KotlinCourse(): Course("Kotlin", 99.99), Learnable{
    override fun learn() {
        super<Course>.learn()
        println("I'm one of the first person to learn Kotlin")
    }
}

class SpecialKotlin(): KotlinCourse(){
    override fun learn() {
        super<KotlinCourse>.learn()
    }
}
fun main(){
        val course = KotlinCourse()
         course.learn()

}