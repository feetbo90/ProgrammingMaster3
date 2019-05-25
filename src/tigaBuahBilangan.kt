fun main(args: Array<String>) {

    // cara I

    println("Masukkan bilangan pertama : ")
    val bilSatu = readLine()!!.toInt()
    println("Masukkan bilangan kedua : ")
    val bilDua = readLine()!!.toInt()
    println("Masukkan bilangan ketiga : ")
    val bilTiga = readLine()!!.toInt()

    if (bilSatu > bilDua && bilSatu > bilTiga ) {
        println("Maka bilangan yang terbesar $bilSatu")
    } else if (bilDua > bilTiga) {
        println("Maka bilangan yang terbesar $bilDua")
    } else
        println("Maka bilangan yang terbesar $bilTiga")

    // cara II

    if (bilSatu > bilDua) {
        if (bilSatu > bilTiga) {
            println("Maka bilangan yang terbesar $bilSatu")
        } else
            println("Maka bilangan yang terbesar $bilTiga")
    } else if (bilDua > bilTiga) {
        println("Maka bilangan yang terbesar $bilDua")
    } else {
        println("Maka bilangan yang terbesar $bilTiga")
    }

}