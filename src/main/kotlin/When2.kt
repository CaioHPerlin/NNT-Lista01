fun main() {
    //Questões práticas sobre when - 2
    //classicação de animais (mamífero, réptil e ave)
    println("Pense em um animal.")
    println("Qual das seguintes características seu animal possui? (não se esqueça dos acentos)")
    println("[Escamas, Penas, Glândulas mamárias]")
    val type = when (readln().lowercase()) {
        "escamas" -> "réptil"
        "penas"-> "ave"
        "glândulas mamárias" -> "mamífero"
        else -> "(característica inválida selecionada)"
    }
    print("o seu animal é um(a) $type")
}