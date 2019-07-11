package kelas

class mobil(var ban: Int,var warna: String,var no_mesin: String,var merk: String) {

/*    var ban: Int = 0
    var warna: String = ""
    var no_mesin: String = ""
    var merk: String = ""
    */
    var gabunganBanMerk : String = ""

    init {
        gabunganBanMerk = "$ban dan $merk"
    }

    fun berjalan() {
        println("mobil berjalan ")

    }

    fun berhenti() {
        println("mobil berhenti")
    }

}