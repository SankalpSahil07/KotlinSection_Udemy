package Section_11_ObjectOrientedPart2

interface Driveable1{
        fun drive()
}
interface Buildable1{
     fun build()
     fun timeRequired(): Int
}

class Car(var color: String): Driveable1, Buildable1 {
    override fun timeRequired() = 120

    override fun drive() {
        println("Auto Piloted")
    }

    override fun build() {
        println("Build a sports Car")
    }
  }

class MotorCycle1(val color:String): Driveable1{
    override fun drive() {
        println("Can be driven 2000")
    }
}
fun main(){
        val car: Driveable1 = Car("RED")
        car.drive()

    val motorCycle1 : Driveable1 = MotorCycle1("RED")
    motorCycle1.drive()
}