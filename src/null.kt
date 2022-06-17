import upcasting.Person

fun main(args:Array<String>){
    // 타입뒤에 ?를 붙이면 변수를 Nullable 하게 만들 수 있다.
    // Nullable - null 값을 지정할 수 있는 변수
    var person:Person? = Person("K",30)
    // null 은 참조 변수가 어떠한 객체도 가리키지 않고 있음을 나타내는 키워드
    person = null

    // Byte, Short, Int, Long, Float, Double, Char, Boolean 타입 뒤에 ?를 붙이면
    // 그 변수는 참조 변수가 된다.
    var num :Int? = null
    num = 10
}

// 기본적으로 null 값을 지정할 수 없는 코틀린
// 자바는 모든 참조 타입에 기본적으로 null 을 지정할 수 있다. 하지만,
// 코틀린에서는 Nullable 타입이 아니면 null 을 지정하지 못한다.