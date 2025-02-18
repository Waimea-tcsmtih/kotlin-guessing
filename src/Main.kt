/**
 * A little guessing game in Kotlin
 */

fun main() {
    println("----------------")
    println(" Guessing game 5 Million")
    println("----------------")
    println()

    val playerName = getString("Enter your name: ")
    println("Nice to meet you $playerName")


    val numToGuess = (1..100).random()

    println("I'm thinking of a number between 1 and 100. Can you guess it?")


    //Main loop
    while (true) {

        //Ask the user for a guess
        println("Have a guess: ")
        val guess = readln().toIntOrNull()
        //Check if their guess is correct
        if (guess == null) {
            println("I said a number!")
            continue
        }
        if (guess == numToGuess) {
            println("Well done! You got it.")
            break
        }

        if (guess < numToGuess) {
            println("Too low")
        } else {
            println("Too high")
        }


    }
//Break out of loop if correct

    //Otherwise give higher/lower feedback

}
/**
 * Function to get a string from a user
 * parameters:
 * - prompt - text to show the user
 * returns:
 * - String that the user types
 */
fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)
        userInput = readln()
        if (userInput.isNotBlank())
            break

    }
    return userInput
}
/**
 * Function to get Int from user
 */
fun getInt(prompt: String): Int {
    var intValue: Int?

    while (true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }
    return intValue!!
}





