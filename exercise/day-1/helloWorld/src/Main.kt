fun main() {
    val spends : Array<Double> = arrayOf(300.0, 150.0 , 50.0, 40.0)


    for (x in spends) {
        val result = when {
            x > 200.0 -> x * 0.7
            x in 100.1..200.0 -> x*0.8
            x in 50.0..100.0 -> x*0.9
            x in 0.0..49.9 -> x
            else -> "invalid amount"
        }
        print(x)
        print(" = ")
        println(result)
    }
}
