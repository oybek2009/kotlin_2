import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    print("birinchi sonni kiriting: ")
    val a = scanner.nextInt()
    print("ikkinchi sonni kiriting: ")
    val b = scanner.nextInt()
    print("uchinchi sonni kiriting: ")
    val c = scanner.nextInt()

    if (a>b&&a>c) {
        println("eng kattasi: " +a)
    }
    else if (b>a&&b>c) {
        println("eng kattasi: " +b)

    }
    else if (c>a&&c>b) {
        println("eng kattasi: " +c)
    }
    if (a<b&&a<c) {
        println("eng kichkinasi: " +a)
    }
    else if (b<a&&b<c) {
        println("eng kichkinasi: " +b)

    }
    else if (c<a&&c<b) {
        println("eng kichkinasi: " +c)
    }
}