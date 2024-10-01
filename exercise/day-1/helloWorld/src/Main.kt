
val availableSeats = arrayOf(1, 2, 3, 4, 5)

fun reserveSeat(name: String, seatNumber: Int) {

    if (availableSeats.contains(seatNumber)) {
        availableSeats[seatNumber] = 0  // Mark the seat as reserved by setting it to 0
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}

