fun main() {
    //Comentarios
    //O objetivo deste programa é indicar se o usuário é maior ou menor de 18 anos, dada sua idade.
    print("Insira sua idade:")
    val age = readln().toInt()
    val underAge = "Você ainda é menor de 18 anos!"
    val overAge = "Você tem mais de 18 anos!"
    val result = if (age >= 18) overAge else underAge
    print(result)
}