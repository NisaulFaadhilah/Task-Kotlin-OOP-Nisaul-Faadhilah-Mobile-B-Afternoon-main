package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        val result = divideNumbers(10, 0)
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
    }
}
fun divideNumbers(dividend: Int, divisor: Int): Int {
    return dividend / divisor
    }