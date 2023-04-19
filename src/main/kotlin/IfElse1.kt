fun main() {
    //Questões práticas sobre if/else - 1
    //Verificar aprovação do aluno
    print("Insira sua primeira nota:")
    val n1 = readln().toFloat()
    print("Insira sua segunda nota:")
    val n2 = readln().toFloat()
    val average = (n1+n2)/2
    val state = if (average >= 7) "Aprovado" else "Reprovado"
    print("$state com média $average")
}