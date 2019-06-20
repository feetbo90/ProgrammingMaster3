open class aritmatika {

    // fungsi tanpa pengembalian nilai
    fun penjumlahan(bilangan : Int, bilangan2: Int) {
        val hasil = bilangan + bilangan2
        println("Maka penjumlahan: $hasil")
    }

    // fungsi dengan pengembalian nilai
     fun pengurangan(bilangan: Int, bilangan2: Int) : Int {
        val kurang = bilangan - bilangan2
        return kurang
    }
}