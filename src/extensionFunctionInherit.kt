/* 확장 함수의 리시버 타입이 상속관계에 있을떄
   확장 함수는 멤버 함수와는 다르게 참조 변수가 실제로 가리키는 객체의 타입을 따르지 않고
   참조 변수의 타입을 그대로 따른다.
 */
open class A; class B:A()

fun A.hello() = println("AAA")
fun B.hello() = println("BBB")

fun main(args:Array<String>){
    val test:A = B()
    test.hello()
}