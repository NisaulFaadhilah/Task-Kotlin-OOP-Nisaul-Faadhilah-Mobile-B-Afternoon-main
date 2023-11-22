package id.infinitelearning.KotlinSubmission.exercise5

class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 20

    fun setProfile(name: String?, age: Int, height: Int, health: Int) {
        this.name = name
        this.age = age
        this.height = height
        this.health = health
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }



    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.
      COSMOPOLITE -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x

    */

    fun jalan() {
        checkHealth()
        println("$name sedang berjalan...")
        health -= 2
    }
    fun lari() {
        checkHealth()
        println("$name sedang berlari...")
        health += 2
    }
    fun makan() {
        checkHealth()
        println("$name sedang makan...")
        health += 2
    }
    fun minum() {
        checkHealth()
        println("$name sedang minum...")
        health -= 2
    }
    fun lompat() {
        checkHealth()
        println("$name sedang lompat...")
        health -= 2
    }
    fun duduk() {
        checkHealth()
        println("$name sedang duduk...")
        health += 1
    }

}

fun runchallange(hero: Hero, activities: List<String>, counts: List<Int>) {
    for (i in activities.indices) {
        repeat(counts[i]) {
            when (activities[i]) {
                "jalan" -> hero.jalan()
                "lari" -> hero.lari()
                "makan" -> hero.makan()
                "minum" -> hero.minum()
                "lompat" -> hero.lompat()
                "duduk" -> hero.duduk()
            }
        }
    }
}

