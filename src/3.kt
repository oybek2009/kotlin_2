import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    print("birinchi sonni kiriting: ")
    val a = scanner.nextInt()
    print("ikkinchi sonni kiriting: ")
    val b = scanner.nextInt()

    if (a==b) {
        println(0)
    }else {
        println(a+b)
    }
}