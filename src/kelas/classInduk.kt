package kelas

open class Mamalia(kaki: Int, warna:String) {

    open var kaki : Int = 0

    init {

    }

    fun bergerak(){
        println("mamalia bergerak")
    }

    open fun bernapas() {
        println("mamalia bernapas")
    }

    fun beranak() {
        println("Mamalia beranak")
    }
}