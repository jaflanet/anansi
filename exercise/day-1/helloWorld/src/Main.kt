fun main() {
    val nilai = arrayOf(90,89,79,69,59)

    for(x in nilai) {
        if (x >= 90) {
            println("A")
        } else if (x >= 80) {
            println("B")
        } else if (x >= 70) {
            println("C")
        } else if (x >= 60) {
            println("D")
        } else if (x < 60) {
            println("F")
        }
    }
}