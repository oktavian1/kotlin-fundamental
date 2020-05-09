package datatypes

fun main(){

    /*Pairs and triples*/
    val creditCard = Triple("123121331243", "44112", "Visa")
    val bankAccount = Pair(200000.0, creditCard)

    val (balance, card) = bankAccount
    val (cardNumber, securityCode, cardType) = creditCard

    println("akun anda memiliki saldo $$balance, dengan no $cardNumber dan tipe kartu $cardType, security****")


    /*arrays and list of data*/

    val film = arrayOf("naruto", "doraemon", "roboto",
    "boomberman", "fallout", "suzuna")
    film[0] = "sinchan"
    println(film[0])

    val filmList = film.toMutableList()
    filmList.addAll(listOf("naruto", "byakugan", "sakura"))

    filmList.remove("sakura")

    println(filmList)
    println("naruto" in filmList)
}