fun main(args: Array<String>) {

    println("Hello! Please, follow the rules!")
    SumOfNumbers()

    println()

    val answer:String = readLine()!!
    while (answer == "YES" || answer == "yes")
    {
        println("${SumOfNumbers()}")
        val answer:String = readLine()!!
    }
    if(answer == "NO" || answer == "no")
    {
        println("THE END")
    }
}

fun SumOfNumbers()
{

    print("Please assign a value for X: ")
    val numberX = readLine()!!
    print("Please assign a value for Y: ")
    val numberY = readLine()!!
    val numberZ = numberX.toInt() + numberY.toInt()
    println("The Sum of number is: $numberZ")
    print("If you want to start again enter 'YES', if not enter 'NO'")



}

