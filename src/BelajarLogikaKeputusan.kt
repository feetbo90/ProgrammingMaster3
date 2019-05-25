/*

    logika AND dan OR

    AND
    T   T   T
    F   T   F
    T   F   F
    F   F   F

    OR

    T   T   T
    F   T   T
    T   F   T
    F   F   F


    operator perbandingan

    >, < , >=, <= , == , !=



    if bersarang

    if() {
    }
    else if () {
    } else if () {
    }
 */


fun main(args: Array<String>) {

    println("Masukkan nilai ")
    val bilangan = readLine()!!.toInt()
    println("Masukkan nilai ke dua ")
    val bilangan2 = readLine()!!.toInt()

    if (bilangan > bilangan2) {
        println("Maka nilai yang terbesar : $bilangan")
    } else if(bilangan == bilangan2){
        println("kedua bilangan sama : $bilangan")
    } else println("Maka nilai yang terbesar : $bilangan2")



}