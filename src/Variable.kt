//변수(Variable) = 값을 저장해 놓는 공간
fun main(args:Array<String>):Unit{

    // 변수선언 var(변수 키워드) total(변수이름, 식별자) : Int (변수의 타입)
    var total : Int // 코틀린은 자바와 달리 원시(Primitive)타입이 없다.
                    // 코틀린에서는 Int와 같은 기본타입들도 모두 클래스이다.
    total = 0

    //var total : Int = 0 , 선언과 동시에 초기화함

   //total = 변수의 이름, 임의로 지어낸 이름을 식별자라 한다.
    // 식별자는 키워드를 제외한 영문자, 숫자, 언더스코어(_)로만 지을수 있다. 단 숫자는 맨앞 X

    //자바와 코틀린의 식별자 규칙 차이점
    // * 코틀린에서는 자바와 달리 식별자에 $를 사용할 수 없다.

    // 여러 단어로 된 식별자 짓기 - 코틀린에서는 식별자에 공백 허용 X
    // anyVariableName 낙타 표기법(Camel Case)
    // AnyVariableName 파스칼 표기법(Pascal Case)
    // any_variable_name 뱀 표기법(Snake Case)

    //Int 는 변수타입, Integer(정수)의 약자로 소수점이 없는 숫자값만 저장할 수 있는 타입
    val a : Int = 10 + 53 - 7
    println(a)

    val b : Int = 43 + 75 + a
    println(b)

    total = a + b
    println(total)

    /*
        val 도 var 처럼 바로 뒤에 나올 식별자가 변수임을 나타내는 키워드
        val 로 선언된 변수는 값을 저장하면 나중에 값을 수정 할 수 없음
        var 은 일반변수 , val 은 final 변수, 불변 변수의 사용을 장려하기 위해 val 이라는 짧은 키워드 제공

     */
}



