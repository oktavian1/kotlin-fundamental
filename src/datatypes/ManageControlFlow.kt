package datatypes

fun main(){


    /*while loop*/

    val food = arrayOf("bakmi", "mie", "burger",
    "mie tektek", "bakwa", "ayam")

    var i = 0
    while (i < food.size){
        println("makanan pada index $i adalah ${food[i]}")
        i++
    }

    /*for loop*/

    for(index in food){
        println(index)
    }


    val rangeZeroToTen = 0..10
    println(rangeZeroToTen) //0..10
    val exclusiveRange = 0 until 10
    println(exclusiveRange)// 0..9

    for (index in rangeZeroToTen step 2){
        println(index) // 0246810
    }

    val range = 10..30
    for (number in range step 2){
        println("$number, ")
    }

    val reverseNumber = 30 downTo 15
    for (number in reverseNumber step 2){
        println("$number, ")
    }

    /*iterate over collection */

    val day = arrayOf("senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu")

    for (i in day){
        println("ini hari $i")
        if (i == "senin"){
            continue
        }

        if (i == "jumat"){
            println("yay besok libur")
        }
    }

    var matrix = MutableList(5){ MutableList(5){""} }

    for (row in 0..matrix.lastIndex){
        for (column in 0..matrix.lastIndex){
            matrix[row][column] = "$row:$column"
        }
    }

    println(matrix) // [[0:0, 0:1, 0:2, 0:3, 0:4], [1:0, 1:1, 1:2, 1:3, 1:4], [2:0, 2:1, 2:2, 2:3, 2:4], [3:0, 3:1, 3:2, 3:3, 3:4], [4:0, 4:1, 4:2, 4:3, 4:4]]

    val matrixRow = 5
    val matrixColumn = 8
    val matrix2 = Array(matrixRow) { Array(matrixColumn){ '.'} }
    matrix2[3][3] = 'X'


    loop@ for(row in 0 until matrixRow){
        for (column in 0 until matrixColumn){
            println("sedang mencari x di row column $row:$column")
            if (matrix2[row][column] == 'X'){
                println("yeay x ketemu di $row:$column" )
                break@loop
            }
        }
    }

    /*when expression*/

    val email: String = "ilham@gmail.com"
    val password: String = "12345678901"

    when {
        email.isEmpty() || email == null -> println("tolong isi email anda")

        "@" !in email -> println("email yang anda masukan tidak ccok")

        password.isEmpty() || password == null -> println("tolong isi password anda")

        password.length < 10 -> println("password anda kurang dari 10")

        else -> println("email anda $email panjang email anda ${email.length} password anda ada ${password.length} huruf")
    }

}