fun main() {
    printOddnums()
    var x= longWord(arrayOf("joy","clara","Belise","clever","Cynthia","georgette","Groly"))
    println("The number of words with more than 5 characters are: "+x)
    serveDrink(1)
    multiples()
}
//printing out odd numbers between 1 and 100
fun printOddnums(){
    for(i in 1..100){
        if(i % 2 != 0){
            println(i)

        }
    }
}

// returning the length of words with more than 5 characters
fun longWord(names:Array<String>):Int{
    var total = 0


    for (n in names){
        if (n.length > 5) {
            total++
        }
    }
    return total

}
// Robot giving drinks to a certain age
fun serveDrink(age:Int){
    var drink = when {
        age<6 -> "glass of milk"
        age<15-> "bottle of fanta orange"
        else->"bottle of coca cola"
    }
    println("person of $age years old get $drink")
}
// checking the multiples of 3 and 5

fun multiples() {
    for (i in 1..100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("Fizz Buzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")

            else -> println(i)
        }
    }
}
