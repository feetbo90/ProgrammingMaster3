

fun main(args: Array<String>) {

    for ( i in 1 .. 10 )
    {
        println("ini : $i")
    }

    println("==============================")
    for ( i in 1 .. 10 step 2) {
        println("ini yang kedua : $i")
    }

    println("==============================")

    for ( i in 1 until 10)
    {
        println("ini yang ketiga : $i")
    }

    println("==============================")

    for ( i in 10 downTo 1 ) {
        println("ini yang keempat $i")
    }

    val awal = readLine()!!.toInt()
    val akhir = readLine()!!.toInt()

    for (i in awal .. akhir )
    {
        if (i % 2 == 1) {
            println(i)
        }
    }

    println("==============================")

    for ( i in 1 .. 3)
    {
        for (j in 1 .. 5) {
            print("*")
        }
        println()
    }

}