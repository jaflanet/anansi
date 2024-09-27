fun main() {
    val guess = arrayOf(5, 3, 7, 0)
    val correct = 7
    var i = 0

    while (i < guess.size) {
        val g = guess[i]
        if (g == correct) {
            print(g)
            println(" correct")
            break
        } else if (g == 0) {
            println("quit guessing")
            break
        } else {
            print(g)
            println(" pass")
        }
        i++
    }
}

