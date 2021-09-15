package Section_10_ObjectOrientedPart1

class House(val height: Double, val color: String, val price: Int = 500000){

    fun print(){
        println("House [height = $height, color = $color, price = $price]")
    }
}

  fun main(){
    val house = House(height = 4.5, color = "Blue", price = 150000)
    val redHouse = House(color = "Red", price = 20000, height = 5.0)
    val yellowHouse = House(color = "Yellow", height = 2.5)

    house.print()
    redHouse.print()
    yellowHouse.print()

  }