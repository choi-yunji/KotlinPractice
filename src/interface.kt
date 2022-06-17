/* 인터페이스(Interface) - 클래스에 어떤 멤버 함수와 프로퍼티가 반드시 존재한다는 것을 보장하기 위한 장치
   인터페이스는 멤버 함수, 추상 멤버 함수, 추상 프로퍼티를 가질 수 있다.
   인터페이스의 멤버함수는 내용이 비어있으면 자동으로 abstract 가 붙는다.
 */
interface Printable{
    fun print():Unit
}

class C:Printable{
    override fun print(){
        println("Hello")
    }
}

fun print(anything:Printable){
    anything.print()
}

fun main(args:Array<String>){
    print(C())
}