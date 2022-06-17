package operators

/* 비교연산자(ComparisonOperator) 두 피연산자를 비교하는 연산자
   기호       사용 예        결과 값
    ==       a == b        a와 b가 같으면 ture, 다르면 false
    !=       a != b        a와 b가 다르면 ture, 같으면 false
     >       a > b         a가 b 보다 크면 ture, 작으면 false
     <       a < b         a가 b 보다 작으면 ture, 크면 false
     >=     a >= b         a가 b보다 크거나 같으면 ture, 작으면 false
     <=     a <= b         a가 b보다 작거나 같으면 ture, 크면 false
 */

fun main(args:Array<String>):Unit {
    var isRight: Boolean = (10 + 70) > (3 * 25)
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 ==(10 + 20)
    println(isRight)

    isRight = 0.00001f == 0.005f * 0.002f
    println(isRight)
}
