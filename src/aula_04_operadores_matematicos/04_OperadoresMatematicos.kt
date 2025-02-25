package aula_04_operadores_matematicos

import java.lang.Math.*
import kotlin.math.floor
import kotlin.math.pow

fun main(){

    val num = 4
    val num2 = 2

    // Operadores básicos

    println("4 + 2 = ${num + num2}")
    println("4 - 2 = ${num - num2}")
    println("4 * 2 = ${num * num2}")
    println("4 / 2 = ${num / num2}")
    println("4 % 2 = ${num % num2}")

    // Operadores de Incremento

    var num3 = 10
    var num4 = 20

    num3++
    num4--

    println(" num3++ = $num3")
    println(" num4-- = $num4")

    // atribuição composta

    var num5 = 1

    num5 += num //isso vale para todos os operadores básicos

    println("num5 += num = $num5")

    // biblioteca math
    val value = 2.567
    val valueRounded = round(value)

    println("arrendondamento de $value com round = $valueRounded")

    val valueFloor = floor(value)
     println("arrendondamento para baixo de $value com floor = $valueFloor")

    val valueCeil = ceil(value)
    println("arrendondamento para cima de $value com ceil = $valueCeil")

    val base = 2.0
    val expoente = 3.0
    val valuePow = base.pow(expoente)
    println("Potencialização: $base ^ $expoente = $valuePow")

    val logValue = log10(100.0)

    println("Log10 de 100 = $logValue")

}