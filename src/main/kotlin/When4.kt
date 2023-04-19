fun main() {
    //Questões práticas sobre when - 4
    //exibir mês correspondente (1-12)
    print("um número inteiro de 1-12:")
    val n = readln().toInt()
    val month = when (n) {
        1 -> "janeiro"
        2 -> "fevereiro"
        3 -> "março"
        4 -> "abril"
        5 -> "maio"
        6 -> "junho"
        7 -> "julho"
        8 -> "agosto"
        9 -> "setembro"
        10 -> "outubro"
        11 -> "novembro"
        12 -> "dezembro"
        else -> "(mês inválido)"
    }
    print("o número inserido ($n) equivale ao mês de $month")
}