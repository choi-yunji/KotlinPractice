// 다른 패키지의 함수 호출하기

fun main(args:Array<String>): Unit {
    println(ex_package.min(30,10))
}

/** 다른 패키지에 선언된 함수를 호출할 때에는 패키지이름.함수이름()을 사용한다
 *  패키지가 서로 다르다면 이름과 시그니처가 같은 함수를 선언해도 상관없다.
 * **/
