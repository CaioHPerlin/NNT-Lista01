fun main() {
    //Questões práticas sobre if/else - 2
    //Par ou Ímpar
    print("Insira o número  inteiro que deseja descobrir se é par ou ímpar:")
    val n = readln().toInt()
    val isEven = n % 2 == 0
    val result = if (isEven) "par" else "ímpar"
    print("o número $n é $result")
}