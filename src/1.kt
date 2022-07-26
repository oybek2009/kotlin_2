import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    println("Registration")
    print("Write your name: ")
    val name = scanner.nextLine()
    print("Write your age: ")
    val age = scanner.nextInt()
    println("Create your password")
    print("Write your password in numbers: ")
    val password = scanner.nextInt()
    print("Return your password: ")
    val password1 = scanner.nextInt()

    if (password==password1) {
        println("Success!!!")
    }else {
        println("Failed!!!")
    }

}