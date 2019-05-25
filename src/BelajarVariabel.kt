
/*

    deklarasi variabel

    1. tipe data
    String, Int, Double , Boolean

    Sintaks variabel:

    var / val nama_variabel : tipedata = value

    contoh :

    val bilanganPertama = 10

    atau

    val bilanganPertama : Int = 10


 */


fun main(args: Array<String>) {

    val bilanganPertama : Int
    val bilanganKedua : Int
    val jumlah : Int
    println("Masukkan bilangan pertama : ")
    bilanganPertama = readLine()!!.toInt()
    println("Masukkan bilangan kedua : ")
    bilanganKedua = readLine()!!.toInt()

    jumlah = bilanganPertama + bilanganKedua

    println("Maka hasil Jumlah : $jumlah")

}