
fun main() {
    val man = "человеку"
    val people = "людям"
    println("Введите колличество лайков: ")
    val likes = readln().toInt()
    val lastNumberOfLikes = likes % 10
    val lastTwoNumberOfLikes = likes % 100
    val manOrPeople = if (lastNumberOfLikes == 1 && lastTwoNumberOfLikes != 11) man else people
    println("Понравилось: $likes $manOrPeople")
}