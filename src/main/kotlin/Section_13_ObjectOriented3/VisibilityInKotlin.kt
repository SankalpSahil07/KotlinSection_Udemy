package Section_13_ObjectOriented3

open class Animals {
        private val age: Int = 0
        protected val name = "John"
        internal val isDangerous = true

    public fun isOld(): Boolean{
        return age > 12
    }
}

  class Vertebrate: Animals(){
        fun introduceYourself(){
            println(this.name)
        }
  }
 fun main(args:Array<String>){
        val animals = Animals()
        animals.isDangerous
        animals.isOld()
        println(animals.isDangerous)
        println(animals.isOld())
 }