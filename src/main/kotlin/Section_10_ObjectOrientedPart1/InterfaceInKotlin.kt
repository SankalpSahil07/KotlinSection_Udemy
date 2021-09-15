package Section_10_ObjectOrientedPart1

interface Driveable{
    fun drive()
}

interface Buildable{
 val timeRequired : Int
  fun build()
}
class Car(val color: String): Driveable, Buildable{
    override val timeRequired: Int = 20
    override fun drive() {
        println("Driving Car")
    }
    override fun build() {
        println("Built a Sports Car")
    }
}
 class MotorCycle(val color: String): Driveable{
     override fun drive() {
        println("Driving motorcycle.")
     }
 }
  fun main(){
        val car: Driveable = Car("Blue")
        car.drive()
        val motorCycle: Driveable = MotorCycle("Red")
         motorCycle.drive()
  }