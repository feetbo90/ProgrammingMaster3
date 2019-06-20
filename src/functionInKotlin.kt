/*




 */


fun main(args: Array<String>) {


    val bilangan : Int = readLine()!!.toInt()
    val bilangan2: Int = readLine()!!.toInt()


    //val objek = aritmatika()
    //objek.penjumlahan(bilangan, bilangan2)
    penjumlahan(bilangan, bilangan2)
    //val kurang = objek.pengurangan(bilangan, bilangan2)
    val kurang = pengurangan(bilangan, bilangan2)
    print("Maka pengurangan : $kurang")
}

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
