import kotlin.math.sqrt

fun main() {

    // Menghitung luas dan keliling bidang trapesium sama kaki
    println("==============================================")
    val trapesium = TrapesiumSamaKaki(15,21,4)
    println("Luas Trapesium Sama Kaki       : ${trapesium.luas()}")
    println("Keliling Trapesium Sama Kaki   : ${trapesium.keliling()}")
    println("==============================================")

    // Menghitung luas dan keliling bidang lingkaran
    val lingkaran = Lingkaran(5)
    println("Luas Lingkaran       : ${lingkaran.luas()}")
    println("Keliling Lingkaran   : ${lingkaran.keliling()}")
    println("==============================================")

    // Menghitung luas dan keliling bidang lingkaran
    val segitigaSikuSiku = SegitigaSikuSiku(3, 4)
    println("Luas Segitiga Siku-Siku       : ${segitigaSikuSiku.luas()}")
    println("Keliling Segitiga Siku-Siku   : ${segitigaSikuSiku.keliling()}")
    println("==============================================")


}


