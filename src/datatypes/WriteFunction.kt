package datatypes

fun main(){

    fun createRange(start: Int, end: Int, isHalfOpen: Boolean = false) =
        if (isHalfOpen){
            start until end
        }else{
            start..end
        }

    fun createChar(start: Char, end: Char, isHalfOpen: Boolean = false) =
        if (isHalfOpen) start until end
        else start..end

    fun printRange(range : IntRange){
        for (number in range ) print("$number \t")
        println()
    }

    fun printRange(range : CharRange){
        for (number in range ) print("$number \t")
        println()
    }

    val halfOpenRange = createRange(5,11,true)
    printRange(halfOpenRange) // 5 	6 	7 	8 	9 	10

    val closedRange = createRange(1, 10)
    printRange(closedRange) //1 	2 	3 	4 	5 	6 	7 	8 	9 	10

    val usingNamedArgument = createRange(isHalfOpen = true, start = 1, end = 12)
    printRange(usingNamedArgument)

    val charRange = createChar('A', 'H')
    printRange(charRange)

    fun parseCoordinates(input: String): Pair<Double, Double>{
        val latitudeLongitude = input.split(",")

        val latitude = latitudeLongitude[0].toDouble()
        val langitude = latitudeLongitude[1].toDouble()

        return latitude to langitude
    }

    val (latitude, longitude) = parseCoordinates("45.12,44.22")
    println("the latitude is $latitude and langitude is $longitude") // the latitude is 45.12 and langitude is 44.22

    /*declare  & pass function*/

    val email: String? = "ilhamoktavia@gmail.com"
    val password: String? = "1234567890"

    fun validateString(input: String?, inputType: String){
        if (input == null || input.isBlank()) false
        else if (inputType == "Password") input.length >= 10
        else if (inputType == "Email") input.contains("@")
        else println("cannot verify this input")
    }

    validateString("Hello World", "Japra") //cannot verify this input

    fun validateString(input: String?, validator: (String) -> Boolean) =
        if (input == null || input.isBlank()) false
        else validator(input)

    fun validatePassword(password : String) = password.length >= 10

//    val isValidPassword = validateString(password, {it.length >= 10})

    val isValidPassword = validateString(password , ::validatePassword)
    println(isValidPassword) // true

    val validator: (String?) -> Boolean = {
        it != null && validatePassword(it)
    }

    println(validator) // (kotlin.String?) -> kotlin.Boolean
}