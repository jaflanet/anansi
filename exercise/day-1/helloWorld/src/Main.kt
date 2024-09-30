
val availableSeats = mutableListOf(1, 2, 3, 4, 5)

fun reserveSeat(name: String, seatNumber: Int) {

    if (seatNumber in availableSeats) {
        availableSeats.remove(seatNumber) // Mark the seat as reserved by setting it to 0
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}

