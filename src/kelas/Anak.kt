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