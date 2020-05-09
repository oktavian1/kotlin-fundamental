package datatypes

fun main(){

/*Boolean and Comparison*/
    val myAge = 22
    val myFriendAge = 20
    val checkAge = myAge > myFriendAge
    println(checkAge)
    // true

    val firstName : String = "ilham"
    val lastName : String = "oktavian"
    val checkName = firstName == lastName
    println(checkName) // false

    val myPassword = "1234567890"
    val checkPassword = myPassword.length >= 10
    println(checkPassword) // true

    val firstBoy = "joni haloho"
    val secondBoy = "juni Jalahaa"
    val checkLength = firstBoy.length == secondBoy.length
    println(checkLength) // false


/*combine logical operator */

    val myAge2 = 22
    val myCountry = "Indonesia"
    val drivingLicense = (myAge2 >= 17 && myCountry == "Indonesia") || (myAge2 >= 17 && myCountry == "Japan")
    println(drivingLicense) // true

    val ageMessage = if (drivingLicense) "you can drive" else "u cant"
    println(ageMessage) // u can drive

    /*Branch With If Expressions & Scopes*/

    val yearOfbirth = 1997
    val generation = if(yearOfbirth > 1964 && yearOfbirth < 1980){
        "Generation X"
    }else if(yearOfbirth > 1980 && yearOfbirth < 1999){
        "Milineal"
    } else{
        "gen micin"
    }
    println(generation)

    val email = "japra@gmail.com"
    val password = "1234567890"
    val username = "ilham.oktavian"
    val message = if (email.isEmpty() || password.isEmpty() || username.isEmpty()){
        "tolong isi datanya"
    }else if(username.length < 6){
        "tolong masukan lebih dari 6"
    }else if (password.length < 10){
        "password anda kurang dari 10"
    }else if (!email.contains("@") || !email.contains(".")){
        "invalid email"
    }else{
        "yee succees"
    }
    println(message) // yee succes

    /*nullable*/

    val myPassword2: String? = "1234511111"
    val passwordLength = myPassword2?.length ?:0 //// ELVIS OPERATOR

    val message2 = if (passwordLength == 0){
        "u need password"
    }else if (passwordLength > 0 && passwordLength < 6){
        "weak password"
    }else if (passwordLength > 10){
        "gogogogo"
    }else{
        "godd"
    }
    println(message2)


    /*conclusion*/

    val name3 = "Ilham"
    val lastName3 = "Oktavian"
    val nickName: String? = null
    val country = "indonesia"
    val age = 22

    val nameToPrint = if (age > 18) "$name3," else ""
    val nickNamePrint = nickName?:"" // elvis
    val yearOfBirth = 2020 - age

    val checkData = "$nameToPrint $nickNamePrint $lastName born on $yearOfBirth, in country $country"
    println(checkData)



}
