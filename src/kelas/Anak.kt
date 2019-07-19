package kelas

class Anak(hidung: Int, kaki: Int) : Ibu(hidung, kaki) {

    override var hidung : Int = 1
    override var tangan : Int = 2
    init {
        this.hidung = hidung
    }

    constructor(hidung: Int, tangan: Int, kaki: Int) : this(hidung, kaki) {
        this.tangan = tangan
    }

    // polimorphisme
    override fun baikHati() {
        println("Anak baik hati")
    }
}

fun main(args: Array<String>) {

    val kevin = Anak(1,2,2)
    kevin.baikHati()
}

/*

    class dosen : nama, nidn, kelas yang diajarkan
    list nama, list nidn, list kelas
    list nama#nidn#kelas
    fungsi tambah nama dosen : nama, nidn, kelas
    fungsi cariDosen("Saib") {

        return SaibSuwilo, 2344, KDM
    }


    class mahasiswa : nama, nim, nama dosen

    nama : Saib Suwilo
    nidn : 10009877333
    kelas : KDM

    objek kevin, 19039393, Saib Suwilo

    kevin = Mahasiswa()

    cariDosen("Saib Suwilo")


    Masukkan data dosen
    1

    Masukkan Data mahasiswa
    1

    cari Dosen : Saib Suwilo
 */