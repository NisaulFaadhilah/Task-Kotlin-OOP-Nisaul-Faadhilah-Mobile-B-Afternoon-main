package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namadepan: String = "Nisaul"
    val namabelakang: String = "Faadhilah"
    val umur: Int = 20
    val single: Boolean = true

    println("Nama: $namadepan $namabelakang")
    println("Umur: $umur tahun")
    println("Status: ${if (single) "Single" else "Not Single"}")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Member: $groupMember")
    println("Session: $session")

    return "Group details printed succesfully"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMembers =  listOf("\n Nisaul Faadhilah\n Jasmine Kholidah Putri\n Alman Hadi Pratama\n Ikhwan Fauzi\n Muhammad Risky Widiyanto\n Maulana Pramugo Mukti\n Vintanny Veshandylla\n Raden Daruryugu\n Muhammad Faiz \n Budi Agung Fajariyanto\n")
    println("List of Group Members: $groupMembers")

    return groupMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Peja", "Kak Ilham")
    val countOfGroup = 10

    return mentor.size + countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("10", listOf("\n Nisaul Faadhilah\n Jasmine Kholidah Putri\n Alman Hadi Pratama\n Ikhwan Fauzi\n Muhammad Risky Widiyanto\n Maulana Pramugo Mukti\n Vintanny Veshandylla\n Raden Daruryugu\n Muhammad Faiz \n Budi Agung Fajariyanto"), "Afternoon")

}