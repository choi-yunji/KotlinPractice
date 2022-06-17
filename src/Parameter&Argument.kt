fun main(args:Array<String>): Unit {
    println(cToF(30)) // 매개변수에 저장되는 표현식 30을 인수(Argument)라 한다. 인수와 매개변수 타입은 일치해야한다.
    println(getAverage(89,96))
}

fun cToF(celsius:Int):Double // 함수 이름 옆의 소괄호 안에 변수 = 매개변수
                             // 매개변수는 함수를 호출한 곳으로부터 값을 전달 받을때 사용한다.
                             // 매개 변수 선언 시 주의점 - 매개 변수를 선언할때는 val 나 var 키워드를 붙이지 않는다.
                             // 매개 변수는 무조건 val 로 선언되므로 값을 수정할 수 없다.
{
    return celsius * 1.8 + 32
}

fun getAverage(a:Int, b:Int):Double{
    return ( a + b )/2.0
}