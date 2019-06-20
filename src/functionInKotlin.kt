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
    println("Maka pengurangan : $kurang")

    val kali = bilangan.kali(bilangan2)
    println(kali)
    // Int.kali(Int)
    val bagi = 4 dibagi 2

    val list = mutableListOf<Int>()
    list.add(3)
    list.add(4)
    tampilkanData(list)

    // cara memanggil kali
    println("Perkalian : ${bilangan dikalikan bilangan2}" )
}

infix fun Int.dikalikan(bilangan2: Int) : Int {
    var hasil = 0
    for (i in 1 .. bilangan2) {
        hasil += this
    }
    return hasil

}

// fungsi dengan parameter array
fun tampilkanData(list: List<Int>) {

    for (i in 0 until list.size) {
        println("maka nilai $i : ${list[i]}")
    }
}

// fungsi extension
fun Int.kali(bilangan2: Int) : Int{

    return this * bilangan2
}

// fungsi infix
infix fun Int.dibagi(bilangan2: Int): Int{

    return this / bilangan2
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



