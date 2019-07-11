import kelas.mobil

/*
    mobil

    atribut

    ban
    warna
    no mesin
    merk


    fungsi / kegunaan
    berjalan
    berhenti



 */





fun main(args: Array<String>) {

    val bmw = mobil(4,"hitam", "blablabla", "bmw")


    bmw.berjalan()
    println("mobil memilik ban : ${bmw.ban} dan warna : ${bmw.warna} dan Gabungan : ${bmw.gabunganBanMerk}")

    val ferrari = mobil(4, "merah", "blablabal", "ferrari", "BK 9080 AU")
    ferrari.show()
}

