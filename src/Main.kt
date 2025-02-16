/**
 *a little guessing game in Kotlin
 */




fun main() {
    println("________________________________________________")
    println(" GUESSING GAME ")
    println("________________________________________________")
    println()


    val playername = getString("enter yourtname: ")
    println ("Nice to meet you, $playername")


    val numToGuess = (1..100).random()





//ask the user for the guess
//check if it's correct or not
//break out of loop if correct
//Otherwise give high/lower feedback


    println("Im thinking of a number from 1 to 100")
    println("Can you guess it?")

        if (guess == null)
    print("Enter your  number: ")
    val number = readln().toIntOrNull()
    if (number == null) {


    }


    /**
     * function to get a string from user
     * parameters
     *- prompt - Text to show the user
     * returns
     * - string that user types
     */
    fun getString(prompt: String): String {
        while (true)
            print(prompt)
        val userInput: string
            val userInput = readln()
            if (userInput.isNotBlank()) break

    }
    return userInput

}

/**
 * Function to get an Int from the user
 */
    fun getInt(prompt: String): Int {
        while (true) {
        val userInput = getString(prompt)
        val intValue = userInput.toIntOrnull()
        if (intValue != null) break

        }
        return intValue

    }












}
