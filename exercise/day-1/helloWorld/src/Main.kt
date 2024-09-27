fun main() {
    val spends = arrayOf(100, 150 ,250)


    for (x in spends) {
        val result = when {
            x > 200 -> (100 + 150 + (x-200)*2)
            x in 101..200 -> ((x-100)*1.5 + 100)
            x in 0..100 -> x*1
            else -> "invalid units"
        }
        print(x)
        print(" = ")
        println(result)
    }
}
