/*
    문자타입
    Char타입 변수에는 문자 한개만 저장할 수 있으며, Char 타입의 크기는 2바이트이다.
    코틀린에서는 문자코드를 매기는 방식으로 유니코드를 사용
    유니코드의 범위는 0~65535, 16진수로는 0~FFFF로 16진수 4자리로 표현할 수 있다.
    코틀린 코드에서 작은따옴표안에 \u 4자리 16진수를 입력하면 그번호에 해당하는 문자로 치환
 */

fun main(args:Array<String>):Unit {
    //문자 A 가 아닌 A의 문자코드가 저장됨
    var ch: Char = 'A'
    println(ch)

    ch = '\uAC00'

    println(ch)

    ch = '한'
    //char타입 표현식에 .toInt()를 적으면, 해당 문자의 유니코드 값을 갖는 Int 타입으로 변화한다.
    println(ch.toInt())
}