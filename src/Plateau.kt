class Plateau(val boundryX: Int, val boundryY: Int){
    fun isValid(frmX: Int, frmY: Int, toX: Int, toY: Int): Boolean{
        return (withinBoundry(toX, toY) && isNeighbor(frmX, frmY, toX, toY))
    }

    private fun isNeighbor(frmX: Int, frmY: Int, toX: Int, toY: Int): Boolean {
        return (frmX == toX && (Math.abs(frmY - 1) == toY || Math.abs(frmY + 1) == toY)) ||
                (frmY == toY && (Math.abs(frmX - 1) == toX || Math.abs(frmX + 1) == toX))
    }

    private fun withinBoundry(x: Int, y: Int): Boolean{
        return ( (y <= boundryY && y >= 0) && (boundryX >= x && x >= 0))
    }
}