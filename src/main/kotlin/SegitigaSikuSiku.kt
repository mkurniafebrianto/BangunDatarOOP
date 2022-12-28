import kotlin.math.sqrt

class SegitigaSikuSiku (
    private var a: Int,
    private var t: Int
): BangunDatar() {

    var sisiMiring: Float = 0F

    override fun luas(): Float {
        super.luas()
        return (0.5 * a * t).toFloat()
    }

    override fun keliling(): Float {
        super.keliling()
        sisiMiring = sqrt(((a * a) + (t * t)).toFloat())
        return (a + t + sisiMiring)
    }
}