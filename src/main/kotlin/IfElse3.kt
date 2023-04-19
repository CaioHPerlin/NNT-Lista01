fun main() {
    //Questões práticas sobre if/else - 3
    //Positivo, negativo ou zero?
    print("Insira um número inteiro:")
    val n = readln().toInt()
    val result = if(n > 0) {
        "positivo"
    } else if(n < 0) {
        "negativo"
    } else {
        "zero"
    }
    print("O número $n é $result")
}