import kotlin.math.sqrt

class TrapesiumSamaKaki (
    private var atas: Int,
    private var bawah: Int,
    private var tinggi: Int,
): BangunDatar() {

    var sisiBawah: Float = 0F
    var sisiKananKiri: Float = 0F

    override fun luas(): Float {
        super.luas()
        return (0.5 * (atas + bawah) * tinggi).toFloat()
    }

    override fun keliling(): Float {
        super.keliling()
        sisiBawah = ((bawah - atas)/2).toFloat()
        sisiKananKiri = sqrt((tinggi * tinggi) + (sisiBawah * sisiBawah)) * 2
        return (atas + bawah + sisiKananKiri)
    }
}