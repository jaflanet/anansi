fun main() {
    val nilai = arrayOf(90,89,79,69,59,-1,101)

    for(x in nilai) {
        if (x in 90..100) {
            print(x)
            println(" = A")
        } else if (x in 80..89) {
            print(x)
            println(" = B")
        } else if (x in 70..79) {
            print(x)
            println(" = C")
        } else if (x in 60..69) {
            print(x)
            println(" = D")
        } else if (x in 0.. 60) {
            print(x)
            println(" = F")
        }
        else{
            println("out of range")
        }
    }
}