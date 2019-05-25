fun main(args: Array<String>) {


    var bilangan = 4

    var faktorial = 1
    for (i in bilangan downTo 1) {

        if (i == 1) {
            print("$bilangan = ")
        }
        else print("$bilangan * ")
        faktorial *= bilangan
        bilangan -= 1
    }

    println(faktorial)

}