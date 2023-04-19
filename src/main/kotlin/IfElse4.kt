fun main() {
    //Questões práticas sobre if/else - 4
    //Maior de idade?
    print("Insira sua idade:")
    val n = readln().toInt()
    val isUnderage = n < 18
    val result = if (isUnderage) "menor de idade" else "maior de idade"
    print("Você é $result")
}