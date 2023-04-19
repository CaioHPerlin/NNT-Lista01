fun main() {
    //Questões práticas sobre when - 1
    //Dia da semana
    print("Insira um número de 1 a 7:")
    val n = readln().toInt()
    val weekDay = when (n) {
        1 -> "domingo"
        2 -> "segunda"
        3 -> "terça"
        4 -> "quarta"
        5 -> "quinta"
        6 -> "sexta"
        7 -> "sábado"
        else -> "(o número inserido não está dentro do alcance especificado)"
    }
    print("o número $n equivale a: $weekDay")
}