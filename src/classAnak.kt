import kelas.Mamalia

class Sapi( kaki:Int, warna:String) : Mamalia(kaki, warna) {

    override var kaki : Int = 0

    override fun bernapas() {
        super.bernapas()
        println("Sapi bernapas jumlah kaki ${this.kaki}")
    }

    init {
        println("kaki di init Sapi $kaki")
        this.kaki = kaki
    }
}

fun main(args: Array<String>) {

    val sapi = Sapi(4, "Hitam Putih")
    sapi.bernapas()
    sapi.beranak()

    sapi.kaki = 5
    println("jumlah kaki ${sapi.kaki}")
}

/*
    class Lingkaran
    fungsi luas lingkaran

    class Tabung
    luas lingk


 */