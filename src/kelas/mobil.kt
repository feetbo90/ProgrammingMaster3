package kelas

class mobil(var ban: Int,var warna: String,var no_mesin: String,var merk: String) {

/*    var ban: Int = 0
    var warna: String = ""
    var no_mesin: String = ""
    var merk: String = ""
    */
    var gabunganBanMerk : String = ""
    var platKendaraan : String = ""

    init {
        println("ini dari primary ")
        gabunganBanMerk = "$ban dan $merk"
    }

    // secondary
    constructor( ban: Int, warna: String, no_mesin: String, merk: String ,  platKendaraan : String) :
            this(ban, warna, no_mesin, merk) {
        println("ini dari secondary")
        this.platKendaraan = platKendaraan
    }

    fun show() {
        println("Hasil : $ban , $warna, $no_mesin, $merk, $platKendaraan")
    }

    fun berjalan() {
        println("mobil berjalan ")

    }

    fun berhenti() {
        println("mobil berhenti")
    }

}