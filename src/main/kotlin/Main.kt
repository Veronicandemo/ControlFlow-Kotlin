fun main() {

    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
        println("Use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("Use your power technique 1337")
    } else {
        println("Use technique")
    }

    var age = 11;
    if (age >= 21) {
        println("You may drink in the US")
    } else if (age >= 18) {
        println("You may vote")
    } else if (age >= 16) {
        println("You may drive")
    } else {
        println("You are too young")
    }
    var name = "Veronica"
    if (name == "Veronica") {
        println("Welcome Home")
    } else {
        println("Who are you?")
    }
    //when statement of the above
//    when (age) {
//        in 21..150 -> println("You may dink in the US")
//        in 18..20 -> println("You may vote now")
//        16, 17 -> println("You may drive now")
//        else -> println("You are soo young")
//    }

    when(age){
        in 21..250 -> println("You can drink in the US")
        in 18..20 -> println("You may vote now")
        16,17 -> println("You may drive now")
        else -> println("You are too young!")
    }

    var season = 3
    when (season) {
        1 -> println("It is spring")
        2 -> println("It is summer")
        3 -> {
            println("Fall")
            println("Autum")
        }

        4 -> println("Winter")
        else -> println("Invalid season")

    }
    var month = 3
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid season")
    }


    var y = 100
    while (y >= 0) {
        println("$y")
        y -= 2
    }

    var x: Any = 12.3
//    when(x){
//        is Int -> println("$x is an Integer")
//        is Double -> println("$x is a Double")
//        is String -> println("$x is a String")
//        else -> println("$x is none of the above")
//    }

    var result = when(x){
        is Int -> "is an integer"
        !is Double -> "is not a Double"
        is String -> "is a String"
        else -> "None of the above"
    }
println("$x $result")
    var num = 1

    while(num <= 10){
        print("$num ")
        num++
    }
    println("\nWhile loop is done")
//A while loop that prints every second value descending from 100
    //Declare a variable

    var value = 100;
    while(value > 0){
        println("$value");
        value -= 2;
    }
    //Do while loops
    var z = 8
    do {
        print("$z")
        z++
    }while (z <= 10)
    println("The do while loop is done")

    var feltTemp = "Cold"
    var roomTemp = 10
    while(feltTemp == "Cold"){
            roomTemp++
        if(roomTemp >= 20){
            feltTemp = "Comfy"
            println("Its comfy now")
        }
    }

    for (number in 1..10){
        print("$number")
    }
    for(i in 1 until 20){
        print("$i ")
        println("End until")
    }
    //steps of 2 down
    for(i in 100 downTo 2 step 2){
        print("$i ")
    }
    println("Next loop_______")
    //Write a for loop that runs from 0 to 10000
    //Once it's at 9001 it should write "IT'S OVER 9000!!!"
    for(w in 0..10000){
        if(w == 9001){
            print("$w ")
            print("ITS OVER 9000!!!")
        }
    }

    //Write a while loop that checks the humidity (not the humidityLevel). The variable humidityLevel starts at 80.
    // The variable humidity is initialized with "humid". If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
    //Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"
    var humidityLevel = 59
    var humidity = "Humid"
    while (humidityLevel > 60){

        println(humidity)
       humidityLevel -= 5
        if(humidityLevel < 60){
            println("Its now comfy")
            humidity = "Comfy"
            println(humidity)
        }
    }

    for(i in 1 until 20){
        print("$i ")
        if(i/2 == 5){
            break
        }
    }
    println("Continue_____")
    for (i in 1 until 20){
        if(i/2 == 5){
            // 10/2 == 5
            // 11/ 2 == 5.5 which is 5 in terms of an int
            continue //skip this iteration
        }
        print("$i ")
    }

}


