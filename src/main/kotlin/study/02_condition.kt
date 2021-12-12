package study

fun main() {
    var a = 11;

    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }

    doWhen("")
}

fun doWhen(a: Any) {
    when (a) {
        1 -> println("정수 1입니다")
        "Dimo" -> println("디모의 코틀린 강좌입니다")
        is Long -> println("Long 타입 입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")
    }
}