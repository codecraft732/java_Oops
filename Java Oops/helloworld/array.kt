fun main() {
    // Read a line of input, split it by spaces, and safely convert it to an array of integers
    val input = readLine(
    val num = input.toTypedArray()  // Convert the list to an array

    // Loop through each number in the array and print it
    for (number in num) {
        println(number)
    }
}
