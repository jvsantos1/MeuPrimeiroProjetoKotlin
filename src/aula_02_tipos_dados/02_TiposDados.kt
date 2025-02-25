package aula_02_tipos_dados

fun main(){

    // numéricos

    val byte: Byte = -128 //ele gera um intervalo de -128 a 127 (8 bits de resolução)
    val short: Short = 32_767 //ele varia de -32768 a 32767 (16 bits de resolução)
    val int: Int = 1_000_000 // vai de -2^31 a 2^31 - 1 (32 bits de resolução)
    val long: Long = 13215163513618  // vai de -2^63 a 2^63 - 1 (64 bits de resolução)

    val float: Float = 3.14f // (32 bits de resolução)
    val double: Double = 3.0 // (64 bits de resolução)

    // literais (ou dados de texto)

    val char: Char = 'A' // um único caracter representado e pode se utilizar letras maiúsculas, minúsculas ou caracteres especiais
    val string: String = "palavra"

    // boolean

    val boolean: Boolean = false // true ou false são as palavras reservadas para tratar esse tipo de valor

    // Detalhes dos Tipos de Dados

    val age: Int = 23

    // adicionar meses em formato decimal ao inteiro da idade, ou seja, converter idade em um tipo de dado numérico flutuante

    var ageDouble: Double = age.toDouble()

    val monthPercent: Double = 1.0/12

    println("ageDouble = $ageDouble monthPercent = $monthPercent")

    // 2 meses depois...

    ageDouble += 2 * monthPercent

    println("ageDouble update = $ageDouble")

    // mostrar a idade em formato string com padrão "A idade é X anos."

    val ageText: String = "A idade é " + ageDouble.toString().plus( " anos.")

    println(ageText)

    println(ageText.uppercase())
    println(ageText.lowercase())


}
