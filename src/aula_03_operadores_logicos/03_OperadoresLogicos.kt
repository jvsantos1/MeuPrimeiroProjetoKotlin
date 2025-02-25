package aula_03_operadores_logicos

fun main(){
    val a = true
    val b = false
    val c = true

    // operador E (&&)
    // vai retornar true apenas se a e b forem verdadeiros ao mesmo tempo, caso contrário sera false

    val result = a && b
    val result2 = a && c

    println("Operador &&")
    println(result) // false
    println(result2) // true

    // operador OU (||)
    // vai retornar true quaando uma das variáveis forem true, ou seja, só será false se as duas forem false

    val result3 = a || b
    val result4 = a || c

    println("Operador ||")
    println(result3)
    println(result4)

    // operador NÃO (!)
    // vai inverter o valor lógico, ou seja, !true = false e do mesmo modo, !false = true

    val e = true
    val f = !e //false

    println("Operador !")
    println(f)

    // operador de IGUALDADE (==)
    // vai verificar se duas variáveis possuem o mesmo valor

    val num1 = 10
    val num2 = 5

    println("operador de IGUALDADE: ")
    println(num1 == num2)

    // operador de DESIGUALDADE (!=)
    // vai verificar se dias variáveis não possuem o mesmo valor

    println("operador de DESIGUALDADE: ")
    println(num1 != num2)

    // operadores É DO TIPO OU NÃO É DO TIPO (is e !is)
    val num: Any = 1
    val numText: Any = "1"

    println("operador is e: ")
    println(num is String)
    println(numText is String)

    println("operador !is e: ")
    println(num !is String)
    println(numText !is String)

    // operadores PERTENCE OU NÃO PERTENCE (in e !in)

    val range = 1.. 10
    val x = 5
    val y = 15

    println("Operador in: ")
    println(x in range)
    println(y in range)

    println("Operador !in: ")
    println(x !in range)
    println(y !in range)
}
