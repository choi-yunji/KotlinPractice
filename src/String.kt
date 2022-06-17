/*
    문자열(String)
    String 은 문자열을 저장할 수 있는 타입이다
    문자 여러 개를 큰 따옴표로 감싸면 그부분은 String 타입이 된다.
 */

fun main(args:Array<String>): Unit {
    var str: String = "Hello"
    println(str)

    str = str + "\nKotlin!"

    println(str)

    println(str[8])

    val num = 10 * 5 + 3
    println(str + num)

    //문자열 안에 표현식의 값을 집어넣기
    val a = 10
    val b = 20
    // $뒤에 변수이름을 적으면 해당 부분은 변수의 값으로 대체
    println("a의 값: $a")
    println("b의 값: $b")
    println("a + b = ${a + b}")
}