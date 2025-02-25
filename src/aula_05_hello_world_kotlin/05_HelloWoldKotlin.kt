package aula_05_hello_world_kotlin

fun main(){
    println("Entre com o seu nome: ")

    val name = readln()

    println("Hello, $name!")

    println("Qual a sua idade? ")

    val age = readln().toInt()

    for (i in 1..age){
        val ageText = if (i == age) "A sua idade é $i!" else "$i..."
        println(ageText)
    }

}