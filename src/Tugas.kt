fun main(args: Array<String>) {

    val bilsatu = readLine()!!.toInt()
    val bildua = readLine()!!.toInt()

    var jumlah = 0

    for ( i in 1 .. bildua) {

        if (i == bildua) {
            print("$bilsatu = ")
        }
        else print("$bilsatu + ")
        jumlah += bilsatu
    }

    println(jumlah)
}

/*

    program faktorial

    4! = 4 * 3 * 2 * 1 = 24

 */