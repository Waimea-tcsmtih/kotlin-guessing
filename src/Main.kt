/**
 *a little guessing game in Kotlin
 */




fun main() {
    println("________________________________________________")
    println(" GUESSING GAME ")
    println("________________________________________________")
    println()

    val numToGuess = (1..100).random()


//ask the user for the guess
//check if it's correct or not
//break out of loop if correct
//Otherwise give high/lower feedback


    print("What is your name? ")
    val name = readln()
    println("Mmmmmm $name, I see!")

    println("Im thinking of a number from 1 to 100")
    println("Can you guess it?")

    print("$name, Enter your  number: ")
    val number = readln().toIntOrNull()
    if (number == null) {
        println("that's not a number")

    }
    when (number) {



     -> println("Seven is just the best")
    88 -> println("No, That's unlucky")
    69 -> println("GYAAT! But no.....")


}












}
