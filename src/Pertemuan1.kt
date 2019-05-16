import java.util.*

/*

    deklarasi variabel
    primitive variabel
    int bilangan = 10

    Sintaks :
                var / val nama_variabel : tipe_data = value
    Contoh :
        val bilangan : Int = 14
        var bilangan : String = "Hallo"
        var kata = "Hallo"

    operator aritmatika
    *, /, +, -


    operator logika
    AND, OR

    AND = &&
    OR = ||




 */


fun main(args: Array<String>) {

    var bilangan = 3
    var bilangan2 = 10

    val jumlah = bilangan + bilangan2
    val kurang : Int
    println("Maka hasil penjumlahannya adalah : $jumlah")

    val input = Scanner(System.`in`)
    println("Masukkan bilangan : ")
    bilangan = input.nextInt()
    println("Masukkan bilangan kedua : ")
    bilangan2 = readLine()!!.toInt()

    kurang = bilangan - bilangan2

    println("Maka hasil pengurangan $bilangan - $bilangan2 = $kurang")


}