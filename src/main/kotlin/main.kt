fun main() {
    var likes = 521
    val last2Character = likes % 100
    val lastCharacter = likes % 10
    val stringLikes = if (lastCharacter == 1 && last2Character != 11) println("Понравилось $likes человеку") else println("Понравилось $likes людям")

}