package Section_14_IO

import java.io.File

fun main(args: Array<String>){
    var lineNumber = 0
    File("src/main/kotlin/inputfile.txt").forEachLine {
        ++lineNumber
        println("#$lineNumber: $it")
    }
}