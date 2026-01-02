package datatype

// collection operation example in Kotlin

fun filterlist() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val oddNumbers = numbers.filterNot { it % 2 == 0 }
    println(evenNumbers)
    println(oddNumbers)
}

fun maplist() {
    val numbers = listOf(1,2,3,4,5)
    val squaredNumbers = numbers.map { it * it }
    println(squaredNumbers)
}

fun countlist() {
    val words = listOf("apple", "banana", "avocado", "grape", "apricot")
    val countA = words.count { it.startsWith("a") }
    println("Number of words starting with 'a': $countA")
}

fun findlist() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val firstEven = numbers.find { it % 2 == 0 }
    val firstGreaterThanFive = numbers.first { it > 5 }
    val firstOrNullLessThanZero = numbers.firstOrNull { it < 0 }

    println("First even number: $firstEven")
    println("First number greater than five: $firstGreaterThanFive")
    println("First number less than zero (or null): $firstOrNullLessThanZero")
}

fun firstlist() {
    val numbers = listOf(1,2,3,4,5)
    val firstNumber = numbers.first()
    val lastnumber = numbers.last()
    println("First number: $firstNumber")
    println("Last number: $lastnumber")
}

fun sumlist() {
    val numbers = listOf(1,2,3,4,5)
    val sum = numbers.sum()
    val average = numbers.average()
    println("Sum: $sum")
    println("Average: $average")
}

fun sortlist() {
    val numbers = listOf(5,3,8,1,2)
    val sortedAsc = numbers.sorted()
    val sortedDesc = numbers.sortedDescending()
    println("Sorted Ascending: $sortedAsc")
    println("Sorted Descending: $sortedDesc")
}

fun main() {
    filterlist()
    maplist()
    countlist()
    findlist()
    firstlist()
    sumlist()

}