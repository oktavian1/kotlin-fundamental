package datatypes

fun main(){

    /*create access map*/
    val filmCollection = mutableMapOf<String, MutableList<String>>()
    println(filmCollection) // {}

    filmCollection.put("Action", mutableListOf("naruto", "doraemon", "llol"))
    println(filmCollection) // {Action =[naruto, doraemon, llol]}

    val actionFilm = filmCollection["Action"]
    println(actionFilm) // [naruto, doraemon, llol]

    val authenticatorHeader = mapOf(
        "API_KEY" to "your-api-key",
        "authorization" to "auth-token",
        "conten/type" to "application/json"
    )
    println(authenticatorHeader) //{API_KEY=your-api-key, authorization=auth-token, conten/type=application/json}

    /*work with maps*/

    filmCollection["Action"] = mutableListOf("Conan")
    println(filmCollection) // {Action=[Conan]}

    filmCollection["Action"]?.add("Fear")
    println(filmCollection) //{Action=[Conan, Fear]}

    val removedAction = filmCollection.remove("Action")
    println(removedAction) // [Conan, Fear]
    println(filmCollection) //{}

    filmCollection["Horor"] = mutableListOf()
    filmCollection["Horor"]?.add("Mumun")
    filmCollection["Comedy"] = mutableListOf("Dono")

    println(filmCollection) //{Horor=[Mumun], Comedy=[Dono]}

    for (key in filmCollection.keys){
        println(key) //Horor Comedy
    }

    for(value in filmCollection.values){
        println(value) //[Mumun][Dono]
    }

    val pets = mutableMapOf<String, String>()

    pets["Kucing"] = "meong"
    pets["Anjing"] = "gukguk"
    pets["Burung"] = "cuitcuit"

    pets.remove("Burung")

    for ((name, sound) in pets){
        println("$name bunyinya $sound")
    }
//////////// map of tidak bisa diubah ubah
    val pets2 = mapOf("Kucing" to "Meong",
    "Anjing" to "GukGuk",
    "Burung" to "CuitCuit")

    for ((name, sound) in pets2){
        println("$name bunyinya $sound")
    }


    /*Store Unique Data In Sets*/
// tidak bisa kembar
    val userId = setOf("13a","12a", "14a", "15a")
    println(userId) // [13a, 12a, 14a, 15a]

    println(userId.contains("13a")) // true
    println("13a" in userId) // true

    val mutableId = userId.toMutableSet()
    println(mutableId.add("11a")) // true
    println(mutableId.add("13a")) // false
    println(mutableId) //[13a, 12a, 14a, 15a, 11a]

    for (id in mutableId){
        println(id)
    }

    val name = arrayOf("ilham", "oktavian", "japra", "japra", "oktavian")
    println(name)

    val uniqueName = name.toMutableSet()
    println(uniqueName)

}