class Lingkaran (
    private var r: Int
): BangunDatar() {

    override fun luas(): Float {
        super.luas()
        return (3.14 * r * r).toFloat()
    }

    override fun keliling(): Float {
        super.keliling()
        return (2 * 3.14 * r).toFloat()
    }

}