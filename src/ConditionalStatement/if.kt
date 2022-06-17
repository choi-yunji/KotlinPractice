// 흐름 제어 - 조건문 if
// if 문은 다음과 같이 작성한다
// if (Boolean 타입 표현식)
// {
//      if 문에 포함시킬 문장들
// }

/*
    if 문은 다음과 같이 작성한다
        if (Boolean 타입 표현식) - 소괄호 안에 들어가는 Boolean 타입의 표현식은 조건(Condition) 이라고 하며
                                 조건이 ture 일 때만 if 문에 들어 있는 문장들이 실행된다.
        {
            if 문에 포함시킬 문장들
        } - {}중괄호로 둘러싼 부분을 블록이라 함
 */


fun main(args:Array<String>): Unit {
    var a = 15
    val b = 11

    if(a > b) {
        println("if 안으로 들어옴")
        a -= b
    }

    println(a)
}

/*  블록 짧게 쓰기 - if문에 속한 문장이 하나일 때는 중괄호를 생략할 수 있다.
    if (a > b) {
        println(a)
     }

    위 코드는 다음과 같이 줄여 쓸 수 있다.

    if (a > b)
        println(a)

 */