
/*

    if(true)
    {

    }else {
    }

    struktur keputusan bersarang

    if() {
    }else if()
    {
    }

 */


fun main(args: Array<String>) {

    println("Masukkan bilangan : ")
    val bilangan = readLine()!!.toInt()


    if (bilangan % 2 == 1) {
        println("Maka bilangan ganjil")
    } else {
        println("Maka bilanagn genap")
    }

    println("============================")
    val nilai = readLine()!!.toInt()
    val nilai2 = readLine()!!.toInt()
    val nilai3 = readLine()!!.toInt()
    if(nilai > nilai2)
    {
        println("Maka nilai terbesar : $nilai")
    } else {
        println("Maka nilai terbesar : $nilai2")

    }



    if (nilai > nilai2) {
        if (nilai > nilai3) {
            println("Maka nilai terbesar : $nilai")
        }else {
            println("Maka nilai terbesar : $nilai3")
        }

    } else if (nilai2 > nilai3){
        println("Maka nilai terbesar : $nilai2")
    } else println("Maka nilai terbesar : $nilai3")


}