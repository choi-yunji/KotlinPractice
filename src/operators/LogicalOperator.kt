package operators

/* 논리 연산자(LogicalOperator) 참과 거짓으로만 계산을 수행하는 연산자
    기호       사용 예        결과 값
    &&       a&&b        a와 b가 모두 ture 면 결과값은 ture , 둘 중 하나라도 false 면 false
    ||       a||b        a와 b 둘 중 하나라도 ture 면 결과 값은 ture, 둘 다 false 면 false
     !       !a          a가 ture 면 결과값은 false, a가 false 면 결과값은 ture
 */

fun main(args:Array<String>):Unit {
    val a = 15
    val b = 17

    var bool:Boolean = (a - b < a + b ) && (a == 15)
    println(bool)

    bool = !((a + b) > (a * 3) || (b - a) > 0)
    println(bool)
}