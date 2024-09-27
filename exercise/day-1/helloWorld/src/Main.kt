fun main() {
    val gaji = 1000000
    val tahun = arrayOf(1, 3, 6)

    println(gaji)

    for (x in tahun) {
        val result = when {
            x > 5 -> gaji * 0.2
            x in 2..5 -> gaji * 0.1
            x in 0..1 -> 0
            else -> "Invalid year"
        }
        print(x)
        print(" = ")
        println(result)
    }
}
