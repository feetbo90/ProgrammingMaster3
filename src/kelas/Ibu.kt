package kelas

open class Ibu(hidung: Int) {

    open var hidung : Int = 1
    open var tangan : Int = 2
    val kaki : Int = 2
    val jk : String = "Perempuan"

    constructor(hidung :Int,  tangan : Int) : this(hidung) {
       this.tangan = tangan
    }

    init {
        this.hidung = hidung
    }

    open fun baikHati() {
        println("Ibu baik hati")
    }

    fun cerewet() {
        println("Ibu cerewet")
    }

    fun penyayang() {
        println("Ibu Penyayang")
    }
}