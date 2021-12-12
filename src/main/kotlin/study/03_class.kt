package study

fun main() {
    var a = Person("박보영", 1990)
    var b = Person("전정국", 1997)
    var c = Person("장원영", 2004)

//    a.introduce()
//    b.introduce()
//    c.introduce()

    var d = Person("제이슨")
    var e = Person("레옹")
    var f = Person("바이든")
}

class Person (var name:String, val birthYear:Int) {

    init {
        println("안녕하세요, ${this.birthYear}년생 ${this.name}입니다")
    }

    constructor(name:String) : this(name,1997){
        println("보조 생성자가 사용되었습니다.")
    }

    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다")
    }
}