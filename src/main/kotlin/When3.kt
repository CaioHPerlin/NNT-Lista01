fun main() {
    //Questões práticas sobre when - 3
    //classicação de letras (vogais e consoantes)
    print("insira uma letra (a-z):")
    val ch = readln().lowercase().toCharArray()[0]
    val type = when (ch) {
        'a' -> "vogal"
        'e' -> "vogal"
        'i' -> "vogal"
        'o' -> "vogal"
        'u' -> "vogal"
        else -> "consoante"
    }
    print("sua letra ($ch) é uma $type")
}