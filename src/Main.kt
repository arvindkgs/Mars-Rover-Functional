fun main() {
    val pl = Plateau(5,5)

    val r1 = Rover(RoverPosition(1, 2, FACING.NORTH), pl)
    try {
        println("R1:" + r1.move("LMLMLMLMM"))
    } catch (e : IllegalAccessException){
        println("Tried to move out of boundry")
    }

    val r2 = Rover(RoverPosition(3, 3, FACING.EAST), pl)
    try {
        println("R2:" + r2.move("MMRMMRMRRM"))
    } catch (e : IllegalAccessException){
        println("Tried to move out of boundry")
    }

}