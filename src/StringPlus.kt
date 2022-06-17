// 문자열간 + 연산 시 주의점
// 문자열끼리 + 연산을 하면 원래 갖고 있던 문자열에 새로운 문자열이 덧붙여지는 게 아니라,
// 기존의 문자열은 ㄱ그대로 남고 합쳐진 문자열이 새로 생성된다.
/** 스택이 아닌 힙 영역에 실제 공간이 할당되는 타입을 참조타입이라고 한다
 * Byte, Short, Int, Long, Float, Double, Char, Boolean 타입을 제외한 타입은 모두 참조타입이다.
 * String 변수는 문자열의 참조값을 저장하기 위한 공간만 갖고 있다.
 */
fun main(args:Array<String>): Unit {
        var first = "Hello "
        var second = "World"
        first += second
    }

