package ex_Class

/* 중첩클래스(NestedClass) - 클래스 안에는 또 다른 클래스를 선언 할 수 있다.
   타입 이름이 바깥 클래스.중첩 클래스로 만들어진다.
   생성자 이름도 마찬가지이다.
   Outer 의 인스턴스와 Outer.Nested 의 인스턴스는 서로 어떠한 프로퍼티나 멤버 함수도 공유하지 않는다.
   완전히 별개의 클래스이다.
   단순히 식별자만 바깥 클래스에 속해 있는 것
 */

class Outer // 바깥 클래스
{
    class Nested // 중첩 클래스
    {
        fun hello() = println("중첩된 클래스")
    }
}

fun main(args: Array<String>)
{
    val instance: Outer.Nested = Outer.Nested()
    instance.hello()
}
