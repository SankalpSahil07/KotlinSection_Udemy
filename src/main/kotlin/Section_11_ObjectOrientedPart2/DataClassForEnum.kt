package Section_11_ObjectOrientedPart2

import java.awt.Color

interface Driveable{
        fun drive()
}
interface Buildable{
        fun build()
        fun timeRequired(): Int
}

class Car2(val color: Color): Driveable, Buildable{

    override fun timeRequired(): Int = 120

    override fun drive() {
        println("Auto Piloted")
    }
    override fun build() {
        println("Build a sports Car")
    }
 }

 class MotorCycle(val color: String) : Driveable{
     override fun drive() {
        println("Can be Driven 200")
     }
 }
fun main(){
        val car : Driveable = Car2(Color.RED)
        car.drive()
}