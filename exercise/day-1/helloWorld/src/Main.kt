fun main() {
    val fuel = 0
    var i = fuel

    while (i < 50) {
        if (i > 40) {
            break
        } else {
            print(i)
            println(" fueling...")
        }
        i+=5
    }
    print("stop ")
    print(i)
    println(" fuel exceed 40")
}

