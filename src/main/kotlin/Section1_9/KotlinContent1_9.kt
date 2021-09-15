package Section1_9

 fun main(){
     val numbers = listOf(1,2,3,4,5)
     primitiveDataTypeKotlin()  // fun 1
     variablesKotlin()          // fun 2
     ifElseCondition()          // fun 3
     forLoop()                  // fun 4
     whileLoop()                // fun 5
     whenExpression()           // fun 6
     conditionalExpressions()   // fun 7
     studentsDetails()          // fun 8
     arrayList()                // fun 9
     arrayDemonstration()       // fun 10
     stringConcatenation()      // fun 11
     whenStatement()            // fun 12
     nullableKotlin()           // fun 13
     breakKotlin()              // fun 14
     outBreak()                 // fun 15
     functionInKotlin("Kotlin Practice")         // fun 16
     println(reverse(numbers))   // fun 17
     println(reverse2(numbers))  // fun 18
 }

 // Function 1
   fun primitiveDataTypeKotlin(){

    val byteVariables : Byte = 100
    val shortVariables : Short = 200
    val intVariables : Int = 200
    val longVariables : Long = 70000L
    val doubleVariables : Double = 1.05
    val charVariables : Char = 'S'
    val booleanVariables : Boolean = true

    println("1: Output of PrimitiveDataTypeKotlin :- ")
    println(byteVariables)
    println(shortVariables)
    println(intVariables)
    println(longVariables)
    println(doubleVariables)
    println(charVariables)
    println(booleanVariables)

}
 // Function 2
fun variablesKotlin(){
    val one  = 1
    val threeBillion = 3000000L
    val oneLong = 1L
    val oneByte : Byte = 1

    val str = " Kotlin Variables Demonstration "
    println("2: Output of VariablesKotlin")
    println(str)
    println(one)
    println(threeBillion)
    println(oneLong)
    println(oneByte)

}

 // Function 3
 fun ifElseCondition(){
     val age : Int = 30
     if (age < 30){
        println("You Cannot Register")
     } else if (age < 21){
        println("Well, maybe you can Register")
     } else if (age < 27){
         println("You should be able to Register")
     } else{
         println("You're good to go")
     }
        println("Registration Complete")
 }

 // Function 4
 fun forLoop(){
    var sum = 0
     for (i in 1..10){
         sum = sum  + 1
         println(sum)
     }
    val list = listOf("Java", "Kotlin", "Python")
     for(element in list){
        println(element)
     }
     for((index, value) in list.withIndex()){
        println("Element in $index is $value")
     }
 }

 // Function 5
fun whileLoop(){
    var x = 9
    while(x >= 0){
        println(x)
        x--
    }
     var i = 1
     while (i <=10){
        println(i)
         i++
     }
}

 // Function 6
fun whenExpression(){
    val x = 9
    when(x){
        5 -> println("x is 5")
        3*5 -> println("x is 3*12")
        "Hey There". length -> println("x is the length of the String 'Hey There' ")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println()
        in 21..30 -> println()
        !in 1..9 -> println("x is not between 1 to 9")
    }
}

// Function 7
fun conditionalExpressions(){
    val mode: Int = 5

   val result = when(mode){
    1 -> "Demonstration of Mode 1"
    2 -> {
        println("The mode is 2")
        val i = 3
        "Reason why mode 2 is occupied"
    }
       3 -> " The mode is super-productive"
       else -> "Don't know about this Mode"
   }
    println(result)
    val x = if(mode < 2){
        println("Mode is less than 2")
        27
    } else{
         42
    }
    println(x)
}

//Function 8
fun studentsDetails() {
    val studentName = "John Deo"
    val studentID = 120
    val studentAge = 21
    val studentGrade = 10
    val studentMark = 98.5f

    println(studentName)
    println(studentID)
    println(studentAge)
    println(studentAge)
    println(studentGrade)
    println(studentMark)
}

// Function 9
fun arrayList() {
    val array = arrayListOf("Delhi", "Haryana", "Punjab", "UK")
    val list = listOf("Orange","Apple", "Bananas")
    val arrayList = arrayListOf("Patrick", "Micheal", "Sarah")
    arrayList.add("Sandra")

    println(array)
    println(list)
    println(arrayList)
}

 // Function 10
fun arrayDemonstration(){
    val array = arrayOf("Delhi", "Gurgaon", "Dehradun", "Noida", "Visakhapatnam")
    val mixed = arrayOf("Kotlin", 17,  3.0, false)
    val numbers = intArrayOf(1,2,3,4,5,67)

    println(mixed[0])
    println(mixed[2])
    mixed[2] = 4.2
    println(mixed[3])

    val str = "Udemy"
    println(str[0])

    val states = arrayOf("Nevada", "Florida")
    val allStates = array + states
    println(allStates.size)

    val empty : Boolean = numbers.isEmpty()

    if (states.contains("Kentucky")){
        println("It contains Kentucky")
    } else{
        println("It does not")
    }

     val arrayList = arrayListOf("Patrick", "Micheal", "Sarah")
     val list = arrayListOf("Peter")
     println(arrayList[0])
     println(arrayList + list)
     println(arrayList.size)
     println(arrayList.isEmpty())

     arrayList.add("Josh")
     val changed = arrayList.add("Jack")
     println(arrayList)
     val removed = arrayList.remove("Micheal")
     println(arrayList)
     println(removed)

     val subList = arrayList.subList(1, 4)
     println(subList)
}

 // Function 11
fun stringConcatenation(){
    val stringConcat = "Demonstration of " + " String Concatenation"
    val concatDemo = "Kotlin Strings"
    println(stringConcat + concatDemo)
}

 // Function 12
fun whenStatement(){
    val mode : Int = 2
     when(mode){
      1 -> println("This is Mode 1")
      2 -> {
            println("This is Mode 2")
            println("Mode 2 is busy")
      }
      3 -> println("The mode is super-productive")
      4 -> println("Don't know about the Mode")
     }
}

 // Function 13
 fun nullableKotlin() {
    var stringNull : String? = null
    stringNull = "Null String Assigned to String variables"

     println(stringNull)
     println(stringNull.length)
     println(stringNull!!.length)
 }

 // Function 14
 fun breakKotlin() {
     for (c in "Python") {
         if (c == 'o') {
             break
         }
         println(c)
     }
        println()
         val list = listOf("Book", "Table", "Laptop")
          for(str in list){
            if (!str.contains('o')){
                continue
            }
              println(str)
     }
 }

  // Function 15
 fun outBreak(){
        outer@ for (i in 1..10)
            for(j in 1..10){
            if (i - j == 5) {
                break@outer
            }
                println("$i - $j")
            }
    }

  // Function 16
 fun functionInKotlin(text: String){
     for(char in text){
        print(char + " ")
     }
        println()
 }

// Function 17
fun reverse(list : List<Int>): List<Int>{
    val result = arrayListOf<Int>()
    return result
}

// Function 18
fun reverse2(list : List<Int>): List<Int>{
    val result = arrayListOf<Int>()
    for (i in list.size -1 downTo 0){
        result.add(list.get(i))
    }
    return result
}