class Rover(var position: RoverPosition,val pl: Plateau){
    fun move(ins: String): RoverPosition{
        return ins.fold(position) { acc: RoverPosition, ins ->
            when (ins) {
                'L' -> acc.left()
                'R' -> acc.right()
                else -> acc.move(pl)
            }
        }
    }
}