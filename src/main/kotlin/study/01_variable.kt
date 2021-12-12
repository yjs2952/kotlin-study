package study

fun main() {
    val a: Int? = null;
    println(a);
    println(add1(1,2,3))
    println(add2(1,2,3))

    val b = arrayOf(1,2,3,4,5)
    println(b)

    val c = listOf(1,2,3,4,5)
    println(c)
}

fun add1(a: Int, b: Int, c: Int): Int {
    return a + b + c;
}

fun add2(a: Int, b: Int, c: Int) = a + b + c;

