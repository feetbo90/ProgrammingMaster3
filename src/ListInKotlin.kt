
/*

    List<Int> 5

    0   1   2   3   4
    10  30            40


    100 140 150 190
    100 140 50 150 190

 */


fun main(args: Array<String>) {

    val list = mutableListOf<Int>()

    list.add(100)
    list.add(121)
    list.add(130)
    list.add(3, 200)

    println(list[3])
    list.add(2,150)
    println(list)

    list.removeAt(0)
    println(list)

    val input = readLine()!!.toInt()
    list.add(input)
    list[0] = 123

    for (i in 0 until list.size) {

        if (list[i] % 2 == 1)
            println(list[i])
    }

    println(list)

}


/*

    masukkan berapa nilai
    5

    input bilangan 1 : 100
    input bilangan 2 : 90
    input bilangan 3 : 80
    ...
    var jumlah = 0
    for


 */