class RoverPosition(val x: Int, val y: Int, val pointing: FACING){
    fun left(): RoverPosition{
        return RoverPosition(x, y, getDirection((pointing.getValue() + 1) % 4))
    }
    fun right(): RoverPosition{
        var pos = pointing.getValue() - 1
        if(pos == -1) pos = 3
        return RoverPosition(x, y, getDirection(pos))
    }

    fun move(pl: Plateau): RoverPosition {
        var toX = x
        var toY = y
        when (pointing) {
            FACING.EAST -> toX = x+1
            FACING.NORTH -> toY = y+1
            FACING.WEST -> toX = x-1
            FACING.SOUTH -> toY = y-1
        }
        if(! pl.isValid(x, y, toX, toY))
            throw IllegalAccessException()
        return RoverPosition(toX, toY, pointing)
    }

    override fun toString(): String{
        return "$x $y $pointing"
    }
}

private var directionList = ArrayList<FACING>()

private fun getDirection(no: Int): FACING{
    return directionList.get(no)
}

enum class FACING() {
    EAST(0), NORTH(1), WEST(2), SOUTH(3);
    constructor(v: Int){
        value = v
        directionList.add(v, this)
    }
    private var value = 0

    fun getValue(): Int {
        return value
    }
}
